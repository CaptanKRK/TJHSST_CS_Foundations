package Lab16;

import javax.swing.*;

public class Driver16 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab12: Bouncing Ball");
        frame.setSize(408, 438);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PrizePanel());
        frame.setVisible(true);
    }
}
