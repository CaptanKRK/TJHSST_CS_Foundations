//Zain Marshall 08/31/2024

import edu.fcps.karel2.Display;
public class SquareDancer extends Dancer
{
   public SquareDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public SquareDancer()
   {
      super(1, 1, Display.EAST, 0);
   }
   public void danceStep(){
      for(int i=0;i<3;i++){
         this.move();
      }
      this.turnLeft();
       
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