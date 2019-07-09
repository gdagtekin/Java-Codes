package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentences = sc.nextLine();
        System.out.println("Enter the number of shifts: ");
        int shift = sc.nextInt();
        sentences = sentences.replace(" ", "");
        String encryptedText = "";
        for (int i = 0; i < sentences.length(); i++) {
            char character = sentences.charAt(i);
            encryptedText += (char) (((int) character + shift - 97) % 26 + 97);
        }
        System.out.println("Encrypted Text = " + encryptedText);
    }
}
