// $ANTLR 3.0.1 streamsql.g 2012-08-02 21:54:43

  package antlr.stream;


import java.util.Stack;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

public class streamsqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TOK_CREATE_SCHEMA", "TOK_CREATE_STREAM", "TOK_CREATE_WINDOW", "TOK_SELECT", "TOK_SCHEMA_LIST", "TOK_NAME_TYPE", "TOK_SELEXPR", "TOK_SELITEM", "TOK_SELLIST", "TOK_EXPLAIN", "KW_SELECT", "KW_FROM", "Identifier", "LSQUARE", "RSQUARE", "KW_INTO", "COMMA", "KW_AS", "LPAREN", "RPAREN", "KW_ON", "KW_CREATE", "KW_INT", "KW_DOUBLE", "KW_SCHEMA", "KW_INPUT", "KW_OUTPUT", "KW_STREAM", "KW_WINDOW", "KW_SIZE", "KW_ADVANCE", "DOT", "COLON", "SEMICOLON", "LCURLY", "RCURLY", "EQUAL", "NOTEQUAL", "LESSTHANOREQUALTO", "LESSTHAN", "GREATERTHANOREQUALTO", "GREATERTHAN", "DIVIDE", "PLUS", "MINUS", "STAR", "MOD", "DIV", "AMPERSAND", "TILDE", "BITWISEOR", "BITWISEXOR", "QUESTION", "DOLLAR", "Letter", "HexDigit", "Digit", "Exponent", "RegexComponent", "StringLiteral", "CharSetLiteral", "BigintLiteral", "SmallintLiteral", "TinyintLiteral", "Number", "CharSetName", "WS", "COMMENT"
    };
    public static final int DOLLAR=57;
    public static final int TOK_SCHEMA_LIST=8;
    public static final int STAR=49;
    public static final int LSQUARE=17;
    public static final int MOD=50;
    public static final int KW_SIZE=33;
    public static final int CharSetName=69;
    public static final int BITWISEXOR=55;
    public static final int Exponent=61;
    public static final int KW_CREATE=25;
    public static final int EOF=-1;
    public static final int TinyintLiteral=67;
    public static final int HexDigit=59;
    public static final int TOK_CREATE_STREAM=5;
    public static final int KW_INPUT=29;
    public static final int KW_OUTPUT=30;
    public static final int Identifier=16;
    public static final int LPAREN=22;
    public static final int KW_FROM=15;
    public static final int NOTEQUAL=41;
    public static final int GREATERTHANOREQUALTO=44;
    public static final int RPAREN=23;
    public static final int RegexComponent=62;
    public static final int TOK_SELLIST=12;
    public static final int Number=68;
    public static final int COMMA=20;
    public static final int TOK_NAME_TYPE=9;
    public static final int EQUAL=40;
    public static final int TILDE=53;
    public static final int PLUS=47;
    public static final int COMMENT=71;
    public static final int DOT=35;
    public static final int DIVIDE=46;
    public static final int GREATERTHAN=45;
    public static final int KW_SCHEMA=28;
    public static final int LESSTHAN=43;
    public static final int KW_INT=26;
    public static final int KW_ADVANCE=34;
    public static final int TOK_CREATE_SCHEMA=4;
    public static final int TOK_EXPLAIN=13;
    public static final int TOK_SELITEM=11;
    public static final int AMPERSAND=52;
    public static final int LCURLY=38;
    public static final int SEMICOLON=37;
    public static final int MINUS=48;
    public static final int RSQUARE=18;
    public static final int Digit=60;
    public static final int KW_DOUBLE=27;
    public static final int BITWISEOR=54;
    public static final int StringLiteral=63;
    public static final int COLON=36;
    public static final int BigintLiteral=65;
    public static final int SmallintLiteral=66;
    public static final int WS=70;
    public static final int CharSetLiteral=64;
    public static final int KW_SELECT=14;
    public static final int TOK_SELEXPR=10;
    public static final int KW_INTO=19;
    public static final int QUESTION=56;
    public static final int KW_STREAM=31;
    public static final int KW_ON=24;
    public static final int RCURLY=39;
    public static final int KW_AS=21;
    public static final int TOK_CREATE_WINDOW=6;
    public static final int TOK_SELECT=7;
    public static final int LESSTHANOREQUALTO=42;
    public static final int DIV=51;
    public static final int KW_WINDOW=32;
    public static final int Letter=58;

        public streamsqlParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "streamsql.g"; }

    
      Stack msgs = new Stack<String>();


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // streamsql.g:41:1: statement : execStatement EOF ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        execStatement_return execStatement1 = null;


        CommonTree EOF2_tree=null;

        try {
            // streamsql.g:42:3: ( execStatement EOF )
            // streamsql.g:42:5: execStatement EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_execStatement_in_statement105);
            execStatement1=execStatement();
            _fsp--;

            adaptor.addChild(root_0, execStatement1.getTree());
            EOF2=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_statement107); 
            EOF2_tree = (CommonTree)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class execStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start execStatement
    // streamsql.g:45:1: execStatement : selectStatement EOF ;
    public final execStatement_return execStatement() throws RecognitionException {
        execStatement_return retval = new execStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        selectStatement_return selectStatement3 = null;


        CommonTree EOF4_tree=null;

         msgs.push("exec statement"); 
        try {
            // streamsql.g:48:3: ( selectStatement EOF )
            // streamsql.g:48:5: selectStatement EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_selectStatement_in_execStatement130);
            selectStatement3=selectStatement();
            _fsp--;

            adaptor.addChild(root_0, selectStatement3.getTree());
            EOF4=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_execStatement132); 
            EOF4_tree = (CommonTree)adaptor.create(EOF4);
            adaptor.addChild(root_0, EOF4_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }
        
        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end execStatement

    public static class selectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectStatement
    // streamsql.g:52:1: selectStatement : KW_SELECT selectList KW_FROM instreamName= Identifier LSQUARE windowName= Identifier RSQUARE KW_INTO outstreamName= Identifier -> ^( KW_SELECT selectList $instreamName $windowName $outstreamName) ;
    public final selectStatement_return selectStatement() throws RecognitionException {
        selectStatement_return retval = new selectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token instreamName=null;
        Token windowName=null;
        Token outstreamName=null;
        Token KW_SELECT5=null;
        Token KW_FROM7=null;
        Token LSQUARE8=null;
        Token RSQUARE9=null;
        Token KW_INTO10=null;
        selectList_return selectList6 = null;


        CommonTree instreamName_tree=null;
        CommonTree windowName_tree=null;
        CommonTree outstreamName_tree=null;
        CommonTree KW_SELECT5_tree=null;
        CommonTree KW_FROM7_tree=null;
        CommonTree LSQUARE8_tree=null;
        CommonTree RSQUARE9_tree=null;
        CommonTree KW_INTO10_tree=null;
        RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_KW_INTO=new RewriteRuleTokenStream(adaptor,"token KW_INTO");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
        RewriteRuleSubtreeStream stream_selectList=new RewriteRuleSubtreeStream(adaptor,"rule selectList");
         msgs.push("select statement"); 
        try {
            // streamsql.g:55:3: ( KW_SELECT selectList KW_FROM instreamName= Identifier LSQUARE windowName= Identifier RSQUARE KW_INTO outstreamName= Identifier -> ^( KW_SELECT selectList $instreamName $windowName $outstreamName) )
            // streamsql.g:55:5: KW_SELECT selectList KW_FROM instreamName= Identifier LSQUARE windowName= Identifier RSQUARE KW_INTO outstreamName= Identifier
            {
            KW_SELECT5=(Token)input.LT(1);
            match(input,KW_SELECT,FOLLOW_KW_SELECT_in_selectStatement157); 
            stream_KW_SELECT.add(KW_SELECT5);

            pushFollow(FOLLOW_selectList_in_selectStatement159);
            selectList6=selectList();
            _fsp--;

            stream_selectList.add(selectList6.getTree());
            KW_FROM7=(Token)input.LT(1);
            match(input,KW_FROM,FOLLOW_KW_FROM_in_selectStatement161); 
            stream_KW_FROM.add(KW_FROM7);

            instreamName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectStatement165); 
            stream_Identifier.add(instreamName);

            LSQUARE8=(Token)input.LT(1);
            match(input,LSQUARE,FOLLOW_LSQUARE_in_selectStatement167); 
            stream_LSQUARE.add(LSQUARE8);

            windowName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectStatement171); 
            stream_Identifier.add(windowName);

            RSQUARE9=(Token)input.LT(1);
            match(input,RSQUARE,FOLLOW_RSQUARE_in_selectStatement173); 
            stream_RSQUARE.add(RSQUARE9);

            KW_INTO10=(Token)input.LT(1);
            match(input,KW_INTO,FOLLOW_KW_INTO_in_selectStatement175); 
            stream_KW_INTO.add(KW_INTO10);

            outstreamName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectStatement179); 
            stream_Identifier.add(outstreamName);


            // AST REWRITE
            // elements: instreamName, selectList, KW_SELECT, windowName, outstreamName
            // token labels: windowName, instreamName, outstreamName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_windowName=new RewriteRuleTokenStream(adaptor,"token windowName",windowName);
            RewriteRuleTokenStream stream_instreamName=new RewriteRuleTokenStream(adaptor,"token instreamName",instreamName);
            RewriteRuleTokenStream stream_outstreamName=new RewriteRuleTokenStream(adaptor,"token outstreamName",outstreamName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:5: -> ^( KW_SELECT selectList $instreamName $windowName $outstreamName)
            {
                // streamsql.g:56:8: ^( KW_SELECT selectList $instreamName $windowName $outstreamName)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_SELECT.next(), root_1);

                adaptor.addChild(root_1, stream_selectList.next());
                adaptor.addChild(root_1, stream_instreamName.next());
                adaptor.addChild(root_1, stream_windowName.next());
                adaptor.addChild(root_1, stream_outstreamName.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }
        
        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectStatement

    public static class selectList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectList
    // streamsql.g:58:1: selectList : selectColumn ( COMMA selectColumn )* -> ^( TOK_SELLIST ( selectColumn )+ ) ;
    public final selectList_return selectList() throws RecognitionException {
        selectList_return retval = new selectList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA12=null;
        selectColumn_return selectColumn11 = null;

        selectColumn_return selectColumn13 = null;


        CommonTree COMMA12_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selectColumn=new RewriteRuleSubtreeStream(adaptor,"rule selectColumn");
        try {
            // streamsql.g:59:3: ( selectColumn ( COMMA selectColumn )* -> ^( TOK_SELLIST ( selectColumn )+ ) )
            // streamsql.g:59:5: selectColumn ( COMMA selectColumn )*
            {
            pushFollow(FOLLOW_selectColumn_in_selectList212);
            selectColumn11=selectColumn();
            _fsp--;

            stream_selectColumn.add(selectColumn11.getTree());
            // streamsql.g:59:18: ( COMMA selectColumn )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // streamsql.g:59:19: COMMA selectColumn
            	    {
            	    COMMA12=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_selectList215); 
            	    stream_COMMA.add(COMMA12);

            	    pushFollow(FOLLOW_selectColumn_in_selectList217);
            	    selectColumn13=selectColumn();
            	    _fsp--;

            	    stream_selectColumn.add(selectColumn13.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: selectColumn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 60:5: -> ^( TOK_SELLIST ( selectColumn )+ )
            {
                // streamsql.g:60:8: ^( TOK_SELLIST ( selectColumn )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELLIST, "TOK_SELLIST"), root_1);

                if ( !(stream_selectColumn.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectColumn.hasNext() ) {
                    adaptor.addChild(root_1, stream_selectColumn.next());

                }
                stream_selectColumn.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectList

    public static class selectColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectColumn
    // streamsql.g:62:1: selectColumn : ( selectItem | selectExpression );
    public final selectColumn_return selectColumn() throws RecognitionException {
        selectColumn_return retval = new selectColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        selectItem_return selectItem14 = null;

        selectExpression_return selectExpression15 = null;



        try {
            // streamsql.g:63:3: ( selectItem | selectExpression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Identifier) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==KW_AS) ) {
                    alt2=1;
                }
                else if ( (LA2_1==LPAREN) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("62:1: selectColumn : ( selectItem | selectExpression );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("62:1: selectColumn : ( selectItem | selectExpression );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // streamsql.g:63:5: selectItem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selectItem_in_selectColumn244);
                    selectItem14=selectItem();
                    _fsp--;

                    adaptor.addChild(root_0, selectItem14.getTree());

                    }
                    break;
                case 2 :
                    // streamsql.g:64:5: selectExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selectExpression_in_selectColumn250);
                    selectExpression15=selectExpression();
                    _fsp--;

                    adaptor.addChild(root_0, selectExpression15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectColumn

    public static class selectItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectItem
    // streamsql.g:66:1: selectItem : Identifier KW_AS Identifier -> ^( TOK_SELITEM Identifier Identifier ) ;
    public final selectItem_return selectItem() throws RecognitionException {
        selectItem_return retval = new selectItem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier16=null;
        Token KW_AS17=null;
        Token Identifier18=null;

        CommonTree Identifier16_tree=null;
        CommonTree KW_AS17_tree=null;
        CommonTree Identifier18_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // streamsql.g:67:3: ( Identifier KW_AS Identifier -> ^( TOK_SELITEM Identifier Identifier ) )
            // streamsql.g:67:5: Identifier KW_AS Identifier
            {
            Identifier16=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectItem262); 
            stream_Identifier.add(Identifier16);

            KW_AS17=(Token)input.LT(1);
            match(input,KW_AS,FOLLOW_KW_AS_in_selectItem264); 
            stream_KW_AS.add(KW_AS17);

            Identifier18=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectItem266); 
            stream_Identifier.add(Identifier18);


            // AST REWRITE
            // elements: Identifier, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:5: -> ^( TOK_SELITEM Identifier Identifier )
            {
                // streamsql.g:68:8: ^( TOK_SELITEM Identifier Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELITEM, "TOK_SELITEM"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                adaptor.addChild(root_1, stream_Identifier.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectItem

    public static class selectExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectExpression
    // streamsql.g:70:1: selectExpression : functionName= Identifier LPAREN itemName= Identifier RPAREN KW_AS asName= Identifier -> ^( TOK_SELEXPR $functionName $itemName $asName) ;
    public final selectExpression_return selectExpression() throws RecognitionException {
        selectExpression_return retval = new selectExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token functionName=null;
        Token itemName=null;
        Token asName=null;
        Token LPAREN19=null;
        Token RPAREN20=null;
        Token KW_AS21=null;

        CommonTree functionName_tree=null;
        CommonTree itemName_tree=null;
        CommonTree asName_tree=null;
        CommonTree LPAREN19_tree=null;
        CommonTree RPAREN20_tree=null;
        CommonTree KW_AS21_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // streamsql.g:71:3: (functionName= Identifier LPAREN itemName= Identifier RPAREN KW_AS asName= Identifier -> ^( TOK_SELEXPR $functionName $itemName $asName) )
            // streamsql.g:71:5: functionName= Identifier LPAREN itemName= Identifier RPAREN KW_AS asName= Identifier
            {
            functionName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectExpression294); 
            stream_Identifier.add(functionName);

            LPAREN19=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_selectExpression296); 
            stream_LPAREN.add(LPAREN19);

            itemName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectExpression300); 
            stream_Identifier.add(itemName);

            RPAREN20=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_selectExpression302); 
            stream_RPAREN.add(RPAREN20);

            KW_AS21=(Token)input.LT(1);
            match(input,KW_AS,FOLLOW_KW_AS_in_selectExpression304); 
            stream_KW_AS.add(KW_AS21);

            asName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_selectExpression308); 
            stream_Identifier.add(asName);


            // AST REWRITE
            // elements: itemName, functionName, asName
            // token labels: itemName, asName, functionName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_itemName=new RewriteRuleTokenStream(adaptor,"token itemName",itemName);
            RewriteRuleTokenStream stream_asName=new RewriteRuleTokenStream(adaptor,"token asName",asName);
            RewriteRuleTokenStream stream_functionName=new RewriteRuleTokenStream(adaptor,"token functionName",functionName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 72:5: -> ^( TOK_SELEXPR $functionName $itemName $asName)
            {
                // streamsql.g:72:8: ^( TOK_SELEXPR $functionName $itemName $asName)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);

                adaptor.addChild(root_1, stream_functionName.next());
                adaptor.addChild(root_1, stream_itemName.next());
                adaptor.addChild(root_1, stream_asName.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectExpression


 

    public static final BitSet FOLLOW_execStatement_in_statement105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statement107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_execStatement130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_execStatement132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SELECT_in_selectStatement157 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_selectList_in_selectStatement159 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_KW_FROM_in_selectStatement161 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_selectStatement165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LSQUARE_in_selectStatement167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_selectStatement171 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RSQUARE_in_selectStatement173 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KW_INTO_in_selectStatement175 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_selectStatement179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectColumn_in_selectList212 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COMMA_in_selectList215 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_selectColumn_in_selectList217 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_selectItem_in_selectColumn244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpression_in_selectColumn250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selectItem262 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KW_AS_in_selectItem264 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_selectItem266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selectExpression294 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_selectExpression296 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_selectExpression300 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_selectExpression302 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KW_AS_in_selectExpression304 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_selectExpression308 = new BitSet(new long[]{0x0000000000000002L});

}