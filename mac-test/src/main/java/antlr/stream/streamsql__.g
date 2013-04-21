lexer grammar streamsql;
@header {package antlr.stream;}

// $ANTLR src "streamsql.g" 78
KW_FROM : 'FROM'; 
// $ANTLR src "streamsql.g" 79
KW_AS : 'AS'; 
// $ANTLR src "streamsql.g" 80
KW_SELECT : 'SELECT'; 
// $ANTLR src "streamsql.g" 81
KW_ON : 'ON'; 
// $ANTLR src "streamsql.g" 82
KW_CREATE: 'CREATE'; 
// $ANTLR src "streamsql.g" 83
KW_INT: 'INT'; 
// $ANTLR src "streamsql.g" 84
KW_DOUBLE: 'DOUBLE'; 
// $ANTLR src "streamsql.g" 85
KW_INTO: 'INTO'; 
// $ANTLR src "streamsql.g" 86
KW_SCHEMA: 'SCHEMA'; 
// $ANTLR src "streamsql.g" 87
KW_INPUT: 'INPUT'; 
// $ANTLR src "streamsql.g" 88
KW_OUTPUT: 'OUTPUT';
// $ANTLR src "streamsql.g" 89
KW_STREAM: 'STREAM'; 
// $ANTLR src "streamsql.g" 90
KW_WINDOW: 'WINDOW'; 
// $ANTLR src "streamsql.g" 91
KW_SIZE: 'SIZE'; 
// $ANTLR src "streamsql.g" 92
KW_ADVANCE: 'ADVANCE';


// Operators
// NOTE: if you add a new function/operator, add it to sysFuncNames so that describe function _FUNC_ will work.

// $ANTLR src "streamsql.g" 98
DOT : '.'; // generated as a part of Number rule
// $ANTLR src "streamsql.g" 99
COLON : ':' ;
// $ANTLR src "streamsql.g" 100
COMMA : ',' ;
// $ANTLR src "streamsql.g" 101
SEMICOLON : ';' ;

// $ANTLR src "streamsql.g" 103
LPAREN : '(' ;
// $ANTLR src "streamsql.g" 104
RPAREN : ')' ;
// $ANTLR src "streamsql.g" 105
LSQUARE : '[' ;
// $ANTLR src "streamsql.g" 106
RSQUARE : ']' ;
// $ANTLR src "streamsql.g" 107
LCURLY : '{';
// $ANTLR src "streamsql.g" 108
RCURLY : '}';

// $ANTLR src "streamsql.g" 110
EQUAL : '=' | '==';
// $ANTLR src "streamsql.g" 111
NOTEQUAL : '<>' | '!=';
// $ANTLR src "streamsql.g" 112
LESSTHANOREQUALTO : '<=';
// $ANTLR src "streamsql.g" 113
LESSTHAN : '<';
// $ANTLR src "streamsql.g" 114
GREATERTHANOREQUALTO : '>=';
// $ANTLR src "streamsql.g" 115
GREATERTHAN : '>';

// $ANTLR src "streamsql.g" 117
DIVIDE : '/';
// $ANTLR src "streamsql.g" 118
PLUS : '+';
// $ANTLR src "streamsql.g" 119
MINUS : '-';
// $ANTLR src "streamsql.g" 120
STAR : '*';
// $ANTLR src "streamsql.g" 121
MOD : '%';
// $ANTLR src "streamsql.g" 122
DIV : 'DIV';

// $ANTLR src "streamsql.g" 124
AMPERSAND : '&';
// $ANTLR src "streamsql.g" 125
TILDE : '~';
// $ANTLR src "streamsql.g" 126
BITWISEOR : '|';
// $ANTLR src "streamsql.g" 127
BITWISEXOR : '^';
// $ANTLR src "streamsql.g" 128
QUESTION : '?';
// $ANTLR src "streamsql.g" 129
DOLLAR : '$';

// LITERALS
// $ANTLR src "streamsql.g" 132
fragment
Letter
    : 'a'..'z' | 'A'..'Z'
    ;

// $ANTLR src "streamsql.g" 137
fragment
HexDigit
    : 'a'..'f' | 'A'..'F'
    ;

// $ANTLR src "streamsql.g" 142
fragment
Digit
    :
    '0'..'9'
    ;

// $ANTLR src "streamsql.g" 148
fragment
Exponent
    :
    ('e' | 'E') ( PLUS|MINUS )? (Digit)+
    ;

// $ANTLR src "streamsql.g" 154
fragment
RegexComponent
    : 'a'..'z' | 'A'..'Z' | '0'..'9' | '_'
    | PLUS | STAR | QUESTION | MINUS | DOT
    | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY
    | BITWISEXOR | BITWISEOR | DOLLAR
    ;

// $ANTLR src "streamsql.g" 162
StringLiteral
    :
    ( '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '\"' ( ~('\"'|'\\') | ('\\' .) )* '\"'
    )+
    ;

// $ANTLR src "streamsql.g" 169
CharSetLiteral
    :
    StringLiteral
    | '0' 'X' (HexDigit|Digit)+
    ;

// $ANTLR src "streamsql.g" 175
BigintLiteral
    :
    (Digit)+ 'L'
    ;

// $ANTLR src "streamsql.g" 180
SmallintLiteral
    :
    (Digit)+ 'S'
    ;

// $ANTLR src "streamsql.g" 185
TinyintLiteral
    :
    (Digit)+ 'Y'
    ;

// $ANTLR src "streamsql.g" 190
Number
    :
    (Digit)+ ( DOT (Digit)* (Exponent)? | Exponent)?
    ;

// $ANTLR src "streamsql.g" 195
Identifier
    :
    (Letter | Digit) (Letter | Digit | '_')*
    | '`' RegexComponent+ '`'
    ;

// $ANTLR src "streamsql.g" 201
CharSetName
    :
    '_' (Letter | Digit | '_' | '-' | '.' | ':' )+
    ;

// $ANTLR src "streamsql.g" 206
WS  :  (' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "streamsql.g" 209
COMMENT
  : '--' (~('\n'|'\r'))*
    { $channel=HIDDEN; }
  ;

