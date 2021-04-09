import java.util.*;
public class TreeMapDemo {
    public static void main(String[]args){
        TreeMap tm=new TreeMap();
        tm.put(500,2342);
        tm.put(300,348);
        tm.put(400,3242);
        tm.put(100,7889);
        System.out.println(tm);
        Set s=tm.keySet();
        Iterator itr=s.iterator();

        while(itr.hasNext()){
            Object obj=itr.next();
            Integer num=(Integer)obj;
            System.out.println(num+" = "+tm.get(num));
        }

    }
}
