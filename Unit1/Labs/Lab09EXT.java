package Labs;//Zain Marshall 08/26/2024
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import Robots.Athlete;

public class Lab09EXT
{
   public static void main(String[] args){
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("Unit1/maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      int[] count = new int[4];
      Athlete a = new Athlete(1,1,Display.NORTH,0);
      
      for(int i=0;i<4;i++){
         while(a.nextToABeeper()){
            a.pickBeeper();
            count[i]++;
            a.move();
         }
         a.turnAround();
         for(int j=0;j<count[i];j++){
            a.move();
         }
         a.turnLeft();
         a.move();
         a.turnLeft();
      }
      a.move();
      a.move();
      a.move();
      a.turnLeft();
      a.move();
      a.move();
      a.move();
      a.move();
      a.turnAround();
      for(int i=0;i<4;i++){
         for(int j=0;j<count[i];j++){
            a.putAndMove();
         }
         a.turnAround();
         for(int j=0;j<count[i];j++){
            a.move();
         }
         if(a.getY()>1){
         a.turnLeft();
         a.move();
         a.turnLeft(); 
         }  
      }
      a.explode();
   }
}