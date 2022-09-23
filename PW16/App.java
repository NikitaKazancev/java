package PW16;

public class App {

   public static void main(String[] args) {
      Order order = new Order();

      Dish pizza = new Dish(10, "Pizza", "Peperoni");

      order.add(new Dish("Fish", "yummy"));
      order.add(pizza);
      order.add(new Drink(5, "Cocktail", "Margarita"));
      System.out.println(order);

      order.remove(pizza);
      System.out.println(order);
   }
}
