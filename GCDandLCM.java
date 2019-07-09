package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int s1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int s2 = sc.nextInt();
        int[] result = GCD_LCM(s1, s2);
        System.out.println("GCD: " + result[0] + "\nLCM: " + result[1]);
    }
    
    public static int[] GCD_LCM(int number1, int number2) {
        int[] gcdLCM = {1, 1};
        int dividing = 2;
        while (number1 != 1 || number2 != 1) {
            if (number1 % dividing == 0 && number2 % dividing == 0) {
                number1 /= dividing;
                number2 /= dividing;
                gcdLCM[0] *= dividing;
                gcdLCM[1] *= dividing;
            } else if (number1 % dividing == 0 || number2 % dividing == 0) {
                if (number1 % dividing == 0) {
                    number1 /= dividing;
                }
                if (number2 % dividing == 0) {
                    number2 /= dividing;
                }
                gcdLCM[1] *= dividing;
            } else {
                boolean check;
                for (int i = 2; i < number1 * number2; i++) {
                    dividing++;
                    check = true;
                    for (int j = 2; j < dividing; j++) {
                        if (dividing % j == 0) {
                            check = false;
                        }
                    }
                    if (check) {
                        break;
                    }
                }
            }
        }
        return gcdLCM;
    }
}
