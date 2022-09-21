package PW8;

public class User {

   String name;
   int age;

   User(String name, int age) {
      this.name = name;
      this.age = age;
   }

   @Override
   public String toString() {
      return "{name: \"" + name + "\", age: \"" + age + "\"}";
   }
}
