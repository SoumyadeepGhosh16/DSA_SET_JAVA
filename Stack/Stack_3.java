import java.util.Stack;

//stack implementation using collection framework
public class Stack_3 {
    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(4);
        s.push(6);
        s.push(3);
        s.push(9);
        s.push(7);

        
        while(!s.isEmpty()){
           System.out.println(s.peek());
            s.pop();
        }
    }
}
