//Zain Marshall 08/26/2024

public class StepClimber extends Climber{
   public StepClimber(int x){
      super(x);
   }
   @Override
     public void climbUpRight(){
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
   }
   @Override
   public void climbUpLeft(){
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
   }
   @Override
   public void climbDownRight(){
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
   }
   @Override
   public void climbDownLeft(){
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
   }
}
