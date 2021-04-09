import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class HashTableDemo {
    public static void main(String[]args){
        Hashtable ht=new Hashtable();
            ht.put(500,2342);
            ht.put(300,348);
            ht.put(400,3242);
            ht.put(100,7889);
            Set s=ht.keySet();
            Iterator itr=s.iterator();

            while(itr.hasNext()){
                Object obj=itr.next();
                Integer num=(Integer)obj;
                System.out.println(num+" = "+ht.get(num));
                
            }

        }
    }


