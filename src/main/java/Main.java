import model.Token;
import model.Type;
import org.apache.commons.io.FileUtils;

import java.io.*;
import lexical.FLexer;

public class Main {

    public static String parseLexical(String input) {
        FLexer analyzer = new FLexer(input);

        StringBuilder output = new StringBuilder();
        while ((input = analyzer.getInput()) != null) {
            Token nextToken = analyzer.GetNextLexicalAtom(input);
            if (nextToken.getType() != Type.INPUT_LINE_SEPARATOR) {
                output.append(nextToken.getType().name() + " " + nextToken.getValue() + "\n");
            }
            else {
                output.append(nextToken.getValue());
            }
        }
        return output.toString();
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);

        // read all file
        String input = FileUtils.readFileToString(file);
        System.out.println(parseLexical(input));
        // while we have lexical atoms:

    }
}
