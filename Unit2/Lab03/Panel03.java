package Lab03;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
public class Panel03 extends JPanel
{
   private BufferedImage myImage;
   public Panel03(int numLines, int numRays)
   {
      int N=400;
   
      myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
      Graphics buffer = myImage.getGraphics();
   
   	  //Background
      buffer.setColor(Color.BLUE);
      buffer.fillRect(0, 0, N, N);
     //Webbing
      buffer.setColor(Color.YELLOW);
      for(int k = 0; k <= numLines; k++)
      {
         buffer.drawLine(N * k / numLines, 0, N, N * k / numLines);
         buffer.drawLine(N, N * k / numLines, N * (numLines - k) / numLines, N);
         buffer.drawLine(N * (numLines - k) / numLines, 400, 0, N * (numLines - k) / numLines);
         buffer.drawLine(0, N * (numLines - k) / numLines, N * k / numLines, 0);
      }
   
   	  //Sunshine
      int x = N / 2;
      int y = N / 2; //center
      int len = 100;
      int r1 = 60;
      int r2 = 55;
   
      for(int angle = 1; angle < 360; angle += 360 /numRays) {
         int x1 = (int)(x + len * Math.cos(angle * Math.PI / 180));
         int y1 = (int)(y - len * Math.sin(angle * Math.PI / 180));
         buffer.drawLine(x, y, x1, y1);
      }
   
   
      buffer.setColor(Color.BLUE.brighter());
      buffer.fillOval(x - r1, y - r1, r1 * 2, r1 * 2);
      buffer.setColor(Color.YELLOW);
      buffer.fillOval(x - r2, y - r2, r2 * 2, r2 * 2);	
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
}
