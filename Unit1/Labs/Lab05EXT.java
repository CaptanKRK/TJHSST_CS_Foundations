//Zain Marshall 08/26/2024
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Lab05EXT{
  
   public static void main(String[] args){
     
      Display.setSpeed(10);
      
      Robot algo = new Robot(1,1,Display.NORTH,36);
      for(int i=8;i>0;i--){
         for(int j=0;j<i;j++){
            algo.putBeeper();
         }
         algo.move();
      }
   }
}