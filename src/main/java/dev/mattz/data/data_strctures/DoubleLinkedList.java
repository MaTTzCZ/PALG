package dev.mattz.data.data_strctures;

import java.util.Iterator;

public class DoubleLinkedList<V> implements Iterable<V> {
    private Node<V> head, tail;
    private int size;

    public DoubleLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public void addFirst(V value) {
        Node<V> newNode = new Node<>(value);
        if (head == null) head = tail = newNode;
        else {
            head.before = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(V value) {
        Node<V> newNode = new Node<>(value);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.before = tail;
            tail = newNode;
        }
        size++;
    }

    public V getFirst() {
        return head.value;
    }

    public V getLast() {
        return tail.value;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<V> iterator() {
        return new DoubleLinkedListIterator<>(head);
    }

    private static class Node<V> {
        private final V value;
        private Node<V> before, next;

        public Node(V value) {
            this.value = value;
            this.before = this.next = null;
        }

    }

    private static class DoubleLinkedListIterator<V> implements Iterator<V> {
        Node<V> current;

        public DoubleLinkedListIterator(Node<V> head) {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public V next() {
            V value = current.value;
            current = current.next;
            return value;
        }
    }
}
