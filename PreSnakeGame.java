package algorithms;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
public class PreSnakeGame extends JFrame implements ActionListener, KeyListener {

    private int[] x = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    private int[] y = {30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
    private static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;
    private int direction = DOWN;
    private Timer t;
    private int xHead = x[x.length - 1], yHead = y[y.length - 1];

    public PreSnakeGame() {
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        t = new Timer(100, this);
        t.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (direction == UP) { // W/UP
            for (int i = 0; i < y.length - 1; i++) {
                y[i] = y[i + 1];
                x[i] = x[i + 1];
            }
            y[y.length - 1] -= 10;
            xHead = x[x.length - 1];
            yHead = y[y.length - 1];

        } else if (direction == DOWN) { // S/DOWN
            for (int i = 0; i < y.length - 1; i++) {
                y[i] = y[i + 1];
                x[i] = x[i + 1];
            }
            y[y.length - 1] += 10;
            xHead = x[x.length - 1];
            yHead = y[y.length - 1];
        } else if (direction == RIGHT) { // D/RIGHT

            for (int i = 0; i < y.length - 1; i++) {
                y[i] = y[i + 1];
                x[i] = x[i + 1];
            }
            x[x.length - 1] += 10;
            xHead = x[x.length - 1];
            yHead = y[y.length - 1];
        } else if (direction == LEFT) { // A/LEFT
            for (int i = 0; i < y.length - 1; i++) {
                y[i] = y[i + 1];
                x[i] = x[i + 1];
            }
            x[x.length - 1] -= 10;
            xHead = x[x.length - 1];
            yHead = y[y.length - 1];
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        repaint();
        g.setColor(Color.red);
        for (int i = 0; i < x.length; i++) {
            g.fillRect(x[i], y[i], 20, 20);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(PreSnakeGame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        PreSnakeGame d = new PreSnakeGame();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tus = e.getKeyCode();
        if ((tus == KeyEvent.VK_A || tus == KeyEvent.VK_LEFT) && direction != RIGHT) {
            direction = LEFT;
        }
        if ((tus == KeyEvent.VK_D || tus == KeyEvent.VK_RIGHT) && direction != LEFT) {
            direction = RIGHT;
        }
        if ((tus == KeyEvent.VK_S || tus == KeyEvent.VK_DOWN) && direction != UP) {
            direction = DOWN;
        }
        if ((tus == KeyEvent.VK_W || tus == KeyEvent.VK_UP) && direction != DOWN) {
            direction = UP;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
