package PW16;

public final class Drink implements Item {

   private final float price;
   private final String name;
   private final String descr;

   public Drink(float price, String name, String descr) {
      this.price = price;
      this.name = name;
      this.descr = descr;
   }

   public Drink(String name, String descr) {
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

   public void drink() {
      System.out.println(
         new StringBuffer()
            .append("I'm drinking ")
            .append(name)
            .append("\nIt's cost ")
            .append(price)
            .append("\nSmth about it: ")
            .append(descr)
            .toString()
      );
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
