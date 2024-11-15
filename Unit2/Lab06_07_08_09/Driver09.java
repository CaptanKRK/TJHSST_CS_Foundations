import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.JFrame;

public class Driver09 {
   public static void twisties(Turtle arg){
      arg.setPenDown(false);
      arg.turnRight((int) (Math.random() * 360));
      arg.forward((int) (Math.random() * 200));
      arg.setPenDown(true);
      arg.drawShape();
   
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame("Polygon Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(3);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.setCrawl(true);
      Turtle.clear(Color.WHITE);
      boolean thread=true;
      if(thread){
         new Thread(new TwistyTurtle()).start();        
         new Thread(new TwistyTurtle1()).start();         
         new Thread(new TwistyTurtle2()).start();
      }else{
         twisties(new TwistyTurtle());
         twisties(new TwistyTurtle1());
         twisties(new TwistyTurtle2());
      }
   }
}
