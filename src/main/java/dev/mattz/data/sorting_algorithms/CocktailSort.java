package dev.mattz.data.sorting_algorithms;

public class CocktailSort implements Sort {
    public CocktailSort() {
    }

    @Override
    public int sort(int[] array) {
        boolean swap;
        int arraySwapCount = 0;
        int min = 0;
        int max = array.length - 1;
        do {
            swap = false;
            for (int i = 0; i < max; i++) {
                if (array[i] > array[i + 1]) {
                    arraySwapCount++;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }
            max--;
            for (int i = max; i > min; i--) {
                if (array[i] > array[i - 1]) {
                    arraySwapCount++;
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swap = true;
                }
            }
            min++;
        } while (swap);
        return arraySwapCount;
    }
}
