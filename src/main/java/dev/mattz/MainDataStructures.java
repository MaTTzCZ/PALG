package dev.mattz;

import dev.mattz.data.data_strctures.DoubleLinkedList;

public class MainDataStructures {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);

        for (int i : list) {
            System.out.println(i);
        }


    }
}
