package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("\nFirst Method\n");
        int s1 = 0, s2 = 1, s3 = 0;
        System.out.println(s1);
        for (int i = 1; s1 + s2 < 1000; i++) {
            s3 = s1 + s2;
            System.out.println(s3);
            if (i % 2 == 0) {
                s1 = s3;
            } else {
                s2 = s3;
            }
        }

        System.out.println("\nSecond Method\n");
        fibonacci2(8);
    }

    public static void fibonacci2(int n) { //Second Method
        int s1 = 1, s2 = 1, s3 = 0;
        System.out.println(s3 + "\n" + s1 + "\n" + s2);
        for (int i = 2; i < n - 1; i++) {
            s3 = s1 + s2;
            s2 = s1;
            s1 = s3;
            System.out.println(s3);
        }

    }
}
