package Lab14;// Name: 				Date:

   import java.awt.*;
   
    public class Bumper
   {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
	 private int x;
        private int y;
        private int width;
        private int height;
        private Color color;
   
   
     //constructors


       public Bumper() {
                this.x = 200;
                this.y = 200;
                this.width = 75;
                this.height = 125;
                this.color = Color.BLUE;
       }

         public Bumper(int myX, int myY, int myWidth, int myHeight, Color myColor) {
              this.x = myX;
              this.y = myY;
              this.width = myWidth;
              this.height = myHeight;
              this.color = myColor;
         }

       public int getX() {
           return x;
       }

       public void setX(int x) {
           this.x = x;
       }

       public int getY() {
           return y;
       }

       public void setY(int y) {
           this.y = y;
       }

       public int getWidth() {
           return width;
       }

       public void setWidth(int width) {
           this.width = width;
       }

       public int getHeight() {
           return height;
       }

       public void setHeight(int height) {
           this.height = height;
       }

       public Color getColor() {
           return color;
       }

       public void setColor(Color color) {
           this.color = color;
       }

       public void jump(int rightEdge, int bottomEdge)
      {
            x = (int)(Math.random() * (rightEdge - width));
            y = (int)(Math.random() * (bottomEdge - height));

      }


       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getWidth(), getHeight());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getHeight(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
