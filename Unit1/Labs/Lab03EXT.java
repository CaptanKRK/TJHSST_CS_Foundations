package Labs;//Zain Marshall, 08/17/2024
import edu.fcps.karel2.Display;

public class Lab03EXT{
   public static void main(String[] args){
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(10);
      
      BetterClimber betterClimber = new BetterClimber(8);
      betterClimber.turnRight();
      betterClimber.move();
      betterClimber.climbMountainRight();
      betterClimber.turnAround();
      betterClimber.climbMountainLeft();
      betterClimber.move();
      betterClimber.turnRight();
   }
}