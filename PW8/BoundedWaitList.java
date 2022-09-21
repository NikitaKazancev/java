package PW8;

public class BoundedWaitList<E> extends WaitList<E> {

   private int capacity;

   BoundedWaitList(int capacity) {
      super();
      this.capacity = capacity;
   }

   public int getCapacity() {
      return capacity;
   }

   /**
    * Добавление нового элемента в очереди, если есть место для добавления
    * При неожиданном случае, когда размер очереди больше capacity, выброс ошибки
    */
   @Override
   public void add(E element) {
      if (content.size() < capacity) {
         super.add(element);
      } else if (content.size() > capacity) {
         throw new Error("Error! [BoundedWaitList] capacity < size");
      }
   }
}
