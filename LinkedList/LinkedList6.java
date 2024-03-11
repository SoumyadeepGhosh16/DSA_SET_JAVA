import java.util.*;

//search an element of an linkedlist
class Node{
        int key;
        Node next;

        Node(int key){
            this.key=key;
            this.next=null;
        }
    }

    public class LinkedList6 {

        static void push(Node[] head_ref,int new_key){
            Node newNode=new Node(new_key);
            newNode.next=head_ref[0];
            head_ref[0]=newNode;
        }

    public static void main(String[] args) {
        Node[] head=new Node[1];
        int x=21;

        push(head, 10);
        push(head, 30);
        push(head, 11);
        push(head, 21);
        push(head, 14);

        Vector<Integer> v=new Vector<Integer>();
        Node temp=head[0];
        while(temp!=null){
            v.add(temp.key);
            temp=temp.next;
        }  
        
        int it=v.indexOf(x);
        if(it == -1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
