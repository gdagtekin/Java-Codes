package algorithms;

import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
public class CircleAnim extends JFrame implements Runnable {

    int x = 550;
    Draw c;

    public CircleAnim() {
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = new Draw();
        add(c);
    }

    public static void main(String[] args) {
        CircleAnim cem = new CircleAnim();
        Thread t = new Thread(cem);
        t.start();
    }
    boolean state = false;

    public void run() {
        while (true) {
            if (state == false) {
                if (x > 50) {
                    x--;
                } else {
                    state = true;
                }
            }
            if (state) {
                if (x < 550) {
                    x++;
                } else {
                    state = false;
                }
            }
            try {
                Thread.sleep(5);
            } catch (Exception e) {

            }
            c.repaint();
        }
    }

    class Draw extends JPanel {

        public void paint(Graphics g) {
            super.paint(g);
            g.fillOval((getWidth() / 2) - x / 2, (getHeight() / 2) - x / 2, x, x);
        }
    }
}
