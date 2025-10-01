package dev.mattz.data;

public class Node<V> {
    private V value;
    private Node<V> before;
    private Node<V> after;

    public Node(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<V> getBefore() {
        return before;
    }

    public void setBefore(Node<V> before) {
        this.before = before;
    }

    public Node<V> getAfter() {
        return after;
    }

    public void setAfter(Node<V> after) {
        this.after = after;
    }
}
