package Labs;//Zain Marshall, 08-20-2024
import edu.fcps.karel2.Display;
public class Lab04EXT{
   public static void takeTheField(Athlete arg){
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
   }
   
   public static void runTheField(Athlete a, Athlete b){
      for(int i=0;i<4;i++){
         a.move();
         b.move();
      }
      a.turnAround();
      b.turnAround();
      for(int i=0;i<4;i++){
         a.move();
         b.move();
      }
      a.turnAround();
      b.turnAround();
   
   }
 
   public static void main(String[] args){
      Display.openWorld("maps/arena.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      new Athlete(2,7,Display.EAST,0);
   
      Athlete[] athletes = new Athlete[6];
      for(int i=0;i<6;i++){
         athletes[i] = new Athlete();
      }
   
      for(int i=0;i<6;i++){
         takeTheField(athletes[i]);
      }
      athletes[0].move();
      athletes[0].turnLeft();
      athletes[0].move();
      athletes[0].turnAround();
      
      athletes[1].move();
      athletes[1].move();
      athletes[1].move();
      athletes[1].move();
      athletes[1].move();
      athletes[1].turnLeft();
      athletes[1].move();
      athletes[1].turnAround();
   
      for(int i=2;i<5;i++){
         for(int j=0;j<i;j++){
            athletes[i].move();
         }
         athletes[i].turnRight();
      
      }
      athletes[5].move();
      athletes[5].move();
      athletes[5].move();
      athletes[5].turnLeft();
      athletes[5].move();
      athletes[5].move();
      athletes[5].turnAround();
      
      runTheField(athletes[0],athletes[1]);
      runTheField(athletes[2],athletes[4]);
   
   
   }
}