package Lab06_07_08_09;

import edu.fcps.Turtle;

public class TwistyTurtle extends Turtle implements Runnable{
   @Override
   public void drawShape(){
      for(int len=5;len<=400;len+=10){
         this.forward(len);
         this.turnLeft(123);
      }
   }
   @Override
   public void run(){
      this.drawShape();
   }
}
