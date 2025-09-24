package dev.mattz;

import data.Matrix;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix = new Matrix(array);
        matrix.swapColumns(0, 1);
        System.out.println(matrix);

        Matrix matrix1 = new Matrix(10, 10);
        matrix1.fillWithRandom(2, 20);
        matrix1.simplify();
        System.out.println(matrix1);
    }
}