package lexer;

import jdk.nashorn.internal.parser.Lexer;
import jdk.nashorn.internal.parser.TokenStream;
import jdk.nashorn.internal.runtime.Source;

public class FLexer extends Lexer {

    public FLexer(Source source, TokenStream stream) {
        super(source, stream);
    }
}
