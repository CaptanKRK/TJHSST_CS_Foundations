package Robots;//Name Zain Marshall Date 08/30/2024
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Carpeter extends Robot implements Workable
{
   public Carpeter(int x, int y)
   {
      super(x, y, Display.EAST, Display.INFINITY);
   }
   public Carpeter()
   {
      super(2, 2, Display.EAST, Display.INFINITY);
   }
   public void workCorner()
   {
      if (!this.nextToABeeper()) {
         this.putBeeper();
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