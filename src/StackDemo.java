import java.util.*;
public class StackDemo {
    public static void main(String[]args){
        Stack s=new Stack();
        for(int i=0;i<20;i++){
            s.push(i);
        }
        s.pop();
        s.remove(0);

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.search(17));
        System.out.println(s.capacity());
    }
}
