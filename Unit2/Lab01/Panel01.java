package Lab01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel01 extends JPanel {
    public void paintComponent(Graphics g) {
        //Draw Sky
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 400, 400);

        //Draw Grass
        g.setColor(Color.GREEN.darker());
        g.fillRect(0, 350, 400, 350);

        //Draw House Body
        g.setColor(Color.GREEN);
        g.fillRect(100, 200, 150, 150);

        //Draw Roof
        g.setColor(Color.RED);
        g.fillRect(150, 275, 50, 75);
        int[] xPoints = new int[]{75, 175, 275};
        int[] yPoints = new int[]{200, 150, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        //Draw Sun
        g.setColor(Color.YELLOW);
        g.fillOval(300, 75, 50, 50);
        g.setFont(new Font("Serif", 3, 30));

        //Draw Text
        g.setColor(Color.WHITE);
        g.drawString("Welcome Home", 50, 50);

        //Draw Fence
        for(int i=0;i<40;i++){
            g.fillRect(i*15,300,5,50);
        }

        //Draw Clouds
        for(int i=0;i<10;i++){
            g.fillOval(i*50, 100, 30, 20);
            g.fillOval(i*50+10, 90, 30, 20);
        }
    }
}