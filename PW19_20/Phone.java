package PW19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Phone {

   private String letters = "АВЕКМНOPCTYX";
   private int lettersAmount = letters.length();

   private ArrayList<String> phones = new ArrayList<>();
   private HashSet<String> hashSet = new HashSet<>();
   private TreeSet<String> treeSet = new TreeSet<>();

   private void addLetter(StringBuffer sb) {
      sb.append(letters.charAt(Functions.random(0, lettersAmount)));
   }

   public String generate(int region) {
      StringBuffer strBuff = new StringBuffer();

      addLetter(strBuff);

      int randInt = Functions.random(0, 9);
      strBuff.append(randInt).append(randInt).append(randInt);

      addLetter(strBuff);
      addLetter(strBuff);

      strBuff.append(Functions.addZero(region));

      String res = strBuff.toString();
      phones.add(res);
      hashSet.add(res);
      treeSet.add(res);
      return res;
   }

   public boolean straightSearch(String str) {
      return phones.contains(str);
   }

   public boolean binarySearch(String str) {
      return Collections.binarySearch(phones, str) >= 0;
   }

   public boolean hashSetSearch(String str) {
      return hashSet.contains(str);
   }

   public boolean treeSetSearch(String str) {
      return treeSet.contains(str);
   }

   public ArrayList<String> getPhones() {
      return phones;
   }

   public String getLetters() {
      return letters;
   }

   public HashSet<String> getHashSet() {
      return hashSet;
   }

   public TreeSet<String> getTreeSet() {
      return treeSet;
   }
}
