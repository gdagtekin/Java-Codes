package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class IndexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String string1 = sc.nextLine();
        System.out.println("Enter a word/sentence: ");
        String string2 = sc.nextLine();
        System.out.println(findIndex(string1, string2));
    }

    public static int findIndex(String s1, String s2) {
        char[] array1 = new char[s1.length()];
        char[] array2 = new char[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            array1[i] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            array2[i] = s2.charAt(i);
        }

        int counter = 0;
        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (array1[j + i] == array2[j]) {
                    counter++;
                    if (counter == s2.length()) {
                        return i;
                    }
                } else {
                    counter = 0;
                    break;
                }
            }
        }
        return -1;
    }

}
