package Lab03;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Driver03 {
   public static void main(String[] args) {
      //User Input
      int numLines = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of lines."));
      int numRays = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rays."));
      JFrame frame = new JFrame("Webbing and Sunshine");
      frame.setSize(400, 400);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(3);
      frame.setContentPane(new Panel03(numLines,numRays));
      frame.setVisible(true);
   }
}
