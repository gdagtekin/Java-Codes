package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class CoprimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        boolean isCoprime = calculateCoprime(number1, number2);
        if (isCoprime) {
            System.out.println("This numbers are coprime.");
        } else {
            System.out.println("This numbers are not coprime.");
        }
    }

    private static boolean calculateCoprime(int s1, int s2) {
        int temp;
        boolean isCoprime = true;
        if (s2 > s1) {
            temp = s2;
            s2 = s1;
            s1 = temp;
        }
        for (int i = 2; i <= s2; i++) {
            if (s1 % i == 0 && s2 % i == 0) {
                isCoprime = false;
            }
        }
        if (isCoprime) {
            return true;
        }
        return false;
    }

}
