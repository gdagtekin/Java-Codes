package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class DeleteWordInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        System.out.println("Enter a word in string: ");
        String word = sc.nextLine();
        String deletedSentences = deleteWord(string, word);
        System.out.println(deletedSentences);
    }

    private static String deleteWord(String sentence, String word) {

        int index = sentence.indexOf(word);
        int stringLength = word.length();
        while (index >= 0) {
            sentence = sentence.substring(0, index) + sentence.substring((index + 1 + stringLength));
            index = sentence.indexOf(word);
        }
        return sentence;

    }
}
