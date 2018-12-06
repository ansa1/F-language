//import java.util.*;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.antlr.v4.runtime.RuleContext;
//import org.antlr.v4.runtime.Token;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.TerminalNodeImpl;
//
//public class TreeTrav {
//    // TreeTraverser class convert from ParseTree to JSON format
//
//    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();
//
//    public static String toJson(ParseTree tree) {
//        return PRETTY_PRINT_GSON.toJson(toMap(tree));
//    }
//
//    private static Map<String, Object> toMap(ParseTree tree) {
//        Map<String, Object> map = new LinkedHashMap<>();
//        traverse(tree, map);
//        return map;
//    }
//    private static ParseTree ast;
//
//    public static ParseTree trimTree(ParseTree tree) {
//        Map<String, Object> map = new LinkedHashMap<>();
//        traverse(tree, map);
//        return tree;
//    }
//
//    private static ParseTree cut(ParseTree subTree) {
//        ParseTree tree = subTree;
//        while (tree.getChild(0) != null && tree.getText().equals(tree.getChild(0).getText())) {
//            tree = tree.getChild(0);
//        }
//        return tree;
//    }
//
//    // Firstly, traverse the tree and map results
//    static Stack<ParseTree> lastParents = new Stack<>();
//    private static void traverse(ParseTree tree, Map<String, Object> map) {
//        lastParents.push(tree);
//        List<Map<String, Object>> children = new ArrayList<>();
//        tree = cut(tree);
//
//        if (tree instanceof TerminalNodeImpl) {
//            System.out.println(tree.getText());
//            Token token = ((TerminalNodeImpl) tree).getSymbol();
//            map.put("type", token.getType());
//            map.put("text", token.getText());
//        } else {
//            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
//            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);
//            for (int i = 0; i < tree.getChildCount(); i++) {
//                Map<String, Object> nested = new LinkedHashMap<>();
//                children.add(nested);
//                traverse(tree.getChild(i), nested);
//            }
//        }
//    }
//}
