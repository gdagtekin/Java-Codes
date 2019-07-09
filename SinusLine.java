package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SinusLine extends JFrame {

    public SinusLine() {
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        DrawClass draw = new DrawClass();
        add(draw);
    }

    public static void main(String[] args) {
        SinusLine c = new SinusLine();
    }

    class DrawClass extends JPanel {

        public void paint(Graphics g) {
            super.paint(g);
            for (double i = 0; i < 12.56; i += 0.01) {
                g.drawLine(
                        10 + (int) (20 * i),
                        100 - (int) (20 * (Math.sin(i))),
                        10 + (int) (20 * (i + 0.1)),
                        100 - (int) (20 * (Math.sin(i + 0.1))));

            }

        }
    }

}
