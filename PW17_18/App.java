package PW17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

   public static boolean check(String str, String regex) {
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(str);

      return matcher.find();
   }

   public static void main(String[] args) {
      String testStr1 = "abcdefghijklmnopqrstuv18340";
      String testStr2 = "abcdefghijklmnoasdfasdpqrstuv18340";

      String regex = "^abcdefghijklmnopqrstuv18340$";
      System.out.println(check(testStr1, regex));
      System.out.println(check(testStr2, regex));

      testStr1 = "aE:dC:cA:56:76:54";
      testStr2 = "01:23:45:67:89:Az";
      regex = "^[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:\\d{2}:\\d{2}:\\d{2}$";
      System.out.println(check(testStr1, regex));
      System.out.println(check(testStr2, regex));

      testStr1 = "Text 23.78 USD smth";
      testStr2 = "Text 22 UDD, 0.002 USD smth";
      regex = "\\d+\\.\\d{1,2} (USD)|(RUR)|(EU)";
      System.out.println(check(testStr1, regex));
      System.out.println(check(testStr2, regex));
   }
}
