package Robots;

public class Democrat extends MazeEscaper implements Runnable
{
   public void walkDownCurrentSegment(){
      while(!this.nextToABeeper() && this.frontIsClear() && !this.leftIsClear()){
         this.move();
      }
   }
   public void turnToTheNextSegment(){
      if(!this.nextToABeeper()){
         if (this.leftIsClear()) {
            this.turnLeft();
         } else if (this.rightIsClear()) {
            this.turnRight();
         } else {
            this.turnAround();
         }
         this.move();
      }
   }
   public void run(){
      this.walkDownCurrentSegment();
      while(!this.nextToABeeper()){
         this.turnToTheNextSegment();
         this.walkDownCurrentSegment();
      }
   }

   
}