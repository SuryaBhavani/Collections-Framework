import java.util.*;
public class SetInterfaceDemo {
    public static void main(String[]args){
        HashSet <String>hs=new HashSet<>();
        hs.add("surya");
        hs.add("bhavani");
        hs.add("kovvuri");
        hs.add("surya");
        Iterator<String> ls=hs.iterator();
        while(ls.hasNext()){
            System.out.println(ls.next());
        }
    }
}
