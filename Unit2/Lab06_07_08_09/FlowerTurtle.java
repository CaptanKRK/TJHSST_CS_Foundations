import edu.fcps.Turtle;
import java.awt.Color;
public class FlowerTurtle extends Turtle
{
   private double mySize;
   public FlowerTurtle()
   {
      mySize = 50.0;
      setColor(Color.RED);
   }
   public FlowerTurtle(double x, double n, Color c)
   {
      super(x, 300.0, 90.0);
      mySize = n;
      setColor(c);
   }
   public void setSize(double n)
   {
      mySize = n;
   }
  
   private void drawPetals() //starts and ends at center facing north
   {
      for(int i=0;i<30;i++){
         this.forward(this.mySize);
         this.turnLeft(180);
         this.forward(this.mySize);
         this.turnLeft(180);
         this.turnLeft(12);
      }
      /************************/
   	/*                      */
   	/* Your code goes here. */
   	/*                      */
   	/************************/
   
   }
   private void drawStem() //starts at top of stem facing south, ends at bottom
   {
      this.turnLeft(180);
      this.setColor(Color.GREEN);
      this.forward(mySize*2.5);
      this.turnLeft(180);
      this.forward(mySize*0.25);
      this.turnLeft(45);
      this.forward(this.mySize*0.5);
      this.turnLeft(180);
      this.forward(this.mySize*0.5);
      this.turnLeft(90);
      this.forward(this.mySize);
      /************************/
   	/*                      */
   	/* Your code goes here. */
   	/*                      */
   	/************************/
   
   }
   public void drawShape()
   {
      drawPetals();
      drawStem();
   }
}