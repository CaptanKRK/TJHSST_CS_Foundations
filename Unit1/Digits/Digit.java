package Digits;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public abstract class Digit{
   private Robot rob;
   
   private void moveThree(boolean place){
      for(int i=0;i<3;i++){
         this.rob.move();
         if(place){
            this.rob.putBeeper();
         }
      }
      this.rob.move();
   
   }
   
   public void segment1_On(){
      this.moveThree(true);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.rob.turnLeft();
   }
   public void segment2_On(){
      this.moveThree(true);
   }
   public void segment3_On(){
      this.moveThree(true);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.rob.turnLeft();
   }
   public void segment4_On(){
      this.moveThree(true);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.rob.turnLeft();
   }
   public void segment5_On(){
      this.moveThree(true);
   }
   public void segment6_On(){
      this.moveThree(true);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.moveThree(false);
      this.rob.turnLeft();
   }
   public void segment7_On(){
      this.moveThree(true);
   }
   public void segment1_Off(){
      this.moveThree(false);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.rob.turnLeft();
   }
   public void segment2_Off(){
      this.moveThree(false);
   }
   public void segment3_Off(){
      this.moveThree(false);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.rob.turnLeft();
   }
   public void segment4_Off(){
      this.moveThree(false);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.rob.turnLeft();
   }
   public void segment5_Off(){
      this.moveThree(false);
   }
   public void segment6_Off(){
      this.moveThree(false);
      this.rob.turnLeft();
      this.rob.turnLeft();
      this.moveThree(false);
      this.rob.turnLeft();
   }
   public void segment7_Off(){
      this.moveThree(false);
   }
   //x and y are of the top left corner.
   public Digit(int x,int y){
      rob=new Robot(x,y,Display.EAST,Display.INFINITY);
   }
   public abstract void display();
}