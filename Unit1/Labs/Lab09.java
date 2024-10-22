package Labs;//Zain Marshall 08/26/2024
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import Robots.Athlete;

public class Lab09

{
   public static void main(String[] args){
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("Unit1/maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      int count=0;
      
      Athlete r = new Athlete(1,1,Display.EAST,0);
      for(int i=0;i<6;i++){
         r.move();
      }
      r.turnAround();
      for(int i = 0; i <= 6; ++i) {
         r.move();
      
         while(r.nextToABeeper()) {
            count++;
            r.pickBeeper();
         }
      
         if (r.hasBeepers()) {
            r.turnAround();
            r.move();
         
            while(count > 0) {
               r.putBeeper();
               count--;
            }
         
            r.turnAround();
            r.move();
         }
      }
   }
}