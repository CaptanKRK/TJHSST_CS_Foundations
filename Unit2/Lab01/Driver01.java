package Lab01;

import javax.swing.JFrame;

public class Driver01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Build a House");
        frame.setSize(400, 425);
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new Panel01());
        frame.setVisible(true);
    }
}