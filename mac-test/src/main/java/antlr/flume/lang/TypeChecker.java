/**
 * Licensed to Odiago, Inc. under one or more contributor license
 * agreements.  See the NOTICE.txt file distributed with this work for
 * additional information regarding copyright ownership.  Odiago, Inc.
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package antlr.flume.lang;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.stringtemplate.language.Expr;
import org.datanucleus.query.symbol.Symbol;
import org.datanucleus.query.symbol.SymbolTable;
import org.datanucleus.store.rdbms.sql.SQLStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Run a type-checker over all elements of the AST.
 */
public class TypeChecker extends Visitor {
  private static final Logger LOG = LoggerFactory.getLogger(
      TypeChecker.class.getName());

  /** Stack containing the symbol table for the current visit context. */
  private Stack<SymbolTable> mSymTableContext;

  /**
   * Indicates how many nested SELECT statements deep we are into the
   * complete statement. The top-most SELECT is #1.
   */
  private int mSelectNestingDepth;

  /**
   * Holds the id number to assign to the next field of a literal source. 
   */
  private Ref<Integer> mNextFieldId;

  public TypeChecker(SymbolTable rootSymbolTable) {
    mSymTableContext = new Stack<SymbolTable>();
    mSymTableContext.push(rootSymbolTable);
    mSelectNestingDepth = 0;
    mNextFieldId = new Ref<Integer>(Integer.valueOf(0));
  }

  @Override
  protected void visit(CreateStreamStmt s) throws VisitException {
    s.getFormatSpec().accept(this);
  }

  @Override
  protected void visit(FormatSpec s) throws VisitException {
    // TODO: Typecheck the FormatSpec; make sure the format describes
    // a real format that exists in the symbol table (each format should
    // have one; it should be like a builtin function).
  }

  @Override
  protected void visit(DropStmt s) throws VisitException {
    // Check that the DROP ____ type matches the type of the object to be dropped.
    SymbolTable symtab = mSymTableContext.top();
    String name = s.getName();
    Symbol sym = symtab.resolve(name);
    if (null == sym) {
      throw new TypeCheckException("No such object at top level: " + name);
    }
    EntityTarget targetType = s.getType();
    Type.TypeName symType = sym.getType().getTypeName();
    // Check that the DROP ___ type matches the symbol type.
    if (EntityTarget.Stream.equals(targetType)
        && !Type.TypeName.STREAM.equals(symType)) {
      throw new TypeCheckException("Entity " + name + " has incorrect type: " + symType);
    } else if (EntityTarget.Flow.equals(targetType)
        && !Type.TypeName.FLOW.equals(symType)) {
      throw new TypeCheckException("Entity " + name + " has incorrect type: " + symType);
    }
  }

  @Override
  protected void visit(ShowStmt s) throws VisitException {
    // Nothing to do.
  }

  @Override
  protected void visit(LiteralSource s) throws VisitException {
    SymbolTable symtab = mSymTableContext.top();

    String name = s.getName();
    LOG.debug("Visiting literalsrc " + name);
    Symbol symbol = symtab.resolve(name);
    if (null == symbol) {
      throw new TypeCheckException("No such identifier: " + name);
    } else if (symbol.getType().getTypeName() != Type.TypeName.STREAM) {
      throw new TypeCheckException("Identifier " + name + " is not a stream (type="
          + symbol.getType());
    }

    // Add a new symbol table layer containing the named stream's symbols.
    SymbolTable sourceTable = s.getFieldsSymbolTable(symtab, mNextFieldId);

    // Push it on top of the stack.
    mSymTableContext.push(sourceTable);
  }

  /**
   * Check if 's' is a valid SQLStatement subclass to be a source for a SELECT
   * statement. If so, visit it. Otherwise, throw an exception.
   */
  private void visitValidSource(SQLStatement source) throws VisitException {
    if (source instanceof RecordSource) {
      // Note that this will push a new symbol table on the stack.
      source.accept(this);
    } else {
      throw new TypeCheckException("Invalid source in FROM clause; this must be "
          + "an identifier, or a SELECT statement. Got " + source.getClass().getName());
    }
  }

  /**
   * Create symbols for the specified field and install them in the symbol
   * table.
   *
   * @param symtab the symbol table where the symbols go
   * @param streamName the name of the stream/select stmt that's generating the 
   * field.
   * @param fieldName the field's own name.
   * @param assignedName the unique label used to transmit values via avro.
   * @param type the type of the field.
   *
   * <p> As an output symbol, it is available as 'streamName.fieldName' if
   * streamName is not null, and also as 'fieldName'. The latter is an alias to
   * the former, if streamName is not null.  </p>
   */
  private void createSymbols(SymbolTable symtab, String streamName, String fieldName,
      String assignedName, Type type) {
    if (null != streamName) {
      AssignedSymbol sym = new AssignedSymbol(streamName + "." + fieldName,
          type, assignedName, IdentifierExpr.AccessType.FIELD);
      sym.setParentName(streamName);
      symtab.addSymbol(sym);
      symtab.addSymbol(new AliasSymbol(fieldName, sym));
    } else {
      symtab.addSymbol(new AssignedSymbol(fieldName, type, assignedName,
          IdentifierExpr.AccessType.FIELD));
    }
  }

  @Override
  protected void visit(SelectStmt s) throws VisitException {
    SymbolTable outTable = null;

    mSelectNestingDepth++;

    // Visiting a source pushes one or more symbol tables on the stack,
    // declaring the fields of this source. While visiting our clauses, we
    // also push a symbol table declaring the names of any windows defined
    // with WINDOW .. AS clauses.  Make sure we pop them on our way out by
    // resetting the stack to its current height.
    int symbolStackHeight = mSymTableContext.size();
    SymbolTable originalSymtab = mSymTableContext.top();

    try {
      // Visit the window clauses first; if their types are okay, create a new
      // symbol table to use when visiting our sources, that contains the
      // window names.

      SymbolTable symbolsForSources = new HashSymbolTable(originalSymtab);
      List<WindowDef> windowDefs = s.getWindowDefs();
      for (WindowDef def : windowDefs) {
        def.accept(this);
        symbolsForSources.addSymbol(new WindowSymbol(def.getName(), def.getWindowSpec()));
      }
      mSymTableContext.push(symbolsForSources);
      
      // Now visit the sources, with the symbols for any windows pushed.
      SQLStatement source = s.getSource();
      visitValidSource(source);

      SymbolTable exprTable = mSymTableContext.top();
      outTable = new HashSymbolTable(originalSymtab);

      // The "stream name" representing this SELECT stmt in the parent
      // statement.
      String stmtAlias = s.getAlias();
      // Nested SELECT statements require an alias.
      if (mSelectNestingDepth > 1 && null == stmtAlias) {
        throw new TypeCheckException("Each derived stream must have its own alias.");
      }

      // Type check all the selected expressions using the symbols from our source.
      for (AliasedExpr aliasedExpr : s.getSelectExprs()) {
        aliasedExpr.accept(this);
        // Add our output symbols to the output symbol table.
        if (aliasedExpr.getExpr() instanceof AllFieldsExpr) {
          // Add all symbols in the source's table into this one,
          // to add fields pulled in by the "*" operator.
          // Resolve away all aliased symbols to their final version, and rename
          // any "qualifier.field" -> "field".
          Iterator<Symbol> sourceSymbols = exprTable.levelIterator();
          while (sourceSymbols.hasNext()) {
            Symbol srcSym = sourceSymbols.next().resolveAliases();
            String symName = StringUtils.dequalify(srcSym.getName());

            if (null != stmtAlias) {
              Symbol sym = srcSym.withName(stmtAlias + "." + symName);
              outTable.addSymbol(sym);
              outTable.addSymbol(new AliasSymbol(symName, sym));
            } else {
              outTable.addSymbol(srcSym.withName(symName));
            }
          }
        } else if (aliasedExpr.getExpr() instanceof IdentifierExpr) {
          // AliasedExpr entries which are just IdentifierExprs were
          // not handled in AssignFieldLabelsVisitor. Now that the
          // IdentifierExpr has been visited, resolve its avro name here.
          IdentifierExpr ident = (IdentifierExpr) aliasedExpr.getExpr();
          String name = aliasedExpr.getUserAlias();
          String assignedName = ident.getAssignedName();

          if (!ident.getIdentifier().startsWith("#")) {
            // Use the avro label of the identified field.
            aliasedExpr.setAvroLabel(assignedName);
          }

          Type type = ident.getType(exprTable);

          // Create symbols for the output SymbolTable.
          createSymbols(outTable, stmtAlias, name, assignedName, type);

        } else {
          // NOTE: This relies on aliasedExpr.getUserAlias() being filled;
          // this is done in the AssignFieldLabelsVisitor, which is run first.
          String name = aliasedExpr.getUserAlias();

          // This is guaranteed to not contain a '.'.
          assert name.contains(".") == false;

          Type type = aliasedExpr.getExpr().getType(exprTable);
          createSymbols(outTable, stmtAlias, name, aliasedExpr.getAvroLabel(), type);
        }
      }

      // Check the where clause for validity if it's non-null.
      Expr where = s.getWhereConditions();
      if (null != where) {
        where.accept(this);
        // The where clause must evaluate to a boolean value.
        Type whereType = where.getType(exprTable);
        if (!whereType.promotesTo(Type.getNullable(Type.TypeName.BOOLEAN))) {
          throw new TypeCheckException("Expected where clause with boolean type, not "
              + whereType);
        }
      }

      // Check the GROUP BY clause for validity if it's non-null.
      GroupBy groupBy = s.getGroupBy();
      if (null != groupBy) {
        groupBy.accept(this);
      }

      // Check the OVER clause for validity if it's non-null.
      // This must evaluate to a value of type WINDOW.
      Expr windowOver = s.getWindowOver();
      if (null != windowOver) {
        windowOver.accept(this);
        Type winType = windowOver.getType(exprTable);
        if (!winType.equals(Type.getPrimitive(Type.TypeName.WINDOW))) {
          throw new TypeCheckException("SELECT ... OVER clause requires a window, not an "
              + "identifier of type " + winType);
        }
      }
    } finally {
      // Pop the source symbol tables from the stack.
      mSymTableContext.reset(symbolStackHeight);
      mSelectNestingDepth--;
    }

    // Push our output symbols on the stack so any higher-level select stmt can
    // type check against them. Memorize the symbols for this statement in the
    // statement object itself.
    if (null != outTable) {
      mSymTableContext.push(outTable);
      s.setFieldSymbols(outTable.cloneLevel());
    }

    // HAVING clause uses the output symbol names. It can only operate on
    // fields already explicitly selected by the user -- if these are not
    // already present, this will fail.
    Expr having = s.getHaving();
    if (null != having) {
      having.accept(this);
      // The having clause must evaluate to a boolean value.
      Type havingType = having.getType(outTable);
      if (!havingType.promotesTo(Type.getNullable(Type.TypeName.BOOLEAN))) {
        throw new TypeCheckException("Expected having clause with boolean type, not "
            + havingType);
      }
    }
  }

  @Override
  protected void visit(JoinedSource s) throws VisitException {
    SQLStatement leftSrc = s.getLeft();
    SQLStatement rightSrc = s.getRight();
    LOG.debug("Visiting joinedsrc");

    int symtabHeight = mSymTableContext.size();

    visitValidSource(leftSrc);
    visitValidSource(rightSrc);

    // Verify: exactly one symbol table pushed per source.
    assert(mSymTableContext.size() == symtabHeight + 2);

    // Each of these sources has pushed one symbol table on the stack.
    // Merge them together, removing duplicate symbols. These must be
    // referred to by "qualified.alias" only.
    SymbolTable rightSymTab = mSymTableContext.pop();
    SymbolTable leftSymTab = mSymTableContext.pop();

    SymbolTable symTab = SymbolTable.mergeSymbols(leftSymTab, rightSymTab,
        mSymTableContext.top());
    s.setJoinedSymbols(symTab);
    mSymTableContext.push(symTab);

    // Verify that the join expression is BOOLEAN.
    Expr joinExpr = s.getJoinExpr();
    joinExpr.accept(this);
    Type joinType = joinExpr.getType(symTab);
    if (!joinType.promotesTo(Type.getNullable(Type.TypeName.BOOLEAN))) {
      throw new TypeCheckException("JOIN ... ON clause requires boolean test expression, not "
          + joinExpr.toStringOneLine());
    }

    // Make sure the "OVER" clause joins over a Window.
    Expr windowExpr = s.getWindowExpr();
    windowExpr.accept(this);
    Type winType = windowExpr.getType(symTab);
    if (!winType.equals(Type.getPrimitive(Type.TypeName.WINDOW))) {
      throw new TypeCheckException("JOIN ... OVER clause requires a window, not an "
          + "identifier of type " + winType);
    }
  }

  @Override
  protected void visit(DescribeStmt s) throws VisitException {
    // Check the symbol table that the identifier exists.
    String id = s.getIdentifier();
    SymbolTable symtab = mSymTableContext.top();

    Symbol symbol = symtab.resolve(id);
    if (null == symbol) {
      throw new TypeCheckException("No such identifier: " + id);
    }
  }

  @Override
  protected void visit(ExplainStmt s) throws VisitException {
    s.getChildStmt().accept(this);
  }

  @Override
  protected void visit(AliasedExpr e) throws VisitException {
    Expr subExpr = e.getExpr();
    String userAlias = e.getUserAlias();

    // If the sub-expression is just a '*', this can't have an alias.
    // ("SELECT * AS bla FROM ..." is illegal.)
    if (subExpr instanceof AllFieldsExpr && userAlias != null) {
      throw new TypeCheckException("Cannot assign field label to '*' operator.");
    }

    if (userAlias != null && userAlias.contains(".")) {
      // Can't "SELECT x AS y.x", it confuses our name promotion.
      throw new TypeCheckException("Cannot use the '.' character in a field alias ("
          + userAlias + ")");
    }

    // Typecheck the sub-expression.
    subExpr.accept(this);
  }

  protected void visit(ConstExpr e) throws VisitException {
    // Nothing to do.
  }

  protected void visit(BinExpr e) throws VisitException {
    // Type-check sub-expressions.
    e.getLeftExpr().accept(this);
    e.getRightExpr().accept(this);

    SymbolTable symTab = mSymTableContext.top();

    // Get the type from the expression; this handles promotion of
    // lhs to rhs or vice versa.
    Type expType = e.getType(symTab);
    if (null == expType) {
      // Sub-expressions cannot agree on a common type.
      throw new TypeCheckException("Cannot assign type to binary expression: "
          + e.toStringOneLine());
    }

    e.setType(expType); // Cache this value for later.

    Type lhsType = e.getLeftExpr().getType(symTab);
    Type rhsType = e.getRightExpr().getType(symTab);

    // Given the operator in the binary expression, check that the type makes sense.
    switch (e.getOp()) {
    case Times:
    case Div:
    case Mod:
    case Subtract:
      // For numeric operators, input types must be numeric.
      if (!lhsType.isNumeric()) {
        throw new TypeCheckException("Operator " + e.getOp() + " requires numeric lhs argument");
      } else if (!rhsType.isNumeric()) {
        throw new TypeCheckException("Operator " + e.getOp() + " requires numeric rhs argument");
      }
      break;
    case Add:
      // This requires input arguments that are numeric, or strings.
      // Check that the output type (which is the resolved, promoted type) is numeric or string.
      if (!expType.isNumeric() && !expType.equals(Type.getPrimitive(Type.TypeName.STRING))
          && !expType.equals(Type.getNullable(Type.TypeName.STRING))) {
        throw new TypeCheckException("Operator " + e.getOp()
            + " requires numeric or string arguments.");
      }
      break;
    case Greater:
    case GreaterEq:
    case Less:
    case LessEq:
      // These require comparable arguments.
      if (!lhsType.isComparable()) {
        throw new TypeCheckException("Operator " + e.getOp()
            + " requires comparable lhs argument.");
      } else if (!rhsType.isComparable()) {
        throw new TypeCheckException("Operator " + e.getOp()
            + " requires comparable rhs argument.");
      }
      break;
    case Eq:
    case NotEq:
      // These require primitive arguments.
      if (!lhsType.isPrimitive()) {
        throw new TypeCheckException("Cannot test for equality on non-primitive lhs");
      } else if (!rhsType.isPrimitive()) {
        throw new TypeCheckException("Cannot test for equality on non-primitive rhs");
      }
      break;
    case And:
    case Or:
      // Both arguments must be boolean.
      if (!lhsType.equals(Type.getPrimitive(Type.TypeName.BOOLEAN))) {
        throw new TypeCheckException("Operator " + e.getOp() + " requires boolean lhs.");
      } else if (!rhsType.equals(Type.getPrimitive(Type.TypeName.BOOLEAN))) {
        throw new TypeCheckException("Operator " + e.getOp() + " requires boolean rhs.");
      }
      break;
    default:
      throw new TypeCheckException("Do not know how to type-check boolean operator: "
          + e.getOp());
    }
  }

  protected void visit(FnCallExpr e) throws VisitException {
    // Type-check all the argument expressions.
    for (Expr argExpr : e.getArgExpressions()) {
      argExpr.accept(this);
    }

    // Verify that all the actual expression types can be promoted to the argument types.
    e.resolveArgTypes(mSymTableContext.top());
  }

  /**
   * @return true if symName does not exist in symTab, but "foo.symName" does.
   */
  private boolean isAmbiguousAlias(String symName, SymbolTable symTab) {
    if (symTab.resolve(symName) != null) {
      return false; // The symbol exists; we're fine.
    }

    String dotName = "." + symName;

    Iterator<Symbol> symbols = symTab.levelIterator();
    while (symbols.hasNext()) {
      Symbol sym = symbols.next();
      if (sym.getName().endsWith(dotName)) {
        // We've found 'foo.symName', but no symName. Ambiguous identifier.
        return true;
      }
    }

    return false;
  }

  /**
   * Look up a field name identifier and resolve it to a Symbol and a Type.
   * These values are returned via Ref arguments.
   * @param fieldsSymTab the symbol table defining fields of the stream.
   * @param fieldName The field name to resolve.
   * @param outSym (output) The final resolved output symbol for the entity.
   * @param outType (output) The type for values of this field.
   */
  private void resolveIdentifier(SymbolTable fieldsSymTab, String fieldName,
      Ref<AssignedSymbol> outSym, Ref<Type> outType) throws TypeCheckException {

    // Check that this field is defined by one of the input sources.
    // Since the source pushed a symbol table on the stack, just check
    // that we have a symbol table, and that this is a primitive value.
    Symbol fieldSym = fieldsSymTab.resolve(fieldName);
    if (null == fieldSym) {
      // This isn't just a simple field. Check if it's an attribute.
      if (fieldName.startsWith("#") && fieldName.length() > 1) {
        // This is an attribute name.
        String attrName = fieldName.substring(1);
        fieldSym = new AssignedSymbol(attrName,
            Type.getNullable(Type.TypeName.BINARY),
            attrName, IdentifierExpr.AccessType.ATTRIBUTE);
      } else if (isAmbiguousAlias(fieldName, fieldsSymTab)) {
        // The identifier doesn't exist, or else it's an ambiguous alias.
        // Return the appropriate error message.

        // This identifier is probably an alias for another identifier
        // but the alias is removed due to ambiguity in a JOIN.
        throw new TypeCheckException("Ambiguous identifier: \"" + fieldName + "\". "
            + "You must prefix this with a stream name qualifier.");
      } else {
        // This identifier straight-up doesn't exist.
        throw new TypeCheckException("No such identifier: \"" + fieldName + "\"");
      }
    }

    Type fieldType = fieldSym.getType();
    if (!fieldType.isConcrete()) {
      // This name refers to a stream or other ephemeral type. We can't
      // select that.
      throw new TypeCheckException("Cannot select non-concrete entity \""
          + fieldName + "\"");
    }

    outType.item = fieldType;

    // The field symbol should also be an AssignedSymbol that has a unique
    // reference name throughout the query. Bind to the reference name here;
    // the actual query uses this name instead of the user-friendly
    // identifier.
    fieldSym = fieldSym.resolveAliases();
    assert fieldSym instanceof AssignedSymbol;

    outSym.item = (AssignedSymbol) fieldSym;
  }

  protected void visit(IdentifierExpr e) throws VisitException {
    SymbolTable fieldsSymTab = mSymTableContext.top();
    String fieldName = e.getIdentifier();

    Ref<AssignedSymbol> symRef = new Ref<AssignedSymbol>();
    Ref<Type> typeRef = new Ref<Type>();
    resolveIdentifier(fieldsSymTab, fieldName, symRef, typeRef);

    Type fieldType = typeRef.item;
    AssignedSymbol fieldSym = symRef.item;

    // Let the AST node memoize its typing information from the symbol table;
    // it will need to reference this at run time to look up values from the
    // EventWrapper.
    e.setType(fieldType);
    e.setAssignedName(fieldSym.getAssignedName());
    e.setAccessType(fieldSym.getAccessType());
    e.setAssignedSymbol(fieldSym);
  }

  protected void visit(UnaryExpr e) throws VisitException {
    // Check that this has a type, that its sub-expression has a type,
    // and that the subexpr type is appropriate for the operator.

    // Start by type-checking the subexpression.
    e.getSubExpr().accept(this);

    SymbolTable symTab = mSymTableContext.top();
    Type expType = e.getType(symTab);
    if (null == expType) {
      throw new TypeCheckException("Cannot resolve type for expression: " + e.toStringOneLine());
    }

    Type subType = e.getSubExpr().getType(symTab);
    switch (e.getOp()) {
    case Plus:
    case Minus:
      if (!subType.isNumeric()) {
        throw new TypeCheckException("Unary " + e.getOp()
            + " operator requires numeric argument");
      }
      break;
    case Not:
      if (!subType.promotesTo(Type.getNullable(Type.TypeName.BOOLEAN))) {
        throw new TypeCheckException("Unary " + e.getOp()
            + " operator requires boolean argument");
      }
      break;
    case IsNull:
    case IsNotNull:
      // Any primitive type works here.
      if (!subType.isPrimitive()) {
        throw new TypeCheckException("Unary " + e.getOp()
            + " operator expects primitive argument");
      }
      break;
    default:
      throw new TypeCheckException("Cannot type-check unary operator " + e.getOp());
    }
  }

  protected void visit(AllFieldsExpr e) throws VisitException {
    // Nothing to do.
  }

  protected void visit(WindowDef def) throws VisitException {
    WindowSpec spec = def.getWindowSpec();
    spec.accept(this);
  }

  protected void visit(WindowSpec spec) throws VisitException {
    RangeSpec range = spec.getRangeSpec();
    range.accept(this);
  }

  protected void visit(RangeSpec spec) throws VisitException {
    // Expressions within a range specification for a window must be constant,
    // and numeric.
    Expr after = spec.getAfterSize();
    Expr prev = spec.getPrevSize();
    after.accept(this);
    prev.accept(this);


    SymbolTable symTab = mSymTableContext.top();
    
    Type prevType = prev.getType(symTab);
    Type afterType = after.getType(symTab);
    if (null == prevType) {
      throw new TypeCheckException("Cannot resolve type for expression: "
          + prev.toStringOneLine());
    } else if (null == afterType) {
      throw new TypeCheckException("Cannot resolve type for expression: "
          + after.toStringOneLine());
    } else if (!prevType.isNumeric()) {
      throw new TypeCheckException("Expression " + prev.toStringOneLine()
          + " should have numeric type.");
    } else if (!afterType.isNumeric()) {
      throw new TypeCheckException("Expression " + after.toStringOneLine()
          + " should have numeric type.");
    } else if (!prev.isConstant()) {
      throw new TypeCheckException("Expression " + prev.toStringOneLine() + " is not constant");
    } else if (!after.isConstant()) {
      throw new TypeCheckException("Expression " + after.toStringOneLine() + " is not constant");
    }
  }

  protected void visit(GroupBy g) throws VisitException {
    SymbolTable fieldsSymTab = mSymTableContext.top();

    // Check that the fields are real fields; resolve them to TypedField instances,
    // like we do for an IdentifierExpr.
    List<TypedField> typedFields = new ArrayList<TypedField>();
    Ref<AssignedSymbol> symRef = new Ref<AssignedSymbol>();
    Ref<Type> typeRef = new Ref<Type>();

    for (String fieldName : g.getFieldNames()) {
      resolveIdentifier(fieldsSymTab, fieldName, symRef, typeRef);
      Type fieldType = typeRef.item;
      AssignedSymbol fieldSym = symRef.item;
      typedFields.add(new TypedField(fieldSym.getAssignedName(), fieldType));
    }

    g.setFieldTypes(typedFields);
  }
}
