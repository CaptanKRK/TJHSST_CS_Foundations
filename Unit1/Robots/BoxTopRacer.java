package Robots;

public class BoxTopRacer extends Racer {
   public BoxTopRacer(int y) {
      super(y);
   }

   public void jumpRight() {
      this.turnLeft();
   
      while(!this.rightIsClear()) {
         this.move();
      }
   
      this.turnRight();
      this.move();
   
      while(!this.rightIsClear()) {
         this.move();
      }
   
      this.turnRight();
   
      while(this.frontIsClear()) {
         this.move();
      }
   
      this.turnLeft();
   }
}
