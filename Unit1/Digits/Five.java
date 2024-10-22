//Zain Marshall 08/30/2024
package Digits;

public class Five extends Digit{
   public Five(int x, int y) {
      super(x, y);
   }
   @Override
   
   public void display() {
      this.segment1_On();
      this.segment2_Off();
      this.segment3_On();
      this.segment4_On();
      this.segment5_Off();
      this.segment6_On();
      this.segment7_On();
   
   }
}