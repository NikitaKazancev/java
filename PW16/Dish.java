package PW16;

public final class Dish implements Item {

   private final float price;
   private final String name;
   private final String descr;

   public Dish(float price, String name, String descr) {
      this.price = price;
      this.name = name;
      this.descr = descr;
   }

   public Dish(String name, String descr) {
      this.name = name;
      this.descr = descr;
      price = 0;
   }

   public float getPrice() {
      return price;
   }

   public String getName() {
      return name;
   }

   public String getDescr() {
      return descr;
   }

   @Override
   public String toString() {
      return new StringBuffer()
         .append("Name: ")
         .append(name)
         .append(", price: ")
         .append(price)
         .append(", description: ")
         .append(descr)
         .toString();
   }
}
