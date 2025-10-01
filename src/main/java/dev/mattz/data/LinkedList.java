package dev.mattz.data;

public class LinkedList<V> {
    Node<V> current, root;

    public LinkedList() {
    }

    public void add(Node<V> node) {
        if (root == null) {
            root = current = node;
        } else {
            current.setAfter(node);
            node.setBefore(current);
            current = node;
        }
    }

    java.util.LinkedList
}
