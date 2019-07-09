package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int remaining;
        String result = "";
        while (2 <= number) {
            remaining = number % 2;
            number = number / 2;
            result = remaining + result;
        }
        result = number + result;
        System.out.println(result);

    }
}
