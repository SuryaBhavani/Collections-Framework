import java.util.*;
public class ListInterfaceDemo {
    public static void main(String []args){
      List <String> al=new ArrayList<>();
      al.add("Surya");
      al.add("Bhavani");
      al.add("Kovvuri");
      System.out.println("METHOD 1");
      System.out.println(al);// Using simple print statement.
        System.out.println("METHOD 2");
        for(String i:al){
            System.out.print(i+" ");//Using for each loop.
        }
        System.out.println("\nMETHOD 3");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");//Using for loop and obj.get(index) method
        }
        System.out.println("\nMETHOD 4");
        Iterator<String>itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");//Using iterator interface
        }
        System.out.println("\nMETHOD 5");
        System.out.println("Forward Traversal");
        //Using listiterator interface which is the child interface of iterator interface we can traverse in both the directions
        ListIterator<String>litr=al.listIterator();
        while(litr.hasNext()){
            System.out.print(litr.next()+" ");
        }
        System.out.println("\nReverse Traversal");
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }
        System.out.println("\nMethod 6:");
        al.forEach(a ->{
            System.out.print(a+" "); //Using forEach loop and lambda expression(->);
        });
        System.out.println("\nMethod 7:");
        Iterator <String> itr1=al.iterator();
        itr1.forEachRemaining(a ->{
            System.out.print(a+" "); //Using forEachRemaining loop along with iterator interface and lambda expression(->);
        });

    }
}
