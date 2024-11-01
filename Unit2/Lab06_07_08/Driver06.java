import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver06
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Square Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      
      Turtle.setCrawl(false);
   
      SquareTurtle a = new SquareTurtle();
      SquareTurtle b = new SquareTurtle(100);
      SquareTurtle c = new SquareTurtle(300, 500, 100);
      SquareTurtle d = new SquareTurtle(400, 300, 50, 25.0D);  
             
      a.setColor(Color.BLUE);
      a.setThickness(6);
      a.drawShape();
      
      b.setColor(Color.RED);
      b.setThickness(10);
      b.drawShape();
   
      c.setColor(Color.PINK);
      c.setThickness(1);
      c.drawShape();
   
      d.setColor(Color.YELLOW);
      d.setThickness(3);
      d.drawShape();
   
      a.setSize(200);
      a.drawShape();
   
   }
}


