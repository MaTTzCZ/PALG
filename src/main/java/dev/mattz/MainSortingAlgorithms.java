package dev.mattz;

import dev.mattz.data.data_strctures.ArraysUtils;
import dev.mattz.data.sorting_algorithms.*;

import java.util.Arrays;

public class MainSortingAlgorithms {
    public static void main(String[] args) {
        ArraysUtils utils = new ArraysUtils();
        Sort bubbleSort = new BubbleSort();
        Sort cocktailSort = new CocktailSort();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();


        int[] nums = utils.createArray(6000, 1, 20);
        System.out.println("Pole před setříděním: " + Arrays.toString(nums));

        long bubbleSortStartTime = System.nanoTime();
        int bubbleSortSwapCount = bubbleSort.sort(Arrays.copyOf(nums, nums.length));
        long bubbleSortEndTime = System.nanoTime();
        System.out.println("Bubble sort time: " + (bubbleSortEndTime - bubbleSortStartTime) / 1000 + " ms");
        System.out.println("Bubble sort array swaps : " + bubbleSortSwapCount);

        long cocktailSortStartTime = System.nanoTime();
        int cocktailSortSwapCount = cocktailSort.sort(Arrays.copyOf(nums, nums.length));
        long cocktailSortEndTime = System.nanoTime();
        System.out.println("Cocktail sort time: " + (cocktailSortEndTime - cocktailSortStartTime) / 1000 + " ms");
        System.out.println("Cocktail sort array swaps : " + cocktailSortSwapCount);

        long selectionSortStartTime = System.nanoTime();
        int selectionSortSwapCount = selectionSort.sort(Arrays.copyOf(nums, nums.length));
        long selectionSortEndTime = System.nanoTime();
        System.out.println("Selection sort time: " + (selectionSortEndTime - selectionSortStartTime) / 1000 + " ms");
        System.out.println("Selection sort array swaps : " + selectionSortSwapCount);

        long insertionSortStartTime = System.nanoTime();
        int insertionSortSwapCount = insertionSort.sort(Arrays.copyOf(nums, nums.length));
        long insertionSortEndTime = System.nanoTime();
        System.out.println("Insertion sort time: " + (insertionSortEndTime - insertionSortStartTime) / 1000 + " ms");
        System.out.println("Insertion sort array swaps : " + insertionSortSwapCount);
    }
}
