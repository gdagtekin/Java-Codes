package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class FindUppercaseCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String string = sc.nextLine();
        System.out.println(findUppercase(string));

    }

    public static int findUppercase(String s1) {
        int uppercaseCharacter = 0;
        for (int i = 0; i < s1.length(); i++) {
            int ascii = (int) s1.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                uppercaseCharacter++;
            }
        }
        return uppercaseCharacter;
    }
}
