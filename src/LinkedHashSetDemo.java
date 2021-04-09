import java.util.*;
public class LinkedHashSetDemo {
    public static void main(String[]args){
        LinkedHashSet <Integer>lhs=new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(4);
        for(Integer i:lhs){
            System.out.println(i);
        }

    }
}
