//Zain Marshall 10/29/2024
import edu.fcps.Turtle;
public class Equilateral extends Turtle
{
   private double mySize;
   
   	//*************************constructors*************************
   public Equilateral()
   {
      super();
      mySize = 50.0;
   }
   public Equilateral(double n)
   {
      super();
      mySize = n;
   }
   public Equilateral(double x, double y)
   {
      super(x, y);
      mySize = 50.0;
   }
   public Equilateral(double x, double y, double n)
   {
      super(x, y);
      mySize = n;
   }
   
   	//************************methods*****************************
   public void setSize(double n)
   {
      mySize = n;
   }
   public void drawShape()
   {
      for(int k = 1; k <= 3; ++k) {
         this.forward(this.mySize);
         this.turnLeft(60);
      }
   
   }
}