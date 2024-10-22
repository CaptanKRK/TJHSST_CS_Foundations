package Robots;//Zain Marshall, 08/22/24

public class HillClimber extends Climber{
   public HillClimber(int x){
      super(x);
   }
   @Override
   public void climbUpRight(){
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.move();
   }
   @Override
   
   public void climbUpLeft(){
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.move();
   }
   @Override
   
   public void climbDownRight(){
      this.move();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
   }
   @Override
   
   public void climbDownLeft(){
      this.move();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
   }
}