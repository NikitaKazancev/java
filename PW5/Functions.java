package PW5;

import java.util.ArrayList;

public class Functions {

   private static ArrayList<Long> factorials = new ArrayList<Long>();

   public static long factorial(int n) {
      if (factorials.size() - 1 >= n) return factorials.get(n); else {
         long res;

         if (n == 0) res = 1; else res = n * factorial(n - 1);

         factorials.add(res);
         return res;
      }
   }

   public static int amount(ArrayList<Long> arr, long n) {
      ArrayList<Integer> res = new ArrayList<Integer>();
      res.add(0);
      arr.forEach(
         number -> {
            if (number == n) res.add(res.get(res.size() - 1) + 1);
         }
      );
      return res.get(res.size() - 1);
   }
}
