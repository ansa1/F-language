package lexer;

import model.Token;
import model.Type;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class FLexer {

    private String input = "";
    private String inputLineSeparator = "";

    private void setInputLineSeparator(String input) {
        inputLineSeparator = Utils.getInputLineSeparator(input);
    }

    private FLexer() {
    }

    public FLexer(String input) {
        // removing BOM to correct work with it
        input = Utils.removeUTF8BOM(input);
        // supporting different line separator types
        setInputLineSeparator(input);
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    // delimiter class
    private final static String[] delimiter = {";", "{", "}", "\r", "\n", "\r\n"};

    // check that this 'str' is delimiter
    private boolean CheckDelimiter(String str) {
        return Arrays.asList(delimiter).contains(str);
    }

    // operator class
    private final static String[] operators = {"+", "-", "*", "/", "<", ">", "<=", ">=", "=", "/=", "&", "|", "^",};

    // check that this 'str' is operator
    private boolean CheckOperator(String str) {
        return Arrays.asList(operators).contains(str);
    }

    // comment class, of course we will ignore it
    private final static String[] comments = {"//", "/*", "*/"};

    // check that this 'str' is comment
    private boolean CheckComments(String str) {
        return Arrays.asList(comments).contains(str);
    }

    // keyword class
    private final static String[] keywords = {"boolean", "integer", "real", "rational", "complex", "string",
    "true", "false", "is", "if", "else", "end", "then", "return", "do", "for", "in", "loop", "=>", "while", "break"};

    // check that this 'str' is keyword
    private boolean CheckKeyword(String str) {
        return Arrays.asList(keywords).contains(str);
    }

    // this method finds next lexical atom
    public Token GetNextLexicalAtom(String input) {

        // trim tabulation
        input = StringUtils.strip(input, " \t");

        StringBuilder token = new StringBuilder();
        Token newToken = new Token();

        // check all element
        for (int i = 0; i < input.length(); i++) {

            // if it is delimiter:
            if (CheckDelimiter(Character.toString(input.charAt(i)))) {
                // two symbols delimiter
                if (i + 1 < input.length() && CheckDelimiter(StringUtils.substring(input, i, i + 2))) {
                    token.append(input.substring(i, i + 2));
                    input = input.substring(0, i) + input.substring(i + 2);

                    setInput(input);
                    return Parse(token.toString());
                }
                // one symbol delimiter
                else {
                    token.append(Character.toString(input.charAt(i)));
                    input = input = input.substring(0, i) + input.substring(i + 1);

                    setInput(input);
                    return Parse(token.toString());
                }

            }
            // check if it is an operator
            else if (CheckOperator(Character.toString(input.charAt(i)))) {
                if (i + 1 < input.length() && (CheckOperator(input.substring(i, i + 2))))
                    // 3 symbol operators
                    if (i + 2 < input.length() && CheckOperator(input.substring(i, i + 3))) {
                        token.append(input.substring(i, i + 3));
                        input = input.substring(0, i) + input.substring(i + 3);

                        setInput(input);
                        return Parse(token.toString());
                    }
                    // 2 symbol operators
                    else {
                        token.append(input.substring(i, i + 2));
                        input = input.substring(0, i) + input.substring(i + 2);

                        setInput(input);
                        return Parse(token.toString());
                    }
                    // if we cannot gather 2 or 3 symbol operators -> check comments
                else if (CheckComments(input.substring(i, i + 2))) {
                    // one line comments
                    if (input.substring(i, i + 2).equals("//")) {
                        do {
                            i++;
                        }
                        while (i < input.length() && input.charAt(i) != '\n');
                        if (i >= input.length()) {
                            setInput(null);
                            return newToken;
                        }
                        input = input.substring(i + 1);
                        input = StringUtils.strip(input, " \t\r\n");
                        i = -1;
                    }
                    // otherwise multiline comments
                    else {
                        // find last element and ignore all
                        do {
                            i++;
                        } while (input.substring(i, i + 2).equals("*/") == false);
                        input = input.substring(i + 2);
                        input = StringUtils.strip(input, " \t\r\n");
                        i = -1;
                    }

                } else {

                    // check negative number
                    if (input.charAt(i) == '-') {
                        if (Utils.isInteger(Character.toString(input.charAt(i + 1)))) {
                            continue;
                        }
                    }

                    // otherwise this is 1(one) symbol operators
                    token.append(input.charAt(i));
                    input = input.substring(0, i) + input.substring(i + 1);

                    setInput(input);
                    return Parse(token.toString());
                }
            } // if current symbol is ''' ->
            else if (input.charAt(i) == '\'') {
                int j = i + 1;
                if (input.charAt(j) == '\\')
                    j += 2;
                else
                    j++;

                token.append("[Literal constant -> ").append(input.substring(i, j + 1)).append("] ");
                newToken.setType(Type.LITERAL_CONSTANT);
                newToken.setValue(input.substring(i, j + 1));
                input = input.substring(0, i) + input.substring(j + 1);

                setInput(input);

                return newToken;
            }
            // other literal constant
            else if (input.charAt(i) == '"') {
                int j = i + 1;
                while (input.charAt(j) != '"')
                    j++;
                token.append("[Literal constant -> ").append(input.substring(i, j + 1)).append("] ");
                newToken.setType(Type.LITERAL_CONSTANT);
                newToken.setValue(input.substring(i, j + 1));
                input = input.substring(0, i) + input.substring(j + 1);

                setInput(input);
                return newToken;
            } // if it is delimiter or operator:
            else if (Character.toString(input.charAt(i + 1)).equals(" ") ||
                    CheckDelimiter(Character.toString(input.charAt(i + 1)))
                    || CheckOperator(Character.toString(input.charAt(i + 1)))) {
                // try to find numerical constant
                if (Parse(input.substring(0, i + 1)).getValue().contains("Numerical constant") && input.charAt(i + 1) == '.') {
                    int j = i + 2;

                    // find right bound
                    while (!(Character.toString(input.charAt(j)).equals(" ")) &&
                            !CheckDelimiter(Character.toString(input.charAt(j))) &&
                            !CheckOperator(Character.toString(input.charAt(j))))
                        j++;

                    // test that this input substring is correct integer
                    if (Utils.isInteger(input.substring(i + 2, j))) {
                        token.append("[Numerical constant -> \"").append(input.substring(0, j)).append("\"] ");
                        input = input.substring(j);

                        setInput(input);
                        return Parse(token.toString());
                    }
                }
                token.append(input.substring(0, i + 1));
                input = input.substring(i + 1);

                setInput(input);
                return Parse(input);
            }

        }
        // of there is no token -> return empty token

        setInput(null);
        return newToken;
    }

    private Token Parse(String input) {

        StringBuilder str = new StringBuilder();
        Token token = new Token();

        // if it is an integer:
        if (Utils.isInteger(input)) {
            // it is numerical constant
            str.append("[Numerical constant -> \"" + input + "\"] ");
            token.setType(Type.NUMERICAL_CONSTANT);
            token.setValue(input);
            return token;
        }

        // new line
        if (input.equals(inputLineSeparator)) {
            token.setType(Type.INPUT_LINE_SEPARATOR);
            token.setValue(inputLineSeparator);
            return token;
        }

        // if it is a keyword:
        if (CheckKeyword(input)) {
            str.append("[Keyword -> \"" + input + "\"] ");
            token.setType(Type.KEYWORD);
            token.setValue(input);
            return token;
        }

        // if it is an operator:
        if (CheckOperator(input)) {
            str.append("[Operator -> \"" + input + "\"] ");
            token.setType(Type.OPERATOR);
            token.setValue(input);
            return token;
        }

        // if it is a delimiter
        if (CheckDelimiter(input)) {
            str.append("[Delimiter -> \"" + input + "\"] ");
            token.setType(Type.DELIMITER);
            token.setValue(input);
            return token;
        }

        // else it is identifer
        str.append("[Identifier -> \"" + input + "\"] ");
        token.setType(Type.IDENTIFIER);
        token.setValue(input);
        return token;
    }
}