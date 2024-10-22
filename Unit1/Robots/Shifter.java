   	//Zain Marshall 08/30/2024
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Shifter extends Robot implements Runnable, Workable
{
   public Shifter(int y)
   {
      super(1, y, Display.EAST, 0);
      
   }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
   @Override
   public void run() {
      int count;
      for(count = 0; count <= 5; ++count) {
         this.move();
      }
   
      this.turnLeft();
      this.turnLeft();
      count = 0;
   
      while(this.frontIsClear()) {
         this.move();
      
         while(this.nextToABeeper()) {
            ++count;
            this.pickBeeper();
         }
      
         this.turnLeft();
         this.turnLeft();
         this.move();
      
         while(count > 0) {
            this.putBeeper();
            --count;
         }
      
         this.turnLeft();
         this.turnLeft();
         this.move();
      }
   
   }       
   @Override
   public void workCorner(){
      //
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