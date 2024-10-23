package Lab00;

import javax.swing.*;
import java.awt.*;
public class Panel00 extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(75, 50, 300, 125);

        g.setFont(new Font("Serif", Font.BOLD, 100));
        g.setColor(Color.YELLOW);
        g.drawString("Hello World", 100, 100);
        g.setFont(new Font("Comic Sans MS", Font.ITALIC, 50));
        g.setColor(new Color(250, 102, 255));
    }
}
