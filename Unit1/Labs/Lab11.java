package Labs;//Zain Marshall 08/30/2024
import edu.fcps.karel2.Display;
import Digits.*;
public class Lab11

{
   public static void main(String[] args){
      Display.setSize(55, 37);
      Display.setSpeed(10);
      new Zero(1,9).display();
      new One(7,9).display();
      new Two(13,9).display();
      new Three(19,9).display();
      new Four(25,9).display();
      new Five(31,9).display();
      new Six(37,9).display();
      new Seven(43,9).display();
      new Eight(49,9).display();
      new Nine(55,9).display();

   }
}