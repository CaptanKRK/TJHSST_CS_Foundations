package Labs;//Zain Marshall 08/26/24
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab06
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("Unit1/maps/" + filename + ".map");
      Display.setSize(12, 12);
      Display.setSpeed(10);
      
      task01(); //go to the end of the row of beepers
      task02(); //go to the beeper
      task03(); //go to the wall
      task04(); //go to the wall, pick up all the beepers (max one per pile)
      task05(); //go to the wall, pick up all the beepers
      task06(); //go to the end of the row of beepers, there is one gap
      task07(); 
      task08(); 
      task09(); 
      task10(); 
      task11(); 
      task12(); 
   
   }
   public static void task01()	
   { //go to the end of the row of beepers
      Robot temp = new Robot(1, 1, Display.EAST, 0);
      while(temp.nextToABeeper()){
         temp.move();
      }
      
   }
   public static void task02()	
   { //go to the beeper
      Robot temp = new Robot(1, 2, Display.EAST, 0);
     
      while(!temp.nextToABeeper()){
         temp.move();
      }         	
   }
   public static void task03()	
   {         //go to a wall 
      Robot temp = new Robot(1, 3, Display.EAST, 0);
      while(temp.frontIsClear()){
         temp.move();
      }
       
   }
   public static void task04()	
   { //go to the wall, picking up the single beepers 
      Robot temp = new Robot(1, 4, Display.EAST, 0);
      int count=0;
      while(temp.frontIsClear()){
         if(temp.nextToABeeper()){
            count++;
            temp.pickBeeper();
         }
         temp.move();
      
      }
      print(count);
   }
   public static void task05()	
   { //go to the wall, picking up the piles of beepers
      Robot temp = new Robot(1, 5, Display.EAST, 0);
      int count=0;
   
      while(temp.frontIsClear()){
      
                  temp.move();
                  while(temp.nextToABeeper()){
            temp.pickBeeper();
            count++;
         }

      
      }
      print(count);

      
   }
   public static void task06()
   { //go to the end of the row of beepers, there is one gap
      Robot temp = new Robot(1, 6, Display.EAST, 0);
      boolean crossedGap=false;
      while(temp.nextToABeeper()||!crossedGap){
         if(!temp.nextToABeeper()){
            crossedGap=true;
         }
      
         temp.move();
      }
      
   }
   
   public static void task07()
   { //go to thge beeper or the wall. CoUnt and report the number of steps you tOOK 
      Robot temp = new Robot(1, 7, Display.EAST, 0);
      int count =0;
      while(!temp.nextToABeeper()&&temp.frontIsClear()){
         temp.move();
         count++;
      }
      print(count);
   }
   public static void task08()
   { //go to thge beeper or the wall. CoUnt and report the number of steps you tOOK 
      Robot temp = new Robot(1, 8, Display.EAST, 10);
      new Robot(8, 8, Display.EAST, 0);
      while(!temp.nextToARobot()){
         temp.move();
      }
      while(temp.hasBeepers()){
         temp.putBeeper();
      }
   }
   
   public static void task09(){//put down 5 piles of 4 beepers def loops
      Robot temp = new Robot(1, 9, Display.EAST, 20);
   
      for(int i=0;i<5;i++){
         for(int j=0;j<4;j++){
            temp.putBeeper();
         }
         temp.move();
      }
   }
   public static void task10(){//fill in gaps with a beeper, stop at a wall
      Robot temp = new Robot(1, 10, Display.EAST, Display.INFINITY);
      while(temp.frontIsClear()){
         if(!temp.nextToABeeper()){
            temp.putBeeper();
         }
         temp.move();
      }
      
   }
   public static void task11(){//while there is a wall to your right put down one beeper at each step
      Robot temp = new Robot(1, 11, Display.EAST, Display.INFINITY);
      while(!temp.rightIsClear()){
         temp.putBeeper();
         temp.move();
      }
   }
   public static void task12(){//go until there is a wall to your right and youre standing on a beeper
      Robot temp = new Robot(1, 12, Display.EAST, 0);
      while(!(!temp.rightIsClear()&&temp.nextToABeeper())){
         temp.move();
      }
   }
   public static void print(int count){
      System.out.println("Beepers: "+count);
   }
}