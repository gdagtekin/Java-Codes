package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
public class CreditCardValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number: ");
        String creditCardNumber = sc.next();
        int[] cardNumber = new int[16];
        for (int i = 0; i < creditCardNumber.length(); i++) {
            cardNumber[i] = (int) (creditCardNumber.charAt(i) - 48);
        }
        boolean isCreditCardTrue = checkCreditCard(cardNumber);
        if (isCreditCardTrue) {
            System.out.println("Credit card number is correct.");
            if (cardNumber[0] == 3) {
                System.out.println("American Express");
            } else if (cardNumber[0] == 4) {
                System.out.println("Visa");
            } else if (cardNumber[0] == 5) {
                System.out.println("MasterCard");
            } else if (cardNumber[0] == 6) {
                System.out.println("Discover");
            }
        } else {
            System.out.println("Credit card number is incorrect.");
        }

    }

    private static boolean checkCreditCard(int[] cardNumber) {
        int sum1 = 0, sum2 = 0, remaining, totalSum, temp;
        for (int i = 1; i <= cardNumber.length; i++) {
            if (i % 2 == 0) {
                sum2 += cardNumber[i - 1];
            }
            if (i % 2 == 1) {
                temp = cardNumber[i - 1] * 2;
                if (temp > 9) {
                    remaining = temp % 10;
                    temp /= 10;
                    temp += remaining;
                    sum1 += temp;
                } else {
                    sum1 += cardNumber[i - 1] * 2;
                }
            }
        }
        totalSum = sum1 + sum2;
        if (totalSum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
