package Lab05;//Torbert, e-mail: smtorbert@fcps.edu
//version 6.17.2003
//version 11.4.2009  mlbillington@fcps.edu
import javax.swing.*;
public class Driver05
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Bugs");
      frame.setSize(400, 400);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BugPanel());
      frame.setVisible(true);
   }
}
