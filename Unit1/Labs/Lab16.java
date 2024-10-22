package Labs;        //Torbert, e-mail: smtorbert@fcps.edu
     //version 4.16.2003

import edu.fcps.karel2.Display;
import Robots.Shifter;
 public class Lab16
{
    public static void main(String[] args)
   {
      Display.openWorld("Unit1/maps/shifty.map");
      Display.setSize(10, 10);
      Display.setSpeed(5);

      Thread t1 = new Thread( new Shifter(1) );
      Thread t2 = new Thread( new Shifter(2) );
      Thread t3 = new Thread( new Shifter(3) );
      Thread t4 = new Thread( new Shifter(4) );

      t1.start();
      t2.start();
      t3.start();
      t4.start();
   }
}