package Labs;    //Torbert, e-mail: smtorbert@fcps.edu
 //version 6.13.2003

import edu.fcps.karel2.*;
import Robots.Seeker;

 public class LabXX
{
    public static void main(String[] args)
   {
      Display.setSize(8, 8);
      Display.setSpeed(10);
      int x = (int)(Math.random() * 6 + 1);
      int y = (int)(Math.random() * (x - 1) + 1);
      WorldBackend.getCurrent().addWall(new Wall(1, 1, x, Display.VERTICAL));
      WorldBackend.getCurrent().putBeepers(2, y, 1);

      Seeker karel = new Seeker();
      karel.fetchBeeper();
      karel.putBeeper();
   }
}