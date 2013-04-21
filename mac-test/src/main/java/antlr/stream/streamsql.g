grammar streamsql;
options
{
output=AST;
ASTLabelType=CommonTree;
backtrack=false;
k=3;
}
tokens {
TOK_CREATE_SCHEMA; 
TOK_CREATE_STREAM; 
TOK_CREATE_WINDOW; 
TOK_SELECT;
TOK_SCHEMA_LIST; 
TOK_NAME_TYPE;
TOK_SELEXPR; 
TOK_SELITEM; 
TOK_SELLIST;
TOK_EXPLAIN;
}

@header {
  package antlr.stream;
}

@lexer::header {package antlr.stream;}

@members {
  Stack msgs = new Stack<String>();
}

@rulecatch {
catch (RecognitionException e) {
 reportError(e);
  throw e;
}
}

// start statement

statement
  : execStatement EOF
  ;

execStatement
@init { msgs.push("exec statement"); }
@after { msgs.pop(); }
  : selectStatement EOF
  ;

selectStatement
@init { msgs.push("select statement"); }
@after { msgs.pop(); }
  : KW_SELECT selectList KW_FROM instreamName=Identifier LSQUARE windowName=Identifier RSQUARE KW_INTO outstreamName=Identifier
    -> ^(KW_SELECT selectList $instreamName $windowName $outstreamName)
  ;
selectList
  : selectColumn (COMMA selectColumn)*
    -> ^(TOK_SELLIST selectColumn+)w
  ;
selectColumn
  : selectItem
  | selectExpression
  ;
selectItem
  : Identifier KW_AS Identifier
    -> ^(TOK_SELITEM Identifier Identifier)
  ;
selectExpression
  : functionName=Identifier LPAREN itemName=Identifier RPAREN KW_AS asName=Identifier
    -> ^(TOK_SELEXPR $functionName $itemName $asName)
  ;
  
// Keywords

KW_FROM : 'FROM'; 
KW_AS : 'AS'; 
KW_SELECT : 'SELECT'; 
KW_ON : 'ON'; 
KW_CREATE: 'CREATE'; 
KW_INT: 'INT'; 
KW_DOUBLE: 'DOUBLE'; 
KW_INTO: 'INTO'; 
KW_SCHEMA: 'SCHEMA'; 
KW_INPUT: 'INPUT'; 
KW_OUTPUT: 'OUTPUT';
KW_STREAM: 'STREAM'; 
KW_WINDOW: 'WINDOW'; 
KW_SIZE: 'SIZE'; 
KW_ADVANCE: 'ADVANCE';


// Operators
// NOTE: if you add a new function/operator, add it to sysFuncNames so that describe function _FUNC_ will work.

DOT : '.'; // generated as a part of Number rule
COLON : ':' ;
COMMA : ',' ;
SEMICOLON : ';' ;

LPAREN : '(' ;
RPAREN : ')' ;
LSQUARE : '[' ;
RSQUARE : ']' ;
LCURLY : '{';
RCURLY : '}';

EQUAL : '=' | '==';
NOTEQUAL : '<>' | '!=';
LESSTHANOREQUALTO : '<=';
LESSTHAN : '<';
GREATERTHANOREQUALTO : '>=';
GREATERTHAN : '>';

DIVIDE : '/';
PLUS : '+';
MINUS : '-';
STAR : '*';
MOD : '%';
DIV : 'DIV';

AMPERSAND : '&';
TILDE : '~';
BITWISEOR : '|';
BITWISEXOR : '^';
QUESTION : '?';
DOLLAR : '$';

// LITERALS
fragment
Letter
    : 'a'..'z' | 'A'..'Z'
    ;

fragment
HexDigit
    : 'a'..'f' | 'A'..'F'
    ;

fragment
Digit
    :
    '0'..'9'
    ;

fragment
Exponent
    :
    ('e' | 'E') ( PLUS|MINUS )? (Digit)+
    ;

fragment
RegexComponent
    : 'a'..'z' | 'A'..'Z' | '0'..'9' | '_'
    | PLUS | STAR | QUESTION | MINUS | DOT
    | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY
    | BITWISEXOR | BITWISEOR | DOLLAR
    ;

StringLiteral
    :
    ( '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '\"' ( ~('\"'|'\\') | ('\\' .) )* '\"'
    )+
    ;

CharSetLiteral
    :
    StringLiteral
    | '0' 'X' (HexDigit|Digit)+
    ;

BigintLiteral
    :
    (Digit)+ 'L'
    ;

SmallintLiteral
    :
    (Digit)+ 'S'
    ;

TinyintLiteral
    :
    (Digit)+ 'Y'
    ;

Number
    :
    (Digit)+ ( DOT (Digit)* (Exponent)? | Exponent)?
    ;

Identifier
    :
    (Letter | Digit) (Letter | Digit | '_')*
    | '`' RegexComponent+ '`'
    ;

CharSetName
    :
    '_' (Letter | Digit | '_' | '-' | '.' | ':' )+
    ;

WS  :  (' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
  : '--' (~('\n'|'\r'))*
    { $channel=HIDDEN; }
  ;

