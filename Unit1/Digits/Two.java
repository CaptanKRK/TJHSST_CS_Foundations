//Zain Marshall 08/30/2024
package Digits;

public class Two extends Digit{
   public Two(int x, int y) {
      super(x, y);
   }
   @Override
   
   public void display() {
      this.segment1_On();
      this.segment2_On();
      this.segment3_Off();
      this.segment4_On();
      this.segment5_On();
      this.segment6_Off();
      this.segment7_On();
   
   }
}