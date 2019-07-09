package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class Josephus_Problem {

    public static void main(String[] args) {

        int place = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int numberOfPeople = sc.nextInt();
        for (int i = 0; i <= (int) Math.sqrt(numberOfPeople); i++) {
            if (numberOfPeople >= Math.pow(2, i)) {
                place = (int) Math.pow(2, i);
            } else {
                break;
            }
        }
        int l = numberOfPeople - place;
        int result = (2 * l) + 1;
        System.out.println("The place of the person who will survive: " + result);
    }
}
