package dev.mattz.data.data_strctures;

import java.util.Iterator;
import java.util.Optional;

public class BinarySearchTree<K extends Comparable<K>, V> implements Iterable<K> {
    Node<K, V> root;

    public BinarySearchTree() {
        this.root = null;
    }

    private Node<K, V> nodeFinder(K key) {
        Node<K, V> current = root;
        while (true) {
            if (current.key.compareTo(key) > 0) {
                if (current.left == null) return current;
                current = current.left;
            } else if (current.key.compareTo(key) < 0) {
                if (current.right == null) return current;
                current = current.right;
            } else return current;
        }
    }

    public boolean insert(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node<K, V> closestAdept = nodeFinder(key);
            if (closestAdept.key.compareTo(key) == 0) return false;
            else if (closestAdept.key.compareTo(key) > 0) {
                closestAdept.left = newNode;
                newNode.parent = closestAdept;
            } else {
                closestAdept.right = newNode;
                newNode.parent = closestAdept;
            }
            return true;
        }
    }

    public Optional<V> search(K key) {
        if (root == null) {
            return Optional.empty();
        } else {
            Node<K, V> closestAdept = nodeFinder(key);
            if (closestAdept.key.compareTo(key) == 0) return Optional.of(closestAdept.value);
            else return Optional.empty();
        }
    }

    @Override
    public Iterator<K> iterator() {
        return null;
    }

    private static class Node<K, V> {
        private final K key;
        private final V value;
        private Node<K, V> parent, left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.parent = this.left = this.right = null;
        }
    }
}
