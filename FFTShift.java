/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2021
 */
public class FFTShift {

    /**
     * shift zero frequency to center, or vice verse, 2D.
     *
     * @param data     the double data to be shifted
     * @param bComplex true: complex; false: real
     * @param bSign    true: fftshift; false: ifftshift
     * @return the fft shifted array
     */
    private double[][] fftshift(double[][] data, boolean bComplex, boolean bSign) {
        int step = 1;
        if (bComplex) step = 2;
        int height = data.length;

        int width = data[0].length / step;

        double[][] revan = new double[data.length][data[0].length];

        int pH = 0;
        int pW = 0;
        if (bSign) {
            pH = (int) Math.ceil(height / 2.0);
            pW = (int) Math.ceil(width / 2.0);
        } else {
            pH = (int) Math.floor(height / 2.0);
            pW = (int) Math.floor(width / 2.0);
        }
        int i = 0;
        int j = 0;
        if (step == 1) {
            for (j = pH; j < height; j++) {
                for (i = pW; i < width; i++) {
                    revan[j - pH][i - pW] = data[j][i];
                }
                for (i = 0; i < pW; i++) {
                    revan[j - pH][i + width - pW] = data[j][i];
                }
            }
            for (j = 0; j < pH; j++) {
                for (i = pW; i < width; i++) {
                    revan[j + height - pH][i - pW] = data[j][i];
                }
                for (i = 0; i < pW; i++) {
                    revan[j + height - pH][i + width - pW] = data[j][i];
                }
            }
        } else {
            for (j = pH; j < height; j++) {
                for (i = pW; i < width; i++) {
                    revan[j - pH][(i - pW) * 2] = data[j][i * 2];
                    revan[j - pH][(i - pW) * 2 + 1] = data[j][i * 2 + 1];
                }
                for (i = 0; i < pW; i++) {
                    revan[j - pH][(i + width - pW) * 2] = data[j][i * 2];
                    revan[j - pH][(i + width - pW) * 2 + 1] = data[j][i * 2 + 1];
                }
            }
            for (j = 0; j < pH; j++) {
                for (i = pW; i < width; i++) {
                    revan[j + height - pH][(i - pW) * 2] = data[j][i * 2];
                    revan[j + height - pH][(i - pW) * 2 + 1] = data[j][i * 2 + 1];
                }
                for (i = 0; i < pW; i++) {
                    revan[j + height - pH][(i + width - pW) * 2] = data[j][i * 2];
                    revan[j + height - pH][(i + width - pW) * 2 + 1] = data[j][i * 2 + 1];
                }
            }
        }
        return revan;
    }
}

