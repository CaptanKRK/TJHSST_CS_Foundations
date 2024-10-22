package Robots.Dancers;//Zain Marshall 08/31/2024

import edu.fcps.karel2.Display;

public class SpinDancer extends Dancer
{
   public SpinDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public SpinDancer()
   {
      super(1, 1, Display.EAST, 0);
   }
   public void danceStep(){
      for(int i=0;i<4;i++){
         this.turnLeft();
      }
      this.move();
       
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