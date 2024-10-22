package Labs;//Zain Marshall 09/01/2024

import edu.fcps.karel2.*;
public class LabYY
{
   public static void main(String[] args)
   {
      final int N = (int) (Math.random() *50+25);
      Display.setSize(N,N);
      Display.setSpeed(10);
      WorldBackend.getCurrent().putBeepers((int) (Math.random()*N+1),(int) (Math.random()*N+1), 1);
      boolean beeperFound = false;
   
      Robot[] army = new Robot[N];
      for(int i=0;i<N;i++){
         army[i] = new Robot(i,1,Display.NORTH,0);
      }
      while(!beeperFound){
         for(Robot rob : army){
            if(rob.nextToABeeper()){
               rob.pickBeeper();
               beeperFound=true;
               System.out.println("Beeper found at: "+rob.getX()+", "+rob.getY());
               break;
            }
            rob.move();
         }
      }
   
   }
}