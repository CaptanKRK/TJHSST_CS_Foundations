package Labs;//Zain Marshall, 08/16/2024
import edu.fcps.karel2.Display;
import Robots.Athlete;

public class Lab02EXT{
   public static void main(String[] args){
      Display.openWorld("maps/maze.map");
      Display.setSize(8,8);
      Display.setSpeed(10);
      
      Athlete athlete = new Athlete();
      
      athlete.putAndMove();        
      athlete.turnRight();
      athlete.putAndMove();        
      athlete.turnRight();
      athlete.putAndMove();
      athlete.turnLeft();
      athlete.putAndMove();        
      athlete.turnLeft();
      athlete.putAndMove();        
      athlete.turnRight();
      athlete.putAndMove();        
      athlete.putAndMove();        
      athlete.turnRight();
      athlete.putAndMove();        
      athlete.turnLeft();
      athlete.putAndMove();        
      athlete.turnLeft();
      athlete.putAndMove();        
      athlete.putAndMove();        
      athlete.putAndMove();        
      athlete.putAndMove();        
      athlete.turnRight();
      athlete.putAndMove();        
      athlete.putAndMove(); 
   }
}