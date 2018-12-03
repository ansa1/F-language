import model.Token;
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
            out.print(nextToken.getValue() + "!");
        }
        out.close();
//        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
//
//        String line = "";
//        while ((line = reader.readLine()) != null) {
//            line = line
//                    .replaceAll("//.+$", "")
//                    .replaceAll("=", " = ")
//                    .replaceAll("<", " < ")
//                    .replaceAll(">", " > ")
//                    .replaceAll("/", " / ")
//                    .replaceAll("<  =", "<=")
//                    .replaceAll(">  =", ">=")
//                    .replaceAll("=  >", "=>")
//                    .replaceAll("=  =", "==")
//                    .replaceAll("/  =", "/=")
//                    .replaceAll("(\\+|-|\\*|/|\\(|\\)|\\{|}|\\.|\\^|\\[|\\]|\\\\|:|,)", " $1 ");
//            System.out.println(line);
//        }
    }
}
