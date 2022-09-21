package PW8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {

   protected ConcurrentLinkedQueue<E> content;

   WaitList() {
      content = new ConcurrentLinkedQueue<>();
   }

   WaitList(Collection<E> c) {
      content = new ConcurrentLinkedQueue<>(c);
   }

   @Override
   public void add(E element) {
      content.add(element);
   }

   @Override
   public E remove() {
      return content.remove();
   }

   @Override
   public boolean contains(E element) {
      return content.contains(element);
   }

   @Override
   public boolean containsAll(Collection<E> c) {
      return content.containsAll(c);
   }

   @Override
   public boolean isEmpty() {
      return content.isEmpty();
   }

   /**
    * Вывод элементов очереди построчно, основываясь на их методе toString
    */
   @Override
   public String toString() {
      String res = "";

      for (E e : content) {
         res += (e.toString() + "\n");
      }

      return res;
   }
}
