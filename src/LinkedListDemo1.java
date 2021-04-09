//best for adding and removing elements
//worst for data retrieval
import java.util.*;
public class LinkedListDemo1 {
     public static void main(String[]args){
         LinkedList<Integer> ll=new LinkedList<>();
         ll.add(1);
         System.out.println(ll);
         ll.add(0,2);
         System.out.println(ll);
         ll.addFirst(3);
         System.out.println(ll);
         ll.addLast(4);
         System.out.println(ll);
         System.out.println("first element in the list:\n"+ll.getFirst());
         System.out.println("last element in the list:\n"+ll.getLast());
         System.out.println("Size of the list:\n"+ll.size());
         ListIterator<Integer>itr=ll.listIterator();
         while(itr.hasNext()){
             System.out.print(itr.next()+" ");
         }
         System.out.println("\nReverse Order:");
         while(itr.hasPrevious()){
             System.out.print(itr.previous()+" ");
         }
         Collections.sort(ll);
         System.out.println(ll);
         ll.sort(Comparator.naturalOrder());
         System.out.println("\nSorted list:\n"+ll);
         Collections.sort(ll,Collections.reverseOrder());
         System.out.println("Descending order:\n"+ll);

     }
}
