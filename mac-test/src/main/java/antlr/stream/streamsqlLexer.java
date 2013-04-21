// $ANTLR 3.0.1 streamsql.g 2012-08-02 21:54:43
package antlr.stream;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

public class streamsqlLexer extends Lexer {
    public static final int DOLLAR=57;
    public static final int TOK_SCHEMA_LIST=8;
    public static final int STAR=49;
    public static final int LSQUARE=17;
    public static final int MOD=50;
    public static final int KW_SIZE=33;
    public static final int CharSetName=69;
    public static final int BITWISEXOR=55;
    public static final int KW_CREATE=25;
    public static final int Exponent=61;
    public static final int EOF=-1;
    public static final int KW_OUTPUT=30;
    public static final int KW_INPUT=29;
    public static final int TOK_CREATE_STREAM=5;
    public static final int HexDigit=59;
    public static final int TinyintLiteral=67;
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
    public static final int RSQUARE=18;
    public static final int MINUS=48;
    public static final int Digit=60;
    public static final int Tokens=72;
    public static final int KW_DOUBLE=27;
    public static final int BITWISEOR=54;
    public static final int COLON=36;
    public static final int StringLiteral=63;
    public static final int BigintLiteral=65;
    public static final int SmallintLiteral=66;
    public static final int TOK_SELEXPR=10;
    public static final int KW_SELECT=14;
    public static final int CharSetLiteral=64;
    public static final int WS=70;
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
    public streamsqlLexer() {;} 
    public streamsqlLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "streamsql.g"; }

    // $ANTLR start KW_FROM
    public final void mKW_FROM() throws RecognitionException {
        try {
            int _type = KW_FROM;
            // streamsql.g:78:9: ( 'FROM' )
            // streamsql.g:78:11: 'FROM'
            {
            match("FROM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FROM

    // $ANTLR start KW_AS
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            // streamsql.g:79:7: ( 'AS' )
            // streamsql.g:79:9: 'AS'
            {
            match("AS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AS

    // $ANTLR start KW_SELECT
    public final void mKW_SELECT() throws RecognitionException {
        try {
            int _type = KW_SELECT;
            // streamsql.g:80:11: ( 'SELECT' )
            // streamsql.g:80:13: 'SELECT'
            {
            match("SELECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SELECT

    // $ANTLR start KW_ON
    public final void mKW_ON() throws RecognitionException {
        try {
            int _type = KW_ON;
            // streamsql.g:81:7: ( 'ON' )
            // streamsql.g:81:9: 'ON'
            {
            match("ON"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ON

    // $ANTLR start KW_CREATE
    public final void mKW_CREATE() throws RecognitionException {
        try {
            int _type = KW_CREATE;
            // streamsql.g:82:10: ( 'CREATE' )
            // streamsql.g:82:12: 'CREATE'
            {
            match("CREATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CREATE

    // $ANTLR start KW_INT
    public final void mKW_INT() throws RecognitionException {
        try {
            int _type = KW_INT;
            // streamsql.g:83:7: ( 'INT' )
            // streamsql.g:83:9: 'INT'
            {
            match("INT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INT

    // $ANTLR start KW_DOUBLE
    public final void mKW_DOUBLE() throws RecognitionException {
        try {
            int _type = KW_DOUBLE;
            // streamsql.g:84:10: ( 'DOUBLE' )
            // streamsql.g:84:12: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DOUBLE

    // $ANTLR start KW_INTO
    public final void mKW_INTO() throws RecognitionException {
        try {
            int _type = KW_INTO;
            // streamsql.g:85:8: ( 'INTO' )
            // streamsql.g:85:10: 'INTO'
            {
            match("INTO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTO

    // $ANTLR start KW_SCHEMA
    public final void mKW_SCHEMA() throws RecognitionException {
        try {
            int _type = KW_SCHEMA;
            // streamsql.g:86:10: ( 'SCHEMA' )
            // streamsql.g:86:12: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SCHEMA

    // $ANTLR start KW_INPUT
    public final void mKW_INPUT() throws RecognitionException {
        try {
            int _type = KW_INPUT;
            // streamsql.g:87:9: ( 'INPUT' )
            // streamsql.g:87:11: 'INPUT'
            {
            match("INPUT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPUT

    // $ANTLR start KW_OUTPUT
    public final void mKW_OUTPUT() throws RecognitionException {
        try {
            int _type = KW_OUTPUT;
            // streamsql.g:88:10: ( 'OUTPUT' )
            // streamsql.g:88:12: 'OUTPUT'
            {
            match("OUTPUT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTPUT

    // $ANTLR start KW_STREAM
    public final void mKW_STREAM() throws RecognitionException {
        try {
            int _type = KW_STREAM;
            // streamsql.g:89:10: ( 'STREAM' )
            // streamsql.g:89:12: 'STREAM'
            {
            match("STREAM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STREAM

    // $ANTLR start KW_WINDOW
    public final void mKW_WINDOW() throws RecognitionException {
        try {
            int _type = KW_WINDOW;
            // streamsql.g:90:10: ( 'WINDOW' )
            // streamsql.g:90:12: 'WINDOW'
            {
            match("WINDOW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WINDOW

    // $ANTLR start KW_SIZE
    public final void mKW_SIZE() throws RecognitionException {
        try {
            int _type = KW_SIZE;
            // streamsql.g:91:8: ( 'SIZE' )
            // streamsql.g:91:10: 'SIZE'
            {
            match("SIZE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SIZE

    // $ANTLR start KW_ADVANCE
    public final void mKW_ADVANCE() throws RecognitionException {
        try {
            int _type = KW_ADVANCE;
            // streamsql.g:92:11: ( 'ADVANCE' )
            // streamsql.g:92:13: 'ADVANCE'
            {
            match("ADVANCE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ADVANCE

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // streamsql.g:98:5: ( '.' )
            // streamsql.g:98:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // streamsql.g:99:7: ( ':' )
            // streamsql.g:99:9: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // streamsql.g:100:7: ( ',' )
            // streamsql.g:100:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start SEMICOLON
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            // streamsql.g:101:11: ( ';' )
            // streamsql.g:101:13: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMICOLON

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // streamsql.g:103:8: ( '(' )
            // streamsql.g:103:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // streamsql.g:104:8: ( ')' )
            // streamsql.g:104:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LSQUARE
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            // streamsql.g:105:9: ( '[' )
            // streamsql.g:105:11: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LSQUARE

    // $ANTLR start RSQUARE
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            // streamsql.g:106:9: ( ']' )
            // streamsql.g:106:11: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSQUARE

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // streamsql.g:107:8: ( '{' )
            // streamsql.g:107:10: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // streamsql.g:108:8: ( '}' )
            // streamsql.g:108:10: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // streamsql.g:110:7: ( '=' | '==' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='=') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=2;
                }
                else {
                    alt1=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("110:1: EQUAL : ( '=' | '==' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // streamsql.g:110:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // streamsql.g:110:15: '=='
                    {
                    match("=="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start NOTEQUAL
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            // streamsql.g:111:10: ( '<>' | '!=' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='<') ) {
                alt2=1;
            }
            else if ( (LA2_0=='!') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("111:1: NOTEQUAL : ( '<>' | '!=' );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // streamsql.g:111:12: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // streamsql.g:111:19: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOTEQUAL

    // $ANTLR start LESSTHANOREQUALTO
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            // streamsql.g:112:19: ( '<=' )
            // streamsql.g:112:21: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHANOREQUALTO

    // $ANTLR start LESSTHAN
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            // streamsql.g:113:10: ( '<' )
            // streamsql.g:113:12: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHAN

    // $ANTLR start GREATERTHANOREQUALTO
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            // streamsql.g:114:22: ( '>=' )
            // streamsql.g:114:24: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHANOREQUALTO

    // $ANTLR start GREATERTHAN
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            // streamsql.g:115:13: ( '>' )
            // streamsql.g:115:15: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHAN

    // $ANTLR start DIVIDE
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            // streamsql.g:117:8: ( '/' )
            // streamsql.g:117:10: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVIDE

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // streamsql.g:118:6: ( '+' )
            // streamsql.g:118:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // streamsql.g:119:7: ( '-' )
            // streamsql.g:119:9: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // streamsql.g:120:6: ( '*' )
            // streamsql.g:120:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // streamsql.g:121:5: ( '%' )
            // streamsql.g:121:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // streamsql.g:122:5: ( 'DIV' )
            // streamsql.g:122:7: 'DIV'
            {
            match("DIV"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start AMPERSAND
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            // streamsql.g:124:11: ( '&' )
            // streamsql.g:124:13: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AMPERSAND

    // $ANTLR start TILDE
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            // streamsql.g:125:7: ( '~' )
            // streamsql.g:125:9: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TILDE

    // $ANTLR start BITWISEOR
    public final void mBITWISEOR() throws RecognitionException {
        try {
            int _type = BITWISEOR;
            // streamsql.g:126:11: ( '|' )
            // streamsql.g:126:13: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEOR

    // $ANTLR start BITWISEXOR
    public final void mBITWISEXOR() throws RecognitionException {
        try {
            int _type = BITWISEXOR;
            // streamsql.g:127:12: ( '^' )
            // streamsql.g:127:14: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEXOR

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // streamsql.g:128:10: ( '?' )
            // streamsql.g:128:12: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start DOLLAR
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            // streamsql.g:129:8: ( '$' )
            // streamsql.g:129:10: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOLLAR

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // streamsql.g:134:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // streamsql.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // streamsql.g:139:5: ( 'a' .. 'f' | 'A' .. 'F' )
            // streamsql.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // streamsql.g:144:5: ( '0' .. '9' )
            // streamsql.g:145:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            // streamsql.g:150:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
            // streamsql.g:151:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // streamsql.g:151:17: ( PLUS | MINUS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // streamsql.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // streamsql.g:151:33: ( Digit )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // streamsql.g:151:34: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start RegexComponent
    public final void mRegexComponent() throws RecognitionException {
        try {
            // streamsql.g:156:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
            // streamsql.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='(' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='}') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end RegexComponent

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // streamsql.g:163:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
            // streamsql.g:164:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            {
            // streamsql.g:164:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    alt7=1;
                }
                else if ( (LA7_0=='\"') ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // streamsql.g:164:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
            	    {
            	    match('\''); 
            	    // streamsql.g:164:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop5:
            	    do {
            	        int alt5=3;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
            	            alt5=1;
            	        }
            	        else if ( (LA5_0=='\\') ) {
            	            alt5=2;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // streamsql.g:164:14: ~ ( '\\'' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // streamsql.g:164:29: ( '\\\\' . )
            	    	    {
            	    	    // streamsql.g:164:29: ( '\\\\' . )
            	    	    // streamsql.g:164:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // streamsql.g:165:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
            	    {
            	    match('\"'); 
            	    // streamsql.g:165:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop6:
            	    do {
            	        int alt6=3;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_0=='\\') ) {
            	            alt6=2;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // streamsql.g:165:14: ~ ( '\\\"' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // streamsql.g:165:29: ( '\\\\' . )
            	    	    {
            	    	    // streamsql.g:165:29: ( '\\\\' . )
            	    	    // streamsql.g:165:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start CharSetLiteral
    public final void mCharSetLiteral() throws RecognitionException {
        try {
            int _type = CharSetLiteral;
            // streamsql.g:170:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"'||LA9_0=='\'') ) {
                alt9=1;
            }
            else if ( (LA9_0=='0') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("169:1: CharSetLiteral : ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // streamsql.g:171:5: StringLiteral
                    {
                    mStringLiteral(); 

                    }
                    break;
                case 2 :
                    // streamsql.g:172:7: '0' 'X' ( HexDigit | Digit )+
                    {
                    match('0'); 
                    match('X'); 
                    // streamsql.g:172:15: ( HexDigit | Digit )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='F')||(LA8_0>='a' && LA8_0<='f')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // streamsql.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetLiteral

    // $ANTLR start BigintLiteral
    public final void mBigintLiteral() throws RecognitionException {
        try {
            int _type = BigintLiteral;
            // streamsql.g:176:5: ( ( Digit )+ 'L' )
            // streamsql.g:177:5: ( Digit )+ 'L'
            {
            // streamsql.g:177:5: ( Digit )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // streamsql.g:177:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match('L'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BigintLiteral

    // $ANTLR start SmallintLiteral
    public final void mSmallintLiteral() throws RecognitionException {
        try {
            int _type = SmallintLiteral;
            // streamsql.g:181:5: ( ( Digit )+ 'S' )
            // streamsql.g:182:5: ( Digit )+ 'S'
            {
            // streamsql.g:182:5: ( Digit )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // streamsql.g:182:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            match('S'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SmallintLiteral

    // $ANTLR start TinyintLiteral
    public final void mTinyintLiteral() throws RecognitionException {
        try {
            int _type = TinyintLiteral;
            // streamsql.g:186:5: ( ( Digit )+ 'Y' )
            // streamsql.g:187:5: ( Digit )+ 'Y'
            {
            // streamsql.g:187:5: ( Digit )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // streamsql.g:187:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match('Y'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TinyintLiteral

    // $ANTLR start Number
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            // streamsql.g:191:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
            // streamsql.g:192:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
            {
            // streamsql.g:192:5: ( Digit )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // streamsql.g:192:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // streamsql.g:192:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='.') ) {
                alt16=1;
            }
            else if ( (LA16_0=='E'||LA16_0=='e') ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // streamsql.g:192:16: DOT ( Digit )* ( Exponent )?
                    {
                    mDOT(); 
                    // streamsql.g:192:20: ( Digit )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // streamsql.g:192:21: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // streamsql.g:192:29: ( Exponent )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // streamsql.g:192:30: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // streamsql.g:192:43: Exponent
                    {
                    mExponent(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Number

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // streamsql.g:196:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='z')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='`') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("195:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' );", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // streamsql.g:197:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // streamsql.g:197:22: ( Letter | Digit | '_' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // streamsql.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // streamsql.g:198:7: '`' ( RegexComponent )+ '`'
                    {
                    match('`'); 
                    // streamsql.g:198:11: ( RegexComponent )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='$'||(LA18_0>='(' && LA18_0<='+')||(LA18_0>='-' && LA18_0<='.')||(LA18_0>='0' && LA18_0<='9')||LA18_0=='?'||(LA18_0>='A' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='_')||(LA18_0>='a' && LA18_0<='}')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // streamsql.g:198:11: RegexComponent
                    	    {
                    	    mRegexComponent(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    match('`'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Identifier

    // $ANTLR start CharSetName
    public final void mCharSetName() throws RecognitionException {
        try {
            int _type = CharSetName;
            // streamsql.g:202:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
            // streamsql.g:203:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
            {
            match('_'); 
            // streamsql.g:203:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='-' && LA20_0<='.')||(LA20_0>='0' && LA20_0<=':')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // streamsql.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetName

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // streamsql.g:206:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // streamsql.g:206:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // streamsql.g:210:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // streamsql.g:210:5: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); 

            // streamsql.g:210:10: (~ ( '\\n' | '\\r' ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFE')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // streamsql.g:210:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // streamsql.g:1:8: ( KW_FROM | KW_AS | KW_SELECT | KW_ON | KW_CREATE | KW_INT | KW_DOUBLE | KW_INTO | KW_SCHEMA | KW_INPUT | KW_OUTPUT | KW_STREAM | KW_WINDOW | KW_SIZE | KW_ADVANCE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | Number | Identifier | CharSetName | WS | COMMENT )
        int alt22=53;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // streamsql.g:1:10: KW_FROM
                {
                mKW_FROM(); 

                }
                break;
            case 2 :
                // streamsql.g:1:18: KW_AS
                {
                mKW_AS(); 

                }
                break;
            case 3 :
                // streamsql.g:1:24: KW_SELECT
                {
                mKW_SELECT(); 

                }
                break;
            case 4 :
                // streamsql.g:1:34: KW_ON
                {
                mKW_ON(); 

                }
                break;
            case 5 :
                // streamsql.g:1:40: KW_CREATE
                {
                mKW_CREATE(); 

                }
                break;
            case 6 :
                // streamsql.g:1:50: KW_INT
                {
                mKW_INT(); 

                }
                break;
            case 7 :
                // streamsql.g:1:57: KW_DOUBLE
                {
                mKW_DOUBLE(); 

                }
                break;
            case 8 :
                // streamsql.g:1:67: KW_INTO
                {
                mKW_INTO(); 

                }
                break;
            case 9 :
                // streamsql.g:1:75: KW_SCHEMA
                {
                mKW_SCHEMA(); 

                }
                break;
            case 10 :
                // streamsql.g:1:85: KW_INPUT
                {
                mKW_INPUT(); 

                }
                break;
            case 11 :
                // streamsql.g:1:94: KW_OUTPUT
                {
                mKW_OUTPUT(); 

                }
                break;
            case 12 :
                // streamsql.g:1:104: KW_STREAM
                {
                mKW_STREAM(); 

                }
                break;
            case 13 :
                // streamsql.g:1:114: KW_WINDOW
                {
                mKW_WINDOW(); 

                }
                break;
            case 14 :
                // streamsql.g:1:124: KW_SIZE
                {
                mKW_SIZE(); 

                }
                break;
            case 15 :
                // streamsql.g:1:132: KW_ADVANCE
                {
                mKW_ADVANCE(); 

                }
                break;
            case 16 :
                // streamsql.g:1:143: DOT
                {
                mDOT(); 

                }
                break;
            case 17 :
                // streamsql.g:1:147: COLON
                {
                mCOLON(); 

                }
                break;
            case 18 :
                // streamsql.g:1:153: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 19 :
                // streamsql.g:1:159: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 20 :
                // streamsql.g:1:169: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 21 :
                // streamsql.g:1:176: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 22 :
                // streamsql.g:1:183: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 23 :
                // streamsql.g:1:191: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 24 :
                // streamsql.g:1:199: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 25 :
                // streamsql.g:1:206: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 26 :
                // streamsql.g:1:213: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 27 :
                // streamsql.g:1:219: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 28 :
                // streamsql.g:1:228: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 

                }
                break;
            case 29 :
                // streamsql.g:1:246: LESSTHAN
                {
                mLESSTHAN(); 

                }
                break;
            case 30 :
                // streamsql.g:1:255: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 

                }
                break;
            case 31 :
                // streamsql.g:1:276: GREATERTHAN
                {
                mGREATERTHAN(); 

                }
                break;
            case 32 :
                // streamsql.g:1:288: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 33 :
                // streamsql.g:1:295: PLUS
                {
                mPLUS(); 

                }
                break;
            case 34 :
                // streamsql.g:1:300: MINUS
                {
                mMINUS(); 

                }
                break;
            case 35 :
                // streamsql.g:1:306: STAR
                {
                mSTAR(); 

                }
                break;
            case 36 :
                // streamsql.g:1:311: MOD
                {
                mMOD(); 

                }
                break;
            case 37 :
                // streamsql.g:1:315: DIV
                {
                mDIV(); 

                }
                break;
            case 38 :
                // streamsql.g:1:319: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 39 :
                // streamsql.g:1:329: TILDE
                {
                mTILDE(); 

                }
                break;
            case 40 :
                // streamsql.g:1:335: BITWISEOR
                {
                mBITWISEOR(); 

                }
                break;
            case 41 :
                // streamsql.g:1:345: BITWISEXOR
                {
                mBITWISEXOR(); 

                }
                break;
            case 42 :
                // streamsql.g:1:356: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 43 :
                // streamsql.g:1:365: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 44 :
                // streamsql.g:1:372: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 45 :
                // streamsql.g:1:386: CharSetLiteral
                {
                mCharSetLiteral(); 

                }
                break;
            case 46 :
                // streamsql.g:1:401: BigintLiteral
                {
                mBigintLiteral(); 

                }
                break;
            case 47 :
                // streamsql.g:1:415: SmallintLiteral
                {
                mSmallintLiteral(); 

                }
                break;
            case 48 :
                // streamsql.g:1:431: TinyintLiteral
                {
                mTinyintLiteral(); 

                }
                break;
            case 49 :
                // streamsql.g:1:446: Number
                {
                mNumber(); 

                }
                break;
            case 50 :
                // streamsql.g:1:453: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 51 :
                // streamsql.g:1:464: CharSetName
                {
                mCharSetName(); 

                }
                break;
            case 52 :
                // streamsql.g:1:476: WS
                {
                mWS(); 

                }
                break;
            case 53 :
                // streamsql.g:1:479: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\10\46\13\uffff\1\70\1\uffff\1\72\2\uffff\1\74\12\uffff"+
        "\2\104\3\uffff\1\46\1\113\5\46\1\121\6\46\10\uffff\1\132\2\uffff"+
        "\1\132\1\46\1\uffff\1\135\1\104\1\136\1\137\2\46\1\uffff\5\46\1"+
        "\uffff\2\46\1\152\2\46\1\155\1\46\3\uffff\1\157\3\uffff\1\104\1"+
        "\160\3\46\1\164\3\46\1\170\1\uffff\2\46\1\uffff\1\46\2\uffff\3\46"+
        "\1\uffff\3\46\1\uffff\1\u0082\3\46\1\u0086\1\u0087\1\u0088\1\u0089"+
        "\1\u008a\1\uffff\1\u008b\1\u008c\1\u008d\10\uffff";
    static final String DFA22_eofS =
        "\u008e\uffff";
    static final String DFA22_minS =
        "\1\11\1\122\1\104\1\103\1\116\1\122\1\116\2\111\13\uffff\1\75\1"+
        "\uffff\1\75\2\uffff\1\55\10\uffff\2\0\2\60\3\uffff\1\117\1\60\1"+
        "\126\1\114\1\110\1\132\1\122\1\60\1\124\1\105\1\120\1\125\1\126"+
        "\1\116\6\uffff\2\0\1\42\2\0\1\42\1\60\1\uffff\4\60\1\53\1\115\1"+
        "\uffff\1\101\4\105\1\uffff\1\120\1\101\1\60\1\125\1\102\1\60\1\104"+
        "\1\0\1\uffff\1\0\1\60\3\uffff\2\60\1\116\1\103\1\115\1\60\1\101"+
        "\1\125\1\124\1\60\1\uffff\1\124\1\114\1\uffff\1\117\2\uffff\1\103"+
        "\1\124\1\101\1\uffff\1\115\1\124\1\105\1\uffff\1\60\1\105\1\127"+
        "\1\105\5\60\1\uffff\3\60\10\uffff";
    static final String DFA22_maxS =
        "\1\176\1\122\1\123\1\124\1\125\1\122\1\116\1\117\1\111\13\uffff"+
        "\1\76\1\uffff\1\75\2\uffff\1\55\10\uffff\2\ufffe\2\172\3\uffff\1"+
        "\117\1\172\1\126\1\114\1\110\1\132\1\122\1\172\1\124\1\105\1\124"+
        "\1\125\1\126\1\116\6\uffff\2\ufffe\1\47\2\ufffe\1\47\1\146\1\uffff"+
        "\4\172\1\71\1\115\1\uffff\1\101\4\105\1\uffff\1\120\1\101\1\172"+
        "\1\125\1\102\1\172\1\104\1\ufffe\1\uffff\1\ufffe\1\172\3\uffff\2"+
        "\172\1\116\1\103\1\115\1\172\1\101\1\125\1\124\1\172\1\uffff\1\124"+
        "\1\114\1\uffff\1\117\2\uffff\1\103\1\124\1\101\1\uffff\1\115\1\124"+
        "\1\105\1\uffff\1\172\1\105\1\127\1\105\5\172\1\uffff\3\172\10\uffff";
    static final String DFA22_acceptS =
        "\11\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
        "\1\uffff\1\33\1\uffff\1\40\1\41\1\uffff\1\43\1\44\1\46\1\47\1\50"+
        "\1\51\1\52\1\53\4\uffff\1\62\1\63\1\64\16\uffff\1\34\1\35\1\36\1"+
        "\37\1\65\1\42\7\uffff\1\61\6\uffff\1\2\5\uffff\1\4\10\uffff\1\54"+
        "\2\uffff\1\57\1\60\1\56\12\uffff\1\6\2\uffff\1\45\1\uffff\1\55\1"+
        "\1\3\uffff\1\16\3\uffff\1\10\11\uffff\1\12\3\uffff\1\3\1\11\1\14"+
        "\1\13\1\5\1\7\1\15\1\17";
    static final String DFA22_specialS =
        "\u008e\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\25\1\43\1\uffff\1\41\1\33"+
            "\1\34\1\42\1\15\1\16\1\32\1\30\1\13\1\31\1\11\1\27\1\44\11\45"+
            "\1\12\1\14\1\24\1\23\1\26\1\40\1\uffff\1\2\1\46\1\5\1\7\1\46"+
            "\1\1\2\46\1\6\5\46\1\4\3\46\1\3\3\46\1\10\3\46\1\17\1\uffff"+
            "\1\20\1\37\1\47\33\46\1\21\1\36\1\22\1\35",
            "\1\51",
            "\1\53\16\uffff\1\52",
            "\1\55\1\uffff\1\54\3\uffff\1\56\12\uffff\1\57",
            "\1\60\6\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\65\5\uffff\1\64",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\1\25",
            "",
            "\1\71",
            "",
            "",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\75\1\77\64\75\1\76\uffa2\75",
            "\42\100\1\102\71\100\1\101\uffa2\100",
            "\12\106\7\uffff\4\46\1\111\6\46\1\110\6\46\1\105\4\46\1\103"+
            "\1\107\1\46\4\uffff\1\46\1\uffff\4\46\1\111\25\46",
            "\12\106\7\uffff\4\46\1\111\6\46\1\110\6\46\1\105\5\46\1\107"+
            "\1\46\4\uffff\1\46\1\uffff\4\46\1\111\25\46",
            "",
            "",
            "",
            "\1\112",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\122",
            "\1\123",
            "\1\125\3\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\75\1\77\64\75\1\76\uffa2\75",
            "\uffff\131",
            "\1\43\4\uffff\1\42",
            "\42\100\1\102\71\100\1\101\uffa2\100",
            "\uffff\133",
            "\1\43\4\uffff\1\42",
            "\12\134\7\uffff\6\134\32\uffff\6\134",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\106\7\uffff\4\46\1\111\6\46\1\110\6\46\1\105\5\46\1\107"+
            "\1\46\4\uffff\1\46\1\uffff\4\46\1\111\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\104\1\uffff\1\104\2\uffff\12\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\12\46\7\uffff\16\46\1\151\13\46\4\uffff\1\46\1\uffff\32\46",
            "\1\153",
            "\1\154",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\156",
            "\47\75\1\77\64\75\1\76\uffa2\75",
            "",
            "\42\100\1\102\71\100\1\101\uffa2\100",
            "\12\134\7\uffff\6\134\24\46\4\uffff\1\46\1\uffff\6\134\24\46",
            "",
            "",
            "",
            "\12\140\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_FROM | KW_AS | KW_SELECT | KW_ON | KW_CREATE | KW_INT | KW_DOUBLE | KW_INTO | KW_SCHEMA | KW_INPUT | KW_OUTPUT | KW_STREAM | KW_WINDOW | KW_SIZE | KW_ADVANCE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
        }
    }
 

}