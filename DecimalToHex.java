package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN 
 * 
 * 2015
 */
public class DecimalToHex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String sonuc = "";
        int kalan;

        while (number > 0) {
            kalan = number % 16;
            sonuc = hex[kalan] + sonuc;
            number = number / 16;
        }
        System.out.println("Result = " + sonuc);

    }
}
