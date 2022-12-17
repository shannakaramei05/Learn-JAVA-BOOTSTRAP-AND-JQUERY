package Matrix;

import java.util.Arrays;
import java.util.Random;

public class MatrixGeneratorExample {
    public static void main(String[] args) {
        // String myMatrix = Arrays.deepToString(generateMatrix(3, 3));
        // System.out.println((myMatrix)); // cant indexing

        System.out.println(Arrays.deepToString(generateMatrix(3, 3)));
        // System.out.println(generateMatrix(3, 3));
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
}
