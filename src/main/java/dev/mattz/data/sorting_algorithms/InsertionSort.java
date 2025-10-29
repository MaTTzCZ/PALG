package dev.mattz.data.sorting_algorithms;

public class InsertionSort implements Sort {
    @Override
    public int sort(int[] array) {
        int arraySwapCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int currentMax = i + 1;
                do {
                    if (array[currentMax - 1] > array[currentMax]) {
                        arraySwapCount++;
                        int temp = array[currentMax - 1];
                        array[currentMax - 1] = array[currentMax];
                        array[currentMax] = temp;
                        currentMax--;
                    } else break;

                } while (currentMax > 0);
            }
        }
        return arraySwapCount;
    }
}
