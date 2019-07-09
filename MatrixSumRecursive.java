package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */

public class MatrixSumRecursive {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix3 = new int[2][2];
        int i = 0, j = 0;
        int[][] resultMatrix = calculateMatrixSum(matrix1, matrix2, matrix3, i, j);
        for (int k = 0; k < resultMatrix.length; k++) {
            for (int l = 0; l < resultMatrix[0].length; l++) {
                System.out.print(resultMatrix[k][l] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] calculateMatrixSum(int matrix1[][], int[][] matrix2, int[][] matrix3, int i, int j) {
        if (matrix1.length > i) {
            if (matrix2[0].length > j) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                return calculateMatrixSum(matrix1, matrix2, matrix3, i, j + 1);
            }
            return calculateMatrixSum(matrix1, matrix2, matrix3, i + 1, 0);
        } else {
            return matrix3;
        }

    }
}
