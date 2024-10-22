package Labs;//Zain Marshall, 08-20-2024
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab00{
    public static void main(String[] args){
        Display.openWorld("Unit1/maps/first.map");
        Display.setSize(10,10);
        Display.setSpeed(10);

        Robot karel=new Robot();

        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();


    }
}