package Lab11;

import javax.swing.*;
import java.awt.*;

public class TJ extends Ball{
    @Override
    public void draw(Graphics myBuffer){
        setDiameter(50);
        ImageIcon icon = new ImageIcon("Unit2/Lab11/tj.jpg");
        myBuffer.drawImage(icon.getImage(), (int)getX(), (int)getY(), (int)getDiameter(), (int)getDiameter(), null);
    }
}
