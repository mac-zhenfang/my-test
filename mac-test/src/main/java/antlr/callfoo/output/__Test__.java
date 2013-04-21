import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ExampleLexer lex = new ExampleLexer(new ANTLRFileStream("C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\callfoo\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ExampleParser g = new ExampleParser(tokens, 49100, null);
        try {
            g.r();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}