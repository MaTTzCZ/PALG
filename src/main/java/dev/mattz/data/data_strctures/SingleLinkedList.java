package dev.mattz.data.data_strctures;

public class SingleLinkedList<V> {
    private Node<V> head, tail;
    private int size;

    public SingleLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public void add(V value) {
        Node<V> newNode = new Node<>(value);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    private static class Node<V> {
        private V value;
        private Node<V> next;

        public Node(V value) {
            this.value = value;
            this.next = null;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<V> getNext() {
            return next;
        }

        public void setNext(Node<V> next) {
            this.next = next;
        }
    }
}
