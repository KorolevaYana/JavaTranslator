import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Compiler {

    public static void compile(String sourcePath, String compiledPath) {
        try (FileReader reader = new FileReader(sourcePath)) {
            ANTLRInputStream input = new ANTLRInputStream(reader);
            JavaLexer lexer = new JavaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            // ParseTree tree = parser.code();
            ParseTree tree = parser.mainClass();
            ParseTreeWalker walker = new ParseTreeWalker();
            CodeListener codeListener = new CodeListener();
            walker.walk(codeListener, tree);
            try (FileWriter writer = new FileWriter(compiledPath)) {
                ArrayList<String> byteCode = CodeListener.getCode();
                int size = byteCode.size();
                for (int i = 0; i < size; i++) {
                    writer.write(byteCode.get(i));
                }

                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Krya");
        }
    }
}
