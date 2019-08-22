/**
   An interface for a class of pairs of objects.
   (Listing JI1-1 of Java Interlude 1.)

   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public interface Pairable<T>
{
   public T getFirst();
   public T getSecond();
   public void changeOrder();
} // end Pairable