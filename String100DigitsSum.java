package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */
public class String100DigitsSum {

    public static void main(String[] args) {
        String number1 = "1516128418446468467446844644513131647416113161647357432697524741279251754179145272137258929757917554";
        String number2 = "1516128418446468467446844644513131647416113161647357432697524741279251754179145272137258929757917554";
        String[] sum = new String[number1.length()];
        int remaning = 0, tempNum1, tempNum2, tempSum;
        for (int i = number1.length() - 1; 0 <= i; i--) {
            String d1 = String.valueOf(number1.charAt(i));
            tempNum1 = Integer.parseInt(d1);
            String d2 = String.valueOf(number2.charAt(i));
            tempNum2 = Integer.parseInt(d2);
            tempSum = tempNum1 + tempNum2 + remaning;
            if (tempSum > 9) {
                sum[i] = Integer.toString(tempSum % 10);
                remaning = 1;
            } else {
                remaning = 0;
                sum[i] = Integer.toString(tempSum);
            }

        }
        for (int i = 0; i < number1.length(); i++) {
            System.out.print(sum[i]);
        }

    }
}
