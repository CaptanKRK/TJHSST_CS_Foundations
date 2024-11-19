package Lab12;

import javax.swing.JFrame;

public class Driver12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab12: Bouncing Ball");
        frame.setSize(400, 400);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PrizePanel());
        frame.setVisible(true);
    }
}
