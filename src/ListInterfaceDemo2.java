//best for retrieving the elements
import java.util.*;
public class ListInterfaceDemo2 {
    public static void main(String[] args) {
        List al1 = new ArrayList();
        List al2 =new ArrayList();
        al1.add("Element2");
        al1.add(0, "Element1"); //To insert at a specific index" obj.add(index,value) "
        al2.add("Element3");
        al2.add("Element4");
        al2.add("Element5");
        al2.add("Element6");
        al2.addAll(0,al1);//To add a collection to another collection
        al1.clear();//To remove elements of a list
        System.out.println("ArrayList1 Elements:");
        for( Object a:al1){
            System.out.println(a);
        }
        System.out.println("ArrayList2 Elements:");
        for(Object b:al2){
            System.out.println(b);
        }
        System.out.println("Check Whether both the lists are equal or not :\n"+al1.equals(al2));//To check whether both the lists are equal and of same order.
        System.out.println("Check whether list1 is empty or not :\n"+al1.isEmpty());
        System.out.println("To find the last occurance of an element in the list :\n"+al2.lastIndexOf("Element2"));
        System.out.println("To find the first occurance of an element in a list: \n "+al2.indexOf("Element9"));
        System.out.println("To check whether an element is ptesent in a list:\n"+ al2.contains("Element7"));
        al2.remove(3);
        al2.set(3,"Element4");//To replace an element with other element
        System.out.println(al2);
        al2.remove("Element5");
        System.out.println(al2);
        al2.add(4,"element5");
        al2.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(al2);
        al2.sort(Comparator.naturalOrder());
        System.out.println(al2);
        System.out.println(al2.subList(3,5));//To create a sublist of an element
    }
}