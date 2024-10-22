//Zain Marshall 08/30/2024
package Digits;

public class Seven extends Digit{
   public Seven(int x, int y) {
      super(x, y);
   }
   @Override
   
   public void display() {
      this.segment1_On();
      this.segment2_On();
      this.segment3_On();
      this.segment4_Off();
      this.segment5_Off();
      this.segment6_Off();
      this.segment7_Off();
   
   }
}