package antlr.callfoo;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		String test = "call foo;";
		ByteArrayInputStream stream = new ByteArrayInputStream(test.getBytes());

		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(stream);

		// create a lexer that feeds off of input CharStream
		ExampleLexer lexer = new ExampleLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		ExampleParser parser = new ExampleParser(tokens);
		// begin parsing at rule r
		parser.r();
	}

}
