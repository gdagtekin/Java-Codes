/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2021
 */
import org.apache.commons.math3.util.FastMath;

public class Entropy{

    // Entropy of grayscale image
    // -sum(p.*log2(p))
    private double entropy(double[] data) {
        double[] bins = new double[256];
        double entro = 0.0;
        double binsA = 1.0 / 255.0;
        for (int i = 0; i < bins.length; i++) {
            bins[i] = binsA * i;
        }
    
        double[] freq = new double[256];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < freq.length - 1; j++) {
                if (bins[j] < data[i] + (binsA / 2.0) && bins[j + 1] >= (data[i] + (binsA / 2.0))) {
                    freq[j]++;
                    break;
                }
            }
        }
    
        double p = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                p = freq[i] / data.length;
                entro -= p * FastMath.log(2, p);
            }
        }
        return entro;
    }
}