// $ANTLR 3.4 C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g 2013-01-05 23:09:36

  package antlr.flume.output;

  import antlr.flume.lang.ListType;
  import antlr.flume.lang.NullableType;
  import antlr.flume.lang.PreciseType;
  import antlr.flume.lang.Type;

  import org.apache.avro.util.Utf8;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlGrammar extends DebugAbstractSqlParse {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AS", "B", "BETWEEN", "BIGINT", "BINARY", "BOOLEAN", "BY", "C", "COMMA", "COMMENT", "CREATE", "D", "DAYS", "DESCRIBE", "DOT", "DOUBLE", "DROP", "E", "EQ", "ESC_SEQ", "EVENT", "EXPLAIN", "F", "FALSE", "FILE", "FLOAT", "FLOW", "FLOWS", "FOLLOWING", "FORMAT", "FROM", "FUNCTIONS", "G", "GROUP", "GT", "GTEQ", "H", "HAVING", "HEX_DIGIT", "HOURS", "I", "ID", "INT", "INTERVAL", "INT_KW", "IS", "J", "JOIN", "K", "L", "LIST", "LOCAL", "LPAREN", "LT", "LTEQ", "L_AND", "L_OR", "M", "MINUS", "MINUTES", "MONTHS", "N", "NEQ", "NODE", "NOT", "NULL", "O", "OCTAL_ESC", "ON", "OVER", "P", "PERCENT", "PLUS", "PRECEDING", "PRECISE", "PROPERTIES", "Q", "QQ_STRING", "Q_STRING", "R", "RANGE", "RPAREN", "S", "SECONDS", "SELECT", "SHOW", "SLASH", "SOURCE", "STAR", "STREAM", "STREAMS", "STRING_KW", "T", "TIMESTAMP", "TRUE", "U", "UNICODE_ESC", "V", "W", "WEEKS", "WHERE", "WINDOW", "WS", "X", "Y", "YEARS", "Z"
    };

    public static final int EOF=-1;
    public static final int A=4;
    public static final int AS=5;
    public static final int B=6;
    public static final int BETWEEN=7;
    public static final int BIGINT=8;
    public static final int BINARY=9;
    public static final int BOOLEAN=10;
    public static final int BY=11;
    public static final int C=12;
    public static final int COMMA=13;
    public static final int COMMENT=14;
    public static final int CREATE=15;
    public static final int D=16;
    public static final int DAYS=17;
    public static final int DESCRIBE=18;
    public static final int DOT=19;
    public static final int DOUBLE=20;
    public static final int DROP=21;
    public static final int E=22;
    public static final int EQ=23;
    public static final int ESC_SEQ=24;
    public static final int EVENT=25;
    public static final int EXPLAIN=26;
    public static final int F=27;
    public static final int FALSE=28;
    public static final int FILE=29;
    public static final int FLOAT=30;
    public static final int FLOW=31;
    public static final int FLOWS=32;
    public static final int FOLLOWING=33;
    public static final int FORMAT=34;
    public static final int FROM=35;
    public static final int FUNCTIONS=36;
    public static final int G=37;
    public static final int GROUP=38;
    public static final int GT=39;
    public static final int GTEQ=40;
    public static final int H=41;
    public static final int HAVING=42;
    public static final int HEX_DIGIT=43;
    public static final int HOURS=44;
    public static final int I=45;
    public static final int ID=46;
    public static final int INT=47;
    public static final int INTERVAL=48;
    public static final int INT_KW=49;
    public static final int IS=50;
    public static final int J=51;
    public static final int JOIN=52;
    public static final int K=53;
    public static final int L=54;
    public static final int LIST=55;
    public static final int LOCAL=56;
    public static final int LPAREN=57;
    public static final int LT=58;
    public static final int LTEQ=59;
    public static final int L_AND=60;
    public static final int L_OR=61;
    public static final int M=62;
    public static final int MINUS=63;
    public static final int MINUTES=64;
    public static final int MONTHS=65;
    public static final int N=66;
    public static final int NEQ=67;
    public static final int NODE=68;
    public static final int NOT=69;
    public static final int NULL=70;
    public static final int O=71;
    public static final int OCTAL_ESC=72;
    public static final int ON=73;
    public static final int OVER=74;
    public static final int P=75;
    public static final int PERCENT=76;
    public static final int PLUS=77;
    public static final int PRECEDING=78;
    public static final int PRECISE=79;
    public static final int PROPERTIES=80;
    public static final int Q=81;
    public static final int QQ_STRING=82;
    public static final int Q_STRING=83;
    public static final int R=84;
    public static final int RANGE=85;
    public static final int RPAREN=86;
    public static final int S=87;
    public static final int SECONDS=88;
    public static final int SELECT=89;
    public static final int SHOW=90;
    public static final int SLASH=91;
    public static final int SOURCE=92;
    public static final int STAR=93;
    public static final int STREAM=94;
    public static final int STREAMS=95;
    public static final int STRING_KW=96;
    public static final int T=97;
    public static final int TIMESTAMP=98;
    public static final int TRUE=99;
    public static final int U=100;
    public static final int UNICODE_ESC=101;
    public static final int V=102;
    public static final int W=103;
    public static final int WEEKS=104;
    public static final int WHERE=105;
    public static final int WINDOW=106;
    public static final int WS=107;
    public static final int X=108;
    public static final int Y=109;
    public static final int YEARS=110;
    public static final int Z=111;

    // delegates
    public AbstractSqlParse[] getDelegates() {
        return new AbstractSqlParse[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "stmt_explain", "precise_type", "or_expr", "mul_op", 
    "expr", "optional_format_spec", "optional_group_by", "stmt_create_stream", 
    "stmt_select", "comp_expr", "field_type", "primitive_field_type", "range_spec", 
    "mul_expr", "atom_expr", "window_spec", "time_width", "stmt_describe", 
    "stmt_show", "add_op", "list_type", "top", "stmt", "stream_sel", "optional_having", 
    "field_sel", "unary_expr", "comp_op", "stmt_drop", "maybe_qualified_user_sel", 
    "src_spec", "typed_field_list", "add_expr", "unary_null_expr", "field_spec", 
    "eq_op", "un_op", "field_sel_list", "inline_window_spec", "src_type", 
    "aliased_expr", "integer", "optional_where_conditions", "optional_window_defs", 
    "aliased_expr_list", "non_nul_qualifier", "user_sel", "scalar_field_type", 
    "source_definition", "and_expr", "optional_window_over", "eq_expr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SqlGrammar(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SqlGrammar(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public SqlGrammar(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return SqlGrammar.tokenNames; }
    public String getGrammarFileName() { return "C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g"; }


    public static class top_return extends ParserRuleReturnScope {
        public SQLStatement val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "top"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:39:1: top returns [SQLStatement val] : s= stmt EOF ;
    public final SqlGrammar.top_return top() throws RecognitionException {
        SqlGrammar.top_return retval = new SqlGrammar.top_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF1=null;
        SqlGrammar.stmt_return s =null;


        Object EOF1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "top");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:39:31: (s= stmt EOF )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:40:3: s= stmt EOF
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(40,4);
            pushFollow(FOLLOW_stmt_in_top84);
            s=stmt();

            state._fsp--;

            adaptor.addChild(root_0, s.getTree());
            dbg.location(40,10);
            retval.val = (s!=null?s.val:null);
            dbg.location(40,27);
            EOF1=(Token)match(input,EOF,FOLLOW_EOF_in_top88); 
            EOF1_tree = 
            (Object)adaptor.create(EOF1)
            ;
            adaptor.addChild(root_0, EOF1_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(40, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "top");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "top"


    public static class stmt_return extends ParserRuleReturnScope {
        public SQLStatement val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:42:1: stmt returns [SQLStatement val] : (cs= stmt_create_stream |sel= stmt_select |expl= stmt_explain |desc= stmt_describe |show= stmt_show |drop= stmt_drop );
    public final SqlGrammar.stmt_return stmt() throws RecognitionException {
        SqlGrammar.stmt_return retval = new SqlGrammar.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.stmt_create_stream_return cs =null;

        SqlGrammar.stmt_select_return sel =null;

        SqlGrammar.stmt_explain_return expl =null;

        SqlGrammar.stmt_describe_return desc =null;

        SqlGrammar.stmt_show_return show =null;

        SqlGrammar.stmt_drop_return drop =null;



        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:42:32: (cs= stmt_create_stream |sel= stmt_select |expl= stmt_explain |desc= stmt_describe |show= stmt_show |drop= stmt_drop )
            int alt1=6;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            switch ( input.LA(1) ) {
            case CREATE:
                {
                alt1=1;
                }
                break;
            case SELECT:
                {
                alt1=2;
                }
                break;
            case EXPLAIN:
                {
                alt1=3;
                }
                break;
            case DESCRIBE:
                {
                alt1=4;
                }
                break;
            case SHOW:
                {
                alt1=5;
                }
                break;
            case DROP:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:43:5: cs= stmt_create_stream
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(43,7);
                    pushFollow(FOLLOW_stmt_create_stream_in_stmt105);
                    cs=stmt_create_stream();

                    state._fsp--;

                    adaptor.addChild(root_0, cs.getTree());
                    dbg.location(43,27);
                    retval.val = (cs!=null?cs.val:null);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:44:5: sel= stmt_select
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(44,8);
                    pushFollow(FOLLOW_stmt_select_in_stmt115);
                    sel=stmt_select();

                    state._fsp--;

                    adaptor.addChild(root_0, sel.getTree());
                    dbg.location(44,21);
                    retval.val = (sel!=null?sel.val:null);

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:45:5: expl= stmt_explain
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(45,9);
                    pushFollow(FOLLOW_stmt_explain_in_stmt125);
                    expl=stmt_explain();

                    state._fsp--;

                    adaptor.addChild(root_0, expl.getTree());
                    dbg.location(45,23);
                    retval.val = (expl!=null?expl.val:null);

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:46:5: desc= stmt_describe
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(46,9);
                    pushFollow(FOLLOW_stmt_describe_in_stmt135);
                    desc=stmt_describe();

                    state._fsp--;

                    adaptor.addChild(root_0, desc.getTree());
                    dbg.location(46,24);
                    retval.val = (desc!=null?desc.val:null);

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:47:5: show= stmt_show
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(47,9);
                    pushFollow(FOLLOW_stmt_show_in_stmt145);
                    show=stmt_show();

                    state._fsp--;

                    adaptor.addChild(root_0, show.getTree());
                    dbg.location(47,20);
                    retval.val = (show!=null?show.val:null);

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:48:5: drop= stmt_drop
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(48,9);
                    pushFollow(FOLLOW_stmt_drop_in_stmt155);
                    drop=stmt_drop();

                    state._fsp--;

                    adaptor.addChild(root_0, drop.getTree());
                    dbg.location(48,20);
                    retval.val = (drop!=null?drop.val:null);

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt"


    public static class stmt_create_stream_return extends ParserRuleReturnScope {
        public SQLStatement val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_create_stream"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:51:1: stmt_create_stream returns [SQLStatement val] : ( CREATE STREAM sid= stream_sel fields= typed_field_list FROM (lcl= LOCAL )? st= src_type src= src_spec sfmt= optional_format_spec | CREATE STREAM nm= stream_sel AS sel= stmt_select );
    public final SqlGrammar.stmt_create_stream_return stmt_create_stream() throws RecognitionException {
        SqlGrammar.stmt_create_stream_return retval = new SqlGrammar.stmt_create_stream_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token lcl=null;
        Token CREATE2=null;
        Token STREAM3=null;
        Token FROM4=null;
        Token CREATE5=null;
        Token STREAM6=null;
        Token AS7=null;
        SqlGrammar.stream_sel_return sid =null;

        SqlGrammar.typed_field_list_return fields =null;

        SqlGrammar.src_type_return st =null;

        SqlGrammar.src_spec_return src =null;

        SqlGrammar.optional_format_spec_return sfmt =null;

        SqlGrammar.stream_sel_return nm =null;

        SqlGrammar.stmt_select_return sel =null;


        Object lcl_tree=null;
        Object CREATE2_tree=null;
        Object STREAM3_tree=null;
        Object FROM4_tree=null;
        Object CREATE5_tree=null;
        Object STREAM6_tree=null;
        Object AS7_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmt_create_stream");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:51:46: ( CREATE STREAM sid= stream_sel fields= typed_field_list FROM (lcl= LOCAL )? st= src_type src= src_spec sfmt= optional_format_spec | CREATE STREAM nm= stream_sel AS sel= stmt_select )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==CREATE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==STREAM) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==ID) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==LPAREN) ) {
                            alt3=1;
                        }
                        else if ( (LA3_3==AS) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else if ( (LA3_2==QQ_STRING) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==LPAREN) ) {
                            alt3=1;
                        }
                        else if ( (LA3_4==AS) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:52:5: CREATE STREAM sid= stream_sel fields= typed_field_list FROM (lcl= LOCAL )? st= src_type src= src_spec sfmt= optional_format_spec
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(52,5);
                    CREATE2=(Token)match(input,CREATE,FOLLOW_CREATE_in_stmt_create_stream175); 
                    CREATE2_tree = 
                    (Object)adaptor.create(CREATE2)
                    ;
                    adaptor.addChild(root_0, CREATE2_tree);

                    dbg.location(52,12);
                    STREAM3=(Token)match(input,STREAM,FOLLOW_STREAM_in_stmt_create_stream177); 
                    STREAM3_tree = 
                    (Object)adaptor.create(STREAM3)
                    ;
                    adaptor.addChild(root_0, STREAM3_tree);

                    dbg.location(52,22);
                    pushFollow(FOLLOW_stream_sel_in_stmt_create_stream181);
                    sid=stream_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, sid.getTree());
                    dbg.location(52,40);
                    pushFollow(FOLLOW_typed_field_list_in_stmt_create_stream185);
                    fields=typed_field_list();

                    state._fsp--;

                    adaptor.addChild(root_0, fields.getTree());
                    dbg.location(52,58);
                    FROM4=(Token)match(input,FROM,FOLLOW_FROM_in_stmt_create_stream187); 
                    FROM4_tree = 
                    (Object)adaptor.create(FROM4)
                    ;
                    adaptor.addChild(root_0, FROM4_tree);

                    dbg.location(52,66);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:52:66: (lcl= LOCAL )?
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==LOCAL) ) {
                        alt2=1;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:52:66: lcl= LOCAL
                            {
                            dbg.location(52,66);
                            lcl=(Token)match(input,LOCAL,FOLLOW_LOCAL_in_stmt_create_stream191); 
                            lcl_tree = 
                            (Object)adaptor.create(lcl)
                            ;
                            adaptor.addChild(root_0, lcl_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}

                    dbg.location(52,76);
                    pushFollow(FOLLOW_src_type_in_stmt_create_stream196);
                    st=src_type();

                    state._fsp--;

                    adaptor.addChild(root_0, st.getTree());
                    dbg.location(52,89);
                    pushFollow(FOLLOW_src_spec_in_stmt_create_stream200);
                    src=src_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, src.getTree());
                    dbg.location(53,9);

                              boolean srcIsLocal = lcl != null;
                              retval.val = new CreateStreamStmt((sid!=null?sid.val:null),
                                  (st!=null?st.val:null), (src!=null?src.val:null), srcIsLocal, (fields!=null?fields.val:null));
                            
                    dbg.location(58,11);
                    pushFollow(FOLLOW_optional_format_spec_in_stmt_create_stream220);
                    sfmt=optional_format_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, sfmt.getTree());
                    dbg.location(58,33);
                     ((CreateStreamStmt) retval.val).setFormatSpec((sfmt!=null?sfmt.val:null)); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:59:5: CREATE STREAM nm= stream_sel AS sel= stmt_select
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(59,5);
                    CREATE5=(Token)match(input,CREATE,FOLLOW_CREATE_in_stmt_create_stream228); 
                    CREATE5_tree = 
                    (Object)adaptor.create(CREATE5)
                    ;
                    adaptor.addChild(root_0, CREATE5_tree);

                    dbg.location(59,12);
                    STREAM6=(Token)match(input,STREAM,FOLLOW_STREAM_in_stmt_create_stream230); 
                    STREAM6_tree = 
                    (Object)adaptor.create(STREAM6)
                    ;
                    adaptor.addChild(root_0, STREAM6_tree);

                    dbg.location(59,21);
                    pushFollow(FOLLOW_stream_sel_in_stmt_create_stream234);
                    nm=stream_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, nm.getTree());
                    dbg.location(59,33);
                    AS7=(Token)match(input,AS,FOLLOW_AS_in_stmt_create_stream236); 
                    AS7_tree = 
                    (Object)adaptor.create(AS7)
                    ;
                    adaptor.addChild(root_0, AS7_tree);

                    dbg.location(59,39);
                    pushFollow(FOLLOW_stmt_select_in_stmt_create_stream240);
                    sel=stmt_select();

                    state._fsp--;

                    adaptor.addChild(root_0, sel.getTree());
                    dbg.location(60,9);

                              (sel!=null?sel.val:null).setOutputName((nm!=null?nm.val:null));
                              retval.val = (sel!=null?sel.val:null);
                            

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(64, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_create_stream");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt_create_stream"


    public static class stmt_describe_return extends ParserRuleReturnScope {
        public DescribeStmt val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_describe"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:66:1: stmt_describe returns [DescribeStmt val] : DESCRIBE id= user_sel ;
    public final SqlGrammar.stmt_describe_return stmt_describe() throws RecognitionException {
        SqlGrammar.stmt_describe_return retval = new SqlGrammar.stmt_describe_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DESCRIBE8=null;
        SqlGrammar.user_sel_return id =null;


        Object DESCRIBE8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmt_describe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:66:41: ( DESCRIBE id= user_sel )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:67:3: DESCRIBE id= user_sel
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(67,3);
            DESCRIBE8=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_stmt_describe266); 
            DESCRIBE8_tree = 
            (Object)adaptor.create(DESCRIBE8)
            ;
            adaptor.addChild(root_0, DESCRIBE8_tree);

            dbg.location(67,14);
            pushFollow(FOLLOW_user_sel_in_stmt_describe270);
            id=user_sel();

            state._fsp--;

            adaptor.addChild(root_0, id.getTree());
            dbg.location(67,24);
            retval.val = new DescribeStmt((id!=null?id.val:null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(67, 58);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_describe");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt_describe"


    public static class stmt_explain_return extends ParserRuleReturnScope {
        public ExplainStmt val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_explain"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:69:1: stmt_explain returns [ExplainStmt val] : EXPLAIN s= stmt ;
    public final SqlGrammar.stmt_explain_return stmt_explain() throws RecognitionException {
        SqlGrammar.stmt_explain_return retval = new SqlGrammar.stmt_explain_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXPLAIN9=null;
        SqlGrammar.stmt_return s =null;


        Object EXPLAIN9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmt_explain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:69:39: ( EXPLAIN s= stmt )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:70:3: EXPLAIN s= stmt
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(70,3);
            EXPLAIN9=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_stmt_explain285); 
            EXPLAIN9_tree = 
            (Object)adaptor.create(EXPLAIN9)
            ;
            adaptor.addChild(root_0, EXPLAIN9_tree);

            dbg.location(70,12);
            pushFollow(FOLLOW_stmt_in_stmt_explain289);
            s=stmt();

            state._fsp--;

            adaptor.addChild(root_0, s.getTree());
            dbg.location(70,18);
            retval.val = new ExplainStmt((s!=null?s.val:null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(70, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_explain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt_explain"


    public static class stmt_select_return extends ParserRuleReturnScope {
        public SelectStmt val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_select"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:72:1: stmt_select returns [SelectStmt val] : SELECT e= aliased_expr_list FROM s= source_definition w= optional_where_conditions g= optional_group_by over= optional_window_over h= optional_having wins= optional_window_defs ;
    public final SqlGrammar.stmt_select_return stmt_select() throws RecognitionException {
        SqlGrammar.stmt_select_return retval = new SqlGrammar.stmt_select_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT10=null;
        Token FROM11=null;
        SqlGrammar.aliased_expr_list_return e =null;

        SqlGrammar.source_definition_return s =null;

        SqlGrammar.optional_where_conditions_return w =null;

        SqlGrammar.optional_group_by_return g =null;

        SqlGrammar.optional_window_over_return over =null;

        SqlGrammar.optional_having_return h =null;

        SqlGrammar.optional_window_defs_return wins =null;


        Object SELECT10_tree=null;
        Object FROM11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmt_select");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:72:37: ( SELECT e= aliased_expr_list FROM s= source_definition w= optional_where_conditions g= optional_group_by over= optional_window_over h= optional_having wins= optional_window_defs )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:73:3: SELECT e= aliased_expr_list FROM s= source_definition w= optional_where_conditions g= optional_group_by over= optional_window_over h= optional_having wins= optional_window_defs
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(73,3);
            SELECT10=(Token)match(input,SELECT,FOLLOW_SELECT_in_stmt_select304); 
            SELECT10_tree = 
            (Object)adaptor.create(SELECT10)
            ;
            adaptor.addChild(root_0, SELECT10_tree);

            dbg.location(73,11);
            pushFollow(FOLLOW_aliased_expr_list_in_stmt_select308);
            e=aliased_expr_list();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
            dbg.location(73,30);
            FROM11=(Token)match(input,FROM,FOLLOW_FROM_in_stmt_select310); 
            FROM11_tree = 
            (Object)adaptor.create(FROM11)
            ;
            adaptor.addChild(root_0, FROM11_tree);

            dbg.location(73,36);
            pushFollow(FOLLOW_source_definition_in_stmt_select314);
            s=source_definition();

            state._fsp--;

            adaptor.addChild(root_0, s.getTree());
            dbg.location(73,56);
            pushFollow(FOLLOW_optional_where_conditions_in_stmt_select318);
            w=optional_where_conditions();

            state._fsp--;

            adaptor.addChild(root_0, w.getTree());
            dbg.location(74,4);
            pushFollow(FOLLOW_optional_group_by_in_stmt_select324);
            g=optional_group_by();

            state._fsp--;

            adaptor.addChild(root_0, g.getTree());
            dbg.location(74,27);
            pushFollow(FOLLOW_optional_window_over_in_stmt_select328);
            over=optional_window_over();

            state._fsp--;

            adaptor.addChild(root_0, over.getTree());
            dbg.location(75,4);
            pushFollow(FOLLOW_optional_having_in_stmt_select334);
            h=optional_having();

            state._fsp--;

            adaptor.addChild(root_0, h.getTree());
            dbg.location(76,7);
            pushFollow(FOLLOW_optional_window_defs_in_stmt_select340);
            wins=optional_window_defs();

            state._fsp--;

            adaptor.addChild(root_0, wins.getTree());
            dbg.location(77,3);
             retval.val = new SelectStmt((e!=null?e.val:null), (s!=null?s.val:null), (w!=null?w.val:null), (g!=null?g.val:null), (over!=null?over.val:null), (h!=null?h.val:null), (wins!=null?wins.val:null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(77, 90);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_select");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt_select"


    public static class stmt_show_return extends ParserRuleReturnScope {
        public ShowStmt val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_show"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:79:1: stmt_show returns [ShowStmt val] : ( SHOW FLOWS | SHOW STREAMS | SHOW FUNCTIONS );
    public final SqlGrammar.stmt_show_return stmt_show() throws RecognitionException {
        SqlGrammar.stmt_show_return retval = new SqlGrammar.stmt_show_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SHOW12=null;
        Token FLOWS13=null;
        Token SHOW14=null;
        Token STREAMS15=null;
        Token SHOW16=null;
        Token FUNCTIONS17=null;

        Object SHOW12_tree=null;
        Object FLOWS13_tree=null;
        Object SHOW14_tree=null;
        Object STREAMS15_tree=null;
        Object SHOW16_tree=null;
        Object FUNCTIONS17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmt_show");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:79:33: ( SHOW FLOWS | SHOW STREAMS | SHOW FUNCTIONS )
            int alt4=3;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==SHOW) ) {
                switch ( input.LA(2) ) {
                case FLOWS:
                    {
                    alt4=1;
                    }
                    break;
                case STREAMS:
                    {
                    alt4=2;
                    }
                    break;
                case FUNCTIONS:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:80:5: SHOW FLOWS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(80,5);
                    SHOW12=(Token)match(input,SHOW,FOLLOW_SHOW_in_stmt_show359); 
                    SHOW12_tree = 
                    (Object)adaptor.create(SHOW12)
                    ;
                    adaptor.addChild(root_0, SHOW12_tree);

                    dbg.location(80,10);
                    FLOWS13=(Token)match(input,FLOWS,FOLLOW_FLOWS_in_stmt_show361); 
                    FLOWS13_tree = 
                    (Object)adaptor.create(FLOWS13)
                    ;
                    adaptor.addChild(root_0, FLOWS13_tree);

                    dbg.location(80,16);
                    retval.val = new ShowStmt(EntityTarget.Flow);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:81:5: SHOW STREAMS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(81,5);
                    SHOW14=(Token)match(input,SHOW,FOLLOW_SHOW_in_stmt_show369); 
                    SHOW14_tree = 
                    (Object)adaptor.create(SHOW14)
                    ;
                    adaptor.addChild(root_0, SHOW14_tree);

                    dbg.location(81,10);
                    STREAMS15=(Token)match(input,STREAMS,FOLLOW_STREAMS_in_stmt_show371); 
                    STREAMS15_tree = 
                    (Object)adaptor.create(STREAMS15)
                    ;
                    adaptor.addChild(root_0, STREAMS15_tree);

                    dbg.location(81,18);
                    retval.val = new ShowStmt(EntityTarget.Stream);

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:82:5: SHOW FUNCTIONS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(82,5);
                    SHOW16=(Token)match(input,SHOW,FOLLOW_SHOW_in_stmt_show379); 
                    SHOW16_tree = 
                    (Object)adaptor.create(SHOW16)
                    ;
                    adaptor.addChild(root_0, SHOW16_tree);

                    dbg.location(82,10);
                    FUNCTIONS17=(Token)match(input,FUNCTIONS,FOLLOW_FUNCTIONS_in_stmt_show381); 
                    FUNCTIONS17_tree = 
                    (Object)adaptor.create(FUNCTIONS17)
                    ;
                    adaptor.addChild(root_0, FUNCTIONS17_tree);

                    dbg.location(82,20);
                    retval.val = new ShowStmt(EntityTarget.Function);

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(83, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_show");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt_show"


    public static class stmt_drop_return extends ParserRuleReturnScope {
        public DropStmt val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_drop"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:85:1: stmt_drop returns [DropStmt val] : ( DROP FLOW f= user_sel | DROP STREAM s= stream_sel );
    public final SqlGrammar.stmt_drop_return stmt_drop() throws RecognitionException {
        SqlGrammar.stmt_drop_return retval = new SqlGrammar.stmt_drop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP18=null;
        Token FLOW19=null;
        Token DROP20=null;
        Token STREAM21=null;
        SqlGrammar.user_sel_return f =null;

        SqlGrammar.stream_sel_return s =null;


        Object DROP18_tree=null;
        Object FLOW19_tree=null;
        Object DROP20_tree=null;
        Object STREAM21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmt_drop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:85:33: ( DROP FLOW f= user_sel | DROP STREAM s= stream_sel )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==DROP) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==FLOW) ) {
                    alt5=1;
                }
                else if ( (LA5_1==STREAM) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:86:5: DROP FLOW f= user_sel
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(86,5);
                    DROP18=(Token)match(input,DROP,FOLLOW_DROP_in_stmt_drop401); 
                    DROP18_tree = 
                    (Object)adaptor.create(DROP18)
                    ;
                    adaptor.addChild(root_0, DROP18_tree);

                    dbg.location(86,10);
                    FLOW19=(Token)match(input,FLOW,FOLLOW_FLOW_in_stmt_drop403); 
                    FLOW19_tree = 
                    (Object)adaptor.create(FLOW19)
                    ;
                    adaptor.addChild(root_0, FLOW19_tree);

                    dbg.location(86,16);
                    pushFollow(FOLLOW_user_sel_in_stmt_drop407);
                    f=user_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, f.getTree());
                    dbg.location(86,26);
                    retval.val = new DropStmt(EntityTarget.Flow, (f!=null?f.val:null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:87:5: DROP STREAM s= stream_sel
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(87,5);
                    DROP20=(Token)match(input,DROP,FOLLOW_DROP_in_stmt_drop415); 
                    DROP20_tree = 
                    (Object)adaptor.create(DROP20)
                    ;
                    adaptor.addChild(root_0, DROP20_tree);

                    dbg.location(87,10);
                    STREAM21=(Token)match(input,STREAM,FOLLOW_STREAM_in_stmt_drop417); 
                    STREAM21_tree = 
                    (Object)adaptor.create(STREAM21)
                    ;
                    adaptor.addChild(root_0, STREAM21_tree);

                    dbg.location(87,18);
                    pushFollow(FOLLOW_stream_sel_in_stmt_drop421);
                    s=stream_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, s.getTree());
                    dbg.location(87,30);
                    retval.val = new DropStmt(EntityTarget.Stream, (s!=null?s.val:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(87, 80);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_drop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt_drop"


    public static class aliased_expr_list_return extends ParserRuleReturnScope {
        public List<AliasedExpr> val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliased_expr_list"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:108:1: aliased_expr_list returns [List<AliasedExpr> val] : (e1= aliased_expr ( COMMA e2= aliased_expr )* )? ;
    public final SqlGrammar.aliased_expr_list_return aliased_expr_list() throws RecognitionException {
        SqlGrammar.aliased_expr_list_return retval = new SqlGrammar.aliased_expr_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA22=null;
        SqlGrammar.aliased_expr_return e1 =null;

        SqlGrammar.aliased_expr_return e2 =null;


        Object COMMA22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "aliased_expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:108:50: ( (e1= aliased_expr ( COMMA e2= aliased_expr )* )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:109:5: (e1= aliased_expr ( COMMA e2= aliased_expr )* )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(109,5);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:109:5: (e1= aliased_expr ( COMMA e2= aliased_expr )* )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==FALSE||(LA7_0 >= ID && LA7_0 <= INT)||LA7_0==LPAREN||LA7_0==MINUS||(LA7_0 >= NOT && LA7_0 <= NULL)||LA7_0==PLUS||(LA7_0 >= QQ_STRING && LA7_0 <= Q_STRING)||LA7_0==STAR||LA7_0==TRUE) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:109:7: e1= aliased_expr ( COMMA e2= aliased_expr )*
                    {
                    dbg.location(109,9);
                    pushFollow(FOLLOW_aliased_expr_in_aliased_expr_list461);
                    e1=aliased_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, e1.getTree());
                    dbg.location(109,23);
                     retval.val = new ArrayList<AliasedExpr>(); retval.val.add((e1!=null?e1.val:null)); 
                    dbg.location(110,7);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:110:7: ( COMMA e2= aliased_expr )*
                    try { dbg.enterSubRule(6);

                    loop6:
                    do {
                        int alt6=2;
                        try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        } finally {dbg.exitDecision(6);}

                        switch (alt6) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:110:9: COMMA e2= aliased_expr
                    	    {
                    	    dbg.location(110,9);
                    	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliased_expr_list473); 
                    	    COMMA22_tree = 
                    	    (Object)adaptor.create(COMMA22)
                    	    ;
                    	    adaptor.addChild(root_0, COMMA22_tree);

                    	    dbg.location(110,17);
                    	    pushFollow(FOLLOW_aliased_expr_in_aliased_expr_list477);
                    	    e2=aliased_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, e2.getTree());
                    	    dbg.location(110,31);
                    	     retval.val.add((e2!=null?e2.val:null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(110, 58);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "aliased_expr_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "aliased_expr_list"


    public static class aliased_expr_return extends ParserRuleReturnScope {
        public AliasedExpr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliased_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:112:1: aliased_expr returns [AliasedExpr val] : e= expr ( ( AS )? u= user_sel )? ;
    public final SqlGrammar.aliased_expr_return aliased_expr() throws RecognitionException {
        SqlGrammar.aliased_expr_return retval = new SqlGrammar.aliased_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS23=null;
        SqlGrammar.expr_return e =null;

        SqlGrammar.user_sel_return u =null;


        Object AS23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "aliased_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:112:39: (e= expr ( ( AS )? u= user_sel )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:113:5: e= expr ( ( AS )? u= user_sel )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(113,6);
            pushFollow(FOLLOW_expr_in_aliased_expr502);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
            dbg.location(113,12);
             retval.val = new AliasedExpr((e!=null?e.val:null)); 
            dbg.location(114,9);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:114:9: ( ( AS )? u= user_sel )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==AS||LA9_0==ID||LA9_0==QQ_STRING) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:114:11: ( AS )? u= user_sel
                    {
                    dbg.location(114,11);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:114:11: ( AS )?
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==AS) ) {
                        alt8=1;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:114:11: AS
                            {
                            dbg.location(114,11);
                            AS23=(Token)match(input,AS,FOLLOW_AS_in_aliased_expr516); 
                            AS23_tree = 
                            (Object)adaptor.create(AS23)
                            ;
                            adaptor.addChild(root_0, AS23_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(114,16);
                    pushFollow(FOLLOW_user_sel_in_aliased_expr521);
                    u=user_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, u.getTree());
                    dbg.location(114,26);
                     ((AliasedExpr) retval.val).setUserAlias((u!=null?u.val:null)); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(115, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "aliased_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "aliased_expr"


    public static class expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:117:1: expr returns [Expr val] : e= or_expr ;
    public final SqlGrammar.expr_return expr() throws RecognitionException {
        SqlGrammar.expr_return retval = new SqlGrammar.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.or_expr_return e =null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:117:24: (e= or_expr )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:117:26: e= or_expr
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(117,27);
            pushFollow(FOLLOW_or_expr_in_expr542);
            e=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
            dbg.location(117,36);
             retval.val =(e!=null?e.val:null); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(117, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class or_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:119:1: or_expr returns [Expr val] : a1= and_expr ( L_OR a2= and_expr )* ;
    public final SqlGrammar.or_expr_return or_expr() throws RecognitionException {
        SqlGrammar.or_expr_return retval = new SqlGrammar.or_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_OR24=null;
        SqlGrammar.and_expr_return a1 =null;

        SqlGrammar.and_expr_return a2 =null;


        Object L_OR24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "or_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:119:27: (a1= and_expr ( L_OR a2= and_expr )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:120:5: a1= and_expr ( L_OR a2= and_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(120,7);
            pushFollow(FOLLOW_and_expr_in_or_expr561);
            a1=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            dbg.location(120,17);
             retval.val =(a1!=null?a1.val:null); 
            dbg.location(121,9);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:121:9: ( L_OR a2= and_expr )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==L_OR) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:121:11: L_OR a2= and_expr
            	    {
            	    dbg.location(121,11);
            	    L_OR24=(Token)match(input,L_OR,FOLLOW_L_OR_in_or_expr575); 
            	    L_OR24_tree = 
            	    (Object)adaptor.create(L_OR24)
            	    ;
            	    adaptor.addChild(root_0, L_OR24_tree);

            	    dbg.location(121,18);
            	    pushFollow(FOLLOW_and_expr_in_or_expr579);
            	    a2=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a2.getTree());
            	    dbg.location(121,28);
            	     retval.val = new BinExpr(retval.val, BinOp.Or, (a2!=null?a2.val:null)); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(122, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "or_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "or_expr"


    public static class and_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:124:1: and_expr returns [Expr val] : a1= eq_expr ( L_AND a2= eq_expr )* ;
    public final SqlGrammar.and_expr_return and_expr() throws RecognitionException {
        SqlGrammar.and_expr_return retval = new SqlGrammar.and_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_AND25=null;
        SqlGrammar.eq_expr_return a1 =null;

        SqlGrammar.eq_expr_return a2 =null;


        Object L_AND25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "and_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:124:28: (a1= eq_expr ( L_AND a2= eq_expr )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:125:5: a1= eq_expr ( L_AND a2= eq_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(125,7);
            pushFollow(FOLLOW_eq_expr_in_and_expr604);
            a1=eq_expr();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            dbg.location(125,16);
             retval.val =(a1!=null?a1.val:null); 
            dbg.location(126,9);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:126:9: ( L_AND a2= eq_expr )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==L_AND) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:126:11: L_AND a2= eq_expr
            	    {
            	    dbg.location(126,11);
            	    L_AND25=(Token)match(input,L_AND,FOLLOW_L_AND_in_and_expr618); 
            	    L_AND25_tree = 
            	    (Object)adaptor.create(L_AND25)
            	    ;
            	    adaptor.addChild(root_0, L_AND25_tree);

            	    dbg.location(126,19);
            	    pushFollow(FOLLOW_eq_expr_in_and_expr622);
            	    a2=eq_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a2.getTree());
            	    dbg.location(126,28);
            	     retval.val = new BinExpr(retval.val, BinOp.And, (a2!=null?a2.val:null)); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(127, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "and_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "and_expr"


    public static class eq_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:129:1: eq_expr returns [Expr val] : a1= comp_expr (op= eq_op a2= comp_expr )* ;
    public final SqlGrammar.eq_expr_return eq_expr() throws RecognitionException {
        SqlGrammar.eq_expr_return retval = new SqlGrammar.eq_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.comp_expr_return a1 =null;

        SqlGrammar.eq_op_return op =null;

        SqlGrammar.comp_expr_return a2 =null;



        try { dbg.enterRule(getGrammarFileName(), "eq_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:129:27: (a1= comp_expr (op= eq_op a2= comp_expr )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:130:5: a1= comp_expr (op= eq_op a2= comp_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(130,7);
            pushFollow(FOLLOW_comp_expr_in_eq_expr647);
            a1=comp_expr();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            dbg.location(130,18);
             retval.val =(a1!=null?a1.val:null); 
            dbg.location(131,9);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:131:9: (op= eq_op a2= comp_expr )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==EQ||LA12_0==NEQ) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:131:11: op= eq_op a2= comp_expr
            	    {
            	    dbg.location(131,13);
            	    pushFollow(FOLLOW_eq_op_in_eq_expr663);
            	    op=eq_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op.getTree());
            	    dbg.location(131,22);
            	    pushFollow(FOLLOW_comp_expr_in_eq_expr667);
            	    a2=comp_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a2.getTree());
            	    dbg.location(131,33);
            	     retval.val = new BinExpr(retval.val, (op!=null?op.val:null), (a2!=null?a2.val:null)); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(132, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eq_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eq_expr"


    public static class eq_op_return extends ParserRuleReturnScope {
        public BinOp val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_op"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:134:1: eq_op returns [BinOp val] : ( EQ | NEQ );
    public final SqlGrammar.eq_op_return eq_op() throws RecognitionException {
        SqlGrammar.eq_op_return retval = new SqlGrammar.eq_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQ26=null;
        Token NEQ27=null;

        Object EQ26_tree=null;
        Object NEQ27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "eq_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:134:26: ( EQ | NEQ )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQ) ) {
                alt13=1;
            }
            else if ( (LA13_0==NEQ) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:135:5: EQ
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(135,5);
                    EQ26=(Token)match(input,EQ,FOLLOW_EQ_in_eq_op690); 
                    EQ26_tree = 
                    (Object)adaptor.create(EQ26)
                    ;
                    adaptor.addChild(root_0, EQ26_tree);

                    dbg.location(135,8);
                     retval.val = BinOp.Eq; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:136:5: NEQ
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(136,5);
                    NEQ27=(Token)match(input,NEQ,FOLLOW_NEQ_in_eq_op698); 
                    NEQ27_tree = 
                    (Object)adaptor.create(NEQ27)
                    ;
                    adaptor.addChild(root_0, NEQ27_tree);

                    dbg.location(136,9);
                     retval.val = BinOp.NotEq; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(137, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eq_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eq_op"


    public static class comp_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:139:1: comp_expr returns [Expr val] : a1= add_expr (op= comp_op a2= add_expr )* ;
    public final SqlGrammar.comp_expr_return comp_expr() throws RecognitionException {
        SqlGrammar.comp_expr_return retval = new SqlGrammar.comp_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.add_expr_return a1 =null;

        SqlGrammar.comp_op_return op =null;

        SqlGrammar.add_expr_return a2 =null;



        try { dbg.enterRule(getGrammarFileName(), "comp_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:139:29: (a1= add_expr (op= comp_op a2= add_expr )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:140:5: a1= add_expr (op= comp_op a2= add_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(140,7);
            pushFollow(FOLLOW_add_expr_in_comp_expr720);
            a1=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            dbg.location(140,17);
             retval.val =(a1!=null?a1.val:null); 
            dbg.location(141,9);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:141:9: (op= comp_op a2= add_expr )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= GT && LA14_0 <= GTEQ)||(LA14_0 >= LT && LA14_0 <= LTEQ)) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:141:11: op= comp_op a2= add_expr
            	    {
            	    dbg.location(141,13);
            	    pushFollow(FOLLOW_comp_op_in_comp_expr736);
            	    op=comp_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op.getTree());
            	    dbg.location(141,24);
            	    pushFollow(FOLLOW_add_expr_in_comp_expr740);
            	    a2=add_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a2.getTree());
            	    dbg.location(141,34);
            	     retval.val = new BinExpr(retval.val, (op!=null?op.val:null), (a2!=null?a2.val:null)); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(142, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comp_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comp_expr"


    public static class comp_op_return extends ParserRuleReturnScope {
        public BinOp val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp_op"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:144:1: comp_op returns [BinOp val] : ( GT | GTEQ | LT | LTEQ );
    public final SqlGrammar.comp_op_return comp_op() throws RecognitionException {
        SqlGrammar.comp_op_return retval = new SqlGrammar.comp_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GT28=null;
        Token GTEQ29=null;
        Token LT30=null;
        Token LTEQ31=null;

        Object GT28_tree=null;
        Object GTEQ29_tree=null;
        Object LT30_tree=null;
        Object LTEQ31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comp_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:144:28: ( GT | GTEQ | LT | LTEQ )
            int alt15=4;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case GT:
                {
                alt15=1;
                }
                break;
            case GTEQ:
                {
                alt15=2;
                }
                break;
            case LT:
                {
                alt15=3;
                }
                break;
            case LTEQ:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:145:5: GT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,5);
                    GT28=(Token)match(input,GT,FOLLOW_GT_in_comp_op763); 
                    GT28_tree = 
                    (Object)adaptor.create(GT28)
                    ;
                    adaptor.addChild(root_0, GT28_tree);

                    dbg.location(145,8);
                     retval.val = BinOp.Greater; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:146:5: GTEQ
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(146,5);
                    GTEQ29=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comp_op771); 
                    GTEQ29_tree = 
                    (Object)adaptor.create(GTEQ29)
                    ;
                    adaptor.addChild(root_0, GTEQ29_tree);

                    dbg.location(146,10);
                     retval.val = BinOp.GreaterEq; 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:147:5: LT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(147,5);
                    LT30=(Token)match(input,LT,FOLLOW_LT_in_comp_op779); 
                    LT30_tree = 
                    (Object)adaptor.create(LT30)
                    ;
                    adaptor.addChild(root_0, LT30_tree);

                    dbg.location(147,8);
                     retval.val = BinOp.Less; 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:148:5: LTEQ
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(148,5);
                    LTEQ31=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comp_op787); 
                    LTEQ31_tree = 
                    (Object)adaptor.create(LTEQ31)
                    ;
                    adaptor.addChild(root_0, LTEQ31_tree);

                    dbg.location(148,10);
                     retval.val = BinOp.LessEq; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(149, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comp_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comp_op"


    public static class add_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:151:1: add_expr returns [Expr val] : a1= mul_expr (op= add_op a2= mul_expr )* ;
    public final SqlGrammar.add_expr_return add_expr() throws RecognitionException {
        SqlGrammar.add_expr_return retval = new SqlGrammar.add_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.mul_expr_return a1 =null;

        SqlGrammar.add_op_return op =null;

        SqlGrammar.mul_expr_return a2 =null;



        try { dbg.enterRule(getGrammarFileName(), "add_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:151:28: (a1= mul_expr (op= add_op a2= mul_expr )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:152:5: a1= mul_expr (op= add_op a2= mul_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(152,7);
            pushFollow(FOLLOW_mul_expr_in_add_expr809);
            a1=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            dbg.location(152,17);
             retval.val =(a1!=null?a1.val:null); 
            dbg.location(153,9);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:153:9: (op= add_op a2= mul_expr )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:153:11: op= add_op a2= mul_expr
            	    {
            	    dbg.location(153,13);
            	    pushFollow(FOLLOW_add_op_in_add_expr825);
            	    op=add_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op.getTree());
            	    dbg.location(153,23);
            	    pushFollow(FOLLOW_mul_expr_in_add_expr829);
            	    a2=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a2.getTree());
            	    dbg.location(153,33);
            	     retval.val = new BinExpr(retval.val, (op!=null?op.val:null), (a2!=null?a2.val:null)); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(154, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_expr"


    public static class add_op_return extends ParserRuleReturnScope {
        public BinOp val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add_op"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:156:1: add_op returns [BinOp val] : ( PLUS | MINUS );
    public final SqlGrammar.add_op_return add_op() throws RecognitionException {
        SqlGrammar.add_op_return retval = new SqlGrammar.add_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS32=null;
        Token MINUS33=null;

        Object PLUS32_tree=null;
        Object MINUS33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:156:27: ( PLUS | MINUS )
            int alt17=2;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==PLUS) ) {
                alt17=1;
            }
            else if ( (LA17_0==MINUS) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:157:5: PLUS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(157,5);
                    PLUS32=(Token)match(input,PLUS,FOLLOW_PLUS_in_add_op852); 
                    PLUS32_tree = 
                    (Object)adaptor.create(PLUS32)
                    ;
                    adaptor.addChild(root_0, PLUS32_tree);

                    dbg.location(157,10);
                     retval.val = BinOp.Add; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:158:5: MINUS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(158,5);
                    MINUS33=(Token)match(input,MINUS,FOLLOW_MINUS_in_add_op860); 
                    MINUS33_tree = 
                    (Object)adaptor.create(MINUS33)
                    ;
                    adaptor.addChild(root_0, MINUS33_tree);

                    dbg.location(158,11);
                     retval.val = BinOp.Subtract; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(159, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_op"


    public static class mul_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:161:1: mul_expr returns [Expr val] : a1= unary_expr (op= mul_op a2= unary_expr )* ;
    public final SqlGrammar.mul_expr_return mul_expr() throws RecognitionException {
        SqlGrammar.mul_expr_return retval = new SqlGrammar.mul_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.unary_expr_return a1 =null;

        SqlGrammar.mul_op_return op =null;

        SqlGrammar.unary_expr_return a2 =null;



        try { dbg.enterRule(getGrammarFileName(), "mul_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:161:28: (a1= unary_expr (op= mul_op a2= unary_expr )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:162:5: a1= unary_expr (op= mul_op a2= unary_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(162,7);
            pushFollow(FOLLOW_unary_expr_in_mul_expr882);
            a1=unary_expr();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            dbg.location(162,19);
             retval.val =(a1!=null?a1.val:null); 
            dbg.location(163,9);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:163:9: (op= mul_op a2= unary_expr )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==PERCENT||LA18_0==SLASH||LA18_0==STAR) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:163:11: op= mul_op a2= unary_expr
            	    {
            	    dbg.location(163,13);
            	    pushFollow(FOLLOW_mul_op_in_mul_expr898);
            	    op=mul_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op.getTree());
            	    dbg.location(163,23);
            	    pushFollow(FOLLOW_unary_expr_in_mul_expr902);
            	    a2=unary_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a2.getTree());
            	    dbg.location(163,35);
            	     retval.val = new BinExpr(retval.val, (op!=null?op.val:null), (a2!=null?a2.val:null)); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(164, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mul_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mul_expr"


    public static class mul_op_return extends ParserRuleReturnScope {
        public BinOp val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul_op"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:166:1: mul_op returns [BinOp val] : ( STAR | SLASH | PERCENT );
    public final SqlGrammar.mul_op_return mul_op() throws RecognitionException {
        SqlGrammar.mul_op_return retval = new SqlGrammar.mul_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR34=null;
        Token SLASH35=null;
        Token PERCENT36=null;

        Object STAR34_tree=null;
        Object SLASH35_tree=null;
        Object PERCENT36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mul_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:166:27: ( STAR | SLASH | PERCENT )
            int alt19=3;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            switch ( input.LA(1) ) {
            case STAR:
                {
                alt19=1;
                }
                break;
            case SLASH:
                {
                alt19=2;
                }
                break;
            case PERCENT:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:167:5: STAR
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(167,5);
                    STAR34=(Token)match(input,STAR,FOLLOW_STAR_in_mul_op925); 
                    STAR34_tree = 
                    (Object)adaptor.create(STAR34)
                    ;
                    adaptor.addChild(root_0, STAR34_tree);

                    dbg.location(167,10);
                     retval.val = BinOp.Times; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:168:5: SLASH
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(168,5);
                    SLASH35=(Token)match(input,SLASH,FOLLOW_SLASH_in_mul_op933); 
                    SLASH35_tree = 
                    (Object)adaptor.create(SLASH35)
                    ;
                    adaptor.addChild(root_0, SLASH35_tree);

                    dbg.location(168,11);
                     retval.val = BinOp.Div; 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:169:5: PERCENT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(169,5);
                    PERCENT36=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_mul_op941); 
                    PERCENT36_tree = 
                    (Object)adaptor.create(PERCENT36)
                    ;
                    adaptor.addChild(root_0, PERCENT36_tree);

                    dbg.location(169,13);
                     retval.val = BinOp.Mod; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(170, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mul_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mul_op"


    public static class unary_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:172:1: unary_expr returns [Expr val] : (op= un_op pe= unary_null_expr |a= unary_null_expr );
    public final SqlGrammar.unary_expr_return unary_expr() throws RecognitionException {
        SqlGrammar.unary_expr_return retval = new SqlGrammar.unary_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.un_op_return op =null;

        SqlGrammar.unary_null_expr_return pe =null;

        SqlGrammar.unary_null_expr_return a =null;



        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:172:30: (op= un_op pe= unary_null_expr |a= unary_null_expr )
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==MINUS||LA20_0==NOT||LA20_0==PLUS) ) {
                alt20=1;
            }
            else if ( (LA20_0==FALSE||(LA20_0 >= ID && LA20_0 <= INT)||LA20_0==LPAREN||LA20_0==NULL||(LA20_0 >= QQ_STRING && LA20_0 <= Q_STRING)||LA20_0==STAR||LA20_0==TRUE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:173:5: op= un_op pe= unary_null_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(173,7);
                    pushFollow(FOLLOW_un_op_in_unary_expr963);
                    op=un_op();

                    state._fsp--;

                    adaptor.addChild(root_0, op.getTree());
                    dbg.location(173,16);
                    pushFollow(FOLLOW_unary_null_expr_in_unary_expr967);
                    pe=unary_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, pe.getTree());
                    dbg.location(173,33);
                     retval.val = new UnaryExpr((op!=null?op.val:null), (pe!=null?pe.val:null)); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:174:5: a= unary_null_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(174,6);
                    pushFollow(FOLLOW_unary_null_expr_in_unary_expr977);
                    a=unary_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, a.getTree());
                    dbg.location(174,23);
                     retval.val = (a!=null?a.val:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(175, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary_expr"


    public static class un_op_return extends ParserRuleReturnScope {
        public UnaryOp val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "un_op"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:177:1: un_op returns [UnaryOp val] : ( PLUS | MINUS | NOT );
    public final SqlGrammar.un_op_return un_op() throws RecognitionException {
        SqlGrammar.un_op_return retval = new SqlGrammar.un_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS37=null;
        Token MINUS38=null;
        Token NOT39=null;

        Object PLUS37_tree=null;
        Object MINUS38_tree=null;
        Object NOT39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "un_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:177:28: ( PLUS | MINUS | NOT )
            int alt21=3;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt21=1;
                }
                break;
            case MINUS:
                {
                alt21=2;
                }
                break;
            case NOT:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:178:5: PLUS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,5);
                    PLUS37=(Token)match(input,PLUS,FOLLOW_PLUS_in_un_op997); 
                    PLUS37_tree = 
                    (Object)adaptor.create(PLUS37)
                    ;
                    adaptor.addChild(root_0, PLUS37_tree);

                    dbg.location(178,10);
                     retval.val = UnaryOp.Plus; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:179:5: MINUS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(179,5);
                    MINUS38=(Token)match(input,MINUS,FOLLOW_MINUS_in_un_op1005); 
                    MINUS38_tree = 
                    (Object)adaptor.create(MINUS38)
                    ;
                    adaptor.addChild(root_0, MINUS38_tree);

                    dbg.location(179,11);
                     retval.val = UnaryOp.Minus; 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:180:5: NOT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,5);
                    NOT39=(Token)match(input,NOT,FOLLOW_NOT_in_un_op1013); 
                    NOT39_tree = 
                    (Object)adaptor.create(NOT39)
                    ;
                    adaptor.addChild(root_0, NOT39_tree);

                    dbg.location(180,9);
                     retval.val = UnaryOp.Not; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(181, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "un_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "un_op"


    public static class unary_null_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_null_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:183:1: unary_null_expr returns [Expr val] : e= atom_expr ( IS (n= NOT )? NULL )? ;
    public final SqlGrammar.unary_null_expr_return unary_null_expr() throws RecognitionException {
        SqlGrammar.unary_null_expr_return retval = new SqlGrammar.unary_null_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token n=null;
        Token IS40=null;
        Token NULL41=null;
        SqlGrammar.atom_expr_return e =null;


        Object n_tree=null;
        Object IS40_tree=null;
        Object NULL41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary_null_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:183:35: (e= atom_expr ( IS (n= NOT )? NULL )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:184:5: e= atom_expr ( IS (n= NOT )? NULL )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(184,6);
            pushFollow(FOLLOW_atom_expr_in_unary_null_expr1035);
            e=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
            dbg.location(184,17);
             retval.val = (e!=null?e.val:null); 
            dbg.location(185,5);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:185:5: ( IS (n= NOT )? NULL )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==IS) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:185:6: IS (n= NOT )? NULL
                    {
                    dbg.location(185,6);
                    IS40=(Token)match(input,IS,FOLLOW_IS_in_unary_null_expr1044); 
                    IS40_tree = 
                    (Object)adaptor.create(IS40)
                    ;
                    adaptor.addChild(root_0, IS40_tree);

                    dbg.location(185,9);
                     retval.val = new UnaryExpr(UnaryOp.IsNull, (e!=null?e.val:null)); 
                    dbg.location(186,6);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:186:6: (n= NOT )?
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NOT) ) {
                        alt22=1;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:186:7: n= NOT
                            {
                            dbg.location(186,8);
                            n=(Token)match(input,NOT,FOLLOW_NOT_in_unary_null_expr1056); 
                            n_tree = 
                            (Object)adaptor.create(n)
                            ;
                            adaptor.addChild(root_0, n_tree);

                            dbg.location(186,13);
                             if (n != null) { ((UnaryExpr)retval.val).setOp(UnaryOp.IsNotNull); } 

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(187,6);
                    NULL41=(Token)match(input,NULL,FOLLOW_NULL_in_unary_null_expr1068); 
                    NULL41_tree = 
                    (Object)adaptor.create(NULL41)
                    ;
                    adaptor.addChild(root_0, NULL41_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(187, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_null_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary_null_expr"


    public static class atom_expr_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom_expr"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:190:1: atom_expr returns [Expr val] : ( LPAREN e= expr RPAREN |u= maybe_qualified_user_sel ( LPAREN (e1= expr ( COMMA e2= expr )* )? RPAREN )? | TRUE | FALSE |i= INT | NULL |s= Q_STRING | STAR );
    public final SqlGrammar.atom_expr_return atom_expr() throws RecognitionException {
        SqlGrammar.atom_expr_return retval = new SqlGrammar.atom_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token i=null;
        Token s=null;
        Token LPAREN42=null;
        Token RPAREN43=null;
        Token LPAREN44=null;
        Token COMMA45=null;
        Token RPAREN46=null;
        Token TRUE47=null;
        Token FALSE48=null;
        Token NULL49=null;
        Token STAR50=null;
        SqlGrammar.expr_return e =null;

        SqlGrammar.maybe_qualified_user_sel_return u =null;

        SqlGrammar.expr_return e1 =null;

        SqlGrammar.expr_return e2 =null;


        Object i_tree=null;
        Object s_tree=null;
        Object LPAREN42_tree=null;
        Object RPAREN43_tree=null;
        Object LPAREN44_tree=null;
        Object COMMA45_tree=null;
        Object RPAREN46_tree=null;
        Object TRUE47_tree=null;
        Object FALSE48_tree=null;
        Object NULL49_tree=null;
        Object STAR50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:190:29: ( LPAREN e= expr RPAREN |u= maybe_qualified_user_sel ( LPAREN (e1= expr ( COMMA e2= expr )* )? RPAREN )? | TRUE | FALSE |i= INT | NULL |s= Q_STRING | STAR )
            int alt27=8;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt27=1;
                }
                break;
            case ID:
            case QQ_STRING:
                {
                alt27=2;
                }
                break;
            case TRUE:
                {
                alt27=3;
                }
                break;
            case FALSE:
                {
                alt27=4;
                }
                break;
            case INT:
                {
                alt27=5;
                }
                break;
            case NULL:
                {
                alt27=6;
                }
                break;
            case Q_STRING:
                {
                alt27=7;
                }
                break;
            case STAR:
                {
                alt27=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:191:5: LPAREN e= expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(191,5);
                    LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1086); 
                    LPAREN42_tree = 
                    (Object)adaptor.create(LPAREN42)
                    ;
                    adaptor.addChild(root_0, LPAREN42_tree);

                    dbg.location(191,13);
                    pushFollow(FOLLOW_expr_in_atom_expr1090);
                    e=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, e.getTree());
                    dbg.location(191,19);
                    RPAREN43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1092); 
                    RPAREN43_tree = 
                    (Object)adaptor.create(RPAREN43)
                    ;
                    adaptor.addChild(root_0, RPAREN43_tree);

                    dbg.location(191,26);
                     retval.val =(e!=null?e.val:null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:192:5: u= maybe_qualified_user_sel ( LPAREN (e1= expr ( COMMA e2= expr )* )? RPAREN )?
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(192,6);
                    pushFollow(FOLLOW_maybe_qualified_user_sel_in_atom_expr1102);
                    u=maybe_qualified_user_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, u.getTree());
                    dbg.location(192,32);
                     retval.val = new IdentifierExpr((u!=null?u.val:null)); 
                    dbg.location(193,5);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:193:5: ( LPAREN (e1= expr ( COMMA e2= expr )* )? RPAREN )?
                    int alt26=2;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==LPAREN) ) {
                        alt26=1;
                    }
                    } finally {dbg.exitDecision(26);}

                    switch (alt26) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:193:7: LPAREN (e1= expr ( COMMA e2= expr )* )? RPAREN
                            {
                            dbg.location(193,7);
                            LPAREN44=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1113); 
                            LPAREN44_tree = 
                            (Object)adaptor.create(LPAREN44)
                            ;
                            adaptor.addChild(root_0, LPAREN44_tree);

                            dbg.location(193,14);
                             retval.val = new FnCallExpr((u!=null?u.val:null)); 
                            dbg.location(194,7);
                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:194:7: (e1= expr ( COMMA e2= expr )* )?
                            int alt25=2;
                            try { dbg.enterSubRule(25);
                            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==FALSE||(LA25_0 >= ID && LA25_0 <= INT)||LA25_0==LPAREN||LA25_0==MINUS||(LA25_0 >= NOT && LA25_0 <= NULL)||LA25_0==PLUS||(LA25_0 >= QQ_STRING && LA25_0 <= Q_STRING)||LA25_0==STAR||LA25_0==TRUE) ) {
                                alt25=1;
                            }
                            } finally {dbg.exitDecision(25);}

                            switch (alt25) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:194:9: e1= expr ( COMMA e2= expr )*
                                    {
                                    dbg.location(194,11);
                                    pushFollow(FOLLOW_expr_in_atom_expr1128);
                                    e1=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, e1.getTree());
                                    dbg.location(194,17);
                                     ((FnCallExpr) retval.val).addArg((e1!=null?e1.val:null)); 
                                    dbg.location(195,9);
                                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:195:9: ( COMMA e2= expr )*
                                    try { dbg.enterSubRule(24);

                                    loop24:
                                    do {
                                        int alt24=2;
                                        try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                                        int LA24_0 = input.LA(1);

                                        if ( (LA24_0==COMMA) ) {
                                            alt24=1;
                                        }


                                        } finally {dbg.exitDecision(24);}

                                        switch (alt24) {
                                    	case 1 :
                                    	    dbg.enterAlt(1);

                                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:195:11: COMMA e2= expr
                                    	    {
                                    	    dbg.location(195,11);
                                    	    COMMA45=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr1143); 
                                    	    COMMA45_tree = 
                                    	    (Object)adaptor.create(COMMA45)
                                    	    ;
                                    	    adaptor.addChild(root_0, COMMA45_tree);

                                    	    dbg.location(195,19);
                                    	    pushFollow(FOLLOW_expr_in_atom_expr1147);
                                    	    e2=expr();

                                    	    state._fsp--;

                                    	    adaptor.addChild(root_0, e2.getTree());
                                    	    dbg.location(195,25);
                                    	     ((FnCallExpr) retval.val).addArg((e2!=null?e2.val:null)); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop24;
                                        }
                                    } while (true);
                                    } finally {dbg.exitSubRule(24);}


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(25);}

                            dbg.location(196,7);
                            RPAREN46=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1163); 
                            RPAREN46_tree = 
                            (Object)adaptor.create(RPAREN46)
                            ;
                            adaptor.addChild(root_0, RPAREN46_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:198:5: TRUE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(198,5);
                    TRUE47=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom_expr1177); 
                    TRUE47_tree = 
                    (Object)adaptor.create(TRUE47)
                    ;
                    adaptor.addChild(root_0, TRUE47_tree);

                    dbg.location(198,10);
                     retval.val = new ConstExpr(Type.getPrimitive(Type.TypeName.BOOLEAN), Boolean.TRUE); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:199:5: FALSE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(199,5);
                    FALSE48=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom_expr1185); 
                    FALSE48_tree = 
                    (Object)adaptor.create(FALSE48)
                    ;
                    adaptor.addChild(root_0, FALSE48_tree);

                    dbg.location(199,11);
                     retval.val = new ConstExpr(Type.getPrimitive(Type.TypeName.BOOLEAN), Boolean.FALSE); 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:200:5: i= INT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(200,6);
                    i=(Token)match(input,INT,FOLLOW_INT_in_atom_expr1195); 
                    i_tree = 
                    (Object)adaptor.create(i)
                    ;
                    adaptor.addChild(root_0, i_tree);

                    dbg.location(200,11);
                     retval.val = new ConstExpr(Type.getPrimitive(Type.TypeName.INT), Integer.valueOf((i!=null?i.getText():null))); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:201:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(201,5);
                    NULL49=(Token)match(input,NULL,FOLLOW_NULL_in_atom_expr1203); 
                    NULL49_tree = 
                    (Object)adaptor.create(NULL49)
                    ;
                    adaptor.addChild(root_0, NULL49_tree);

                    dbg.location(201,10);
                     retval.val = new ConstExpr(Type.getNullable(Type.TypeName.NULL), null); 

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:202:5: s= Q_STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(202,6);
                    s=(Token)match(input,Q_STRING,FOLLOW_Q_STRING_in_atom_expr1213); 
                    s_tree = 
                    (Object)adaptor.create(s)
                    ;
                    adaptor.addChild(root_0, s_tree);

                    dbg.location(202,16);
                     retval.val = new ConstExpr(Type.getPrimitive(Type.TypeName.STRING),
                          new Utf8(unescape((s!=null?s.getText():null)))); 

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:204:5: STAR
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,5);
                    STAR50=(Token)match(input,STAR,FOLLOW_STAR_in_atom_expr1221); 
                    STAR50_tree = 
                    (Object)adaptor.create(STAR50)
                    ;
                    adaptor.addChild(root_0, STAR50_tree);

                    dbg.location(204,10);
                     retval.val = new AllFieldsExpr(); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(205, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom_expr"


    public static class field_sel_return extends ParserRuleReturnScope {
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_sel"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:208:1: field_sel returns [String val] : s= maybe_qualified_user_sel ;
    public final SqlGrammar.field_sel_return field_sel() throws RecognitionException {
        SqlGrammar.field_sel_return retval = new SqlGrammar.field_sel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.maybe_qualified_user_sel_return s =null;



        try { dbg.enterRule(getGrammarFileName(), "field_sel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:208:32: (s= maybe_qualified_user_sel )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:208:34: s= maybe_qualified_user_sel
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(208,35);
            pushFollow(FOLLOW_maybe_qualified_user_sel_in_field_sel1241);
            s=maybe_qualified_user_sel();

            state._fsp--;

            adaptor.addChild(root_0, s.getTree());
            dbg.location(208,61);
            retval.val =(s!=null?s.val:null);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(208, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "field_sel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "field_sel"


    public static class field_sel_list_return extends ParserRuleReturnScope {
        public List<String> val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_sel_list"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:211:1: field_sel_list returns [List<String> val] : (f= field_sel ( COMMA f2= field_sel )* )? ;
    public final SqlGrammar.field_sel_list_return field_sel_list() throws RecognitionException {
        SqlGrammar.field_sel_list_return retval = new SqlGrammar.field_sel_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA51=null;
        SqlGrammar.field_sel_return f =null;

        SqlGrammar.field_sel_return f2 =null;


        Object COMMA51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "field_sel_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:211:43: ( (f= field_sel ( COMMA f2= field_sel )* )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:212:5: (f= field_sel ( COMMA f2= field_sel )* )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(212,5);
             retval.val = new ArrayList<String>(); 
            dbg.location(213,5);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:213:5: (f= field_sel ( COMMA f2= field_sel )* )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID||LA29_0==QQ_STRING) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:213:7: f= field_sel ( COMMA f2= field_sel )*
                    {
                    dbg.location(213,8);
                    pushFollow(FOLLOW_field_sel_in_field_sel_list1270);
                    f=field_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, f.getTree());
                    dbg.location(213,19);
                     retval.val.add((f!=null?f.val:null)); 
                    dbg.location(214,7);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:214:7: ( COMMA f2= field_sel )*
                    try { dbg.enterSubRule(28);

                    loop28:
                    do {
                        int alt28=2;
                        try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==COMMA) ) {
                            alt28=1;
                        }


                        } finally {dbg.exitDecision(28);}

                        switch (alt28) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:214:9: COMMA f2= field_sel
                    	    {
                    	    dbg.location(214,9);
                    	    COMMA51=(Token)match(input,COMMA,FOLLOW_COMMA_in_field_sel_list1282); 
                    	    COMMA51_tree = 
                    	    (Object)adaptor.create(COMMA51)
                    	    ;
                    	    adaptor.addChild(root_0, COMMA51_tree);

                    	    dbg.location(214,17);
                    	    pushFollow(FOLLOW_field_sel_in_field_sel_list1286);
                    	    f2=field_sel();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, f2.getTree());
                    	    dbg.location(214,28);
                    	     retval.val.add((f2!=null?f2.val:null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(28);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(215, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "field_sel_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "field_sel_list"


    public static class typed_field_list_return extends ParserRuleReturnScope {
        public TypedFieldList val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typed_field_list"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:220:1: typed_field_list returns [TypedFieldList val] : LPAREN tf= field_spec ( COMMA tg= field_spec )* RPAREN ;
    public final SqlGrammar.typed_field_list_return typed_field_list() throws RecognitionException {
        SqlGrammar.typed_field_list_return retval = new SqlGrammar.typed_field_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN52=null;
        Token COMMA53=null;
        Token RPAREN54=null;
        SqlGrammar.field_spec_return tf =null;

        SqlGrammar.field_spec_return tg =null;


        Object LPAREN52_tree=null;
        Object COMMA53_tree=null;
        Object RPAREN54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typed_field_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:220:46: ( LPAREN tf= field_spec ( COMMA tg= field_spec )* RPAREN )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:221:3: LPAREN tf= field_spec ( COMMA tg= field_spec )* RPAREN
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(221,3);
            LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typed_field_list1314); 
            LPAREN52_tree = 
            (Object)adaptor.create(LPAREN52)
            ;
            adaptor.addChild(root_0, LPAREN52_tree);

            dbg.location(221,12);
            pushFollow(FOLLOW_field_spec_in_typed_field_list1318);
            tf=field_spec();

            state._fsp--;

            adaptor.addChild(root_0, tf.getTree());
            dbg.location(221,24);
             retval.val = new TypedFieldList((tf!=null?tf.val:null)); 
            dbg.location(222,3);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:222:3: ( COMMA tg= field_spec )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMA) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:222:4: COMMA tg= field_spec
            	    {
            	    dbg.location(222,4);
            	    COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_typed_field_list1325); 
            	    COMMA53_tree = 
            	    (Object)adaptor.create(COMMA53)
            	    ;
            	    adaptor.addChild(root_0, COMMA53_tree);

            	    dbg.location(222,12);
            	    pushFollow(FOLLOW_field_spec_in_typed_field_list1329);
            	    tg=field_spec();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tg.getTree());
            	    dbg.location(222,24);
            	    retval.val.addField((tg!=null?tg.val:null));

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}

            dbg.location(222,52);
            RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typed_field_list1335); 
            RPAREN54_tree = 
            (Object)adaptor.create(RPAREN54)
            ;
            adaptor.addChild(root_0, RPAREN54_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(222, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typed_field_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typed_field_list"


    public static class field_spec_return extends ParserRuleReturnScope {
        public TypedField val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_spec"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:225:1: field_spec returns [TypedField val] : f= field_sel t= field_type ;
    public final SqlGrammar.field_spec_return field_spec() throws RecognitionException {
        SqlGrammar.field_spec_return retval = new SqlGrammar.field_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.field_sel_return f =null;

        SqlGrammar.field_type_return t =null;



        try { dbg.enterRule(getGrammarFileName(), "field_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:225:37: (f= field_sel t= field_type )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:226:3: f= field_sel t= field_type
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(226,4);
            pushFollow(FOLLOW_field_sel_in_field_spec1352);
            f=field_sel();

            state._fsp--;

            adaptor.addChild(root_0, f.getTree());
            dbg.location(226,16);
            pushFollow(FOLLOW_field_type_in_field_spec1356);
            t=field_type();

            state._fsp--;

            adaptor.addChild(root_0, t.getTree());
            dbg.location(226,28);
             retval.val = new TypedField((f!=null?f.val:null), (t!=null?t.val:null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(226, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "field_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "field_spec"


    public static class field_type_return extends ParserRuleReturnScope {
        public Type val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_type"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:230:1: field_type returns [Type val] : (s= scalar_field_type |lst= list_type );
    public final SqlGrammar.field_type_return field_type() throws RecognitionException {
        SqlGrammar.field_type_return retval = new SqlGrammar.field_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.scalar_field_type_return s =null;

        SqlGrammar.list_type_return lst =null;



        try { dbg.enterRule(getGrammarFileName(), "field_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(230, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:230:31: (s= scalar_field_type |lst= list_type )
            int alt31=2;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( ((LA31_0 >= BIGINT && LA31_0 <= BOOLEAN)||LA31_0==DOUBLE||LA31_0==FLOAT||LA31_0==INT_KW||LA31_0==PRECISE||LA31_0==STRING_KW||LA31_0==TIMESTAMP) ) {
                alt31=1;
            }
            else if ( (LA31_0==LIST) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:231:5: s= scalar_field_type
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(231,6);
                    pushFollow(FOLLOW_scalar_field_type_in_field_type1378);
                    s=scalar_field_type();

                    state._fsp--;

                    adaptor.addChild(root_0, s.getTree());
                    dbg.location(231,25);
                     retval.val = (s!=null?s.val:null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:232:5: lst= list_type
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(232,8);
                    pushFollow(FOLLOW_list_type_in_field_type1388);
                    lst=list_type();

                    state._fsp--;

                    adaptor.addChild(root_0, lst.getTree());
                    dbg.location(232,19);
                     retval.val = (lst!=null?lst.val:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(233, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "field_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "field_type"


    public static class scalar_field_type_return extends ParserRuleReturnScope {
        public Type val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scalar_field_type"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:236:1: scalar_field_type returns [Type val] : (prim= primitive_field_type nonnul= non_nul_qualifier |precise= precise_type );
    public final SqlGrammar.scalar_field_type_return scalar_field_type() throws RecognitionException {
        SqlGrammar.scalar_field_type_return retval = new SqlGrammar.scalar_field_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.primitive_field_type_return prim =null;

        SqlGrammar.non_nul_qualifier_return nonnul =null;

        SqlGrammar.precise_type_return precise =null;



        try { dbg.enterRule(getGrammarFileName(), "scalar_field_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:236:38: (prim= primitive_field_type nonnul= non_nul_qualifier |precise= precise_type )
            int alt32=2;
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= BIGINT && LA32_0 <= BOOLEAN)||LA32_0==DOUBLE||LA32_0==FLOAT||LA32_0==INT_KW||LA32_0==STRING_KW||LA32_0==TIMESTAMP) ) {
                alt32=1;
            }
            else if ( (LA32_0==PRECISE) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:237:5: prim= primitive_field_type nonnul= non_nul_qualifier
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(237,9);
                    pushFollow(FOLLOW_primitive_field_type_in_scalar_field_type1412);
                    prim=primitive_field_type();

                    state._fsp--;

                    adaptor.addChild(root_0, prim.getTree());
                    dbg.location(237,37);
                    pushFollow(FOLLOW_non_nul_qualifier_in_scalar_field_type1416);
                    nonnul=non_nul_qualifier();

                    state._fsp--;

                    adaptor.addChild(root_0, nonnul.getTree());
                    dbg.location(238,5);

                          try {
                            if (nonnul.val) {
                              retval.val = Type.getPrimitive(Type.TypeName.valueOf((prim!=null?prim.val:null)));
                            } else {
                              retval.val = Type.getNullable(Type.TypeName.valueOf((prim!=null?prim.val:null)));
                            } 
                          } catch (NullPointerException npe) {
                            retval.val = Type.getPrimitive(Type.TypeName.TYPECLASS_ANY);
                          }
                        

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:249:5: precise= precise_type
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(249,12);
                    pushFollow(FOLLOW_precise_type_in_scalar_field_type1430);
                    precise=precise_type();

                    state._fsp--;

                    adaptor.addChild(root_0, precise.getTree());
                    dbg.location(249,26);
                     retval.val = (precise!=null?precise.val:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(250, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "scalar_field_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "scalar_field_type"


    public static class primitive_field_type_return extends ParserRuleReturnScope {
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitive_field_type"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:253:1: primitive_field_type returns [String val] : ( BOOLEAN | BINARY | BIGINT | INT_KW | FLOAT | DOUBLE | STRING_KW | TIMESTAMP );
    public final SqlGrammar.primitive_field_type_return primitive_field_type() throws RecognitionException {
        SqlGrammar.primitive_field_type_return retval = new SqlGrammar.primitive_field_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN55=null;
        Token BINARY56=null;
        Token BIGINT57=null;
        Token INT_KW58=null;
        Token FLOAT59=null;
        Token DOUBLE60=null;
        Token STRING_KW61=null;
        Token TIMESTAMP62=null;

        Object BOOLEAN55_tree=null;
        Object BINARY56_tree=null;
        Object BIGINT57_tree=null;
        Object INT_KW58_tree=null;
        Object FLOAT59_tree=null;
        Object DOUBLE60_tree=null;
        Object STRING_KW61_tree=null;
        Object TIMESTAMP62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "primitive_field_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:253:42: ( BOOLEAN | BINARY | BIGINT | INT_KW | FLOAT | DOUBLE | STRING_KW | TIMESTAMP )
            int alt33=8;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt33=1;
                }
                break;
            case BINARY:
                {
                alt33=2;
                }
                break;
            case BIGINT:
                {
                alt33=3;
                }
                break;
            case INT_KW:
                {
                alt33=4;
                }
                break;
            case FLOAT:
                {
                alt33=5;
                }
                break;
            case DOUBLE:
                {
                alt33=6;
                }
                break;
            case STRING_KW:
                {
                alt33=7;
                }
                break;
            case TIMESTAMP:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:254:5: BOOLEAN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(254,5);
                    BOOLEAN55=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitive_field_type1451); 
                    BOOLEAN55_tree = 
                    (Object)adaptor.create(BOOLEAN55)
                    ;
                    adaptor.addChild(root_0, BOOLEAN55_tree);

                    dbg.location(254,13);
                     retval.val = "BOOLEAN"; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:255:5: BINARY
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(255,5);
                    BINARY56=(Token)match(input,BINARY,FOLLOW_BINARY_in_primitive_field_type1459); 
                    BINARY56_tree = 
                    (Object)adaptor.create(BINARY56)
                    ;
                    adaptor.addChild(root_0, BINARY56_tree);

                    dbg.location(255,12);
                     retval.val = "BINARY"; 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:256:5: BIGINT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(256,5);
                    BIGINT57=(Token)match(input,BIGINT,FOLLOW_BIGINT_in_primitive_field_type1467); 
                    BIGINT57_tree = 
                    (Object)adaptor.create(BIGINT57)
                    ;
                    adaptor.addChild(root_0, BIGINT57_tree);

                    dbg.location(256,12);
                     retval.val = "BIGINT"; 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:257:5: INT_KW
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(257,5);
                    INT_KW58=(Token)match(input,INT_KW,FOLLOW_INT_KW_in_primitive_field_type1475); 
                    INT_KW58_tree = 
                    (Object)adaptor.create(INT_KW58)
                    ;
                    adaptor.addChild(root_0, INT_KW58_tree);

                    dbg.location(257,12);
                     retval.val = "INT"; 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:258:5: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(258,5);
                    FLOAT59=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitive_field_type1483); 
                    FLOAT59_tree = 
                    (Object)adaptor.create(FLOAT59)
                    ;
                    adaptor.addChild(root_0, FLOAT59_tree);

                    dbg.location(258,11);
                     retval.val = "FLOAT"; 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:259:5: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(259,5);
                    DOUBLE60=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitive_field_type1491); 
                    DOUBLE60_tree = 
                    (Object)adaptor.create(DOUBLE60)
                    ;
                    adaptor.addChild(root_0, DOUBLE60_tree);

                    dbg.location(259,12);
                     retval.val = "DOUBLE"; 

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:260:5: STRING_KW
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(260,5);
                    STRING_KW61=(Token)match(input,STRING_KW,FOLLOW_STRING_KW_in_primitive_field_type1499); 
                    STRING_KW61_tree = 
                    (Object)adaptor.create(STRING_KW61)
                    ;
                    adaptor.addChild(root_0, STRING_KW61_tree);

                    dbg.location(260,15);
                     retval.val = "STRING"; 

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:261:5: TIMESTAMP
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(261,5);
                    TIMESTAMP62=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_primitive_field_type1507); 
                    TIMESTAMP62_tree = 
                    (Object)adaptor.create(TIMESTAMP62)
                    ;
                    adaptor.addChild(root_0, TIMESTAMP62_tree);

                    dbg.location(261,15);
                     retval.val = "TIMESTAMP"; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(262, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primitive_field_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primitive_field_type"


    public static class precise_type_return extends ParserRuleReturnScope {
        public Type val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precise_type"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:265:1: precise_type returns [Type val] : PRECISE LPAREN precision= integer RPAREN ( NOT NULL )? ;
    public final SqlGrammar.precise_type_return precise_type() throws RecognitionException {
        SqlGrammar.precise_type_return retval = new SqlGrammar.precise_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRECISE63=null;
        Token LPAREN64=null;
        Token RPAREN65=null;
        Token NOT66=null;
        Token NULL67=null;
        SqlGrammar.integer_return precision =null;


        Object PRECISE63_tree=null;
        Object LPAREN64_tree=null;
        Object RPAREN65_tree=null;
        Object NOT66_tree=null;
        Object NULL67_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "precise_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:265:33: ( PRECISE LPAREN precision= integer RPAREN ( NOT NULL )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:266:5: PRECISE LPAREN precision= integer RPAREN ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(266,5);
            PRECISE63=(Token)match(input,PRECISE,FOLLOW_PRECISE_in_precise_type1529); 
            PRECISE63_tree = 
            (Object)adaptor.create(PRECISE63)
            ;
            adaptor.addChild(root_0, PRECISE63_tree);

            dbg.location(266,13);
            LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_precise_type1531); 
            LPAREN64_tree = 
            (Object)adaptor.create(LPAREN64)
            ;
            adaptor.addChild(root_0, LPAREN64_tree);

            dbg.location(266,29);
            pushFollow(FOLLOW_integer_in_precise_type1535);
            precision=integer();

            state._fsp--;

            adaptor.addChild(root_0, precision.getTree());
            dbg.location(266,38);
            RPAREN65=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_precise_type1537); 
            RPAREN65_tree = 
            (Object)adaptor.create(RPAREN65)
            ;
            adaptor.addChild(root_0, RPAREN65_tree);

            dbg.location(267,5);
             retval.val = new NullableType(new PreciseType((precision!=null?precision.val:null))); 
            dbg.location(268,5);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:268:5: ( NOT NULL )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==NOT) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:268:6: NOT NULL
                    {
                    dbg.location(268,6);
                    NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_precise_type1550); 
                    NOT66_tree = 
                    (Object)adaptor.create(NOT66)
                    ;
                    adaptor.addChild(root_0, NOT66_tree);

                    dbg.location(268,10);
                    NULL67=(Token)match(input,NULL,FOLLOW_NULL_in_precise_type1552); 
                    NULL67_tree = 
                    (Object)adaptor.create(NULL67)
                    ;
                    adaptor.addChild(root_0, NULL67_tree);

                    dbg.location(268,15);
                     retval.val = ((NullableType) retval.val).getInnerType(); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(269, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "precise_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "precise_type"


    public static class list_type_return extends ParserRuleReturnScope {
        public Type val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_type"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:272:1: list_type returns [Type val] : LIST LT s= scalar_field_type GT ( NOT NULL )? ;
    public final SqlGrammar.list_type_return list_type() throws RecognitionException {
        SqlGrammar.list_type_return retval = new SqlGrammar.list_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LIST68=null;
        Token LT69=null;
        Token GT70=null;
        Token NOT71=null;
        Token NULL72=null;
        SqlGrammar.scalar_field_type_return s =null;


        Object LIST68_tree=null;
        Object LT69_tree=null;
        Object GT70_tree=null;
        Object NOT71_tree=null;
        Object NULL72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "list_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(272, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:272:29: ( LIST LT s= scalar_field_type GT ( NOT NULL )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:273:5: LIST LT s= scalar_field_type GT ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(273,5);
            LIST68=(Token)match(input,LIST,FOLLOW_LIST_in_list_type1575); 
            LIST68_tree = 
            (Object)adaptor.create(LIST68)
            ;
            adaptor.addChild(root_0, LIST68_tree);

            dbg.location(273,10);
            LT69=(Token)match(input,LT,FOLLOW_LT_in_list_type1577); 
            LT69_tree = 
            (Object)adaptor.create(LT69)
            ;
            adaptor.addChild(root_0, LT69_tree);

            dbg.location(273,14);
            pushFollow(FOLLOW_scalar_field_type_in_list_type1581);
            s=scalar_field_type();

            state._fsp--;

            adaptor.addChild(root_0, s.getTree());
            dbg.location(273,33);
            GT70=(Token)match(input,GT,FOLLOW_GT_in_list_type1583); 
            GT70_tree = 
            (Object)adaptor.create(GT70)
            ;
            adaptor.addChild(root_0, GT70_tree);

            dbg.location(273,36);
             retval.val = new NullableType(new ListType((s!=null?s.val:null))); 
            dbg.location(274,5);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:274:5: ( NOT NULL )?
            int alt35=2;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35, decisionCanBacktrack[35]);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==NOT) ) {
                alt35=1;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:274:6: NOT NULL
                    {
                    dbg.location(274,6);
                    NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_list_type1592); 
                    NOT71_tree = 
                    (Object)adaptor.create(NOT71)
                    ;
                    adaptor.addChild(root_0, NOT71_tree);

                    dbg.location(274,10);
                    NULL72=(Token)match(input,NULL,FOLLOW_NULL_in_list_type1594); 
                    NULL72_tree = 
                    (Object)adaptor.create(NULL72)
                    ;
                    adaptor.addChild(root_0, NULL72_tree);

                    dbg.location(274,15);
                     retval.val = ((NullableType) retval.val).getInnerType(); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(275, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "list_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "list_type"


    public static class non_nul_qualifier_return extends ParserRuleReturnScope {
        public boolean val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "non_nul_qualifier"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:278:1: non_nul_qualifier returns [boolean val] : ( NOT NULL |);
    public final SqlGrammar.non_nul_qualifier_return non_nul_qualifier() throws RecognitionException {
        SqlGrammar.non_nul_qualifier_return retval = new SqlGrammar.non_nul_qualifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT73=null;
        Token NULL74=null;

        Object NOT73_tree=null;
        Object NULL74_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "non_nul_qualifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(278, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:278:41: ( NOT NULL |)
            int alt36=2;
            try { dbg.enterDecision(36, decisionCanBacktrack[36]);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==NOT) ) {
                alt36=1;
            }
            else if ( (LA36_0==COMMA||LA36_0==GT||LA36_0==RPAREN) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:279:5: NOT NULL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(279,5);
                    NOT73=(Token)match(input,NOT,FOLLOW_NOT_in_non_nul_qualifier1618); 
                    NOT73_tree = 
                    (Object)adaptor.create(NOT73)
                    ;
                    adaptor.addChild(root_0, NOT73_tree);

                    dbg.location(279,9);
                    NULL74=(Token)match(input,NULL,FOLLOW_NULL_in_non_nul_qualifier1620); 
                    NULL74_tree = 
                    (Object)adaptor.create(NULL74)
                    ;
                    adaptor.addChild(root_0, NULL74_tree);

                    dbg.location(279,14);
                     retval.val = true; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:280:5: 
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(280,5);
                     retval.val = false; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(280, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "non_nul_qualifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "non_nul_qualifier"


    public static class stream_sel_return extends ParserRuleReturnScope {
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stream_sel"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:283:1: stream_sel returns [String val] : s= user_sel ;
    public final SqlGrammar.stream_sel_return stream_sel() throws RecognitionException {
        SqlGrammar.stream_sel_return retval = new SqlGrammar.stream_sel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.user_sel_return s =null;



        try { dbg.enterRule(getGrammarFileName(), "stream_sel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(283, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:283:33: (s= user_sel )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:283:35: s= user_sel
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(283,36);
            pushFollow(FOLLOW_user_sel_in_stream_sel1647);
            s=user_sel();

            state._fsp--;

            adaptor.addChild(root_0, s.getTree());
            dbg.location(283,46);
            retval.val =(s!=null?s.val:null);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(283, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stream_sel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stream_sel"


    public static class user_sel_return extends ParserRuleReturnScope {
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "user_sel"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:286:1: user_sel returns [String val] : ( ID | QQ_STRING );
    public final SqlGrammar.user_sel_return user_sel() throws RecognitionException {
        SqlGrammar.user_sel_return retval = new SqlGrammar.user_sel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID75=null;
        Token QQ_STRING76=null;

        Object ID75_tree=null;
        Object QQ_STRING76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "user_sel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:286:31: ( ID | QQ_STRING )
            int alt37=2;
            try { dbg.enterDecision(37, decisionCanBacktrack[37]);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==QQ_STRING) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:287:5: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(287,5);
                    ID75=(Token)match(input,ID,FOLLOW_ID_in_user_sel1666); 
                    ID75_tree = 
                    (Object)adaptor.create(ID75)
                    ;
                    adaptor.addChild(root_0, ID75_tree);

                    dbg.location(287,8);
                    retval.val =(ID75!=null?ID75.getText():null).toLowerCase();

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:288:5: QQ_STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(288,5);
                    QQ_STRING76=(Token)match(input,QQ_STRING,FOLLOW_QQ_STRING_in_user_sel1674); 
                    QQ_STRING76_tree = 
                    (Object)adaptor.create(QQ_STRING76)
                    ;
                    adaptor.addChild(root_0, QQ_STRING76_tree);

                    dbg.location(288,15);
                    retval.val =unescape((QQ_STRING76!=null?QQ_STRING76.getText():null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(288, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "user_sel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "user_sel"


    public static class maybe_qualified_user_sel_return extends ParserRuleReturnScope {
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "maybe_qualified_user_sel"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:292:1: maybe_qualified_user_sel returns [String val] : (id= ID ( DOT id2= ID )? | QQ_STRING );
    public final SqlGrammar.maybe_qualified_user_sel_return maybe_qualified_user_sel() throws RecognitionException {
        SqlGrammar.maybe_qualified_user_sel_return retval = new SqlGrammar.maybe_qualified_user_sel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token id2=null;
        Token DOT77=null;
        Token QQ_STRING78=null;

        Object id_tree=null;
        Object id2_tree=null;
        Object DOT77_tree=null;
        Object QQ_STRING78_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "maybe_qualified_user_sel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:292:47: (id= ID ( DOT id2= ID )? | QQ_STRING )
            int alt39=2;
            try { dbg.enterDecision(39, decisionCanBacktrack[39]);

            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==QQ_STRING) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:293:5: id= ID ( DOT id2= ID )?
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(293,7);
                    id=(Token)match(input,ID,FOLLOW_ID_in_maybe_qualified_user_sel1696); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);

                    dbg.location(293,11);
                     retval.val = (id!=null?id.getText():null).toLowerCase(); 
                    dbg.location(294,5);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:294:5: ( DOT id2= ID )?
                    int alt38=2;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38, decisionCanBacktrack[38]);

                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==DOT) ) {
                        alt38=1;
                    }
                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:294:7: DOT id2= ID
                            {
                            dbg.location(294,7);
                            DOT77=(Token)match(input,DOT,FOLLOW_DOT_in_maybe_qualified_user_sel1706); 
                            DOT77_tree = 
                            (Object)adaptor.create(DOT77)
                            ;
                            adaptor.addChild(root_0, DOT77_tree);

                            dbg.location(294,14);
                            id2=(Token)match(input,ID,FOLLOW_ID_in_maybe_qualified_user_sel1710); 
                            id2_tree = 
                            (Object)adaptor.create(id2)
                            ;
                            adaptor.addChild(root_0, id2_tree);

                            dbg.location(294,18);
                             retval.val = retval.val + "." + (id2!=null?id2.getText():null).toLowerCase(); 

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:295:5: QQ_STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(295,5);
                    QQ_STRING78=(Token)match(input,QQ_STRING,FOLLOW_QQ_STRING_in_maybe_qualified_user_sel1721); 
                    QQ_STRING78_tree = 
                    (Object)adaptor.create(QQ_STRING78)
                    ;
                    adaptor.addChild(root_0, QQ_STRING78_tree);

                    dbg.location(295,15);
                    retval.val =unescape((QQ_STRING78!=null?QQ_STRING78.getText():null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(295, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "maybe_qualified_user_sel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "maybe_qualified_user_sel"


    public static class src_spec_return extends ParserRuleReturnScope {
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "src_spec"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:298:1: src_spec returns [String val] : q= Q_STRING ;
    public final SqlGrammar.src_spec_return src_spec() throws RecognitionException {
        SqlGrammar.src_spec_return retval = new SqlGrammar.src_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token q=null;

        Object q_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "src_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:298:31: (q= Q_STRING )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:299:5: q= Q_STRING
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(299,6);
            q=(Token)match(input,Q_STRING,FOLLOW_Q_STRING_in_src_spec1746); 
            q_tree = 
            (Object)adaptor.create(q)
            ;
            adaptor.addChild(root_0, q_tree);

            dbg.location(299,16);
             retval.val =unescape((q!=null?q.getText():null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(299, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "src_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "src_spec"


    public static class source_definition_return extends ParserRuleReturnScope {
        public RecordSource val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "source_definition"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:303:1: source_definition returns [RecordSource val] : (s= stream_sel ( ( AS )? alias= stream_sel )? ( JOIN j= source_definition ON e= expr OVER w= inline_window_spec )* | LPAREN st= stmt_select RPAREN ( ( AS )? alias= stream_sel )? );
    public final SqlGrammar.source_definition_return source_definition() throws RecognitionException {
        SqlGrammar.source_definition_return retval = new SqlGrammar.source_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS79=null;
        Token JOIN80=null;
        Token ON81=null;
        Token OVER82=null;
        Token LPAREN83=null;
        Token RPAREN84=null;
        Token AS85=null;
        SqlGrammar.stream_sel_return s =null;

        SqlGrammar.stream_sel_return alias =null;

        SqlGrammar.source_definition_return j =null;

        SqlGrammar.expr_return e =null;

        SqlGrammar.inline_window_spec_return w =null;

        SqlGrammar.stmt_select_return st =null;


        Object AS79_tree=null;
        Object JOIN80_tree=null;
        Object ON81_tree=null;
        Object OVER82_tree=null;
        Object LPAREN83_tree=null;
        Object RPAREN84_tree=null;
        Object AS85_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "source_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(303, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:303:45: (s= stream_sel ( ( AS )? alias= stream_sel )? ( JOIN j= source_definition ON e= expr OVER w= inline_window_spec )* | LPAREN st= stmt_select RPAREN ( ( AS )? alias= stream_sel )? )
            int alt45=2;
            try { dbg.enterDecision(45, decisionCanBacktrack[45]);

            int LA45_0 = input.LA(1);

            if ( (LA45_0==ID||LA45_0==QQ_STRING) ) {
                alt45=1;
            }
            else if ( (LA45_0==LPAREN) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(45);}

            switch (alt45) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:304:5: s= stream_sel ( ( AS )? alias= stream_sel )? ( JOIN j= source_definition ON e= expr OVER w= inline_window_spec )*
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(304,6);
                    pushFollow(FOLLOW_stream_sel_in_source_definition1767);
                    s=stream_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, s.getTree());
                    dbg.location(304,18);
                     retval.val = new LiteralSource((s!=null?s.val:null)); 
                    dbg.location(305,5);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:305:5: ( ( AS )? alias= stream_sel )?
                    int alt41=2;
                    try { dbg.enterSubRule(41);
                    try { dbg.enterDecision(41, decisionCanBacktrack[41]);

                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==AS||LA41_0==ID||LA41_0==QQ_STRING) ) {
                        alt41=1;
                    }
                    } finally {dbg.exitDecision(41);}

                    switch (alt41) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:305:7: ( AS )? alias= stream_sel
                            {
                            dbg.location(305,7);
                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:305:7: ( AS )?
                            int alt40=2;
                            try { dbg.enterSubRule(40);
                            try { dbg.enterDecision(40, decisionCanBacktrack[40]);

                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==AS) ) {
                                alt40=1;
                            }
                            } finally {dbg.exitDecision(40);}

                            switch (alt40) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:305:7: AS
                                    {
                                    dbg.location(305,7);
                                    AS79=(Token)match(input,AS,FOLLOW_AS_in_source_definition1777); 
                                    AS79_tree = 
                                    (Object)adaptor.create(AS79)
                                    ;
                                    adaptor.addChild(root_0, AS79_tree);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(40);}

                            dbg.location(305,16);
                            pushFollow(FOLLOW_stream_sel_in_source_definition1782);
                            alias=stream_sel();

                            state._fsp--;

                            adaptor.addChild(root_0, alias.getTree());
                            dbg.location(305,28);
                             ((LiteralSource) retval.val).setAlias((alias!=null?alias.val:null)); 

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(306,5);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:306:5: ( JOIN j= source_definition ON e= expr OVER w= inline_window_spec )*
                    try { dbg.enterSubRule(42);

                    loop42:
                    do {
                        int alt42=2;
                        try { dbg.enterDecision(42, decisionCanBacktrack[42]);

                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==JOIN) ) {
                            alt42=1;
                        }


                        } finally {dbg.exitDecision(42);}

                        switch (alt42) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:306:7: JOIN j= source_definition ON e= expr OVER w= inline_window_spec
                    	    {
                    	    dbg.location(306,7);
                    	    JOIN80=(Token)match(input,JOIN,FOLLOW_JOIN_in_source_definition1795); 
                    	    JOIN80_tree = 
                    	    (Object)adaptor.create(JOIN80)
                    	    ;
                    	    adaptor.addChild(root_0, JOIN80_tree);

                    	    dbg.location(306,13);
                    	    pushFollow(FOLLOW_source_definition_in_source_definition1799);
                    	    j=source_definition();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, j.getTree());
                    	    dbg.location(306,32);
                    	    ON81=(Token)match(input,ON,FOLLOW_ON_in_source_definition1801); 
                    	    ON81_tree = 
                    	    (Object)adaptor.create(ON81)
                    	    ;
                    	    adaptor.addChild(root_0, ON81_tree);

                    	    dbg.location(306,36);
                    	    pushFollow(FOLLOW_expr_in_source_definition1805);
                    	    e=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, e.getTree());
                    	    dbg.location(306,42);
                    	    OVER82=(Token)match(input,OVER,FOLLOW_OVER_in_source_definition1807); 
                    	    OVER82_tree = 
                    	    (Object)adaptor.create(OVER82)
                    	    ;
                    	    adaptor.addChild(root_0, OVER82_tree);

                    	    dbg.location(306,48);
                    	    pushFollow(FOLLOW_inline_window_spec_in_source_definition1811);
                    	    w=inline_window_spec();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, w.getTree());
                    	    dbg.location(307,7);
                    	     retval.val = new JoinedSource(retval.val, (j!=null?j.val:null), (e!=null?e.val:null), (w!=null?w.val:null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(42);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:309:5: LPAREN st= stmt_select RPAREN ( ( AS )? alias= stream_sel )?
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(309,5);
                    LPAREN83=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_source_definition1832); 
                    LPAREN83_tree = 
                    (Object)adaptor.create(LPAREN83)
                    ;
                    adaptor.addChild(root_0, LPAREN83_tree);

                    dbg.location(309,14);
                    pushFollow(FOLLOW_stmt_select_in_source_definition1836);
                    st=stmt_select();

                    state._fsp--;

                    adaptor.addChild(root_0, st.getTree());
                    dbg.location(309,27);
                    RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_source_definition1838); 
                    RPAREN84_tree = 
                    (Object)adaptor.create(RPAREN84)
                    ;
                    adaptor.addChild(root_0, RPAREN84_tree);

                    dbg.location(309,34);
                     retval.val = (st!=null?st.val:null); 
                    dbg.location(310,5);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:310:5: ( ( AS )? alias= stream_sel )?
                    int alt44=2;
                    try { dbg.enterSubRule(44);
                    try { dbg.enterDecision(44, decisionCanBacktrack[44]);

                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==AS||LA44_0==ID||LA44_0==QQ_STRING) ) {
                        alt44=1;
                    }
                    } finally {dbg.exitDecision(44);}

                    switch (alt44) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:310:7: ( AS )? alias= stream_sel
                            {
                            dbg.location(310,7);
                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:310:7: ( AS )?
                            int alt43=2;
                            try { dbg.enterSubRule(43);
                            try { dbg.enterDecision(43, decisionCanBacktrack[43]);

                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==AS) ) {
                                alt43=1;
                            }
                            } finally {dbg.exitDecision(43);}

                            switch (alt43) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:310:7: AS
                                    {
                                    dbg.location(310,7);
                                    AS85=(Token)match(input,AS,FOLLOW_AS_in_source_definition1848); 
                                    AS85_tree = 
                                    (Object)adaptor.create(AS85)
                                    ;
                                    adaptor.addChild(root_0, AS85_tree);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(43);}

                            dbg.location(310,16);
                            pushFollow(FOLLOW_stream_sel_in_source_definition1853);
                            alias=stream_sel();

                            state._fsp--;

                            adaptor.addChild(root_0, alias.getTree());
                            dbg.location(310,28);
                             ((SelectStmt) retval.val).setAlias((alias!=null?alias.val:null)); 

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(44);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(311, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "source_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "source_definition"


    public static class src_type_return extends ParserRuleReturnScope {
        public StreamSourceType val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "src_type"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:314:1: src_type returns [StreamSourceType val] : ( FILE | SOURCE | NODE );
    public final SqlGrammar.src_type_return src_type() throws RecognitionException {
        SqlGrammar.src_type_return retval = new SqlGrammar.src_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FILE86=null;
        Token SOURCE87=null;
        Token NODE88=null;

        Object FILE86_tree=null;
        Object SOURCE87_tree=null;
        Object NODE88_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "src_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:314:40: ( FILE | SOURCE | NODE )
            int alt46=3;
            try { dbg.enterDecision(46, decisionCanBacktrack[46]);

            switch ( input.LA(1) ) {
            case FILE:
                {
                alt46=1;
                }
                break;
            case SOURCE:
                {
                alt46=2;
                }
                break;
            case NODE:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:315:5: FILE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(315,5);
                    FILE86=(Token)match(input,FILE,FOLLOW_FILE_in_src_type1877); 
                    FILE86_tree = 
                    (Object)adaptor.create(FILE86)
                    ;
                    adaptor.addChild(root_0, FILE86_tree);

                    dbg.location(315,10);
                     retval.val = StreamSourceType.File; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:316:5: SOURCE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(316,5);
                    SOURCE87=(Token)match(input,SOURCE,FOLLOW_SOURCE_in_src_type1885); 
                    SOURCE87_tree = 
                    (Object)adaptor.create(SOURCE87)
                    ;
                    adaptor.addChild(root_0, SOURCE87_tree);

                    dbg.location(316,12);
                     retval.val = StreamSourceType.Source; 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:317:5: NODE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(317,5);
                    NODE88=(Token)match(input,NODE,FOLLOW_NODE_in_src_type1893); 
                    NODE88_tree = 
                    (Object)adaptor.create(NODE88)
                    ;
                    adaptor.addChild(root_0, NODE88_tree);

                    dbg.location(317,10);
                     retval.val = StreamSourceType.Node; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(318, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "src_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "src_type"


    public static class optional_where_conditions_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_where_conditions"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:323:1: optional_where_conditions returns [Expr val] : (| WHERE e= expr );
    public final SqlGrammar.optional_where_conditions_return optional_where_conditions() throws RecognitionException {
        SqlGrammar.optional_where_conditions_return retval = new SqlGrammar.optional_where_conditions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE89=null;
        SqlGrammar.expr_return e =null;


        Object WHERE89_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "optional_where_conditions");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(323, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:323:46: (| WHERE e= expr )
            int alt47=2;
            try { dbg.enterDecision(47, decisionCanBacktrack[47]);

            int LA47_0 = input.LA(1);

            if ( (LA47_0==EOF||LA47_0==GROUP||LA47_0==HAVING||LA47_0==OVER||LA47_0==RPAREN||LA47_0==WINDOW) ) {
                alt47=1;
            }
            else if ( (LA47_0==WHERE) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:324:5: 
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(324,5);
                     retval.val =null; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:325:5: WHERE e= expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(325,5);
                    WHERE89=(Token)match(input,WHERE,FOLLOW_WHERE_in_optional_where_conditions1927); 
                    WHERE89_tree = 
                    (Object)adaptor.create(WHERE89)
                    ;
                    adaptor.addChild(root_0, WHERE89_tree);

                    dbg.location(325,12);
                    pushFollow(FOLLOW_expr_in_optional_where_conditions1931);
                    e=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, e.getTree());
                    dbg.location(325,18);
                     retval.val =(e!=null?e.val:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(326, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optional_where_conditions");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optional_where_conditions"


    public static class optional_having_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_having"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:331:1: optional_having returns [Expr val] : (| HAVING e= expr );
    public final SqlGrammar.optional_having_return optional_having() throws RecognitionException {
        SqlGrammar.optional_having_return retval = new SqlGrammar.optional_having_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HAVING90=null;
        SqlGrammar.expr_return e =null;


        Object HAVING90_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "optional_having");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(331, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:331:36: (| HAVING e= expr )
            int alt48=2;
            try { dbg.enterDecision(48, decisionCanBacktrack[48]);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==EOF||LA48_0==RPAREN||LA48_0==WINDOW) ) {
                alt48=1;
            }
            else if ( (LA48_0==HAVING) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:332:5: 
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(332,5);
                     retval.val =null; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:333:5: HAVING e= expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(333,5);
                    HAVING90=(Token)match(input,HAVING,FOLLOW_HAVING_in_optional_having1961); 
                    HAVING90_tree = 
                    (Object)adaptor.create(HAVING90)
                    ;
                    adaptor.addChild(root_0, HAVING90_tree);

                    dbg.location(333,13);
                    pushFollow(FOLLOW_expr_in_optional_having1965);
                    e=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, e.getTree());
                    dbg.location(333,19);
                     retval.val =(e!=null?e.val:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(334, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optional_having");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optional_having"


    public static class optional_group_by_return extends ParserRuleReturnScope {
        public GroupBy val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_group_by"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:338:1: optional_group_by returns [GroupBy val] : (| GROUP BY f= field_sel_list );
    public final SqlGrammar.optional_group_by_return optional_group_by() throws RecognitionException {
        SqlGrammar.optional_group_by_return retval = new SqlGrammar.optional_group_by_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GROUP91=null;
        Token BY92=null;
        SqlGrammar.field_sel_list_return f =null;


        Object GROUP91_tree=null;
        Object BY92_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "optional_group_by");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(338, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:338:41: (| GROUP BY f= field_sel_list )
            int alt49=2;
            try { dbg.enterDecision(49, decisionCanBacktrack[49]);

            int LA49_0 = input.LA(1);

            if ( (LA49_0==EOF||LA49_0==HAVING||LA49_0==OVER||LA49_0==RPAREN||LA49_0==WINDOW) ) {
                alt49=1;
            }
            else if ( (LA49_0==GROUP) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(49);}

            switch (alt49) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:339:5: 
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(339,5);
                     retval.val =null; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:340:5: GROUP BY f= field_sel_list
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(340,5);
                    GROUP91=(Token)match(input,GROUP,FOLLOW_GROUP_in_optional_group_by1994); 
                    GROUP91_tree = 
                    (Object)adaptor.create(GROUP91)
                    ;
                    adaptor.addChild(root_0, GROUP91_tree);

                    dbg.location(340,11);
                    BY92=(Token)match(input,BY,FOLLOW_BY_in_optional_group_by1996); 
                    BY92_tree = 
                    (Object)adaptor.create(BY92)
                    ;
                    adaptor.addChild(root_0, BY92_tree);

                    dbg.location(340,15);
                    pushFollow(FOLLOW_field_sel_list_in_optional_group_by2000);
                    f=field_sel_list();

                    state._fsp--;

                    adaptor.addChild(root_0, f.getTree());
                    dbg.location(340,31);
                     retval.val = new GroupBy((f!=null?f.val:null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(341, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optional_group_by");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optional_group_by"


    public static class optional_window_over_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_window_over"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:345:1: optional_window_over returns [Expr val] : (| OVER w= inline_window_spec );
    public final SqlGrammar.optional_window_over_return optional_window_over() throws RecognitionException {
        SqlGrammar.optional_window_over_return retval = new SqlGrammar.optional_window_over_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OVER93=null;
        SqlGrammar.inline_window_spec_return w =null;


        Object OVER93_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "optional_window_over");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:345:40: (| OVER w= inline_window_spec )
            int alt50=2;
            try { dbg.enterDecision(50, decisionCanBacktrack[50]);

            int LA50_0 = input.LA(1);

            if ( (LA50_0==EOF||LA50_0==HAVING||LA50_0==RPAREN||LA50_0==WINDOW) ) {
                alt50=1;
            }
            else if ( (LA50_0==OVER) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(50);}

            switch (alt50) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:346:5: 
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(346,5);
                     retval.val =null; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:347:5: OVER w= inline_window_spec
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(347,5);
                    OVER93=(Token)match(input,OVER,FOLLOW_OVER_in_optional_window_over2028); 
                    OVER93_tree = 
                    (Object)adaptor.create(OVER93)
                    ;
                    adaptor.addChild(root_0, OVER93_tree);

                    dbg.location(347,11);
                    pushFollow(FOLLOW_inline_window_spec_in_optional_window_over2032);
                    w=inline_window_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, w.getTree());
                    dbg.location(347,31);
                     retval.val = (w!=null?w.val:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(347, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optional_window_over");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optional_window_over"


    public static class optional_window_defs_return extends ParserRuleReturnScope {
        public List<WindowDef> val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_window_defs"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:350:1: optional_window_defs returns [List<WindowDef> val] : ( WINDOW id= user_sel AS LPAREN w= window_spec RPAREN ( COMMA WINDOW id2= user_sel AS LPAREN w2= window_spec RPAREN )* )? ;
    public final SqlGrammar.optional_window_defs_return optional_window_defs() throws RecognitionException {
        SqlGrammar.optional_window_defs_return retval = new SqlGrammar.optional_window_defs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WINDOW94=null;
        Token AS95=null;
        Token LPAREN96=null;
        Token RPAREN97=null;
        Token COMMA98=null;
        Token WINDOW99=null;
        Token AS100=null;
        Token LPAREN101=null;
        Token RPAREN102=null;
        SqlGrammar.user_sel_return id =null;

        SqlGrammar.window_spec_return w =null;

        SqlGrammar.user_sel_return id2 =null;

        SqlGrammar.window_spec_return w2 =null;


        Object WINDOW94_tree=null;
        Object AS95_tree=null;
        Object LPAREN96_tree=null;
        Object RPAREN97_tree=null;
        Object COMMA98_tree=null;
        Object WINDOW99_tree=null;
        Object AS100_tree=null;
        Object LPAREN101_tree=null;
        Object RPAREN102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "optional_window_defs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:350:52: ( ( WINDOW id= user_sel AS LPAREN w= window_spec RPAREN ( COMMA WINDOW id2= user_sel AS LPAREN w2= window_spec RPAREN )* )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:351:5: ( WINDOW id= user_sel AS LPAREN w= window_spec RPAREN ( COMMA WINDOW id2= user_sel AS LPAREN w2= window_spec RPAREN )* )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(351,5);
             retval.val = new ArrayList<WindowDef>(); 
            dbg.location(352,5);
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:352:5: ( WINDOW id= user_sel AS LPAREN w= window_spec RPAREN ( COMMA WINDOW id2= user_sel AS LPAREN w2= window_spec RPAREN )* )?
            int alt52=2;
            try { dbg.enterSubRule(52);
            try { dbg.enterDecision(52, decisionCanBacktrack[52]);

            int LA52_0 = input.LA(1);

            if ( (LA52_0==WINDOW) ) {
                alt52=1;
            }
            } finally {dbg.exitDecision(52);}

            switch (alt52) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:352:7: WINDOW id= user_sel AS LPAREN w= window_spec RPAREN ( COMMA WINDOW id2= user_sel AS LPAREN w2= window_spec RPAREN )*
                    {
                    dbg.location(352,7);
                    WINDOW94=(Token)match(input,WINDOW,FOLLOW_WINDOW_in_optional_window_defs2059); 
                    WINDOW94_tree = 
                    (Object)adaptor.create(WINDOW94)
                    ;
                    adaptor.addChild(root_0, WINDOW94_tree);

                    dbg.location(352,16);
                    pushFollow(FOLLOW_user_sel_in_optional_window_defs2063);
                    id=user_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, id.getTree());
                    dbg.location(352,26);
                    AS95=(Token)match(input,AS,FOLLOW_AS_in_optional_window_defs2065); 
                    AS95_tree = 
                    (Object)adaptor.create(AS95)
                    ;
                    adaptor.addChild(root_0, AS95_tree);

                    dbg.location(352,29);
                    LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_optional_window_defs2067); 
                    LPAREN96_tree = 
                    (Object)adaptor.create(LPAREN96)
                    ;
                    adaptor.addChild(root_0, LPAREN96_tree);

                    dbg.location(352,37);
                    pushFollow(FOLLOW_window_spec_in_optional_window_defs2071);
                    w=window_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, w.getTree());
                    dbg.location(352,50);
                    RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_optional_window_defs2073); 
                    RPAREN97_tree = 
                    (Object)adaptor.create(RPAREN97)
                    ;
                    adaptor.addChild(root_0, RPAREN97_tree);

                    dbg.location(353,7);
                     retval.val.add(new WindowDef((id!=null?id.val:null), (w!=null?w.val:null))); 
                    dbg.location(354,7);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:354:7: ( COMMA WINDOW id2= user_sel AS LPAREN w2= window_spec RPAREN )*
                    try { dbg.enterSubRule(51);

                    loop51:
                    do {
                        int alt51=2;
                        try { dbg.enterDecision(51, decisionCanBacktrack[51]);

                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==COMMA) ) {
                            alt51=1;
                        }


                        } finally {dbg.exitDecision(51);}

                        switch (alt51) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:354:9: COMMA WINDOW id2= user_sel AS LPAREN w2= window_spec RPAREN
                    	    {
                    	    dbg.location(354,9);
                    	    COMMA98=(Token)match(input,COMMA,FOLLOW_COMMA_in_optional_window_defs2091); 
                    	    COMMA98_tree = 
                    	    (Object)adaptor.create(COMMA98)
                    	    ;
                    	    adaptor.addChild(root_0, COMMA98_tree);

                    	    dbg.location(354,15);
                    	    WINDOW99=(Token)match(input,WINDOW,FOLLOW_WINDOW_in_optional_window_defs2093); 
                    	    WINDOW99_tree = 
                    	    (Object)adaptor.create(WINDOW99)
                    	    ;
                    	    adaptor.addChild(root_0, WINDOW99_tree);

                    	    dbg.location(354,25);
                    	    pushFollow(FOLLOW_user_sel_in_optional_window_defs2097);
                    	    id2=user_sel();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, id2.getTree());
                    	    dbg.location(354,35);
                    	    AS100=(Token)match(input,AS,FOLLOW_AS_in_optional_window_defs2099); 
                    	    AS100_tree = 
                    	    (Object)adaptor.create(AS100)
                    	    ;
                    	    adaptor.addChild(root_0, AS100_tree);

                    	    dbg.location(354,38);
                    	    LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_optional_window_defs2101); 
                    	    LPAREN101_tree = 
                    	    (Object)adaptor.create(LPAREN101)
                    	    ;
                    	    adaptor.addChild(root_0, LPAREN101_tree);

                    	    dbg.location(354,47);
                    	    pushFollow(FOLLOW_window_spec_in_optional_window_defs2105);
                    	    w2=window_spec();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, w2.getTree());
                    	    dbg.location(354,60);
                    	    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_optional_window_defs2107); 
                    	    RPAREN102_tree = 
                    	    (Object)adaptor.create(RPAREN102)
                    	    ;
                    	    adaptor.addChild(root_0, RPAREN102_tree);

                    	    dbg.location(355,9);
                    	     retval.val.add(new WindowDef((id2!=null?id2.val:null), (w2!=null?w2.val:null))); 

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(51);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(52);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(355, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optional_window_defs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optional_window_defs"


    public static class window_spec_return extends ParserRuleReturnScope {
        public WindowSpec val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_spec"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:358:1: window_spec returns [WindowSpec val] : RANGE r= range_spec ;
    public final SqlGrammar.window_spec_return window_spec() throws RecognitionException {
        SqlGrammar.window_spec_return retval = new SqlGrammar.window_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RANGE103=null;
        SqlGrammar.range_spec_return r =null;


        Object RANGE103_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "window_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:358:37: ( RANGE r= range_spec )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:359:5: RANGE r= range_spec
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(359,5);
            RANGE103=(Token)match(input,RANGE,FOLLOW_RANGE_in_window_spec2139); 
            RANGE103_tree = 
            (Object)adaptor.create(RANGE103)
            ;
            adaptor.addChild(root_0, RANGE103_tree);

            dbg.location(359,12);
            pushFollow(FOLLOW_range_spec_in_window_spec2143);
            r=range_spec();

            state._fsp--;

            adaptor.addChild(root_0, r.getTree());
            dbg.location(359,24);
             retval.val = new WindowSpec((r!=null?r.val:null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(359, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "window_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "window_spec"


    public static class inline_window_spec_return extends ParserRuleReturnScope {
        public Expr val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inline_window_spec"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:363:1: inline_window_spec returns [Expr val] : (w= window_spec |id= user_sel );
    public final SqlGrammar.inline_window_spec_return inline_window_spec() throws RecognitionException {
        SqlGrammar.inline_window_spec_return retval = new SqlGrammar.inline_window_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlGrammar.window_spec_return w =null;

        SqlGrammar.user_sel_return id =null;



        try { dbg.enterRule(getGrammarFileName(), "inline_window_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(363, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:363:38: (w= window_spec |id= user_sel )
            int alt53=2;
            try { dbg.enterDecision(53, decisionCanBacktrack[53]);

            int LA53_0 = input.LA(1);

            if ( (LA53_0==RANGE) ) {
                alt53=1;
            }
            else if ( (LA53_0==ID||LA53_0==QQ_STRING) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:364:5: w= window_spec
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(364,6);
                    pushFollow(FOLLOW_window_spec_in_inline_window_spec2164);
                    w=window_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, w.getTree());
                    dbg.location(364,19);
                     retval.val = (w!=null?w.val:null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:365:5: id= user_sel
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(365,7);
                    pushFollow(FOLLOW_user_sel_in_inline_window_spec2174);
                    id=user_sel();

                    state._fsp--;

                    adaptor.addChild(root_0, id.getTree());
                    dbg.location(365,17);
                     retval.val = new IdentifierExpr((id!=null?id.val:null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(366, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inline_window_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inline_window_spec"


    public static class range_spec_return extends ParserRuleReturnScope {
        public RangeSpec val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "range_spec"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:369:1: range_spec returns [RangeSpec val] : ( INTERVAL e= expr t= time_width PRECEDING | BETWEEN INTERVAL e1= expr t1= time_width PRECEDING L_AND INTERVAL e2= expr t2= time_width FOLLOWING );
    public final SqlGrammar.range_spec_return range_spec() throws RecognitionException {
        SqlGrammar.range_spec_return retval = new SqlGrammar.range_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERVAL104=null;
        Token PRECEDING105=null;
        Token BETWEEN106=null;
        Token INTERVAL107=null;
        Token PRECEDING108=null;
        Token L_AND109=null;
        Token INTERVAL110=null;
        Token FOLLOWING111=null;
        SqlGrammar.expr_return e =null;

        SqlGrammar.time_width_return t =null;

        SqlGrammar.expr_return e1 =null;

        SqlGrammar.time_width_return t1 =null;

        SqlGrammar.expr_return e2 =null;

        SqlGrammar.time_width_return t2 =null;


        Object INTERVAL104_tree=null;
        Object PRECEDING105_tree=null;
        Object BETWEEN106_tree=null;
        Object INTERVAL107_tree=null;
        Object PRECEDING108_tree=null;
        Object L_AND109_tree=null;
        Object INTERVAL110_tree=null;
        Object FOLLOWING111_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "range_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(369, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:369:35: ( INTERVAL e= expr t= time_width PRECEDING | BETWEEN INTERVAL e1= expr t1= time_width PRECEDING L_AND INTERVAL e2= expr t2= time_width FOLLOWING )
            int alt54=2;
            try { dbg.enterDecision(54, decisionCanBacktrack[54]);

            int LA54_0 = input.LA(1);

            if ( (LA54_0==INTERVAL) ) {
                alt54=1;
            }
            else if ( (LA54_0==BETWEEN) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(54);}

            switch (alt54) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:370:5: INTERVAL e= expr t= time_width PRECEDING
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(370,5);
                    INTERVAL104=(Token)match(input,INTERVAL,FOLLOW_INTERVAL_in_range_spec2195); 
                    INTERVAL104_tree = 
                    (Object)adaptor.create(INTERVAL104)
                    ;
                    adaptor.addChild(root_0, INTERVAL104_tree);

                    dbg.location(370,15);
                    pushFollow(FOLLOW_expr_in_range_spec2199);
                    e=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, e.getTree());
                    dbg.location(370,22);
                    pushFollow(FOLLOW_time_width_in_range_spec2203);
                    t=time_width();

                    state._fsp--;

                    adaptor.addChild(root_0, t.getTree());
                    dbg.location(370,34);
                    PRECEDING105=(Token)match(input,PRECEDING,FOLLOW_PRECEDING_in_range_spec2205); 
                    PRECEDING105_tree = 
                    (Object)adaptor.create(PRECEDING105)
                    ;
                    adaptor.addChild(root_0, PRECEDING105_tree);

                    dbg.location(370,44);
                     retval.val = new RangeSpec((e!=null?e.val:null), (t!=null?t.val:null)); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:371:5: BETWEEN INTERVAL e1= expr t1= time_width PRECEDING L_AND INTERVAL e2= expr t2= time_width FOLLOWING
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(371,5);
                    BETWEEN106=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_range_spec2213); 
                    BETWEEN106_tree = 
                    (Object)adaptor.create(BETWEEN106)
                    ;
                    adaptor.addChild(root_0, BETWEEN106_tree);

                    dbg.location(371,13);
                    INTERVAL107=(Token)match(input,INTERVAL,FOLLOW_INTERVAL_in_range_spec2215); 
                    INTERVAL107_tree = 
                    (Object)adaptor.create(INTERVAL107)
                    ;
                    adaptor.addChild(root_0, INTERVAL107_tree);

                    dbg.location(371,24);
                    pushFollow(FOLLOW_expr_in_range_spec2219);
                    e1=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, e1.getTree());
                    dbg.location(371,32);
                    pushFollow(FOLLOW_time_width_in_range_spec2223);
                    t1=time_width();

                    state._fsp--;

                    adaptor.addChild(root_0, t1.getTree());
                    dbg.location(371,44);
                    PRECEDING108=(Token)match(input,PRECEDING,FOLLOW_PRECEDING_in_range_spec2225); 
                    PRECEDING108_tree = 
                    (Object)adaptor.create(PRECEDING108)
                    ;
                    adaptor.addChild(root_0, PRECEDING108_tree);

                    dbg.location(372,5);
                    L_AND109=(Token)match(input,L_AND,FOLLOW_L_AND_in_range_spec2231); 
                    L_AND109_tree = 
                    (Object)adaptor.create(L_AND109)
                    ;
                    adaptor.addChild(root_0, L_AND109_tree);

                    dbg.location(372,11);
                    INTERVAL110=(Token)match(input,INTERVAL,FOLLOW_INTERVAL_in_range_spec2233); 
                    INTERVAL110_tree = 
                    (Object)adaptor.create(INTERVAL110)
                    ;
                    adaptor.addChild(root_0, INTERVAL110_tree);

                    dbg.location(372,22);
                    pushFollow(FOLLOW_expr_in_range_spec2237);
                    e2=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, e2.getTree());
                    dbg.location(372,30);
                    pushFollow(FOLLOW_time_width_in_range_spec2241);
                    t2=time_width();

                    state._fsp--;

                    adaptor.addChild(root_0, t2.getTree());
                    dbg.location(372,42);
                    FOLLOWING111=(Token)match(input,FOLLOWING,FOLLOW_FOLLOWING_in_range_spec2243); 
                    FOLLOWING111_tree = 
                    (Object)adaptor.create(FOLLOWING111)
                    ;
                    adaptor.addChild(root_0, FOLLOWING111_tree);

                    dbg.location(373,5);
                     retval.val = new RangeSpec((e1!=null?e1.val:null), (t1!=null?t1.val:null), (e2!=null?e2.val:null), (t2!=null?t2.val:null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(374, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "range_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "range_spec"


    public static class time_width_return extends ParserRuleReturnScope {
        public TimeWidth val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time_width"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:376:1: time_width returns [TimeWidth val] : ( SECONDS | MINUTES | HOURS | DAYS | WEEKS | MONTHS | YEARS );
    public final SqlGrammar.time_width_return time_width() throws RecognitionException {
        SqlGrammar.time_width_return retval = new SqlGrammar.time_width_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SECONDS112=null;
        Token MINUTES113=null;
        Token HOURS114=null;
        Token DAYS115=null;
        Token WEEKS116=null;
        Token MONTHS117=null;
        Token YEARS118=null;

        Object SECONDS112_tree=null;
        Object MINUTES113_tree=null;
        Object HOURS114_tree=null;
        Object DAYS115_tree=null;
        Object WEEKS116_tree=null;
        Object MONTHS117_tree=null;
        Object YEARS118_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "time_width");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:376:35: ( SECONDS | MINUTES | HOURS | DAYS | WEEKS | MONTHS | YEARS )
            int alt55=7;
            try { dbg.enterDecision(55, decisionCanBacktrack[55]);

            switch ( input.LA(1) ) {
            case SECONDS:
                {
                alt55=1;
                }
                break;
            case MINUTES:
                {
                alt55=2;
                }
                break;
            case HOURS:
                {
                alt55=3;
                }
                break;
            case DAYS:
                {
                alt55=4;
                }
                break;
            case WEEKS:
                {
                alt55=5;
                }
                break;
            case MONTHS:
                {
                alt55=6;
                }
                break;
            case YEARS:
                {
                alt55=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:377:5: SECONDS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(377,5);
                    SECONDS112=(Token)match(input,SECONDS,FOLLOW_SECONDS_in_time_width2267); 
                    SECONDS112_tree = 
                    (Object)adaptor.create(SECONDS112)
                    ;
                    adaptor.addChild(root_0, SECONDS112_tree);

                    dbg.location(377,13);
                     retval.val = TimeWidth.Seconds; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:378:5: MINUTES
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(378,5);
                    MINUTES113=(Token)match(input,MINUTES,FOLLOW_MINUTES_in_time_width2275); 
                    MINUTES113_tree = 
                    (Object)adaptor.create(MINUTES113)
                    ;
                    adaptor.addChild(root_0, MINUTES113_tree);

                    dbg.location(378,13);
                     retval.val = TimeWidth.Minutes; 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:379:5: HOURS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(379,5);
                    HOURS114=(Token)match(input,HOURS,FOLLOW_HOURS_in_time_width2283); 
                    HOURS114_tree = 
                    (Object)adaptor.create(HOURS114)
                    ;
                    adaptor.addChild(root_0, HOURS114_tree);

                    dbg.location(379,11);
                     retval.val = TimeWidth.Hours; 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:380:5: DAYS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(380,5);
                    DAYS115=(Token)match(input,DAYS,FOLLOW_DAYS_in_time_width2291); 
                    DAYS115_tree = 
                    (Object)adaptor.create(DAYS115)
                    ;
                    adaptor.addChild(root_0, DAYS115_tree);

                    dbg.location(380,10);
                     retval.val = TimeWidth.Days; 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:381:5: WEEKS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(381,5);
                    WEEKS116=(Token)match(input,WEEKS,FOLLOW_WEEKS_in_time_width2299); 
                    WEEKS116_tree = 
                    (Object)adaptor.create(WEEKS116)
                    ;
                    adaptor.addChild(root_0, WEEKS116_tree);

                    dbg.location(381,11);
                     retval.val = TimeWidth.Weeks; 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:382:5: MONTHS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(382,5);
                    MONTHS117=(Token)match(input,MONTHS,FOLLOW_MONTHS_in_time_width2307); 
                    MONTHS117_tree = 
                    (Object)adaptor.create(MONTHS117)
                    ;
                    adaptor.addChild(root_0, MONTHS117_tree);

                    dbg.location(382,12);
                     retval.val = TimeWidth.Months; 

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:383:5: YEARS
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(383,5);
                    YEARS118=(Token)match(input,YEARS,FOLLOW_YEARS_in_time_width2315); 
                    YEARS118_tree = 
                    (Object)adaptor.create(YEARS118)
                    ;
                    adaptor.addChild(root_0, YEARS118_tree);

                    dbg.location(383,11);
                     retval.val = TimeWidth.Years; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(384, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "time_width");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "time_width"


    public static class optional_format_spec_return extends ParserRuleReturnScope {
        public FormatSpec val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_format_spec"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:388:1: optional_format_spec returns [FormatSpec val] : (| EVENT FORMAT fmt= Q_STRING ( PROPERTIES LPAREN (k= Q_STRING EQ v= Q_STRING ( COMMA k2= Q_STRING EQ v2= Q_STRING )* )? RPAREN )? );
    public final SqlGrammar.optional_format_spec_return optional_format_spec() throws RecognitionException {
        SqlGrammar.optional_format_spec_return retval = new SqlGrammar.optional_format_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token fmt=null;
        Token k=null;
        Token v=null;
        Token k2=null;
        Token v2=null;
        Token EVENT119=null;
        Token FORMAT120=null;
        Token PROPERTIES121=null;
        Token LPAREN122=null;
        Token EQ123=null;
        Token COMMA124=null;
        Token EQ125=null;
        Token RPAREN126=null;

        Object fmt_tree=null;
        Object k_tree=null;
        Object v_tree=null;
        Object k2_tree=null;
        Object v2_tree=null;
        Object EVENT119_tree=null;
        Object FORMAT120_tree=null;
        Object PROPERTIES121_tree=null;
        Object LPAREN122_tree=null;
        Object EQ123_tree=null;
        Object COMMA124_tree=null;
        Object EQ125_tree=null;
        Object RPAREN126_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "optional_format_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(388, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:388:47: (| EVENT FORMAT fmt= Q_STRING ( PROPERTIES LPAREN (k= Q_STRING EQ v= Q_STRING ( COMMA k2= Q_STRING EQ v2= Q_STRING )* )? RPAREN )? )
            int alt59=2;
            try { dbg.enterDecision(59, decisionCanBacktrack[59]);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==EOF) ) {
                alt59=1;
            }
            else if ( (LA59_0==EVENT) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:389:5: 
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(389,5);
                     retval.val = new FormatSpec(); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:390:5: EVENT FORMAT fmt= Q_STRING ( PROPERTIES LPAREN (k= Q_STRING EQ v= Q_STRING ( COMMA k2= Q_STRING EQ v2= Q_STRING )* )? RPAREN )?
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(390,5);
                    EVENT119=(Token)match(input,EVENT,FOLLOW_EVENT_in_optional_format_spec2344); 
                    EVENT119_tree = 
                    (Object)adaptor.create(EVENT119)
                    ;
                    adaptor.addChild(root_0, EVENT119_tree);

                    dbg.location(390,11);
                    FORMAT120=(Token)match(input,FORMAT,FOLLOW_FORMAT_in_optional_format_spec2346); 
                    FORMAT120_tree = 
                    (Object)adaptor.create(FORMAT120)
                    ;
                    adaptor.addChild(root_0, FORMAT120_tree);

                    dbg.location(390,21);
                    fmt=(Token)match(input,Q_STRING,FOLLOW_Q_STRING_in_optional_format_spec2350); 
                    fmt_tree = 
                    (Object)adaptor.create(fmt)
                    ;
                    adaptor.addChild(root_0, fmt_tree);

                    dbg.location(390,31);
                     retval.val = new FormatSpec(unescape((fmt!=null?fmt.getText():null))); 
                    dbg.location(391,5);
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:391:5: ( PROPERTIES LPAREN (k= Q_STRING EQ v= Q_STRING ( COMMA k2= Q_STRING EQ v2= Q_STRING )* )? RPAREN )?
                    int alt58=2;
                    try { dbg.enterSubRule(58);
                    try { dbg.enterDecision(58, decisionCanBacktrack[58]);

                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==PROPERTIES) ) {
                        alt58=1;
                    }
                    } finally {dbg.exitDecision(58);}

                    switch (alt58) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:391:6: PROPERTIES LPAREN (k= Q_STRING EQ v= Q_STRING ( COMMA k2= Q_STRING EQ v2= Q_STRING )* )? RPAREN
                            {
                            dbg.location(391,6);
                            PROPERTIES121=(Token)match(input,PROPERTIES,FOLLOW_PROPERTIES_in_optional_format_spec2359); 
                            PROPERTIES121_tree = 
                            (Object)adaptor.create(PROPERTIES121)
                            ;
                            adaptor.addChild(root_0, PROPERTIES121_tree);

                            dbg.location(391,17);
                            LPAREN122=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_optional_format_spec2361); 
                            LPAREN122_tree = 
                            (Object)adaptor.create(LPAREN122)
                            ;
                            adaptor.addChild(root_0, LPAREN122_tree);

                            dbg.location(391,24);
                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:391:24: (k= Q_STRING EQ v= Q_STRING ( COMMA k2= Q_STRING EQ v2= Q_STRING )* )?
                            int alt57=2;
                            try { dbg.enterSubRule(57);
                            try { dbg.enterDecision(57, decisionCanBacktrack[57]);

                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==Q_STRING) ) {
                                alt57=1;
                            }
                            } finally {dbg.exitDecision(57);}

                            switch (alt57) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:391:26: k= Q_STRING EQ v= Q_STRING ( COMMA k2= Q_STRING EQ v2= Q_STRING )*
                                    {
                                    dbg.location(391,27);
                                    k=(Token)match(input,Q_STRING,FOLLOW_Q_STRING_in_optional_format_spec2367); 
                                    k_tree = 
                                    (Object)adaptor.create(k)
                                    ;
                                    adaptor.addChild(root_0, k_tree);

                                    dbg.location(391,37);
                                    EQ123=(Token)match(input,EQ,FOLLOW_EQ_in_optional_format_spec2369); 
                                    EQ123_tree = 
                                    (Object)adaptor.create(EQ123)
                                    ;
                                    adaptor.addChild(root_0, EQ123_tree);

                                    dbg.location(391,41);
                                    v=(Token)match(input,Q_STRING,FOLLOW_Q_STRING_in_optional_format_spec2373); 
                                    v_tree = 
                                    (Object)adaptor.create(v)
                                    ;
                                    adaptor.addChild(root_0, v_tree);

                                    dbg.location(391,51);

                                            retval.val.setParam(unescape((k!=null?k.getText():null)), unescape((v!=null?v.getText():null))); 
                                    dbg.location(393,9);
                                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:393:9: ( COMMA k2= Q_STRING EQ v2= Q_STRING )*
                                    try { dbg.enterSubRule(56);

                                    loop56:
                                    do {
                                        int alt56=2;
                                        try { dbg.enterDecision(56, decisionCanBacktrack[56]);

                                        int LA56_0 = input.LA(1);

                                        if ( (LA56_0==COMMA) ) {
                                            alt56=1;
                                        }


                                        } finally {dbg.exitDecision(56);}

                                        switch (alt56) {
                                    	case 1 :
                                    	    dbg.enterAlt(1);

                                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:393:11: COMMA k2= Q_STRING EQ v2= Q_STRING
                                    	    {
                                    	    dbg.location(393,11);
                                    	    COMMA124=(Token)match(input,COMMA,FOLLOW_COMMA_in_optional_format_spec2387); 
                                    	    COMMA124_tree = 
                                    	    (Object)adaptor.create(COMMA124)
                                    	    ;
                                    	    adaptor.addChild(root_0, COMMA124_tree);

                                    	    dbg.location(393,19);
                                    	    k2=(Token)match(input,Q_STRING,FOLLOW_Q_STRING_in_optional_format_spec2391); 
                                    	    k2_tree = 
                                    	    (Object)adaptor.create(k2)
                                    	    ;
                                    	    adaptor.addChild(root_0, k2_tree);

                                    	    dbg.location(393,29);
                                    	    EQ125=(Token)match(input,EQ,FOLLOW_EQ_in_optional_format_spec2393); 
                                    	    EQ125_tree = 
                                    	    (Object)adaptor.create(EQ125)
                                    	    ;
                                    	    adaptor.addChild(root_0, EQ125_tree);

                                    	    dbg.location(393,34);
                                    	    v2=(Token)match(input,Q_STRING,FOLLOW_Q_STRING_in_optional_format_spec2397); 
                                    	    v2_tree = 
                                    	    (Object)adaptor.create(v2)
                                    	    ;
                                    	    adaptor.addChild(root_0, v2_tree);

                                    	    dbg.location(393,44);

                                    	            retval.val.setParam(unescape((k2!=null?k2.getText():null)), unescape((v2!=null?v2.getText():null))); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop56;
                                        }
                                    } while (true);
                                    } finally {dbg.exitSubRule(56);}


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(57);}

                            dbg.location(395,8);
                            RPAREN126=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_optional_format_spec2411); 
                            RPAREN126_tree = 
                            (Object)adaptor.create(RPAREN126)
                            ;
                            adaptor.addChild(root_0, RPAREN126_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(58);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(396, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optional_format_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optional_format_spec"


    public static class integer_return extends ParserRuleReturnScope {
        public Integer val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integer"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:399:1: integer returns [Integer val] : i= INT ;
    public final SqlGrammar.integer_return integer() throws RecognitionException {
        SqlGrammar.integer_return retval = new SqlGrammar.integer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token i=null;

        Object i_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(399, 0);

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:399:30: (i= INT )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlGrammar.g:400:5: i= INT
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(400,6);
            i=(Token)match(input,INT,FOLLOW_INT_in_integer2434); 
            i_tree = 
            (Object)adaptor.create(i)
            ;
            adaptor.addChild(root_0, i_tree);

            dbg.location(400,11);
             retval.val = Integer.valueOf((i!=null?i.getText():null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(400, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integer"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmt_in_top84 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_top88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_create_stream_in_stmt105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_select_in_stmt115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_explain_in_stmt125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_describe_in_stmt135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_show_in_stmt145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_drop_in_stmt155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_stmt_create_stream175 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STREAM_in_stmt_create_stream177 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_stream_sel_in_stmt_create_stream181 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_typed_field_list_in_stmt_create_stream185 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FROM_in_stmt_create_stream187 = new BitSet(new long[]{0x0100000020000000L,0x0000000010000010L});
    public static final BitSet FOLLOW_LOCAL_in_stmt_create_stream191 = new BitSet(new long[]{0x0000000020000000L,0x0000000010000010L});
    public static final BitSet FOLLOW_src_type_in_stmt_create_stream196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_src_spec_in_stmt_create_stream200 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_optional_format_spec_in_stmt_create_stream220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_stmt_create_stream228 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STREAM_in_stmt_create_stream230 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_stream_sel_in_stmt_create_stream234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_stmt_create_stream236 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_stmt_select_in_stmt_create_stream240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_stmt_describe266 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_user_sel_in_stmt_describe270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLAIN_in_stmt_explain285 = new BitSet(new long[]{0x0000000004248000L,0x0000000006000000L});
    public static final BitSet FOLLOW_stmt_in_stmt_explain289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_stmt_select304 = new BitSet(new long[]{0x8200C00810000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_aliased_expr_list_in_stmt_select308 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FROM_in_stmt_select310 = new BitSet(new long[]{0x0200400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_source_definition_in_stmt_select314 = new BitSet(new long[]{0x0000044000000000L,0x0000060000000400L});
    public static final BitSet FOLLOW_optional_where_conditions_in_stmt_select318 = new BitSet(new long[]{0x0000044000000000L,0x0000040000000400L});
    public static final BitSet FOLLOW_optional_group_by_in_stmt_select324 = new BitSet(new long[]{0x0000040000000000L,0x0000040000000400L});
    public static final BitSet FOLLOW_optional_window_over_in_stmt_select328 = new BitSet(new long[]{0x0000040000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_optional_having_in_stmt_select334 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_optional_window_defs_in_stmt_select340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_stmt_show359 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FLOWS_in_stmt_show361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_stmt_show369 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_STREAMS_in_stmt_show371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_stmt_show379 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FUNCTIONS_in_stmt_show381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_stmt_drop401 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOW_in_stmt_drop403 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_user_sel_in_stmt_drop407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_stmt_drop415 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STREAM_in_stmt_drop417 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_stream_sel_in_stmt_drop421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliased_expr_in_aliased_expr_list461 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_aliased_expr_list473 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_aliased_expr_in_aliased_expr_list477 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_expr_in_aliased_expr502 = new BitSet(new long[]{0x0000400000000022L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_in_aliased_expr516 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_user_sel_in_aliased_expr521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_expr542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr561 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_L_OR_in_or_expr575 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_and_expr_in_or_expr579 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_eq_expr_in_and_expr604 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_L_AND_in_and_expr618 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_eq_expr_in_and_expr622 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_comp_expr_in_eq_expr647 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000008L});
    public static final BitSet FOLLOW_eq_op_in_eq_expr663 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_comp_expr_in_eq_expr667 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_eq_op690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEQ_in_eq_op698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_comp_expr720 = new BitSet(new long[]{0x0C00018000000002L});
    public static final BitSet FOLLOW_comp_op_in_comp_expr736 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_add_expr_in_comp_expr740 = new BitSet(new long[]{0x0C00018000000002L});
    public static final BitSet FOLLOW_GT_in_comp_op763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTEQ_in_comp_op771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_comp_op779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTEQ_in_comp_op787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr809 = new BitSet(new long[]{0x8000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_add_op_in_add_expr825 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr829 = new BitSet(new long[]{0x8000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_add_op852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_add_op860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mul_expr882 = new BitSet(new long[]{0x0000000000000002L,0x0000000028001000L});
    public static final BitSet FOLLOW_mul_op_in_mul_expr898 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_unary_expr_in_mul_expr902 = new BitSet(new long[]{0x0000000000000002L,0x0000000028001000L});
    public static final BitSet FOLLOW_STAR_in_mul_op925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_mul_op933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_mul_op941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_un_op_in_unary_expr963 = new BitSet(new long[]{0x0200C00010000000L,0x00000008200C0040L});
    public static final BitSet FOLLOW_unary_null_expr_in_unary_expr967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_null_expr_in_unary_expr977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_un_op997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_un_op1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_un_op1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_null_expr1035 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_IS_in_unary_null_expr1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_NOT_in_unary_null_expr1056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_unary_null_expr1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1086 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_atom_expr1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_maybe_qualified_user_sel_in_atom_expr1102 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1113 = new BitSet(new long[]{0x8200C00010000000L,0x00000008204C2060L});
    public static final BitSet FOLLOW_expr_in_atom_expr1128 = new BitSet(new long[]{0x0000000000002000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr1143 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_atom_expr1147 = new BitSet(new long[]{0x0000000000002000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom_expr1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom_expr1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom_expr1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom_expr1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Q_STRING_in_atom_expr1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_atom_expr1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_maybe_qualified_user_sel_in_field_sel1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_sel_in_field_sel_list1270 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_field_sel_list1282 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_field_sel_in_field_sel_list1286 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LPAREN_in_typed_field_list1314 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_field_spec_in_typed_field_list1318 = new BitSet(new long[]{0x0000000000002000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_typed_field_list1325 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_field_spec_in_typed_field_list1329 = new BitSet(new long[]{0x0000000000002000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_typed_field_list1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_sel_in_field_spec1352 = new BitSet(new long[]{0x0082000040100700L,0x0000000500008000L});
    public static final BitSet FOLLOW_field_type_in_field_spec1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalar_field_type_in_field_type1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_type_in_field_type1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_field_type_in_scalar_field_type1412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_non_nul_qualifier_in_scalar_field_type1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precise_type_in_scalar_field_type1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitive_field_type1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_primitive_field_type1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIGINT_in_primitive_field_type1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_KW_in_primitive_field_type1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitive_field_type1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitive_field_type1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_KW_in_primitive_field_type1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_primitive_field_type1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRECISE_in_precise_type1529 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_precise_type1531 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_integer_in_precise_type1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_precise_type1537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NOT_in_precise_type1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_precise_type1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_list_type1575 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LT_in_list_type1577 = new BitSet(new long[]{0x0002000040100700L,0x0000000500008000L});
    public static final BitSet FOLLOW_scalar_field_type_in_list_type1581 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_GT_in_list_type1583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NOT_in_list_type1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_list_type1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_non_nul_qualifier1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_non_nul_qualifier1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_user_sel_in_stream_sel1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_user_sel1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQ_STRING_in_user_sel1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_maybe_qualified_user_sel1696 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_DOT_in_maybe_qualified_user_sel1706 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_maybe_qualified_user_sel1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQ_STRING_in_maybe_qualified_user_sel1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Q_STRING_in_src_spec1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_sel_in_source_definition1767 = new BitSet(new long[]{0x0010400000000022L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_in_source_definition1777 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_stream_sel_in_source_definition1782 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_JOIN_in_source_definition1795 = new BitSet(new long[]{0x0200400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_source_definition_in_source_definition1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_source_definition1801 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_source_definition1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OVER_in_source_definition1807 = new BitSet(new long[]{0x0000400000000000L,0x0000000000240000L});
    public static final BitSet FOLLOW_inline_window_spec_in_source_definition1811 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_source_definition1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_stmt_select_in_source_definition1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_source_definition1838 = new BitSet(new long[]{0x0000400000000022L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_in_source_definition1848 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_stream_sel_in_source_definition1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILE_in_src_type1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_in_src_type1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_src_type1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_optional_where_conditions1927 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_optional_where_conditions1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAVING_in_optional_having1961 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_optional_having1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_optional_group_by1994 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_optional_group_by1996 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_field_sel_list_in_optional_group_by2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVER_in_optional_window_over2028 = new BitSet(new long[]{0x0000400000000000L,0x0000000000240000L});
    public static final BitSet FOLLOW_inline_window_spec_in_optional_window_over2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_optional_window_defs2059 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_user_sel_in_optional_window_defs2063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_optional_window_defs2065 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_optional_window_defs2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_window_spec_in_optional_window_defs2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_optional_window_defs2073 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_optional_window_defs2091 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_WINDOW_in_optional_window_defs2093 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_user_sel_in_optional_window_defs2097 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_optional_window_defs2099 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_optional_window_defs2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_window_spec_in_optional_window_defs2105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_optional_window_defs2107 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RANGE_in_window_spec2139 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_range_spec_in_window_spec2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_window_spec_in_inline_window_spec2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_user_sel_in_inline_window_spec2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERVAL_in_range_spec2195 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_range_spec2199 = new BitSet(new long[]{0x0000100000020000L,0x0000410001000003L});
    public static final BitSet FOLLOW_time_width_in_range_spec2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PRECEDING_in_range_spec2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BETWEEN_in_range_spec2213 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_INTERVAL_in_range_spec2215 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_range_spec2219 = new BitSet(new long[]{0x0000100000020000L,0x0000410001000003L});
    public static final BitSet FOLLOW_time_width_in_range_spec2223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PRECEDING_in_range_spec2225 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_L_AND_in_range_spec2231 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_INTERVAL_in_range_spec2233 = new BitSet(new long[]{0x8200C00010000000L,0x00000008200C2060L});
    public static final BitSet FOLLOW_expr_in_range_spec2237 = new BitSet(new long[]{0x0000100000020000L,0x0000410001000003L});
    public static final BitSet FOLLOW_time_width_in_range_spec2241 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FOLLOWING_in_range_spec2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECONDS_in_time_width2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUTES_in_time_width2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOURS_in_time_width2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYS_in_time_width2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEKS_in_time_width2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTHS_in_time_width2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARS_in_time_width2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENT_in_optional_format_spec2344 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FORMAT_in_optional_format_spec2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Q_STRING_in_optional_format_spec2350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_PROPERTIES_in_optional_format_spec2359 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_optional_format_spec2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_Q_STRING_in_optional_format_spec2367 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQ_in_optional_format_spec2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Q_STRING_in_optional_format_spec2373 = new BitSet(new long[]{0x0000000000002000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_optional_format_spec2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Q_STRING_in_optional_format_spec2391 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQ_in_optional_format_spec2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Q_STRING_in_optional_format_spec2397 = new BitSet(new long[]{0x0000000000002000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_optional_format_spec2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integer2434 = new BitSet(new long[]{0x0000000000000002L});

}