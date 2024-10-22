package Robots;    //Zain Marshall 08/30/2024
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Harvester extends Robot implements Workable
{
   public Harvester(int x, int y)
   {
      super(x, y, Display.EAST, 0);
   }
   public Harvester()
   {
      super(2, 2, Display.EAST, 0);
   }
   public void workCorner()
   {
      if (this.nextToABeeper()) {
         this.pickBeeper();
      }
   }
   public void moveOneBlock()
   {
      this.move();
   }
   public void turnToTheRight()
   {
      this.turnLeft();
      this.turnLeft();
      this.turnLeft();
   }
   public void turnToTheNorth()
   {
      while(!this.facingNorth()){
         this.turnLeft();
      }
   }
}