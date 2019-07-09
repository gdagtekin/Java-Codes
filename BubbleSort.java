package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN 
 * 
 * 2015
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[]{54, 2, 87, 56, 4, 36, 1, 85, 4, 25, 78, 62, 12, 36, 45, 3};

        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

    }

}
