import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");;
        }
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll("=", " = ")
                    .replaceAll("<", " < ")
                    .replaceAll(">", " > ")
                    .replaceAll("<  =", "<=")
                    .replaceAll(">  =", "<=")
                    .replaceAll("=  =", "==");
            System.out.println(line);
        }
    }
}
