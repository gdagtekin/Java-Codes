package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2019
 */
public class PointInTriangleTest {

    public static void main(String[] args) {

        double AX = 1.0, AY = 1.0;
        double BX = 1.0, BY = 5.0;
        double CX = 5.0, CY = 4.0;
        double PX = 2.0, PY = 3.0; // Inside the triangle
        //double PX = 4.0, PY = 2.0; // Outside the triangle
        //double PX = 1.0, PY = 4.0; // Above the triangle

        double bX = BX - AX;
        double bY = BY - AY;
        double cX = CX - AX;
        double cY = CY - AY;
        double x = PX - AX;
        double y = PY - AY;

        double d = (bX * cY) - (cX * bY);
        double WA = ((x * (bY - cY)) + (y * (cX - bX)) + ((bX * cY) - (cX * bY))) / d;
        double WB = ((x * cY) - (y * cX)) / d;
        double WC = ((y * bX) - (x * bY)) / d;
        System.out.println("d: " + String.valueOf(d));
        System.out.println("WA: " + String.valueOf(WA));
        System.out.println("WB: " + String.valueOf(WB));
        System.out.println("WC: " + String.valueOf(WC) + "\n");

        /**
         * If WA, WB, WC bigger than 0 and lower than 0 = inside the triangle
         *
         * If not = outside the triangle
         *
         * If equals to 0 = above the triangle
         */
        if ((WA <= 1.0 && WA > 0.0) && (WB <= 1.0 && WB > 0.0) && (WC <= 1.0 && WC > 0.0)) {
            System.out.println("Inside the triangle.");
        } else if ((Math.abs(WA) == 0.00) || (Math.abs(WB) == 0.00) || (Math.abs(WC) == 0.00)) {
            System.out.println("Above the triangle.");
        } else {
            System.out.println("Outside the triangle.");
        }

    }
}
