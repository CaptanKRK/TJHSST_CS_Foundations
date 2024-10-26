package Lab04;
//Zain Marshall
import edu.fcps.Bucket;
import javax.swing.*;

public class Driver04b
{
   //This is Lab04 part 2 extension. In this extension you have to make three buckets measure out all possible amounts of water, 0-12.
   //I have 18 total commands. Add a comment if you can get less.
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
      Bucket four = new Bucket(4);
      Bucket three = new Bucket(3);

      five.fill(); //5
      //5 0 0
      four.fill(); //9
      //5 4 0
      three.fill(); //12
      //5 4 3
      four.spill(); //8
      //5 0 3
      five.spill(); //3
      //0 0 3
      four.fill(); //7
      //0 4 3
      three.spill(); //4
      //0 4 0
      four.pourInto(three);
      //0 1 3
      three.spill(); //1
      //0 1 0
      five.fill(); //6
      //5 1 0
      five.pourInto(four);
      //2 4 0
      four.spill(); //2
      //2 0 0
      five.pourInto(three);
      //0 0 2
      five.fill();
      //5 0 2
      four.fill(); //11
      //5 4 2
      four.spill();
      //5 0 2
      three.pourInto(four);
      //5 2 0
      three.fill(); //10
      //5 2 3
   }
}

