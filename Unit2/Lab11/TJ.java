package Lab11;

import java.awt.*;

public class TJ extends Ball{
    @Override
    public void draw(Graphics myBuffer){
        Image myImage = Toolkit.getDefaultToolkit().getImage("Unit2/Lab11/tj.jpg");
        myBuffer.drawImage(myImage, (int)getX(), (int)getY(), (int)getDiameter(), (int)getDiameter(), null);
    }
}
