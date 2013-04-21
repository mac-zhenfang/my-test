import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SqlLexer lex = new SqlLexer(new ANTLRFileStream("C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\flume\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SqlGrammar g = new SqlGrammar(tokens, 49100, null);
        try {
            g.top();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}