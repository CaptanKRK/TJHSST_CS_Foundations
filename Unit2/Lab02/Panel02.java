package Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel02 extends JPanel {
    //Draws a frame with a picture in the center.
    public void drawFrame(int x1, int x2, int y1,int y2,int r, String url, Color color,Graphics g){
        g.setColor(color);
        g.fillRect((int) x1+r/2, (int) y1+r/2, x2-x1, y2-y1);

        for(int x = x1; x <= x2; x += r) {
            g.fillOval(x, y1, r, r);
            g.fillOval(x, y2, r, r);
        }


        for(int y = y1; y <= y2; y += r) {
            g.fillOval(x1, y, r, r);
            g.fillOval(x2, y, r, r);
        }


        ImageIcon i = new ImageIcon(url);
        g.drawImage(i.getImage(),(int)(0.85*r)+x1, (int)(0.85*r)+y1,(int) ( 0.925*(x2-x1)),(int) ( 0.925*(y2-y1)), null);
    }
    @Override
    public void paintComponent(Graphics g) {
        //Draw Wall
        g.setColor(Color.RED.darker());
        g.fillRect(0, 0, 1000, 1000);

        //Drawing four picture frames
        drawFrame(125,265,50,230,20, "Unit2/Lab02/som.jpg",Color.YELLOW.darker(),g);
        drawFrame(125+200,265+200,50+300,230+300,20, "Unit2/Lab02/som.jpg",Color.PINK.darker(),g);
        drawFrame(125-60,265-60,50+400,230+400,20, "Unit2/Lab02/som.jpg",Color.BLUE.darker(),g);
        drawFrame(125+500,265+500,60,250,20, "Unit2/Lab02/som.jpg",Color.GREEN.darker(),g);
    }
}