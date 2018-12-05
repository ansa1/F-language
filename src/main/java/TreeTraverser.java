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
        boolean res = traverse(tree, map);
        return map;
    }

    public static Stack<HashMap<String, String>> cont = new Stack<>();
    public static HashMap<String, Integer> functions = new HashMap<>();

    private static void initIfNot() {
        if (cont.isEmpty()) {
            cont.push(new HashMap<>());
        }
    }

    private static void addIfNot(String name) {
        if (cont.peek().containsKey(name)) {

        } else {
            cont.peek().put(name, "placeholder");
        }
    }

    // Firstly, traverse the tree and map results
    private static boolean traverse(ParseTree tree, Map<String, Object> map) {
        initIfNot();
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            map.put("type", token.getType());
            map.put("text", token.getText());
            if (tree.getParent().getChild(0).getText().equals("for")) {
                if (token.getType() == 55) {
                    addIfNot(token.getText());
                }
            }
            return true;
        } else {
            List<Map<String, Object>> children = new ArrayList<>();
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
            String nodeName = Character.toLowerCase(name.charAt(0)) + name.substring(1);

            // declaration
            if (nodeName.equals("declaration")) {
                String identName = tree.getChild(0).getText();
                addIfNot(identName);
            }

            // Assignments
            if (nodeName.equals("assignment_or_call")) {
                ParseTree subtree = tree;
                while (subtree.getChildCount() != 1) {
                    subtree = subtree.getChild(0);
                }
                String identName = subtree.getText();
                if (cont.peek().containsKey(identName)) {
                    //TODO: type check
                } else {
//                    return false;
                }
            }

            if (nodeName.equals("function")
                    || nodeName.equals("loop_body")
                    || nodeName.equals("then_statement")
                    || nodeName.equals("else_statement")) {
                HashMap clone = (HashMap) cont.peek().clone();
                if (nodeName.equals("function")) {
                    int childCount = tree.getChild(2).getChildCount();
                    Integer amountOfParams = childCount - childCount / 2;
                    functions.put(nodeName, amountOfParams);
                }
                cont.push(clone);
            }

            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

            ArrayList<Boolean> results = new ArrayList<>();
            for (int i = 0; i < tree.getChildCount(); i++) {
                Map<String, Object> nested = new LinkedHashMap<>();
                children.add(nested);
                if (tree.getChild(i).getText().equals("end")) {
                    cont.pop();
                }
                results.add(traverse(tree.getChild(i), nested));
            }
            return !results.contains(false);
        }
    }
}
