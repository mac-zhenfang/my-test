// $ANTLR 3.4 C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\callfoo\\Example.g 2012-07-24 23:24:21

package antlr.callfoo;
  
import org.antlr.runtime.BitSet;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExampleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "';'", "'call'"
    };

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int ID=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExampleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExampleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExampleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\callfoo\\Example.g"; }


    public static class r_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "r"
    // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\callfoo\\Example.g:22:1: r : 'call' ID ';' ;
    public final ExampleParser.r_return r() throws RecognitionException {
        ExampleParser.r_return retval = new ExampleParser.r_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal1=null;
        Token ID2=null;
        Token char_literal3=null;

        Object string_literal1_tree=null;
        Object ID2_tree=null;
        Object char_literal3_tree=null;

        try {
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\callfoo\\Example.g:23:3: ( 'call' ID ';' )
            // C:\\projects\\workspace\\mac-test\\src\\main\\java\\antlr\\callfoo\\Example.g:24:3: 'call' ID ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal1=(Token)match(input,7,FOLLOW_7_in_r54); 
            string_literal1_tree = 
            (Object)adaptor.create(string_literal1)
            ;
            adaptor.addChild(root_0, string_literal1_tree);


            ID2=(Token)match(input,ID,FOLLOW_ID_in_r56); 
            ID2_tree = 
            (Object)adaptor.create(ID2)
            ;
            adaptor.addChild(root_0, ID2_tree);


            char_literal3=(Token)match(input,6,FOLLOW_6_in_r58); 
            char_literal3_tree = 
            (Object)adaptor.create(char_literal3)
            ;
            adaptor.addChild(root_0, char_literal3_tree);



                             System.out.println("invoke " + (ID2!=null?ID2.getText():null));
                            

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
        return retval;
    }
    // $ANTLR end "r"

    // Delegated rules


 

    public static final BitSet FOLLOW_7_in_r54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_r56 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r58 = new BitSet(new long[]{0x0000000000000002L});

}