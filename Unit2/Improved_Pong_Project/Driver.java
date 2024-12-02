package Improved_Pong_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Driver extends JPanel {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong Game");
        frame.setContentPane(new PongFrame());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}