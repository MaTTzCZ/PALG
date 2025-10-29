package dev.mattz.data.data_strctures;

import java.util.Random;

public class ArraysUtils {
    public int[] createArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max + 1);
        }
        return array;
    }
}
