import model.Token;
import model.Type;
import org.apache.commons.io.FileUtils;

import java.io.*;
import lexer.FLexer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        PrintWriter out = new PrintWriter(new File("out.txt"));

        // read all file
        String input = FileUtils.readFileToString(file);

        FLexer analyzer = new FLexer(input);

        // while we have lexical atoms:
        while ((input = analyzer.getInput()) != null) {
            Token nextToken = analyzer.GetNextLexicalAtom(input);
            if (nextToken.getType() != Type.INPUT_LINE_SEPARATOR) {
                out.print(nextToken.getType().name() + " " + nextToken.getValue() + "\n");
            }
            else {
                out.print(nextToken.getValue());
            };
        }
        out.close();
    }
}
