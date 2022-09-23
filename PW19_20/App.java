package PW19_20;

import java.util.Collections;

public class App {

   public static void searchOutput(
      String searchDescr,
      boolean found,
      double time
   ) {
      System.out.println(
         searchDescr +
         ": номер " +
         (found ? "" : "не ") +
         "найден, поиск занял " +
         time +
         "нс"
      );
   }

   public static void main(String[] args) {
      Phone phone = new Phone();

      for (int i = 0; i < 10; i++) {
         phone.generate(77);
      }
      System.out.println(phone.getPhones());

      String testNumber = phone.getPhones().get(4);
      System.out.println("\n" + "Номер для поиска: " + testNumber);

      Collections.sort(phone.getPhones());
      boolean sortRes;
      long m;

      m = System.nanoTime();
      sortRes = phone.straightSearch(testNumber);
      searchOutput(
         "Поиск перебором",
         sortRes,
         (double) (System.nanoTime() - m)
      );

      m = System.nanoTime();
      sortRes = phone.binarySearch(testNumber);
      searchOutput("Бинарный поиск", sortRes, (double) (System.nanoTime() - m));

      m = System.nanoTime();
      sortRes = phone.hashSetSearch(testNumber);
      searchOutput(
         "Поиск в HashSet",
         sortRes,
         (double) (System.nanoTime() - m)
      );

      m = System.nanoTime();
      sortRes = phone.treeSetSearch(testNumber);
      searchOutput(
         "Поиск в TreeSet",
         sortRes,
         (double) (System.nanoTime() - m)
      );
   }
}
