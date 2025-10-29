package dev.mattz.data.sorting_algorithms;

public class SelectionSort implements Sort {
    @Override
    public int sort(int[] array) {
        int arraySwapCount = 0;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                arraySwapCount++;

            }
        }
        return arraySwapCount;
    }
}
