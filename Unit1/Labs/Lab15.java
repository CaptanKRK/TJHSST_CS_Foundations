package Labs;//Zain Marshall 08/31/2024
import Robots.Dancers.*;

public class Lab15
{
   public static void main(String[] args)
   {
   
      BreakDancer breaker = new BreakDancer(8,5,0,0);
      SpinDancer spinny = new SpinDancer(3,5,0,0);
      SquareDancer square = new SquareDancer(5,5,0,0);
      ZigZagDancer zig = new ZigZagDancer(1,5,0,0);
      Thread t1 = new Thread( breaker );
      Thread t2 = new Thread( spinny );
      Thread t3 = new Thread( square );
      Thread t4 = new Thread( zig );
      t1.start();
      t2.start();
      t3.start();
      t4.start();
   }
}