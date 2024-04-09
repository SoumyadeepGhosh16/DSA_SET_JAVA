import java.util.*;

//java program to implement queue using two stacks
public class Queue_5 {

    static class Queue{
        static java.util.Stack<Integer> s1 = new java.util.Stack<>(); 
        static java.util.Stack<Integer> s2 = new java.util.Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

           return s1.pop();
    
        }


    }

    public static void main(String[] args) {
        
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // 1 2 3 4 5  
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
