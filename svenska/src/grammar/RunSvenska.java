package grammar;
import java.io.*;
import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class RunSvenska {

        public static void main(String[] args) throws IOException {
            String infnam;
            if (args.length > 0) {
                infnam = args[0];
            } else {
                System.out.println("Vilken fil vill du köra?");
                Scanner scanner = new Scanner(System.in);
                infnam = scanner.nextLine();
            }
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infnam));
            hejLexer lexer = new hejLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            hejParser parser = new hejParser(tokens);
            ParseTree tree = parser.code();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new Compiler(infnam), tree);
        }
}
