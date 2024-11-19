package Lab06_07_08_09;

import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.JFrame;

public class Driver07 {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Polygon Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(3);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.setCrawl(true);
      Turtle.clear(Color.BLACK);
     
      PolygonTurtle stem = new PolygonTurtle(300,350, 270, 200,3);
      stem.setColor(Color.GREEN.darker());
      stem.setThickness(5);
      stem.forward(250);
               
      PolygonTurtle petal = new PolygonTurtle();       
      petal.setColor(Color.RED);
      for(int i=0; i< 24; i++){
         petal.turnLeft(15);
         petal.drawShape();
      }
      PolygonTurtle center = new PolygonTurtle(20, 8);
      center.setColor(Color.YELLOW);
      for(int i=0; i< 24; i++){
         center.turnLeft(15);
         center.drawShape();
      }
      
      PolygonTurtle leaf = new PolygonTurtle(300, 500, 90, 45, 3);
      leaf.setColor(Color.GREEN.darker());
   
      for(int i = 3; i <= 8; i++) {
         leaf.drawShape(i);
      }
      leaf.turnLeft(180);
      leaf.forward(30);
      for(int i = 3; i <= 8; i++) {
         leaf.drawShape(i);
      }
            
   }
}
