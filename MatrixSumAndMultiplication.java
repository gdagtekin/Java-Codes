package algorithms;
/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class MatrixSumAndMultiplication {

    public static void main(String[] args) {
        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];
        int[][] sumMatrix = new int[4][4];
        int[][] mulMatrix = new int[4][4];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = (int) (Math.random() * 5);
                matrix2[i][j] = (int) (Math.random() * 5);
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1.length; k++) {
                System.out.print(matrix1[i][k] + " ");
            }
            System.out.print("\t");
            for (int l = 0; l < matrix1.length; l++) {
                System.out.print(matrix2[i][l] + " ");
            }
            if (i == 1) {
                System.out.print("\tSum\t");
            } else {
                System.out.print("\t\t");
            }
            for (int j = 0; j < matrix1.length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            if (i == 1) {
                System.out.print("\tMult\t");
            } else {
                System.out.print("\t\t");
            }

            for (int j = 0; j < matrix1.length; j++) {
                mulMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.print(mulMatrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
