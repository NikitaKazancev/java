package PW9.db;

import PW9.users.User;
import java.util.ArrayList;

public class DB {

   private static ArrayList<User> users = new ArrayList<>();

   public DB() {
      users.add(new User("Alex", "None", 1, 100));
      users.add(new User("Nike", "None", 2, 25));
      users.add(new User("Olga", "None", 4, 34));
      users.add(new User("Maria", "None", 5, 120));
      users.add(new User("Amber", "None", 3, 0));
   }

   public static ArrayList<User> getUsers() {
      return users;
   }
}
