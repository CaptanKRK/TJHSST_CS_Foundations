package Lab00;

import javax.swing.*;
import java.awt.*;

public class Panel00modify extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.setColor(Color.RED);
        g.drawString("I must not fear. Fear is the mind-killer. Fear is the little-death that brings total obliteration. I will face my fear.", 100, 450);

        g.setFont(new Font("Comic Sans MS", Font.ITALIC, 50));
        g.setColor(new Color(250, 102, 255));
        g.drawString("Three Rings for the Elven-kings under the sky,",100,50);
        g.drawString("Seven for the Dwarf-lords in their halls of stone,",100,100);
        g.drawString("Nine for Mortal Men doomed to die,",100,150);
        g.drawString("One for the Dark Lord on his dark throne",100,200);
        g.drawString("In the Land of Mordor where the Shadows lie.",100,250);
        g.drawString("   One Ring to rule them all, One Ring to find them,",100,300);
        g.drawString("   One Ring to bring them all, and in the darkness bind them",100,350);
        g.drawString("In the Land of Mordor where the Shadows lie.",100,400);

        g.setFont(new Font("GungSeo", Font.PLAIN, 50));
        g.setColor(new Color(0, 102, 255));
        g.drawString("Insanity is doing the same thing over and over again and expecting different results.",100,600);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(new Color(0, 0, 0));
        g.drawString("I am Iron man.",100,500);




    }
}


