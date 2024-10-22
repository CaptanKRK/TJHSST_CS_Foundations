//Zain Marshall 08/30/2024
package Digits;

public class Four extends Digit{
   public Four(int x, int y) {
      super(x, y);
   }
   @Override
   
   public void display() {
      this.segment1_Off();
      this.segment2_On();
      this.segment3_On();
      this.segment4_Off();
      this.segment5_Off();
      this.segment6_On();
      this.segment7_On();
   
   }
}