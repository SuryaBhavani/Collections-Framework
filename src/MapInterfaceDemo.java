import java.util.*;
public class MapInterfaceDemo {
    public static void main(String[]args){
        HashMap <Integer,String>hm=new HashMap<>();
        hm.put(401,"apple");
        hm.put(400,"ball");
        hm.put(403,"cat");
        hm.put(403,"dog");
        hm.remove(403);//to remove a value using the key

        System.out.println(hm.get(400));
        System.out.println(hm.size());//to find the size
        Set s=hm.keySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Object obj=itr.next();
            Integer str=(Integer)obj;
            System.out.println(str+"="+hm.get(str));
        }
    }
}
