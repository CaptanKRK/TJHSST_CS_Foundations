package Lab04;
//Zain Marshall
import edu.fcps.Bucket;
import javax.swing.*;

public class Driver04a
{
   //This is Lab04 part 2. In this lab you have to make two buckets measure out all possible amounts of water, 0-8.
   //I have 13 total commands. Add a comment if you can get less.
   public static void main(String args[])
   {
      JFrame frame = new JFrame("Buckets");
      frame.setSize(600, 400);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(10);
      Bucket.useTotal(true);
   
      Bucket five = new Bucket(5);
      Bucket three = new Bucket(3);
   
     
      three.fill(); //3
      //0 3
      five.fill(); //8
      //5 3
      three.spill(); //5
      //5 0
      five.pourInto(three);
      //2 3
      three.spill(); //2
      //2 0
      five.pourInto(three);
      //0 2
      five.fill(); //7
      //5 2
      five.pourInto(three);
      //4 3
      three.spill(); //4
      //4 0
      five.pourInto(three);
      //1 3
      three.spill(); //1
      //1 0
      five.pourInto(three);
      //0 1
      five.fill(); //6
      //5 1
      
   }
}
