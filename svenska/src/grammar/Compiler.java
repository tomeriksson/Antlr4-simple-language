package grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class Compiler extends hejBaseListener {

    private Stack<String> labelStack = new Stack<String>();
    private int counter = 0;


    private String filename;

    public Compiler(String fname){
        this.filename = fname;
    }

    @Override public void exitTilldelning(hejParser.TilldelningContext ctx) {

        System.out.println("pop " + ctx.ID().getText());
    }

    @Override public void exitAtom(hejParser.AtomContext ctx) {

            if(ctx.INT() != null) {
                System.out.println("push " + ctx.INT().getText());
            } else{
                    System.out.println("push " + ctx.ID().getText());
            }
    }

    @Override public void exitAddera(hejParser.AdderaContext ctx) {
        System.out.println("add");
    }

    @Override public void exitSubtrahera(hejParser.SubtraheraContext ctx) {
        System.out.println("sub");
    }

    @Override public void enterUpprepning(hejParser.UpprepningContext ctx) {
        String label = "" + counter;
        labelStack.push(label);
        counter++;
        System.out.println("label enterLoop" + label);
    }

    @Override public void exitUpprepning(hejParser.UpprepningContext ctx) {
        labelStack.pop();
    }

    @Override public void exitSlut(hejParser.SlutContext ctx) {
        String label = labelStack.peek();
        System.out.println("goto enterLoop" + label);
        System.out.println("label exitLoop" + label);

    }

    @Override public void exitVillkor(hejParser.VillkorContext ctx) {
        if (ctx.getText().contains("mindre")){
            System.out.println("lt");
        } else {
            System.out.println("gt");
        }
        System.out.println("not");

        String label = labelStack.peek();
        System.out.println("if-goto exitLoop" + label);

    }
    @Override public void exitUtskrift(hejParser.UtskriftContext ctx) { System.out.println("print " + ctx.uttryck().atom().ID().getText());

    }

}
