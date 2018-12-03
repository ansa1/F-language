import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void parseLexical() {
        String input = "a is 3i4\n" +
                "b is 3.4i4.5\n" +
                "c is 3\\4\n" +
                "d is 3.4i5\n" +
                "e is 3i4.5\n";
        try {
            String expected = "IDENTIFIER a\n" +
                    "KEYWORD is\n" +
                    "COMPLEX_LITERAL 3i4\n" +
                    "b\n" +
                    "KEYWORD is\n" +
                    "COMPLEX_LITERAL 3.4i4.5\n" +
                    "c\n" +
                    "KEYWORD is\n" +
                    "RATIONAL_LITERAL 3\\4\n" +
                    "\n" +
                    "IDENTIFIER d\n" +
                    "KEYWORD is\n" +
                    "COMPLEX_LITERAL 3.4i5\n" +
                    "e\n" +
                    "KEYWORD is\n" +
                    "COMPLEX_LITERAL 3i4.5\n" +
                    "\n" +
                    "EOF \n";
            String actual = Main.parseLexical(input);
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}