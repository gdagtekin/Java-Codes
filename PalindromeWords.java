package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class PalindromeWords {

    public static void main(String[] args) {
        String[] words = {"anna", "civic", "moon", "stats", "cat", "book"};
        int[] results = palindrome(words);
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 1) {
                System.out.println(words[i] + " is palindrom.");
            } else {
                System.out.println(words[i] + " is not palindrom.");
            }
        }
    }

    private static int[] palindrome(String[] wordArray) {
        int[] results = new int[wordArray.length];
        char inverse;
        String terskelime = "";

        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 1; j <= wordArray[i].length(); j++) {
                inverse = wordArray[i].charAt(wordArray[i].length() - j);
                terskelime = terskelime + inverse;
            }
            if (wordArray[i].compareTo(terskelime) == 0) {
                results[i] = 1;
            } else {
                results[i] = 0;
            }
            terskelime = "";
        }
        return results;
    }
}
