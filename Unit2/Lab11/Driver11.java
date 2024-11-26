package Lab11;   //Torbert, e-mail: smtorbert@fcps.edu
//version 6.17.2003

import javax.swing.JFrame;
public class Driver11
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Unit2, Lab11: Pinball");
        frame.setSize(400, 400);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PinballPanel());
        frame.setVisible(true);
    }
}