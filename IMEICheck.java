package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class IMEICheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IMEI number(15 Character): ");
        String IMEINumber = sc.next();
        int[] IMEINumberArray = new int[15];
        for (int i = 0; i < IMEINumber.length(); i++) {
            IMEINumberArray[i] = (int) (IMEINumber.charAt(i) - 48);
        }
        boolean isIMEICorrect = checkIMEI(IMEINumberArray);
        if (isIMEICorrect) {
            System.out.println("IMEI number is correct");
        } else {
            System.out.println("IMEI number is incorrect");
        }

    }

    private static boolean checkIMEI(int[] imei) {
        int sum1 = 0, sum2 = 0, remaining, totalSum;
        for (int i = 1; i <= imei.length; i++) {
            if (i % 2 == 0) {
                int temp = imei[i - 1] * 2;
                if (temp > 9) {
                    remaining = temp % 10;
                    temp /= 10;
                    temp += remaining;
                    sum1 += temp;
                } else {
                    sum1 += imei[i - 1] * 2;
                }
            }
            if (i % 2 == 1) {
                sum2 += imei[i - 1];
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
