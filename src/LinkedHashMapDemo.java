import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[]args){
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(1,"Element1");
        lhm.put(2,"Element2");
        lhm.put(3,"Element3");
        lhm.put(4,"Element4");
        lhm.put(5,"Element5");
        Set s=lhm.keySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Object obj=itr.next();
            Integer str=(Integer)obj;
            System.out.println(str+"="+lhm.get(str));

        }


        System.out.println(lhm);

    }
}
