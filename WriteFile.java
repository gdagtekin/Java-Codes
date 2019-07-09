package algorithms;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class WriteFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        File f = new File("text.txt");
        PrintWriter p = null;
        try {
            p = new PrintWriter(new FileOutputStream(f, true)/*f*/);
            if (!f.exists()) {
                f.createNewFile();
            }
            p.println(sentence);
            p.close();
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            p.close();
        }
    }

}
