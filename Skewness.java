/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2021
 */
public class Skewness {
    
    private double skewness(double[] data, double mean, boolean unbiased) {
        double s2 = 0;
        double s3 = 0;
        int n = data.length;
        double skewness = 0;

        for (int i = 0; i < n; i++) {
            double dev = data[i] - mean;

            s2 += dev * dev;
            s3 += dev * dev * dev;
        }

        double m2 = s2 / n;
        double m3 = s3 / n;

        double g = m3 / (Math.pow(m2, (3 / 2.0)));

        if (unbiased) {
            double a = Math.sqrt((n * (n - 1)));
            double b = n - 2;
            skewness = (a / b) * g;
        } else {
            skewness = g;
        }

        return skewness;
    }
}
