package algorithms;


/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2017
 */
public class InsertionSort {
    
    int[] a = {5, 2, 4, 6, 1, 3};
    
    void insertionSort(int[] arr) {
        int i, j, temp;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before sorting:");
        insertionSort.getArray(insertionSort.a);
        insertionSort.insertionSort(insertionSort.a);
        System.out.println("\n\nAfter sorting:");
        insertionSort.getArray(insertionSort.a);
        System.out.println("");
    }
    
}
