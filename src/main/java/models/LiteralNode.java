package models;

public class LiteralNode extends Node {
    private String value;                   // Value of the literal

    public LiteralNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
