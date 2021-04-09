import java.util.*;
public class CollectionClassDemo {
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add(223);
        al.add(2);
        al.add(33);
        al.add(90);
        System.out.println("Original ArrayList:\n"+al);
        Collections.reverse(al);
        System.out.println("Reversed ArrayList:\n"+al);
        Collections.sort(al);
        System.out.println("Sorted ArrayList:\n"+al);
        Collections.swap(al,0,1);
        System.out.println("Swap two elements:\n"+al);
        System.out.println("Min value in the ArrayList:\n"+Collections.min(al));
        System.out.println("Max value in the ArrayList:\n"+Collections.max(al));
    }
}
