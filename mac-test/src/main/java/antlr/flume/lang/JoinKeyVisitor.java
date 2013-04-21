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

import java.util.List;

import org.antlr.stringtemplate.language.Expr;
import org.datanucleus.query.symbol.Symbol;
import org.datanucleus.query.symbol.SymbolTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Identifies the "key" columns in an equijoin which should be performed by a
 * HashJoin.
 */
public class JoinKeyVisitor extends TreeWalkVisitor {
  private static final Logger LOG = LoggerFactory.getLogger(
      JoinKeyVisitor.class.getName());

  private void identifyJoinKeys(JoinedSource src, BinExpr e) throws VisitException {
    if (!e.getOp().equals(BinOp.Eq)) {
      // Don't currently know how to handle non-equijoins.
      throw new VisitException("Join should be performed with the '=' operator.");
    }

    Expr e1 = e.getLeftExpr();
    Expr e2 = e.getRightExpr();

    assert e1 != null;
    assert e2 != null;

    if (!(e1 instanceof IdentifierExpr)) {
      throw new VisitException("Join can only be performed on identifier comparisons.");
    }

    if (!(e2 instanceof IdentifierExpr)) {
      throw new VisitException("Join can only be performed on identifier comparisons.");
    }

    String e1Ident = ((IdentifierExpr) e1).getIdentifier();
    String e2Ident = ((IdentifierExpr) e2).getIdentifier();

    assert e1Ident != null;
    assert e2Ident != null;

    SymbolTable symTab = src.getFieldSymbols();

    Symbol e1Sym = symTab.resolve(e1Ident);
    Symbol e2Sym = symTab.resolve(e2Ident);

    assert e1Sym != null;
    assert e2Sym != null;

    e1Sym = e1Sym.resolveAliases();
    e2Sym = e2Sym.resolveAliases();

    // We now have the symbols for the e1 and e2 sides of the BinExpr.
    // Determine which of these is from the left source and the right source.
    // Verify that both sources are represented here.

    // The typechecker should have already assigned labels to these.
    assert e1Sym instanceof AssignedSymbol;
    assert e2Sym instanceof AssignedSymbol;

    // Get the names of the input streams for each symbol, verify they're
    // nonnull.
    String e1Parent = ((AssignedSymbol) e1Sym).getParentName();
    String e2Parent = ((AssignedSymbol) e2Sym).getParentName();

    if (null == e1Parent) {
      throw new VisitException("Identifier " + e1Ident + " is not from a known stream.");
    } else if (null == e2Parent) {
      throw new VisitException("Identifier " + e2Ident + " is not from a known stream.");
    }

    List<String> leftSrcNames = src.getLeft().getSourceNames();
    List<String> rightSrcNames = src.getRight().getSourceNames();

    LOG.debug("left sources: " + StringUtils.listToStr(leftSrcNames));
    LOG.debug("right sources: " + StringUtils.listToStr(rightSrcNames));
    LOG.debug("e1sym: " + e1Sym);
    LOG.debug("e2sym: " + e2Sym);

    if (leftSrcNames.contains(e1Parent)) {
      src.setLeftKey(e1Sym);
    } else if (rightSrcNames.contains(e1Parent)) {
      src.setRightKey(e1Sym);
    } else {
      throw new VisitException("Identifier " + e1Ident + " is not a valid join key");
    }

    if (leftSrcNames.contains(e2Parent)) {
      src.setLeftKey(e2Sym);
    } else if (rightSrcNames.contains(e2Parent)) {
      src.setRightKey(e2Sym);
    } else {
      throw new VisitException("Identifier " + e2Ident + " is not a valid join key");
    }

    if (src.getLeftKey() == null || src.getRightKey() == null) {
      throw new VisitException("Join clause does not contain keys from both input streams");
    }
  }

  @Override
  protected void visit(JoinedSource src) throws VisitException {
    Expr joinExpr = src.getJoinExpr();
    if (!(joinExpr instanceof BinExpr)) {
      // Need a BinExpr here.. don't know how to handle other top-level
      // expressions.
      throw new VisitException("Join should be performed with binary comparison operation");
    }
    identifyJoinKeys(src, (BinExpr) joinExpr);

    // Handle nested joins.
    src.getLeft().accept(this);
    src.getRight().accept(this);
  }
}
