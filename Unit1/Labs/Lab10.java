package Labs;//Zain Marshall 08/30/2024
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import Robots.Athlete;

public class Lab10
{
   public static void followWallsRight(Athlete a){
      while(!a.nextToABeeper()) {
         if (!a.rightIsClear() && a.frontIsClear()) {
            a.move();
         } else if (a.rightIsClear()) {
            a.turnRight();
            a.move();
         } else {
            a.turnLeft();
         }
      }
   }
   
   public static void followWallsLeft(Athlete a){
      while(!a.nextToABeeper()){
         if(!a.leftIsClear() && a.frontIsClear()){
            a.move();
         
         }
         else if(a.leftIsClear()){
            a.turnLeft();
            a.move();
         }else{
            a.turnRight();
         }
      }
   }
   public static void main(String[] args){
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("Unit1/maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      Athlete a = new Athlete(1,1,Display.NORTH,Display.INFINITY);
      if(Math.random()<0.5){
         followWallsLeft(a);
      }
      else{
         followWallsRight(a);
      }
   }
}