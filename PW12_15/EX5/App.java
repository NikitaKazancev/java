package PW12_15.EX5;

import PW12_15.EX5.FormattingString.FormattingType;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

   public static void main(String[] args) {
      Scanner consoleScanner = new Scanner(System.in);
      String fileName = consoleScanner.nextLine();
      consoleScanner.close();

      try (FileReader fileReader = new FileReader(fileName)) {
         Scanner fileScanner = new Scanner(fileReader);
         String str = fileScanner.nextLine();
         fileScanner.close();

         str = getLine(str);
         System.out.println(str);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static String getLine(String str) {
      ArrayList<String> words = new ArrayList<>(List.of(str.split(" ")));
      StringBuilder sb = new StringBuilder();

      FormattingString res = new FormattingString();
      if (words.size() != 0) {
         for (int i = 0; i < words.size(); i++) {
            res = getLine(sb, words, i);

            if (res.type == FormattingType.SUCCESS) {
               return sb.toString();
            }

            if (i != words.size() - 1) {
               sb = new StringBuilder();
            } else {
               return sb.toString();
            }
         }
      }

      return sb.toString();
   }

   public static FormattingString getLine(
      StringBuilder sb,
      ArrayList<String> words,
      int index
   ) {
      ArrayList<String> wordsCopy = (ArrayList<String>) words.clone();
      sb.append(wordsCopy.get(index));
      wordsCopy.remove(index);

      int counter = 0;
      while (wordsCopy.size() != 0) {
         for (int i = 0; i < wordsCopy.size(); i++) {
            if (addWord(sb, wordsCopy.get(i))) {
               wordsCopy.remove(i);
            }
            counter++;
         }

         if (counter == wordsCopy.size() && wordsCopy.size() != 0) {
            sb.append(" - [Unused words]:");
            for (String word : wordsCopy) {
               sb.append(" ").append(word);
            }
            return new FormattingString(FormattingType.ERROR, sb);
         }

         counter = 0;
      }

      return new FormattingString(FormattingType.SUCCESS, sb);
   }

   public static boolean addWord(StringBuilder sb, String word) {
      if (sb.charAt(sb.length() - 1) == word.charAt(0)) {
         sb.append(" ").append(word);
         return true;
      }

      return false;
   }
}
