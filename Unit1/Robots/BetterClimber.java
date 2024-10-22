package Robots;//Zain Marshall 08/22/2024

public class BetterClimber extends Climber{
   public BetterClimber(){
      super();
   }
   public BetterClimber(int x){
      super(x);
   }
   @Override
   public void climbUpRight(){
      this.turnLeft();
      this.move();
      this.move();
      this.turnRight();
      this.move();
   }
   public void climbMountainRight(){
      this.climbUpRight();
      this.climbUpRight();
      this.climbUpRight();
      this.climbDownRight();
      this.climbDownRight();
      this.climbDownRight();
   
   }
   public void climbMountainLeft(){
      this.climbUpLeft();
      this.climbUpLeft();
      this.climbUpLeft();
      this.climbDownLeft();
      this.climbDownLeft();
      this.climbDownLeft();
   
   }
   @Override
   public void climbUpLeft(){
      this.turnRight();
      this.move();
      this.move();
      this.turnLeft();
      this.move();
   }
   @Override
   public void climbDownRight(){
      this.move();
      this.turnRight();
      this.move();
      this.move();
      this.turnLeft();
   }
   @Override
   public void climbDownLeft(){
      this.move();
      this.turnLeft();
      this.move();
      this.move();
      this.turnRight();
   }
}
