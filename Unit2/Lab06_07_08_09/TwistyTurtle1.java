package Lab06_07_08_09;

import edu.fcps.Turtle;

public class TwistyTurtle1 extends Turtle implements Runnable{
   @Override
   public void drawShape(){
      for(int len=0;len<=200;len+=5){
         this.forward(len);
         this.turnLeft(45);
      }
   }
   @Override
   public void run(){
      this.drawShape();
   }
}