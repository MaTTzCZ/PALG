package dev.mattz;

import dev.mattz.data.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4);
        matrix.fillWithRandom(1, 20);
        printMatrix(matrix);
        long startTime = System.nanoTime();
        matrix.mirrorColumns();
        long endTime = System.nanoTime();
        double duration = endTime - startTime;
        System.out.println("Time taken: " + duration / 1000000 + " ms");
        printMatrix(matrix);
    }

    private static void printMatrix(Matrix matrix) {
        int rowCount = matrix.getRowCount();
        int columnCount = matrix.getColumnCount();
        for (int row = 0; row < rowCount; row++) {
            System.out.print("|");
            for (int column = 0; column < columnCount; column++) {
                System.out.printf(" %2d ", matrix.getValue(row, column));
            }
            System.out.println("|");
        }
    }
}