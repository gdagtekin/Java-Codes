package algorithms;

import java.util.Arrays;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2017
 */
public class QuickSort {

    int[] array = {2, 17, -4, 42, 9, 26, 11, 3, 5, 28};

    void quickSort(int[] a, int begin, int end) {
        int i = begin, j = end, h;
        int x = a[(begin + end) / 2];
        do {
            while (a[i] < x) {
                i++;
            }
            while (a[j] > x) {
                j--;
            }
            if (i <= j) {
                h = a[i];
                a[i] = a[j];
                a[j] = h;
                i++;
                j--;
            }
        } while (i <= j);
        if (begin < j) {
            quickSort(a, begin, j);
        }
        if (i < end) {
            quickSort(a, i, end);
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(qs.array));
        qs.quickSort(qs.array, 0, qs.array.length - 1);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(qs.array));
    }
}
