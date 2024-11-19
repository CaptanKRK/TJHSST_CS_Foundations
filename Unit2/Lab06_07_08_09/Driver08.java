package Lab06_07_08_09;

import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver08
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Flower Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(3);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.setCrawl(false);
      Turtle.clear(Color.WHITE);
      Color[] colors = {Color.RED,Color.BLUE,Color.PINK,Color.ORANGE};
      for(int i=0;i<colors.length;i++){
         new FlowerTurtle(125*(i+1),50,colors[i]).drawShape();
      } 
   }
}