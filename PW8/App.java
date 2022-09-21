package PW8;

import java.util.ArrayList;

public class App {

   public static void main(String[] args) {
      ArrayList<User> users = new ArrayList<User>();
      User testUser = new User("Nike", 10);
      users.add(testUser);
      users.add(new User("Helena", 11));
      users.add(new User("Alex", 12));
      users.add(new User("Elizabeth", 13));
      users.add(new User("Missy", 14));

      WaitList<User> waitList = new WaitList<>(users);
      System.out.println(waitList);
      waitList.add(new User("No one", 1000));
      System.out.println(waitList.contains(testUser));
      System.out.println(waitList);
   }
}
