package algorithms;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
public class BoxCollisions {

    Rectangle r;
    int vX, vY;

    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(640, 480);
        CollisionsPanel p = new CollisionsPanel();
        j.add(p);
        j.addMouseListener(p);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public BoxCollisions(int x, int y, int width, int height, int vX, int vY) {

        r = new Rectangle(x, y, width, height);
        this.vX = vX;
        this.vY = vY;

    }

    public void drawScreen(Graphics g) {
        g.drawRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
    }

    public void boxMove(BoxCollisions[] others, int number) {
        Rectangle temp = new Rectangle(r);
        temp .setLocation((int) temp .getX() + vX, (int) temp .getY() + vY);
        boolean isCollision = false;
        for (int i = 0; i < number; i++) {
            if ((!this.equals(others[i])) && temp .intersects(others[i].getRectangle())) {
                isCollision = true;
            }
        }
        if (temp .getX() < 0 || temp .getY() < 0 || temp .getX() > 620 - temp .getWidth() || temp .getY() > 460 - temp .getHeight()) {
            isCollision = true;
        }
        if (isCollision == false) {
            r.setLocation((int) r.getX() + vX, (int) r.getY() + vY);
        } else {
            vX = -vX;
            vY = -vY;
        }

    }

    public Rectangle getRectangle() {
        return r;
    }

}

class CollisionsPanel extends JPanel implements ActionListener, MouseListener {

    BoxCollisions[] otherBox;
    int step = 5;
    int n = 5;
    Timer time;
    Random random = new Random();

    public CollisionsPanel() {
        super();
        otherBox = new BoxCollisions[50];
        otherBox[0] = new BoxCollisions(10, 10, 20, 20, random.nextInt(10), random.nextInt(10));
        otherBox[1] = new BoxCollisions(150, 40, 20, 20, random.nextInt(10), random.nextInt(10));
        otherBox[2] = new BoxCollisions(60, 30, 20, 20, random.nextInt(10), random.nextInt(10));
        otherBox[3] = new BoxCollisions(110, 210, 20, 20, random.nextInt(10), random.nextInt(10));
        otherBox[4] = new BoxCollisions(110, 110, 20, 20, random.nextInt(10), random.nextInt(10));
        time = new Timer(40, this);
        time.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0, 0, 620, 460);
        for (int i = 0; i < n; i++) {
            otherBox[i].drawScreen(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < n; i++) {
            otherBox[i].boxMove(otherBox, n);
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("tıklanma");
        otherBox[n] = new BoxCollisions(e.getX(), e.getY(), 20, 20, random.nextInt(10), random.nextInt(10));
        n++;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
