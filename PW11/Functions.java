package PW11;

public class Functions {

   public static float getAfterOp(String operation, float a, float b) {
      switch (operation) {
         case "+":
            return a + b;
         case "-":
            return a - b;
         case "*":
            return a * b;
         case "/":
            return a / b;
         default:
            return a + b;
      }
   }
}
