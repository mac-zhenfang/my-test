// $ANTLR 3.4 C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g 2012-07-26 14:42:43

  package antlr.flume.output;


import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlLexer extends AbstractSqlLexer {
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
    // delegators
    public AbstractSqlLexer[] getDelegates() {
        return new AbstractSqlLexer[] {};
    }

    public SqlLexer() {} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g"; }

    // $ANTLR start "L_AND"
    public final void mL_AND() throws RecognitionException {
        try {
            int _type = L_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:29:7: ( A N D )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:29:9: A N D
            {
            mA(); 


            mN(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_AND"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:30:4: ( A S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:30:6: A S
            {
            mA(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:31:9: ( B E T W E E N )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:31:11: B E T W E E N
            {
            mB(); 


            mE(); 


            mT(); 


            mW(); 


            mE(); 


            mE(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "BIGINT"
    public final void mBIGINT() throws RecognitionException {
        try {
            int _type = BIGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:32:8: ( B I G I N T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:32:10: B I G I N T
            {
            mB(); 


            mI(); 


            mG(); 


            mI(); 


            mN(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIGINT"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:33:8: ( B I N A R Y )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:33:10: B I N A R Y
            {
            mB(); 


            mI(); 


            mN(); 


            mA(); 


            mR(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:34:9: ( B O O L E A N )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:34:11: B O O L E A N
            {
            mB(); 


            mO(); 


            mO(); 


            mL(); 


            mE(); 


            mA(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:35:4: ( B Y )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:35:6: B Y
            {
            mB(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:36:8: ( C R E A T E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:36:10: C R E A T E
            {
            mC(); 


            mR(); 


            mE(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DAYS"
    public final void mDAYS() throws RecognitionException {
        try {
            int _type = DAYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:37:6: ( D A Y S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:37:8: D A Y S
            {
            mD(); 


            mA(); 


            mY(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAYS"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:38:10: ( D E S C R I B E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:38:12: D E S C R I B E
            {
            mD(); 


            mE(); 


            mS(); 


            mC(); 


            mR(); 


            mI(); 


            mB(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:39:8: ( D O U B L E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:39:10: D O U B L E
            {
            mD(); 


            mO(); 


            mU(); 


            mB(); 


            mL(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:40:6: ( D R O P )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:40:8: D R O P
            {
            mD(); 


            mR(); 


            mO(); 


            mP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "EVENT"
    public final void mEVENT() throws RecognitionException {
        try {
            int _type = EVENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:41:7: ( E V E N T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:41:9: E V E N T
            {
            mE(); 


            mV(); 


            mE(); 


            mN(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EVENT"

    // $ANTLR start "EXPLAIN"
    public final void mEXPLAIN() throws RecognitionException {
        try {
            int _type = EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:42:9: ( E X P L A I N )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:42:11: E X P L A I N
            {
            mE(); 


            mX(); 


            mP(); 


            mL(); 


            mA(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPLAIN"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:43:7: ( F A L S E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:43:9: F A L S E
            {
            mF(); 


            mA(); 


            mL(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FILE"
    public final void mFILE() throws RecognitionException {
        try {
            int _type = FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:44:6: ( F I L E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:44:8: F I L E
            {
            mF(); 


            mI(); 


            mL(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILE"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:45:7: ( F L O A T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:45:9: F L O A T
            {
            mF(); 


            mL(); 


            mO(); 


            mA(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "FLOW"
    public final void mFLOW() throws RecognitionException {
        try {
            int _type = FLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:46:6: ( F L O W )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:46:8: F L O W
            {
            mF(); 


            mL(); 


            mO(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOW"

    // $ANTLR start "FLOWS"
    public final void mFLOWS() throws RecognitionException {
        try {
            int _type = FLOWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:47:7: ( F L O W S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:47:9: F L O W S
            {
            mF(); 


            mL(); 


            mO(); 


            mW(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOWS"

    // $ANTLR start "FOLLOWING"
    public final void mFOLLOWING() throws RecognitionException {
        try {
            int _type = FOLLOWING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:48:10: ( F O L L O W I N G )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:48:12: F O L L O W I N G
            {
            mF(); 


            mO(); 


            mL(); 


            mL(); 


            mO(); 


            mW(); 


            mI(); 


            mN(); 


            mG(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOLLOWING"

    // $ANTLR start "FORMAT"
    public final void mFORMAT() throws RecognitionException {
        try {
            int _type = FORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:49:8: ( F O R M A T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:49:10: F O R M A T
            {
            mF(); 


            mO(); 


            mR(); 


            mM(); 


            mA(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FORMAT"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:50:6: ( F R O M )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:50:8: F R O M
            {
            mF(); 


            mR(); 


            mO(); 


            mM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "FUNCTIONS"
    public final void mFUNCTIONS() throws RecognitionException {
        try {
            int _type = FUNCTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:51:11: ( F U N C T I O N S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:51:13: F U N C T I O N S
            {
            mF(); 


            mU(); 


            mN(); 


            mC(); 


            mT(); 


            mI(); 


            mO(); 


            mN(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTIONS"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:52:7: ( G R O U P )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:52:9: G R O U P
            {
            mG(); 


            mR(); 


            mO(); 


            mU(); 


            mP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:53:8: ( H A V I N G )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:53:10: H A V I N G
            {
            mH(); 


            mA(); 


            mV(); 


            mI(); 


            mN(); 


            mG(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "HOURS"
    public final void mHOURS() throws RecognitionException {
        try {
            int _type = HOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:54:7: ( H O U R S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:54:9: H O U R S
            {
            mH(); 


            mO(); 


            mU(); 


            mR(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOURS"

    // $ANTLR start "INTERVAL"
    public final void mINTERVAL() throws RecognitionException {
        try {
            int _type = INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:55:10: ( I N T E R V A L )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:55:12: I N T E R V A L
            {
            mI(); 


            mN(); 


            mT(); 


            mE(); 


            mR(); 


            mV(); 


            mA(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERVAL"

    // $ANTLR start "INT_KW"
    public final void mINT_KW() throws RecognitionException {
        try {
            int _type = INT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:56:8: ( I N T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:56:10: I N T
            {
            mI(); 


            mN(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_KW"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:57:4: ( I S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:57:6: I S
            {
            mI(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:58:6: ( J O I N )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:58:8: J O I N
            {
            mJ(); 


            mO(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:59:6: ( L I S T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:59:8: L I S T
            {
            mL(); 


            mI(); 


            mS(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "LOCAL"
    public final void mLOCAL() throws RecognitionException {
        try {
            int _type = LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:60:7: ( L O C A L )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:60:9: L O C A L
            {
            mL(); 


            mO(); 


            mC(); 


            mA(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOCAL"

    // $ANTLR start "MINUTES"
    public final void mMINUTES() throws RecognitionException {
        try {
            int _type = MINUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:61:9: ( M I N U T E S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:61:11: M I N U T E S
            {
            mM(); 


            mI(); 


            mN(); 


            mU(); 


            mT(); 


            mE(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUTES"

    // $ANTLR start "MONTHS"
    public final void mMONTHS() throws RecognitionException {
        try {
            int _type = MONTHS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:62:8: ( M O N T H S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:62:10: M O N T H S
            {
            mM(); 


            mO(); 


            mN(); 


            mT(); 


            mH(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MONTHS"

    // $ANTLR start "NODE"
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:63:6: ( N O D E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:63:8: N O D E
            {
            mN(); 


            mO(); 


            mD(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:64:5: ( N O T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:64:7: N O T
            {
            mN(); 


            mO(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:65:6: ( N U L L )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:65:8: N U L L
            {
            mN(); 


            mU(); 


            mL(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:66:4: ( O N )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:66:6: O N
            {
            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "L_OR"
    public final void mL_OR() throws RecognitionException {
        try {
            int _type = L_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:67:6: ( O R )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:67:8: O R
            {
            mO(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_OR"

    // $ANTLR start "OVER"
    public final void mOVER() throws RecognitionException {
        try {
            int _type = OVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:68:6: ( O V E R )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:68:8: O V E R
            {
            mO(); 


            mV(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OVER"

    // $ANTLR start "PRECEDING"
    public final void mPRECEDING() throws RecognitionException {
        try {
            int _type = PRECEDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:69:10: ( P R E C E D I N G )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:69:12: P R E C E D I N G
            {
            mP(); 


            mR(); 


            mE(); 


            mC(); 


            mE(); 


            mD(); 


            mI(); 


            mN(); 


            mG(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRECEDING"

    // $ANTLR start "PRECISE"
    public final void mPRECISE() throws RecognitionException {
        try {
            int _type = PRECISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:70:8: ( P R E C I S E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:70:10: P R E C I S E
            {
            mP(); 


            mR(); 


            mE(); 


            mC(); 


            mI(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRECISE"

    // $ANTLR start "PROPERTIES"
    public final void mPROPERTIES() throws RecognitionException {
        try {
            int _type = PROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:71:12: ( P R O P E R T I E S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:71:14: P R O P E R T I E S
            {
            mP(); 


            mR(); 


            mO(); 


            mP(); 


            mE(); 


            mR(); 


            mT(); 


            mI(); 


            mE(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROPERTIES"

    // $ANTLR start "RANGE"
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:72:7: ( R A N G E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:72:9: R A N G E
            {
            mR(); 


            mA(); 


            mN(); 


            mG(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RANGE"

    // $ANTLR start "SECONDS"
    public final void mSECONDS() throws RecognitionException {
        try {
            int _type = SECONDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:73:9: ( S E C O N D S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:73:11: S E C O N D S
            {
            mS(); 


            mE(); 


            mC(); 


            mO(); 


            mN(); 


            mD(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SECONDS"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:74:8: ( S E L E C T )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:74:10: S E L E C T
            {
            mS(); 


            mE(); 


            mL(); 


            mE(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SHOW"
    public final void mSHOW() throws RecognitionException {
        try {
            int _type = SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:75:6: ( S H O W )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:75:8: S H O W
            {
            mS(); 


            mH(); 


            mO(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHOW"

    // $ANTLR start "SOURCE"
    public final void mSOURCE() throws RecognitionException {
        try {
            int _type = SOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:76:8: ( S O U R C E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:76:10: S O U R C E
            {
            mS(); 


            mO(); 


            mU(); 


            mR(); 


            mC(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOURCE"

    // $ANTLR start "STREAM"
    public final void mSTREAM() throws RecognitionException {
        try {
            int _type = STREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:77:8: ( S T R E A M )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:77:10: S T R E A M
            {
            mS(); 


            mT(); 


            mR(); 


            mE(); 


            mA(); 


            mM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STREAM"

    // $ANTLR start "STREAMS"
    public final void mSTREAMS() throws RecognitionException {
        try {
            int _type = STREAMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:78:9: ( S T R E A M S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:78:11: S T R E A M S
            {
            mS(); 


            mT(); 


            mR(); 


            mE(); 


            mA(); 


            mM(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STREAMS"

    // $ANTLR start "STRING_KW"
    public final void mSTRING_KW() throws RecognitionException {
        try {
            int _type = STRING_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:79:11: ( S T R I N G )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:79:13: S T R I N G
            {
            mS(); 


            mT(); 


            mR(); 


            mI(); 


            mN(); 


            mG(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_KW"

    // $ANTLR start "TIMESTAMP"
    public final void mTIMESTAMP() throws RecognitionException {
        try {
            int _type = TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:80:11: ( T I M E S T A M P )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:80:13: T I M E S T A M P
            {
            mT(); 


            mI(); 


            mM(); 


            mE(); 


            mS(); 


            mT(); 


            mA(); 


            mM(); 


            mP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMESTAMP"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:81:6: ( T R U E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:81:8: T R U E
            {
            mT(); 


            mR(); 


            mU(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "WEEKS"
    public final void mWEEKS() throws RecognitionException {
        try {
            int _type = WEEKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:82:7: ( W E E K S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:82:9: W E E K S
            {
            mW(); 


            mE(); 


            mE(); 


            mK(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WEEKS"

    // $ANTLR start "WINDOW"
    public final void mWINDOW() throws RecognitionException {
        try {
            int _type = WINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:83:8: ( W I N D O W )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:83:10: W I N D O W
            {
            mW(); 


            mI(); 


            mN(); 


            mD(); 


            mO(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WINDOW"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:84:7: ( W H E R E )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:84:9: W H E R E
            {
            mW(); 


            mH(); 


            mE(); 


            mR(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "YEARS"
    public final void mYEARS() throws RecognitionException {
        try {
            int _type = YEARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:85:7: ( Y E A R S )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:85:9: Y E A R S
            {
            mY(); 


            mE(); 


            mA(); 


            mR(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "YEARS"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:87:5: ( ( '#' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:87:7: ( '#' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:87:7: ( '#' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='#') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:87:7: '#'
                    {
                    match('#'); 

                    }
                    break;

            }


            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:87:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:90:5: ( '.' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:90:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:92:6: ( '*' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:92:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:94:8: ( '(' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:94:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:96:8: ( ')' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:96:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:98:7: ( ',' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:98:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:100:6: ( '+' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:100:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:102:7: ( '-' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:102:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:104:7: ( '/' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:104:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:106:9: ( '%' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:106:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:108:6: ( '>' '=' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:108:8: '>' '='
            {
            match('>'); 

            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:110:4: ( '>' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:110:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:112:6: ( '<' '=' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:112:8: '<' '='
            {
            match('<'); 

            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:114:4: ( '<' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:114:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:116:4: ( '=' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:116:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:118:5: ( '!' '=' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:118:7: '!' '='
            {
            match('!'); 

            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:120:5: ( ( '0' .. '9' )+ )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:120:7: ( '0' .. '9' )+
            {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:120:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:125:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='/') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='*') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:125:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:125:14: (~ ( '\\n' | '\\r' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:125:28: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:125:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    skip();

                    }
                    break;
                case 2 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:126:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:126:14: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*') ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1=='/') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:126:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    match("*/"); 



                    skip();

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:129:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:129:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "QQ_STRING"
    public final void mQQ_STRING() throws RecognitionException {
        try {
            int _type = QQ_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:137:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:137:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:137:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:137:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:137:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QQ_STRING"

    // $ANTLR start "Q_STRING"
    public final void mQ_STRING() throws RecognitionException {
        try {
            int _type = Q_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:141:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:141:7: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 

            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:141:12: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '&')||(LA9_0 >= '(' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:141:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:141:24: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q_STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:146:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:150:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt10=1;
                    }
                    break;
                case 'u':
                    {
                    alt10=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt10=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:150:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:151:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:152:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:157:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1 >= '0' && LA11_1 <= '3')) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2 >= '0' && LA11_2 <= '7')) ) {
                        int LA11_4 = input.LA(4);

                        if ( ((LA11_4 >= '0' && LA11_4 <= '7')) ) {
                            alt11=1;
                        }
                        else {
                            alt11=2;
                        }
                    }
                    else {
                        alt11=3;
                    }
                }
                else if ( ((LA11_1 >= '4' && LA11_1 <= '7')) ) {
                    int LA11_3 = input.LA(3);

                    if ( ((LA11_3 >= '0' && LA11_3 <= '7')) ) {
                        alt11=2;
                    }
                    else {
                        alt11=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:157:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:158:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:159:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:164:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:164:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:171:12: ( 'a' | 'A' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:172:12: ( 'b' | 'B' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:173:12: ( 'c' | 'C' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:174:12: ( 'd' | 'D' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:175:12: ( 'e' | 'E' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:176:12: ( 'f' | 'F' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:177:12: ( 'g' | 'G' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:178:12: ( 'h' | 'H' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:179:12: ( 'i' | 'I' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:180:12: ( 'j' | 'J' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:181:12: ( 'k' | 'K' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:182:12: ( 'l' | 'L' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:183:12: ( 'm' | 'M' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:184:12: ( 'n' | 'N' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:185:12: ( 'o' | 'O' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:186:12: ( 'p' | 'P' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:187:12: ( 'q' | 'Q' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:188:12: ( 'r' | 'R' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:189:12: ( 's' | 'S' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:190:12: ( 't' | 'T' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:191:12: ( 'u' | 'U' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:192:12: ( 'v' | 'V' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:193:12: ( 'w' | 'W' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:194:12: ( 'x' | 'X' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:195:12: ( 'y' | 'Y' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:196:12: ( 'z' | 'Z' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:8: ( L_AND | AS | BETWEEN | BIGINT | BINARY | BOOLEAN | BY | CREATE | DAYS | DESCRIBE | DOUBLE | DROP | EVENT | EXPLAIN | FALSE | FILE | FLOAT | FLOW | FLOWS | FOLLOWING | FORMAT | FROM | FUNCTIONS | GROUP | HAVING | HOURS | INTERVAL | INT_KW | IS | JOIN | LIST | LOCAL | MINUTES | MONTHS | NODE | NOT | NULL | ON | L_OR | OVER | PRECEDING | PRECISE | PROPERTIES | RANGE | SECONDS | SELECT | SHOW | SOURCE | STREAM | STREAMS | STRING_KW | TIMESTAMP | TRUE | WEEKS | WINDOW | WHERE | YEARS | ID | DOT | STAR | LPAREN | RPAREN | COMMA | PLUS | MINUS | SLASH | PERCENT | GTEQ | GT | LTEQ | LT | EQ | NEQ | INT | COMMENT | WS | QQ_STRING | Q_STRING )
        int alt12=78;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:10: L_AND
                {
                mL_AND(); 


                }
                break;
            case 2 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:16: AS
                {
                mAS(); 


                }
                break;
            case 3 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:19: BETWEEN
                {
                mBETWEEN(); 


                }
                break;
            case 4 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:27: BIGINT
                {
                mBIGINT(); 


                }
                break;
            case 5 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:34: BINARY
                {
                mBINARY(); 


                }
                break;
            case 6 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:41: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 7 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:49: BY
                {
                mBY(); 


                }
                break;
            case 8 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:52: CREATE
                {
                mCREATE(); 


                }
                break;
            case 9 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:59: DAYS
                {
                mDAYS(); 


                }
                break;
            case 10 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:64: DESCRIBE
                {
                mDESCRIBE(); 


                }
                break;
            case 11 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:73: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 12 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:80: DROP
                {
                mDROP(); 


                }
                break;
            case 13 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:85: EVENT
                {
                mEVENT(); 


                }
                break;
            case 14 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:91: EXPLAIN
                {
                mEXPLAIN(); 


                }
                break;
            case 15 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:99: FALSE
                {
                mFALSE(); 


                }
                break;
            case 16 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:105: FILE
                {
                mFILE(); 


                }
                break;
            case 17 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:110: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 18 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:116: FLOW
                {
                mFLOW(); 


                }
                break;
            case 19 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:121: FLOWS
                {
                mFLOWS(); 


                }
                break;
            case 20 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:127: FOLLOWING
                {
                mFOLLOWING(); 


                }
                break;
            case 21 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:137: FORMAT
                {
                mFORMAT(); 


                }
                break;
            case 22 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:144: FROM
                {
                mFROM(); 


                }
                break;
            case 23 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:149: FUNCTIONS
                {
                mFUNCTIONS(); 


                }
                break;
            case 24 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:159: GROUP
                {
                mGROUP(); 


                }
                break;
            case 25 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:165: HAVING
                {
                mHAVING(); 


                }
                break;
            case 26 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:172: HOURS
                {
                mHOURS(); 


                }
                break;
            case 27 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:178: INTERVAL
                {
                mINTERVAL(); 


                }
                break;
            case 28 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:187: INT_KW
                {
                mINT_KW(); 


                }
                break;
            case 29 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:194: IS
                {
                mIS(); 


                }
                break;
            case 30 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:197: JOIN
                {
                mJOIN(); 


                }
                break;
            case 31 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:202: LIST
                {
                mLIST(); 


                }
                break;
            case 32 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:207: LOCAL
                {
                mLOCAL(); 


                }
                break;
            case 33 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:213: MINUTES
                {
                mMINUTES(); 


                }
                break;
            case 34 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:221: MONTHS
                {
                mMONTHS(); 


                }
                break;
            case 35 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:228: NODE
                {
                mNODE(); 


                }
                break;
            case 36 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:233: NOT
                {
                mNOT(); 


                }
                break;
            case 37 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:237: NULL
                {
                mNULL(); 


                }
                break;
            case 38 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:242: ON
                {
                mON(); 


                }
                break;
            case 39 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:245: L_OR
                {
                mL_OR(); 


                }
                break;
            case 40 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:250: OVER
                {
                mOVER(); 


                }
                break;
            case 41 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:255: PRECEDING
                {
                mPRECEDING(); 


                }
                break;
            case 42 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:265: PRECISE
                {
                mPRECISE(); 


                }
                break;
            case 43 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:273: PROPERTIES
                {
                mPROPERTIES(); 


                }
                break;
            case 44 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:284: RANGE
                {
                mRANGE(); 


                }
                break;
            case 45 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:290: SECONDS
                {
                mSECONDS(); 


                }
                break;
            case 46 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:298: SELECT
                {
                mSELECT(); 


                }
                break;
            case 47 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:305: SHOW
                {
                mSHOW(); 


                }
                break;
            case 48 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:310: SOURCE
                {
                mSOURCE(); 


                }
                break;
            case 49 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:317: STREAM
                {
                mSTREAM(); 


                }
                break;
            case 50 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:324: STREAMS
                {
                mSTREAMS(); 


                }
                break;
            case 51 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:332: STRING_KW
                {
                mSTRING_KW(); 


                }
                break;
            case 52 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:342: TIMESTAMP
                {
                mTIMESTAMP(); 


                }
                break;
            case 53 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:352: TRUE
                {
                mTRUE(); 


                }
                break;
            case 54 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:357: WEEKS
                {
                mWEEKS(); 


                }
                break;
            case 55 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:363: WINDOW
                {
                mWINDOW(); 


                }
                break;
            case 56 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:370: WHERE
                {
                mWHERE(); 


                }
                break;
            case 57 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:376: YEARS
                {
                mYEARS(); 


                }
                break;
            case 58 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:382: ID
                {
                mID(); 


                }
                break;
            case 59 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:385: DOT
                {
                mDOT(); 


                }
                break;
            case 60 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:389: STAR
                {
                mSTAR(); 


                }
                break;
            case 61 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:394: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 62 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:401: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 63 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:408: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 64 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:414: PLUS
                {
                mPLUS(); 


                }
                break;
            case 65 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:419: MINUS
                {
                mMINUS(); 


                }
                break;
            case 66 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:425: SLASH
                {
                mSLASH(); 


                }
                break;
            case 67 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:431: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 68 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:439: GTEQ
                {
                mGTEQ(); 


                }
                break;
            case 69 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:444: GT
                {
                mGT(); 


                }
                break;
            case 70 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:447: LTEQ
                {
                mLTEQ(); 


                }
                break;
            case 71 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:452: LT
                {
                mLT(); 


                }
                break;
            case 72 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:455: EQ
                {
                mEQ(); 


                }
                break;
            case 73 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:458: NEQ
                {
                mNEQ(); 


                }
                break;
            case 74 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:462: INT
                {
                mINT(); 


                }
                break;
            case 75 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:466: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 76 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:474: WS
                {
                mWS(); 


                }
                break;
            case 77 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:477: QQ_STRING
                {
                mQQ_STRING(); 


                }
                break;
            case 78 :
                // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\SqlLexer.g:1:487: Q_STRING
                {
                mQ_STRING(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\24\25\10\uffff\1\126\1\uffff\1\130\1\132\6\uffff\1\25\1"+
        "\134\3\25\1\141\21\25\1\164\7\25\1\175\1\176\15\25\6\uffff\1\u008e"+
        "\1\uffff\4\25\1\uffff\21\25\1\u00a5\1\uffff\6\25\1\u00ad\1\25\2"+
        "\uffff\17\25\1\uffff\5\25\1\u00c4\2\25\1\u00c7\3\25\1\u00cb\1\25"+
        "\1\u00cd\2\25\1\u00d1\4\25\1\uffff\1\25\1\u00d7\1\u00d8\3\25\1\u00dc"+
        "\1\uffff\1\u00dd\1\u00de\5\25\1\u00e5\4\25\1\u00ea\11\25\1\uffff"+
        "\2\25\1\uffff\1\u00f6\1\25\1\u00f8\1\uffff\1\u00f9\1\uffff\1\u00fa"+
        "\2\25\1\uffff\1\25\1\u00fe\1\25\1\u0100\1\25\2\uffff\1\u0102\2\25"+
        "\3\uffff\3\25\1\u0108\2\25\1\uffff\4\25\1\uffff\1\u010f\1\25\1\u0111"+
        "\1\u0112\1\25\1\u0114\1\u0115\1\25\1\u0117\1\25\1\u0119\1\uffff"+
        "\1\25\3\uffff\1\25\1\u011c\1\25\1\uffff\1\u011e\1\uffff\1\25\1\uffff"+
        "\1\25\1\u0121\3\25\1\uffff\1\25\1\u0126\1\u0127\1\u0128\1\u012a"+
        "\1\25\1\uffff\1\u012c\2\uffff\1\u012d\2\uffff\1\u012e\1\uffff\1"+
        "\25\1\uffff\1\u0130\1\25\1\uffff\1\25\1\uffff\1\25\1\u0134\1\uffff"+
        "\1\25\1\u0136\1\25\1\u0138\3\uffff\1\u0139\1\uffff\1\25\3\uffff"+
        "\1\u013b\1\uffff\2\25\1\u013e\1\uffff\1\25\1\uffff\1\25\2\uffff"+
        "\1\25\1\uffff\1\u0142\1\u0143\1\uffff\1\u0144\1\25\1\u0146\3\uffff"+
        "\1\u0147\2\uffff";
    static final String DFA12_eofS =
        "\u0148\uffff";
    static final String DFA12_minS =
        "\1\11\1\116\1\105\1\122\1\101\1\126\1\101\1\122\1\101\1\116\1\117"+
        "\2\111\1\117\1\116\1\122\1\101\1\105\1\111\2\105\10\uffff\1\52\1"+
        "\uffff\2\75\6\uffff\1\104\1\60\1\124\1\107\1\117\1\60\1\105\1\131"+
        "\1\123\1\125\1\117\1\105\1\120\2\114\1\117\1\114\1\117\1\116\1\117"+
        "\1\126\1\125\1\124\1\60\1\111\1\123\1\103\2\116\1\104\1\114\2\60"+
        "\2\105\1\116\1\103\1\117\1\125\1\122\1\115\1\125\1\105\1\116\1\105"+
        "\1\101\6\uffff\1\60\1\uffff\1\127\1\111\1\101\1\114\1\uffff\1\101"+
        "\1\123\1\103\1\102\1\120\1\116\1\114\1\123\1\105\1\101\1\114\2\115"+
        "\1\103\1\125\1\111\1\122\1\60\1\uffff\1\116\1\124\1\101\1\125\1"+
        "\124\1\105\1\60\1\114\2\uffff\1\122\1\103\1\120\1\107\1\117\1\105"+
        "\1\127\1\122\3\105\1\113\1\104\2\122\1\uffff\1\105\1\116\1\122\1"+
        "\105\1\124\1\60\1\122\1\114\1\60\1\124\1\101\1\105\1\60\1\124\1"+
        "\60\1\117\1\101\1\60\1\124\1\120\1\116\1\123\1\uffff\1\122\2\60"+
        "\1\114\1\124\1\110\1\60\1\uffff\2\60\3\105\1\116\1\103\1\60\1\103"+
        "\1\101\1\116\1\123\1\60\1\123\1\117\1\105\1\123\1\105\1\124\1\131"+
        "\1\101\1\105\1\uffff\1\111\1\105\1\uffff\1\60\1\111\1\60\1\uffff"+
        "\1\60\1\uffff\1\60\1\127\1\124\1\uffff\1\111\1\60\1\107\1\60\1\126"+
        "\2\uffff\1\60\1\105\1\123\3\uffff\1\104\1\123\1\122\1\60\1\104\1"+
        "\124\1\uffff\1\105\1\115\1\107\1\124\1\uffff\1\60\1\127\2\60\1\116"+
        "\2\60\1\116\1\60\1\102\1\60\1\uffff\1\116\3\uffff\1\111\1\60\1\117"+
        "\1\uffff\1\60\1\uffff\1\101\1\uffff\1\123\1\60\1\111\1\105\1\124"+
        "\1\uffff\1\123\4\60\1\101\1\uffff\1\60\2\uffff\1\60\2\uffff\1\60"+
        "\1\uffff\1\105\1\uffff\1\60\1\116\1\uffff\1\116\1\uffff\1\114\1"+
        "\60\1\uffff\1\116\1\60\1\111\1\60\3\uffff\1\60\1\uffff\1\115\3\uffff"+
        "\1\60\1\uffff\1\107\1\123\1\60\1\uffff\1\107\1\uffff\1\105\2\uffff"+
        "\1\120\1\uffff\2\60\1\uffff\1\60\1\123\1\60\3\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\172\1\163\1\171\2\162\1\170\1\165\1\162\1\157\1\163\3\157\1\165"+
        "\1\166\1\162\1\141\1\164\1\162\1\151\1\145\10\uffff\1\57\1\uffff"+
        "\2\75\6\uffff\1\144\1\172\1\164\1\156\1\157\1\172\1\145\1\171\1"+
        "\163\1\165\1\157\1\145\1\160\2\154\1\157\1\162\1\157\1\156\1\157"+
        "\1\166\1\165\1\164\1\172\1\151\1\163\1\143\2\156\1\164\1\154\2\172"+
        "\1\145\1\157\1\156\1\154\1\157\1\165\1\162\1\155\1\165\1\145\1\156"+
        "\1\145\1\141\6\uffff\1\172\1\uffff\1\167\1\151\1\141\1\154\1\uffff"+
        "\1\141\1\163\1\143\1\142\1\160\1\156\1\154\1\163\1\145\1\167\1\154"+
        "\2\155\1\143\1\165\1\151\1\162\1\172\1\uffff\1\156\1\164\1\141\1"+
        "\165\1\164\1\145\1\172\1\154\2\uffff\1\162\1\143\1\160\1\147\1\157"+
        "\1\145\1\167\1\162\1\151\2\145\1\153\1\144\2\162\1\uffff\1\145\1"+
        "\156\1\162\1\145\1\164\1\172\1\162\1\154\1\172\1\164\1\141\1\145"+
        "\1\172\1\164\1\172\1\157\1\141\1\172\1\164\1\160\1\156\1\163\1\uffff"+
        "\1\162\2\172\1\154\1\164\1\150\1\172\1\uffff\2\172\1\151\2\145\1"+
        "\156\1\143\1\172\1\143\1\141\1\156\1\163\1\172\1\163\1\157\1\145"+
        "\1\163\1\145\1\164\1\171\1\141\1\145\1\uffff\1\151\1\145\1\uffff"+
        "\1\172\1\151\1\172\1\uffff\1\172\1\uffff\1\172\1\167\1\164\1\uffff"+
        "\1\151\1\172\1\147\1\172\1\166\2\uffff\1\172\1\145\1\163\3\uffff"+
        "\1\144\1\163\1\162\1\172\1\144\1\164\1\uffff\1\145\1\155\1\147\1"+
        "\164\1\uffff\1\172\1\167\2\172\1\156\2\172\1\156\1\172\1\142\1\172"+
        "\1\uffff\1\156\3\uffff\1\151\1\172\1\157\1\uffff\1\172\1\uffff\1"+
        "\141\1\uffff\1\163\1\172\1\151\1\145\1\164\1\uffff\1\163\4\172\1"+
        "\141\1\uffff\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff\1\145\1\uffff"+
        "\1\172\1\156\1\uffff\1\156\1\uffff\1\154\1\172\1\uffff\1\156\1\172"+
        "\1\151\1\172\3\uffff\1\172\1\uffff\1\155\3\uffff\1\172\1\uffff\1"+
        "\147\1\163\1\172\1\uffff\1\147\1\uffff\1\145\2\uffff\1\160\1\uffff"+
        "\2\172\1\uffff\1\172\1\163\1\172\3\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\25\uffff\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\uffff\1\103"+
        "\2\uffff\1\110\1\111\1\112\1\114\1\115\1\116\56\uffff\1\113\1\102"+
        "\1\104\1\105\1\106\1\107\1\uffff\1\2\4\uffff\1\7\22\uffff\1\35\10"+
        "\uffff\1\46\1\47\17\uffff\1\1\26\uffff\1\34\7\uffff\1\44\26\uffff"+
        "\1\11\2\uffff\1\14\3\uffff\1\20\1\uffff\1\22\3\uffff\1\26\5\uffff"+
        "\1\36\1\37\3\uffff\1\43\1\45\1\50\6\uffff\1\57\4\uffff\1\65\13\uffff"+
        "\1\15\1\uffff\1\17\1\21\1\23\3\uffff\1\30\1\uffff\1\32\1\uffff\1"+
        "\40\5\uffff\1\54\6\uffff\1\66\1\uffff\1\70\1\71\1\uffff\1\4\1\5"+
        "\1\uffff\1\10\1\uffff\1\13\2\uffff\1\25\1\uffff\1\31\2\uffff\1\42"+
        "\4\uffff\1\56\1\60\1\61\1\uffff\1\63\1\uffff\1\67\1\3\1\6\1\uffff"+
        "\1\16\3\uffff\1\41\1\uffff\1\52\1\uffff\1\55\1\62\1\uffff\1\12\2"+
        "\uffff\1\33\3\uffff\1\24\1\27\1\51\1\uffff\1\64\1\53";
    static final String DFA12_specialS =
        "\u0148\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\42\1\45\1\25\1\uffff\1\36"+
            "\1\uffff\1\46\1\30\1\31\1\27\1\33\1\32\1\34\1\26\1\35\12\43"+
            "\2\uffff\1\40\1\41\1\37\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
            "\1\10\1\11\1\12\1\25\1\13\1\14\1\15\1\16\1\17\1\25\1\20\1\21"+
            "\1\22\2\25\1\23\1\25\1\24\1\25\4\uffff\1\25\1\uffff\1\1\1\2"+
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\25\1\13\1\14\1\15\1\16"+
            "\1\17\1\25\1\20\1\21\1\22\2\25\1\23\1\25\1\24\1\25",
            "\1\47\4\uffff\1\50\32\uffff\1\47\4\uffff\1\50",
            "\1\51\3\uffff\1\52\5\uffff\1\53\11\uffff\1\54\13\uffff\1\51"+
            "\3\uffff\1\52\5\uffff\1\53\11\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\3\uffff\1\57\11\uffff\1\60\2\uffff\1\61\16\uffff\1\56"+
            "\3\uffff\1\57\11\uffff\1\60\2\uffff\1\61",
            "\1\62\1\uffff\1\63\35\uffff\1\62\1\uffff\1\63",
            "\1\64\7\uffff\1\65\2\uffff\1\66\2\uffff\1\67\2\uffff\1\70\2"+
            "\uffff\1\71\13\uffff\1\64\7\uffff\1\65\2\uffff\1\66\2\uffff"+
            "\1\67\2\uffff\1\70\2\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\15\uffff\1\74\21\uffff\1\73\15\uffff\1\74",
            "\1\75\4\uffff\1\76\32\uffff\1\75\4\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\1\100\5\uffff\1\101\31\uffff\1\100\5\uffff\1\101",
            "\1\102\5\uffff\1\103\31\uffff\1\102\5\uffff\1\103",
            "\1\104\5\uffff\1\105\31\uffff\1\104\5\uffff\1\105",
            "\1\106\3\uffff\1\107\3\uffff\1\110\27\uffff\1\106\3\uffff\1"+
            "\107\3\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\1\113\2\uffff\1\114\6\uffff\1\115\4\uffff\1\116\20\uffff\1"+
            "\113\2\uffff\1\114\6\uffff\1\115\4\uffff\1\116",
            "\1\117\10\uffff\1\120\26\uffff\1\117\10\uffff\1\120",
            "\1\121\2\uffff\1\123\1\122\33\uffff\1\121\2\uffff\1\123\1\122",
            "\1\124\37\uffff\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125\4\uffff\1\125",
            "",
            "\1\127",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133\37\uffff\1\133",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\135\37\uffff\1\135",
            "\1\136\6\uffff\1\137\30\uffff\1\136\6\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147",
            "\1\150\37\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "\1\154\5\uffff\1\155\31\uffff\1\154\5\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\17\uffff\1\173\17\uffff\1\172\17\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\177\37\uffff\1\177",
            "\1\u0080\11\uffff\1\u0081\25\uffff\1\u0080\11\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\10\uffff\1\u0084\26\uffff\1\u0083\10\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\25\uffff\1\u009d\11\uffff\1\u009c\25\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\12\25\7\uffff\4\25\1\u00a6\25\25\4\uffff\1\25\1\uffff\4\25"+
            "\1\u00a6\25\25",
            "",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00ae\37\uffff\1\u00ae",
            "",
            "",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\3\uffff\1\u00b8\33\uffff\1\u00b7\3\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00cc\37\uffff\1\u00cc",
            "\12\25\7\uffff\22\25\1\u00ce\7\25\4\uffff\1\25\1\uffff\22\25"+
            "\1\u00ce\7\25",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "",
            "\1\u00d6\37\uffff\1\u00d6",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00df\3\uffff\1\u00e0\33\uffff\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00f7\37\uffff\1\u00f7",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "",
            "\1\u00fd\37\uffff\1\u00fd",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00ff\37\uffff\1\u00ff",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0101\37\uffff\1\u0101",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "",
            "",
            "",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0110\37\uffff\1\u0110",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0113\37\uffff\1\u0113",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0116\37\uffff\1\u0116",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0118\37\uffff\1\u0118",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u011a\37\uffff\1\u011a",
            "",
            "",
            "",
            "\1\u011b\37\uffff\1\u011b",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u011d\37\uffff\1\u011d",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u011f\37\uffff\1\u011f",
            "",
            "\1\u0120\37\uffff\1\u0120",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "",
            "\1\u0125\37\uffff\1\u0125",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\22\25\1\u0129\7\25\4\uffff\1\25\1\uffff\22\25"+
            "\1\u0129\7\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u012b\37\uffff\1\u012b",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u012f\37\uffff\1\u012f",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0131\37\uffff\1\u0131",
            "",
            "\1\u0132\37\uffff\1\u0132",
            "",
            "\1\u0133\37\uffff\1\u0133",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u0135\37\uffff\1\u0135",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0137\37\uffff\1\u0137",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u013a\37\uffff\1\u013a",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u013f\37\uffff\1\u013f",
            "",
            "\1\u0140\37\uffff\1\u0140",
            "",
            "",
            "\1\u0141\37\uffff\1\u0141",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0145\37\uffff\1\u0145",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( L_AND | AS | BETWEEN | BIGINT | BINARY | BOOLEAN | BY | CREATE | DAYS | DESCRIBE | DOUBLE | DROP | EVENT | EXPLAIN | FALSE | FILE | FLOAT | FLOW | FLOWS | FOLLOWING | FORMAT | FROM | FUNCTIONS | GROUP | HAVING | HOURS | INTERVAL | INT_KW | IS | JOIN | LIST | LOCAL | MINUTES | MONTHS | NODE | NOT | NULL | ON | L_OR | OVER | PRECEDING | PRECISE | PROPERTIES | RANGE | SECONDS | SELECT | SHOW | SOURCE | STREAM | STREAMS | STRING_KW | TIMESTAMP | TRUE | WEEKS | WINDOW | WHERE | YEARS | ID | DOT | STAR | LPAREN | RPAREN | COMMA | PLUS | MINUS | SLASH | PERCENT | GTEQ | GT | LTEQ | LT | EQ | NEQ | INT | COMMENT | WS | QQ_STRING | Q_STRING );";
        }
    }
 

}