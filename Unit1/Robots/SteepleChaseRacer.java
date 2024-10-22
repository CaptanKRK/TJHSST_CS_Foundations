package Robots;//Zain Marshall, 08/22/24

public class SteepleChaseRacer extends Racer{
   public SteepleChaseRacer(int y){
      super(y);
   }
   @Override
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