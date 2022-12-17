package Matrix;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class MatrixSerialMultiplierExample {
    public static void main(String[] args) {
        int[][] firstMatrix = generateMatrix(3, 3);
        int[][] secondMatrix = generateMatrix(3, 3);

        // checking time
        Date start = new Date();
        System.out.println(Arrays.deepToString(multiplyMatrix(firstMatrix, secondMatrix)));
        Date end = new Date();
        System.out.printf("Total time take : %d mili seconds ", end.getTime() - start.getTime());
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] myMatrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myMatrix[i][j] = random.nextInt() * 10;
            }
        }
        return myMatrix;
    }

    public static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int row1 = firstMatrix.length;
        int column1 = firstMatrix[0].length;
        int column2 = secondMatrix[0].length;

        int[][] result = new int[row1][column1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < column1; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return result;
    }
}
