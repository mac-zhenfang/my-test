lexer grammar Example;
options {
  language=Java;

}
@header {
package antlr;
}

T6 : 'call' ;
T7 : ';' ;

// $ANTLR src "Example.g" 30
ID
  :
  'a'..'z'+
  ;

// $ANTLR src "Example.g" 35
WS
  :
  (
    ' '
    | '\n'
    | '\r'
  )+
  
   {
    $channel = HIDDEN;
   }
  ;
