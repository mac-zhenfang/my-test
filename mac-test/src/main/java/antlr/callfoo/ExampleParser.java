// $ANTLR 3.0.1 Example.g 2012-07-23 23:22:07

package antlr.callfoo;
  
import org.antlr.runtime.BitSet;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import antlr.Token;

public class ExampleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'call'", "';'"
    };
    public static final int WS=5;
    public static final int ID=4;
    public static final int EOF=-1;

        public ExampleParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "Example.g"; }


    public static class r_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r
    // Example.g:21:1: r : 'call' ID ';' ;
    public final r_return r() throws RecognitionException {
        r_return retval = new r_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token ID2=null;
        Token char_literal3=null;

        Object string_literal1_tree=null;
        Object ID2_tree=null;
        Object char_literal3_tree=null;

        try {
            // Example.g:23:3: ( 'call' ID ';' )
            // Example.g:24:3: 'call' ID ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)input.LT(1);
            match(input,6,FOLLOW_6_in_r54); 
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);

            ID2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_r56); 
            ID2_tree = (Object)adaptor.create(ID2);
            adaptor.addChild(root_0, ID2_tree);

            char_literal3=(Token)input.LT(1);
            match(input,7,FOLLOW_7_in_r58); 
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            
                             System.out.println("invoke " + ID2.getText());
                            

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r


 

    public static final BitSet FOLLOW_6_in_r54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_r56 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_r58 = new BitSet(new long[]{0x0000000000000002L});

}