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
import org.datanucleus.store.rdbms.sql.SQLStatement;

/**
 * TreeWalkVisitor comes with default visit() methods that visit all children of a given
 * node. Subclasses should call super.visit() when they want recursion to occur.
 */
public abstract class TreeWalkVisitor extends Visitor {
  
  /**
   * Method called before visiting each item in the tree (except the root).
   */
  protected void before(SQLStatement parent, SQLStatement child) throws VisitException {
  }

  /**
   * Method called after visiting each item in the tree (except the root).
   */
  protected void after(SQLStatement parent, SQLStatement child) throws VisitException {
  }

  /**
   * Replace all instances of AST element 'oldChild' under 'parent' with
   * 'newChild'. Comparison is done with == (not equals()).
   */
  protected void replace(SQLStatement parent, SQLStatement oldChild, SQLStatement newChild)
      throws VisitException {
    new ReplaceVisitor(oldChild, newChild).visit(parent);
  }

  @Override
  protected void visit(CreateStreamStmt s) throws VisitException {
    before(s, s.getFormatSpec());
    s.getFormatSpec().accept(this);
    after(s, s.getFormatSpec());
  }

  @Override
  protected void visit(SelectStmt s) throws VisitException {
    List<AliasedExpr> exprs = s.getSelectExprs();
    for (int i = 0; i < exprs.size(); i++) {
      AliasedExpr e = exprs.get(i);
      before(s, e);
      e.accept(this);
      after(s, e);
    }

    before(s, s.getSource());
    s.getSource().accept(this);
    after(s, s.getSource());

    Expr where = s.getWhereConditions();
    if (null != where) {
      before(s, where);
      where.accept(this);
      after(s, where);
    }

    GroupBy groupBy = s.getGroupBy();
    if (null != groupBy) {
      before(s, groupBy);
      groupBy.accept(this);
      after(s, groupBy);
    }

    Expr aggregateOver = s.getWindowOver();
    if (null != aggregateOver) {
      before(s, aggregateOver);
      aggregateOver.accept(this);
      after(s, aggregateOver);
    }

    Expr having = s.getHaving();
    if (null != having) {
      before(s, having);
      having.accept(this);
      after(s, having);
    }

    List<WindowDef> windowDefs = s.getWindowDefs();
    if (null != windowDefs) {
      for (int i = 0; i < windowDefs.size(); i++) {
        WindowDef def = windowDefs.get(i);
        before(s, def);
        def.accept(this);
        after(s, def);
      }
    }
  }

  @Override
  protected void visit(ExplainStmt s) throws VisitException {
    before(s, s.getChildStmt());
    s.getChildStmt().accept(this);
    after(s, s.getChildStmt());
  }

  @Override
  protected void visit(BinExpr e) throws VisitException {
    before(e, e.getLeftExpr());
    e.getLeftExpr().accept(this);
    after(e, e.getLeftExpr());

    before(e, e.getRightExpr());
    e.getRightExpr().accept(this);
    after(e, e.getRightExpr());
  }

  @Override
  protected void visit(FnCallExpr e) throws VisitException {
    List<Expr> args = e.getArgExpressions();
    if (null != args) {
      for (int i = 0; i < args.size(); i++) {
        Expr ae = args.get(i);
        before(e, ae);
        ae.accept(this);
        after(e, ae);
      }
    }
  }

  @Override
  protected void visit(UnaryExpr e) throws VisitException {
    before(e, e.getSubExpr());
    e.getSubExpr().accept(this);
    after(e, e.getSubExpr());
  }

  @Override
  protected void visit(AliasedExpr e) throws VisitException {
    before(e, e.getExpr());
    e.getExpr().accept(this);
    after(e, e.getExpr());
  }

  @Override
  protected void visit(WindowDef e) throws VisitException {
    before(e, e.getWindowSpec());
    e.getWindowSpec().accept(this);
    after(e, e.getWindowSpec());
  }

  @Override
  protected void visit(WindowSpec e) throws VisitException {
    before(e, e.getRangeSpec());
    e.getRangeSpec().accept(this);
    after(e, e.getRangeSpec());
  }

  @Override
  protected void visit(RangeSpec e) throws VisitException {
    before(e, e.getPrevSize());
    e.getPrevSize().accept(this);
    after(e, e.getPrevSize());

    before(e, e.getAfterSize());
    e.getAfterSize().accept(this);
    after(e, e.getAfterSize());
  }

  @Override
  protected void visit(JoinedSource s) throws VisitException {
    before(s, s.getLeft());
    s.getLeft().accept(this);
    after(s, s.getLeft());

    before(s, s.getRight());
    s.getRight().accept(this);
    after(s, s.getRight());

    before(s, s.getJoinExpr());
    s.getJoinExpr().accept(this);
    after(s, s.getJoinExpr());

    before(s, s.getWindowExpr());
    s.getWindowExpr().accept(this);
    after(s, s.getWindowExpr());
  }
}

