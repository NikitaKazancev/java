package PW9.users;

import PW9.users.dto.UserSearchDto;
import java.util.Objects;

public class User implements Comparable<User> {

   private String name;
   private String surname;
   private int id;
   private int finalScore;

   public User(String name, String surname, int id, int finalScore) {
      this.name = name;
      this.surname = surname;
      this.id = id;
      this.finalScore = finalScore;
   }

   public String getName() {
      return name;
   }

   public String getSurname() {
      return surname;
   }

   public int getId() {
      return id;
   }

   public int getFinalScore() {
      return finalScore;
   }

   @Override
   public int compareTo(User user) {
      if (id == user.id) {
         return 0;
      } else if (id > user.id) {
         return 1;
      } else {
         return -1;
      }
   }

   public boolean checkUser(UserSearchDto user) {
      return (
         Objects.equals(this.name, user.name) &&
         Objects.equals(this.surname, user.surname)
      );
   }

   @Override
   public String toString() {
      return (
         "{ name: " +
         name +
         ", surname: " +
         surname +
         ", id: " +
         id +
         ", final-score: " +
         finalScore +
         " }"
      );
   }
}
