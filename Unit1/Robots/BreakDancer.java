package Robots;
//Zain Marshall 08/31/2024

import edu.fcps.karel2.Display;
public  class BreakDancer extends Dancer
{
   public BreakDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public BreakDancer()
   {
      super(1, 1, Display.EAST, 0);
   }
   public void danceStep(){
      for(int i=0;i<100;i++){
         this.turnLeft();
      }
       
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