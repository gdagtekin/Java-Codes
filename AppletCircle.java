package algorithms;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2015
 */

public class AppletCircle extends JApplet implements Runnable {

    int x, y, r, counter = 0;
    boolean isSmall = true;

    public void init() {
        r = 20;
        (new Thread(AppletCircle.this)).start();
    }

    public void start() {
        x = getWidth() / 2;
        y = getHeight() / 2;
        counter = 0;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x - r, y - r, r + r, r + r);

    }

    public void run() {
        while (true) {
            if (r + r > getHeight()) {
                counter++;
                isSmall = false;
            }
            if (isSmall) {
                r = r + 10;
            }
            if (!isSmall) {
                r = r - 10;
            }
            if (r + r < 20) {
                isSmall = true;
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            if (counter == 5) {
                return;
            }
            repaint();
        }

    }
}
