import java.util.Stack;

//push element at the bottom of a stack
public class Stack_4 {

    public static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(4);
        s.push(6);
        
        pushAtBottom(9, s);
        
        while(!s.isEmpty()){
           System.out.println(s.peek());
            s.pop();
        }
    }
}
