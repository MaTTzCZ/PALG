package data;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int width, int height) {
        matrix = new int[height][width];
    }

    public Matrix(int[][] matrix) {
        this.matrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                this.matrix[row][column] = matrix[row][column];
            }
            //System.arraycopy(matrix[column], 0, this.matrix[column], 0, matrix[0].length);
        }
    }

    public int getColumnCount() {
        return matrix[0].length;
    }

    public int getRowCount() {
        return matrix.length;
    }

    public int getValue(int row, int column) {
        return matrix[column][row];
    }

    public void setValue(int value, int row, int column) {
        matrix[row][column] = value;
    }


    public void swapRows(int row1, int row2) {
        for (int column = 0; column < matrix[0].length; column++) {
            int temp = matrix[row1][column];
            matrix[row1][column] = matrix[row2][column];
            matrix[row2][column] = temp;
        }
    }

    public void swapColumns(int column1, int column2) {
        for (int row = 0; row < matrix.length; row++) {
            int temp = matrix[row][column1];
            matrix[row][column1] = matrix[row][column2];
            matrix[row][column2] = temp;
        }
    }

    public void clear() {
        int rows = matrix.length;
        int columns = matrix[0].length;
        matrix = new int[rows][columns];
    }

    public void simplify() {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                if (column == row || column + row == columnCount - 1) matrix[row][column] = 0;
                else if (column > row && column + row < columnCount - 1) matrix[row][column] = 1;
                else if (column > row && column + row > columnCount - 1) matrix[row][column] = 2;
                else if (column < row && column + row > columnCount - 1) matrix[row][column] = 3;
                else if (column < row && column + row < columnCount - 1) matrix[row][column] = 4;
            }
        }
    }

    public void fillWithRandom(int min, int max) {
        for (int column = 0; column < matrix.length; column++) {
            for (int row = 0; row < matrix[0].length; row++) {
                Random r = new Random();
                int randomInt = r.nextInt(min, max);
                matrix[column][row] = randomInt;
            }
        }
    }

    @Override
    public String toString() {
        for (int column = 0; column < matrix.length; column++) {
            System.out.print("|");
            for (int row = 0; row < matrix[0].length; row++) {
                System.out.printf(" %2d ", matrix[column][row]);
            }
            System.out.print("|\n");
        }
        return Arrays.deepToString(matrix);
    }
}
