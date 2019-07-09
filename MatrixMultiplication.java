package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3}, {3, 4, 5}};
        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
