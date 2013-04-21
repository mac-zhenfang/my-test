grammar Example;

options {
  language = Java;
  output = AST;
}

@header {
package antlr.callfoo;
  
import org.antlr.runtime.BitSet;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
}

@lexer::header {
package antlr.callfoo;
}

/** Match things like "call foo;" */
r
  :
  'call' ID ';' 
                {
                 System.out.println("invoke " + $ID.text);
                }
  ;

ID
  :
  'a'..'z'+
  ;

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
