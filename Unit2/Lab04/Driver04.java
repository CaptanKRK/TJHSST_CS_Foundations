//Zain Marshall
import edu.fcps.Bucket;
import javax.swing.*;

public class Driver04
{
   //This is Lab04 part 1. This is a basic implementation of the fill 4 gallons using a 3 gallon and 5 gallon bucket.
   public static void main(String args[])
   {
      JFrame frame = new JFrame("Buckets");
      frame.setSize(600, 400);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(10);
      Bucket.useTotal(false); 
         
      Bucket five = new Bucket(5);
      Bucket three = new Bucket(3);
   
      five.fill();				
      five.pourInto(three);	
      three.spill();			
      five.pourInto(three);
      five.fill();				
      five.pourInto(three);
   }
}
