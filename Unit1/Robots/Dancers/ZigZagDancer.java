package Robots.Dancers;//Zain Marshall 08/31/2024

import edu.fcps.karel2.Display;
public class ZigZagDancer extends Dancer
{
   public ZigZagDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public ZigZagDancer()
   {
      super(1, 1, Display.EAST, 0);
   }
   public void danceStep(){
      move();
      turnLeft();
      move();
      turnRight();          
   }
   @Override
   public void run()
   {
      for(int k = 1; k <= 10; k++)
      {
         danceStep();
      }
   }
}