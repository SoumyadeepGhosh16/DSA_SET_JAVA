import java.util.Stack;

//reversing a stack
public class Stack_5 {

    public static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void Reverse(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        Reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(4);
        s.push(6);
        
        Reverse(s);
        
        while(!s.isEmpty()){
           System.out.println(s.peek());
            s.pop();
        }
    }
}
