package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2017
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {5, -5, 1, 47, 2, 65, -44, 8, 5, 21, 58, 3};
        shellSort(array, array.length);
    }

    public static void shellSort(int[] p, int size) {
        int i, j, k, temp;
        for (k = size; k > 1;) {
            k = (k < 5) ? 1 : ((k * 5 - 1) / 11);
            for (i = k - 1; ++i < size;) {
                temp = p[i];
                for (j = i; p[j - k] > temp;) {
                    p[j] = p[j - k];
                    if ((j -= k) < k) {
                        break;
                    }
                }
                p[j] = temp;
            }
        }
        for (int l = 0; l < p.length; l++) {
            System.out.print(p[l] + " ");
        }
    }
}
