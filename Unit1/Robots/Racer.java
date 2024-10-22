package Robots;//Zain Marshall, 08/22/24
import edu.fcps.karel2.Display;

public class Racer extends Athlete implements Runnable{
   public Racer(int y){
      super(1,y,Display.EAST,Display.INFINITY);
   }
   public void jumpRight() {
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
   }

   public void jumpLeft() {
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
   }

   public void sprint(int n){
      for(int k=1;k<=n;k++){
         this.move();
      }
   }
   public void put(int n){
      for(int k=1;k<=n;k++){
         this.putBeeper();
      }
   
   
   }
   public void pick(int n){
      for(int k=1;k<=n;k++){
         this.pickBeeper();
      }
   
   }
   
   public void shuttle(int spaces, int beepers){
      this.jumpRight();
      this.sprint(spaces);
      this.pick(beepers);
      this.turnAround();
      this.sprint(spaces);
      this.jumpLeft();
      this.move();
      this.put(beepers);
      this.turnAround();
      this.move();
   }
   @Override
   public void run(){
      this.move();
      this.shuttle(2,7);
      this.shuttle(4,5);
      this.shuttle(6,3);
   }

}