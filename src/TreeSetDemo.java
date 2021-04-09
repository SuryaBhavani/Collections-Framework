import java.util.*;
public class TreeSetDemo {
    public static void main(String[]args){
        TreeSet ts=new TreeSet();
        for(char i='z';i>='a';i--){
            ts.add(i);
        }

        Iterator itr=ts.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        Iterator itr1=ts.descendingIterator();
        while(itr1.hasNext()){
            System.out.print(itr1.next()+" ");
        }
        System.out.println();
        System.out.println("First element of the list:\n"+ts.first());
        System.out.println("Last element of the list:\n"+ts.last());
        TreeSet ts1=(TreeSet)ts.headSet('s');
        System.out.println(ts1);
        TreeSet ts2=(TreeSet)ts.tailSet('s');
        System.out.println(ts2);
        TreeSet ts3=(TreeSet)ts.subSet('a','s');
        System.out.println(ts3);

    }
}
