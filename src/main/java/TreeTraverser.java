import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class TreeTraverser {
    // TreeTraverser class convert from ParseTree to JSON format

    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();

    public static String toJson(ParseTree tree) {
        return PRETTY_PRINT_GSON.toJson(toMap(tree));
    }

    private static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    public static Stack<HashMap<String, String>> cont = new Stack<>();

    private static void initIfNot() {
        if (cont.isEmpty()) {
            cont.push(new HashMap<>());
        }
    }

    private static String getType(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
        String nodeName = Character.toLowerCase(name.charAt(0)) + name.substring(1);
        if (nodeName.equals("declaration")) {
            if (tree.getChild(1).equals(":")){

            }
        }
        return null;
    }

    // Firstly, traverse the tree and map results
    private static void traverse(ParseTree tree, Map<String, Object> map){
        initIfNot();
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            map.put("type", token.getType());
            map.put("text", token.getText());
        } else {
            List<Map<String, Object>> children = new ArrayList<>();
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
            String nodeName = Character.toLowerCase(name.charAt(0)) + name.substring(1);
            if (nodeName.equals("declaration")) {
                String identName = tree.getChild(0).getText();
                if (cont.peek().containsKey(identName)) {
                    System.out.println("ALREADYIN");
                } else {
                    System.out.println("NOTINANDADDED");
                    cont.peek().put(identName, "placeholder");
                }
            }

            if (nodeName.equals("assignment_or_call")) {
                String identName = tree.getChild(0).getText();
                if (cont.peek().containsKey(identName)) {
                    System.out.println("in");
                } else {
                    System.out.println("NONDECLARED");
                }
            }

            if (nodeName.equals("function")) {
                System.out.println("!NEWLEVEL");
                HashMap clone = (HashMap) cont.peek().clone();
                cont.push(clone);
            }

            if (nodeName.equals("loop_body")) {
                System.out.println("!NEWLEVEL");
                HashMap clone = (HashMap) cont.peek().clone();
                cont.push(clone);
            }
            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

            for (int i = 0; i < tree.getChildCount(); i++) {
                Map<String, Object> nested = new LinkedHashMap<>();
                children.add(nested);
                if (tree.getChild(i).getText().equals("end")) {
                    cont.pop();
                    System.out.println("!DELETED");
                }
                traverse(tree.getChild(i), nested);
            }
        }
    }
}
