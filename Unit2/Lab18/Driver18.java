package Lab18;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Driver18 extends JPanel {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.turnLeft(5.0D);

        for (int i=0;i<20;i++) {
            for (int k = 0; k < 4; ++k) {
                t.forward(200.0D);
                t.turnLeft(90.0D);

            }
            t.turnLeft(18.0D);
        }

        JFrame f = new JFrame();
        f.setSize(800, 600);
        f.setDefaultCloseOperation(3);
        f.setContentPane(new Driver18());
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(Turtle.getImage(), 0, 0, this.getWidth(), this.getHeight(), (ImageObserver)null);
    }
}