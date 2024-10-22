//Zain Marshall
import edu.fcps.Bucket;
import javax.swing.*;

public class Driver04a
{
    //TODO Make this algorithm more efficent
    //This is Lab04 part 2. In this lab you have to make the buckets measure out all possible amounts of water.
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

        three.fill();
        three.pourInto(five);
        three.fill();
        three.pourInto(five);
        five.spill();
        three.pourInto(five);
        three.fill();
        three.pourInto(five);
        five.spill();
        three.fill();
        three.pourInto(five);
        five.fill();
        five.pourInto(three);
        three.spill();
        five.pourInto(three);
        five.fill();
        five.pourInto(three);
        five.fill();
    }
}
