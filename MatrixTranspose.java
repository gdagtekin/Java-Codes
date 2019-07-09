package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = new int[2][2];
        int i = 0, j = 0;
        int[][] transposeMatrix = calculateTransposeMatrix(matrix1, matrix2, i, j);
        for (int k = 0; k < transposeMatrix.length; k++) {
            for (int l = 0; l < transposeMatrix[0].length; l++) {
                System.out.print(transposeMatrix[k][l] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] calculateTransposeMatrix(int[][] matrix1, int[][] matrix2, int i, int j) {
        if (matrix1.length > i) {
            if (matrix1[0].length > j) {
                matrix2[j][i] = matrix1[i][j];
                return calculateTransposeMatrix(matrix1, matrix2, i, j + 1);
            }
            return calculateTransposeMatrix(matrix1, matrix2, i + 1, 0);

        } else {
            return matrix2;
        }
    }

}
