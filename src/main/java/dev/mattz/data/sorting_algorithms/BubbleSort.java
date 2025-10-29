package dev.mattz.data.sorting_algorithms;

public class BubbleSort implements Sort {
    public BubbleSort() {
    }

    @Override
    public int sort(int[] array) {
        int arraySwapCount = 0;
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    arraySwapCount++;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
        return arraySwapCount;
    }
}
