/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2021
 */
public class BiasedKurtosis {
    private double biasedKurtosis(double[] data) {
        double n = 0, mean = 0, M2 = 0, M3 = 0, M4 = 0, delta, delta_n, delta_n2, term1, kurtosis, n1;
        for (double x : data) {
            n1 = n;
            n = n + 1;
            delta = x - mean;
            delta_n = delta / n;
            delta_n2 = delta_n * delta_n;
            term1 = delta * delta_n * n1;
            mean = mean + delta_n;
            M4 = M4 + term1 * delta_n2 * (n * n - 3 * n + 3) + 6 * delta_n2 * M2 - 4 * delta_n * M3;
            M3 = M3 + term1 * delta_n * (n - 2) - 3 * delta_n * M2;
            M2 = M2 + term1;
        }
        kurtosis = (n * M4) / (M2 * M2) - 3;
        return kurtosis;
    }
}
