package Labs;    //Zain Marshall 08/31/24
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import Robots.Democrat;
import Robots.Republican;
import Robots.MazeEscaper;

public class Lab17
{
   public static void escape_the_maze(MazeEscaper arg)
   {
      arg.walkDownCurrentSegment(); //you are not at the end at the start
      while(!arg.nextToABeeper())
      {
         arg.turnToTheNextSegment();
         arg.walkDownCurrentSegment();
      }
   }
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("Unit1/maps/"+filename+".map");
      Display.setSize(8, 8);
      Display.setSpeed(10);
      new Thread(new Democrat()).start();
      new Thread(new Republican()).start();
   
   }
}
