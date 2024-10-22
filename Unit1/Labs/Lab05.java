package Labs;//Zain Marshall 08/26/2024
import edu.fcps.karel2.Display;
import Robots.Racer;
public class Lab05{
   public static void runTheRace(Racer r){      
      r.move();
      r.shuttle(2,7);
      r.shuttle(4,5);
      r.shuttle(6,3);
   }
   
   public static void main(String[] args){
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10,10);
      Display.setSpeed(2);
      Racer r1 = new Racer(1);
      Racer r2 = new Racer(4);
      Racer r3 = new Racer(7);
      boolean thread=false;
      if(thread){
         Thread t1=new Thread(r1);
         Thread t2=new Thread(r2);
         Thread t3=new Thread(r3);
         t1.start();
         t2.start();
         t3.start();
      }else{
      
         runTheRace(r1);
         runTheRace(r2);
         runTheRace(r3);
      }
   
   }
}