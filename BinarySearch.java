package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {5, 7, 9, 11, 25, 38, 41, 58, 74, 87, 96};
        int first = 0, last = array.length, middle = first + last / 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int search = sc.nextInt();
        while (first <= last) {
            if (array[middle] == search) {
                System.out.println("Found at location " + middle + ".");

                break;
            } else if (array[middle] > search) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
            middle = first + last / 2;
        }
        if (first > last) {
            System.out.println("Not found");
        }

    }
}
