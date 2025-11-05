package dev.mattz.data.sorting_algorithms;

public class InsertionSort implements Sort {
    @Override
    public int sort(int[] array) {
        int arraySwapCount = 0;

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                arraySwapCount++;
            }
            array[j + 1] = key;
        }
        return arraySwapCount;
    }
}
