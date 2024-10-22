public class Republican extends MazeEscaper implements Runnable
{
   public void walkDownCurrentSegment(){
      while(!this.nextToABeeper() && this.frontIsClear() && !this.rightIsClear()){
         this.move();
      }
   }
   public void turnToTheNextSegment(){
      if(!this.nextToABeeper()){
         if(this.rightIsClear()){
            this.turnRight();
         } else if(this.leftIsClear()){
            this.turnLeft();
         }else{
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