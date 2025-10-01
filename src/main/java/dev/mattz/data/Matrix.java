package dev.mattz.data;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private final int[][] matrix;
    private int rowCount;
    private int columnCount;

    public Matrix(int rowCount, int columnCount) {
        matrix = new int[rowCount][columnCount];
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public Matrix(int size) {
        matrix = new int[size][size];
        this.rowCount = this.columnCount = size;
    }

    public Matrix(int[][] matrix) {
        this.matrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                this.matrix[row][column] = matrix[row][column];
            }
            //System.arraycopy(matrix[column], 0, this.matrix[column], 0, matrix[0].length);
        }
        this.rowCount = matrix.length;
        this.columnCount = matrix[0].length;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public int getValue(int row, int column) {
        return matrix[row][column];
    }

    public void setValue(int value, int row, int column) {
        matrix[row][column] = value;
    }


    public void swapRows(int row1, int row2) {
        for (int column = 0; column < columnCount; column++) {
            int temp = matrix[row1][column];
            matrix[row1][column] = matrix[row2][column];
            matrix[row2][column] = temp;
        }
    }

    public void swapColumns(int column1, int column2) {
        for (int row = 0; row < rowCount; row++) {
            int temp = matrix[row][column1];
            matrix[row][column1] = matrix[row][column2];
            matrix[row][column2] = temp;
        }
    }

    public void mirrorRows() {
        for (int row = 0; row < rowCount / 2; row++) {
            swapRows(row, matrix.length - 1 - row);
        }
    }

    public void mirrorColumns() {
        for (int column = 0; column < columnCount / 2; column++) {
            swapColumns(column, matrix[0].length - 1 - column);
        }
    }


    public void createSectors() {
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                if (row == column || row + column == columnCount - 1) matrix[row][column] = 0;
                else if (row < column && row + column < columnCount - 1) matrix[row][column] = 1;
                else if (row < column && row + column > columnCount - 1) matrix[row][column] = 2;
                else if (row > column && row + column > columnCount - 1) matrix[row][column] = 3;
                else if (row > column && row + column < columnCount - 1) matrix[row][column] = 4;
            }
        }
    }

    public void fillWithRandom(int min, int max) {
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Random r = new Random();
                int randomInt = r.nextInt(min, max);
                matrix[row][column] = randomInt;
            }
        }
    }

    public void clear() {
        for (int[] ints : matrix) {
            Arrays.fill(ints, 0);
        }
    }
}
