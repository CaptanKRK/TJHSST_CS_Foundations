import edu.fcps.karel2.*;

public class Seeker extends Athlete {
   public Seeker() {
      super(1, 1, Display.EAST, 0);
   }

   public void fetchBeeper() {
      this.turnLeft();
   
      while(!this.rightIsClear()) {
         this.move();
      }
   
      this.turnRight();
      this.move();
      this.turnRight();
   
      while(!this.nextToABeeper()) {
         this.move();
      }
   
      this.pickBeeper();
      this.turnAround();
   
      while(!this.leftIsClear()) {
         this.move();
      }
   
      this.turnLeft();
      this.move();
      this.turnLeft();
   
      while(this.frontIsClear()) {
         this.move();
      }
   
   }
}