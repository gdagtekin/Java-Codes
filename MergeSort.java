package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2017
 */
public class MergeSort {

    static int a[] = {12, 9, 4, 99, 120, 1, 3, 10};

    public static void main(String[] args) {
        System.out.println("Before sorting:");
        getArray(a);
        mergeSort(0, a.length-1);
        System.out.println("\n\nAfter sorting:");
        getArray(a);
        System.out.println("");
    }

    static void mergeSort(int begin, int end) {
        if (begin < end) {
            int m = (begin + end) / 2;
            mergeSort(begin, m);
            mergeSort(m + 1, end);
            merge(begin, m, end);
        }
    }

    static void merge(int begin, int m, int end) {
        int[] b = new int[8];
        int i, j, k;
        for (i = begin; i <= end; i++) {
            b[i] = a[i];
        }
        i = begin;
        j = m + 1;
        k = begin;
        while (i <= m && j <= end) {
            if (b[i] <= b[j]) {
                a[k++] = b[i++];
            } else {
                a[k++] = b[j++];
            }
        }
        while (i <= m) {
            a[k++] = b[i++];
        }
    }

    static void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
