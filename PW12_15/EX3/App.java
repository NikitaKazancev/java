package PW12_15.EX3;

public class App {

   public static void main(String[] args) {
      String[] shirtsStr = new String[11];
      shirtsStr[0] = "S001,Black Polo Shirt,Black,XL";
      shirtsStr[1] = "S002,Black Polo Shirt,Black,L";
      shirtsStr[2] = "S003,Blue Polo Shirt,Blue,XL";
      shirtsStr[3] = "S004,Blue Polo Shirt,Blue,M";
      shirtsStr[4] = "S005,Tan Polo Shirt,Tan,XL";
      shirtsStr[5] = "S006,Black T-Shirt,Black,XL";
      shirtsStr[6] = "S007,White T-Shirt,White,XL";
      shirtsStr[7] = "S008,White T-Shirt,White,L";
      shirtsStr[8] = "S009,Green T-Shirt,Green,S";
      shirtsStr[9] = "S010,Orange T-Shirt,Orange,S";
      shirtsStr[10] = "S011,Maroon Polo Shirt,Maroon,S";

      Shirt[] shirts = new Shirt[11];
      for (int i = 0; i < shirtsStr.length; i++) {
         shirts[i] = Shirt.fromString(shirtsStr[i]);
      }

      for (Shirt shirt : shirts) {
         System.out.println(shirt);
      }
   }
}
