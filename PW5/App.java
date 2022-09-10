package PW5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

   public static long ex9(int a, int b) {
      if (a - 1 > b) return 0; else if (a - 1 == b) return 1; else return (
         (long) Functions.factorial(b + 1) /
         (Functions.factorial(a) * Functions.factorial(b + 1 - a))
      );
   }

   public static String ex10(int a) {
      String res = "";

      while (a != 0) {
         res += String.valueOf(a % 10);
         a /= 10;
      }

      return res;
   }

   public static void main(String[] args) {
      System.out.println(ex9(5, 5));
      System.out.println(ex9(1, 5));
      System.out.println(ex9(2, 3));

      System.out.println(ex10(142146));

      Scanner scanner = new Scanner(System.in);

      long prevNum = 1, num;
      ArrayList<Long> res = new ArrayList<Long>();
      while (true) {
         num = scanner.nextInt();
         res.add(num);
         if (num == 0) {
            if (prevNum == 0) break; else prevNum = 0;
         }
      }
      scanner.close();

      System.out.println(Functions.amount(res, 1));
   }
}
