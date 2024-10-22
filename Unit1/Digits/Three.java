//Zain Marshall 08/30/2024
package Digits;

public class Three extends Digit{
   public Three(int x, int y) {
      super(x, y);
   }
   @Override
   
   public void display() {
      this.segment1_On();
      this.segment2_On();
      this.segment3_On();
      this.segment4_On();
      this.segment5_Off();
      this.segment6_Off();
      this.segment7_On();
   
   }
}