package Lab06_07_08_09;

import edu.fcps.Turtle;

public class TwistyTurtle2 extends Turtle implements Runnable{
   @Override
   public void drawShape(){
      for(int len=5;len<=150;len+=5){
         this.forward(len);
         this.turnLeft(22.5);
      }
   }
   @Override
   public void run(){
      this.drawShape();
   }
}