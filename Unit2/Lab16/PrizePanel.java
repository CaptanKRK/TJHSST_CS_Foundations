package Lab16;   //Name:    Date:

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
public class PrizePanel extends JPanel
{
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t;
      private int hits = 0;
		//constructor
       public PrizePanel()
      {
          myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
          myBuffer = myImage.getGraphics();
          myBuffer.setColor(BACKGROUND);
          myBuffer.fillRect(0, 0, FRAME,FRAME);
          int xPos = (int)(Math.random()*(FRAME-100) + 50);
          int yPos = (int)(Math.random()*(FRAME-100)+ 50);
          ball = new Ball(xPos, yPos, 50, Color.BLACK);
          pd= new Polkadot(xPos, yPos, 50, Color.RED);

          addMouseListener(new Mouse());
          t = new Timer(5, new Listener());
          t.start();
      }
       private class Mouse extends MouseAdapter{
              public void mouseClicked(MouseEvent e){

                if (e.isMetaDown()){
                    ball.setX(e.getX());
                    ball.setY(e.getY());
                } else if (e.isShiftDown()){
                    ball.setdx(Math.random()*12-6);
                    ball.setdy(Math.random()*12-6);
                }else{
                    pd.setX(e.getX());
                    pd.setY(e.getY());
                }
              }
       }
       public void paintComponent(Graphics g)
      {
          g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
             myBuffer.setColor(BACKGROUND);
             myBuffer.fillRect(0,0,FRAME,FRAME);

             ball.move(FRAME,FRAME);
             collide(ball, pd);

             ball.draw(myBuffer);
             pd.draw(myBuffer);

             myBuffer.setColor(Color.BLACK);
             myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
             myBuffer.drawString("Count: "+hits, FRAME-150, 25);
             repaint();
         }
      }
       private double distance(double x1, double y1, double x2, double y2){
           return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
       }
       private void collide(Ball b, Polkadot pd){
           double d=distance(b.getX(), b.getY(), pd.getX(), pd.getY());
           if(d<=b.getRadius()+pd.getRadius()){
               b.setdx(-b.getdx());
               b.setdy(-b.getdy());
               hits++;
               pd.jump(FRAME, FRAME);
           }


       }
   }

