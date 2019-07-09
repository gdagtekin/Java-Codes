package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2017
 */
public class SelectionSort {

    
    int[] a = {17, 3, 86, -9, 7, -11, 38};

    void selectionSort(int[] array) {
        int temp;
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        System.out.println("\nBefore sorting:");
        ss.getArray(ss.a);
        ss.selectionSort(ss.a);
        System.out.println("\n\nAfter sorting:");
        ss.getArray(ss.a);
    }
}
