import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

public class JarCreator {
    public static void run() throws IOException
    {
        String file1ToCompile = "./src/main/java/Compilation.java";
        String file2ToCompile = "./src/main/java/Complex.java";
        String file3ToCompile = "./src/main/java/FTreeCodeGeneratorVisitor.java";
        String file4ToCompile = "./src/main/java/Rational.java";
        String file5ToCompile = "./src/main/java/Utils.java";
        String file6ToCompile = "./src/main/java/Value.java";

        String file7ToCompile = "./src/main/java/antlr/FBaseListener.java";
        String file8ToCompile = "./src/main/java/antlr/FBaseVisitor.java";
        String file9ToCompile = "./src/main/java/antlr/FLexer.java";
        String file10ToCompile = "./src/main/java/antlr/FParser.java";
        String file11ToCompile = "./src/main/java/antlr/FListener.java";
        String file12ToCompile = "./src/main/java/antlr/FVisitor.java";

        String file13ToCompile = "./src/main/java/CSyntaxAnalyzer.java";

        String file14ToCompile = "./src/main/java/antlr4-4.7.1.jar";
        String file15ToCompile = "./src/main/java/antlr4-runtime-4.7.1.jar";
        String file16ToCompile = "./src/main/java/antlr-runtime-3.5.2.jar";


        String file17ToCompile = "./src/main/java/ThrowingErrorListener.java";



        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        int compilationResult = compiler.run(null, null, null,
                file1ToCompile, file2ToCompile, file3ToCompile, file4ToCompile, file5ToCompile, file6ToCompile,
                file7ToCompile, file8ToCompile, file9ToCompile, file10ToCompile, file11ToCompile, file12ToCompile,
                file13ToCompile, file17ToCompile
        );

        if (compilationResult == 0) {

            System.out.println("Compilation is successful");

        } else {
            System.out.println("Compilation Failed");
        }

        Manifest manifest = new Manifest();
        manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "Compilation");
        manifest.getMainAttributes().put(Attributes.Name.CLASS_PATH, "./src/main/java/ ./src/main/java/antlr4-4.7.1.jar ./src/main/java/antlr4-runtime-4.7.1.jar ./src/main/java/antlr-runtime-3.5.2.jar");
        JarOutputStream target = new JarOutputStream(new FileOutputStream("output.jar"), manifest);

        add(new File("./src/main/java/Compilation.class"), target);
        add(new File("./src/main/java/Complex.class"), target);
        add(new File("./src/main/java/FTreeCodeGeneratorVisitor.class"), target);
        add(new File("./src/main/java/Rational.class"), target);
        add(new File("./src/main/java/Utils.class"), target);
        add(new File("./src/main/java/Value.class"), target);

        add(new File("./src/main/java/antlr/FBaseListener.class"), target);
        add(new File("./src/main/java/antlr/FBaseVisitor.class"), target);
        add(new File("./src/main/java/antlr/FLexer.class"), target);
        add(new File("./src/main/java/antlr/FParser.class"), target);
        add(new File("./src/main/java/antlr/FListener.class"), target);
        add(new File("./src/main/java/antlr/FVisitor.class"), target);

        add(new File("./src/main/java/CSyntaxAnalyzer.class"), target);

        add(new File("./src/main/java/antlr/F.tokens"), target);
        add(new File("./src/main/java/antlr/FLexer.tokens"), target);

        add(new File("./src/main/java/antlr4-4.7.1.jar"), target);
        add(new File("./src/main/java/antlr4-runtime-4.7.1.jar"), target);
        add(new File("./src/main/java/antlr-runtime-3.5.2.jar"), target);

        add(new File("./src/main/java/ThrowingErrorListener.class"), target);

        target.close();
    }

    private static void add(File source, JarOutputStream target) throws IOException
    {
        BufferedInputStream in = null;
        try
        {
            if (source.isDirectory())
            {
                String name = source.getPath().replace("\\", "/");
                if (!name.isEmpty())
                {
                    if (!name.endsWith("/"))
                        name += "/";
                    JarEntry entry = new JarEntry(name);
                    entry.setTime(source.lastModified());
                    target.putNextEntry(entry);
                    target.closeEntry();
                }
                for (File nestedFile: source.listFiles())
                    add(nestedFile, target);
                return;
            }

            JarEntry entry = new JarEntry(source.getPath().replace("\\", "/"));
            entry.setTime(source.lastModified());
            target.putNextEntry(entry);
            in = new BufferedInputStream(new FileInputStream(source));

            byte[] buffer = new byte[1024];
            while (true)
            {
                int count = in.read(buffer);
                if (count == -1)
                    break;
                target.write(buffer, 0, count);
            }
            target.closeEntry();
        }
        finally
        {
            if (in != null)
                in.close();
        }
    }
}
