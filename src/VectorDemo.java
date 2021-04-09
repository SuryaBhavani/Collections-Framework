//in arraylist the capacity will increase 50%
// in vector the capacity get double
//hasPrevious doesn't work for vectors
import java.util.*;
public class VectorDemo {
    public static void main(String[]args){
        Vector<Integer>v=new Vector();//we can customize the capacity of a vector by giving "new Vector(size,increment value);"
        for(int i=0;i<30;i++) {
            if(i % 2 == 0) {
                v.add(i);
            }
        }
        ListIterator <Integer> itr=v.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("\nVector Capacity:"+v.capacity());
        System.out.println("Vector size:"+v.size());
    }
}
