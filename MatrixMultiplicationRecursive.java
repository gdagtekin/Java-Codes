package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */

public class MatrixMultiplicationRecursive {

    public static int[][] mat3 = new int[2][2];

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int i = 0, j = 0, k = 0;
        System.out.println("\n");
        int[][] mMatrix = calculateMatrix(matrix1, matrix2, i, j, k);
        for (int l = 0; l < matrix1.length; l++) {
            for (int m = 0; m < matrix2.length; m++) {
                System.out.print(mMatrix[l][m] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] calculateMatrix(int[][] matrix1, int[][] matrix2, int i, int j, int k) {
        if (matrix1.length > i) {
            if (matrix2[0].length > j) {
                if (matrix2.length > k) {
                    mat3[i][j] += matrix1[i][k] * matrix2[k][j];
                    return calculateMatrix(matrix1, matrix2, i, j, k + 1);
                }
                return calculateMatrix(matrix1, matrix2, i, j + 1, 0);
            }
            return calculateMatrix(matrix1, matrix2, i + 1, 0, 0);
        } else {
            return mat3;
        }
    }
}
