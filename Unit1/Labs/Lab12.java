package Labs;    //Torbert, e-mail: smtorbert@fcps.edu
 //version 4.16.2003
import Robots.Workable;
import Robots.Harvester;
import Robots.Carpeter;
import edu.fcps.karel2.*;
 public class Lab12
{
    public static void work_one_row(Workable arg, int n)
   {
      for(int k = 1; k <= n; k++)
      {
         arg.workCorner();
         arg.moveOneBlock();
      }
   }
    public static void work_8x8_square(Workable arg)
   { //precondition: arg must be at lower-left corner of square
      arg.turnToTheNorth();
      work_one_row(arg, 7);
      for(int k = 7; k >= 1; k--)
      {
         arg.turnToTheRight();
         work_one_row(arg, k);
         arg.turnToTheRight();
         work_one_row(arg, k);
      }
      arg.workCorner();
   }
    public static void main(String[] args)
   {
      Display.openWorld("Unit1/maps/spiral.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      if(Math.random() < 0.5)
      {
         work_8x8_square( new Harvester(2, 2) );
      }
      else
      {
         work_8x8_square( new Carpeter(2, 2) );
      }
   }
}