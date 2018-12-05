package models;

public abstract class Node {
    private String type;            // Keep type of ident or literal

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
