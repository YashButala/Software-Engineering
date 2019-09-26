import java.util.*;
public class StackDemo {
        public static void main(String[] args)
        {
                Stack stack=new Stack();
                stack.push(new Integer(10));
                stack.push("a");
                System.out.println("Contents is"+stack);
                System.out.println("Size is"+stack.size());
                System.out.println("Number popped is"+stack.pop());
                System.out.println("Number popped is"+stack.pop());
                System.out.println("Contents is"+stack);
                System.out.println("Size is"+stack.size());
        }
}