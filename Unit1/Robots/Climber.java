package Robots;//Zain Marshall 08/17/2024
import edu.fcps.karel2.Display;

public class Climber extends Athlete{
   public Climber(){
      super();
   }
   public Climber(int x){
      super(x, 1, Display.NORTH, 1);
   }
   public void climbUpRight(){
      this.turnLeft();
      this.move();
      this.move();
      this.turnRight();
      this.move();
   }
   public void climbUpLeft(){
      this.turnRight();
      this.move();
      this.move();
      this.turnLeft();
      this.move();
   }
   public void climbDownRight(){
      this.move();
      this.turnRight();
      this.move();
      this.move();
      this.turnLeft();
   }
   public void climbDownLeft(){
      this.move();
      this.turnLeft();
      this.move();
      this.move();
      this.turnRight();
   }
}
