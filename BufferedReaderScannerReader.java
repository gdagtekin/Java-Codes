package algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class BufferedReaderScannerReader {

    public static void main(String[] args) {
        System.out.println("Buffered Reader");
        bufferedReader();
        System.out.println("Scanner Reader");
        scannerReader();
    }

    private static void bufferedReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String line = null;
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static void scannerReader() {
        File f = new File("text.txt");
        Scanner read = null;
        try {
            read = new Scanner(f);
            while (read.hasNextLine()) {
                System.out.println(read);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            read.close();
        }
    }
}
