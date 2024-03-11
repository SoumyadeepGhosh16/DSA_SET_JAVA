import java.util.*;

//find the length of linked list
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedList7 {

    Node head;

    public void push(int data){

        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }

    public int getCount(){

        Node temp=head;
        int count=0;
        while(temp!=head){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        LinkedList7 list5 = new LinkedList7();
        list5.push(1);
        list5.push(3);
        list5.push(1);
        list5.push(2);
        list5.push(1);

        int size=list5.getCount();
 
        System.out.println("Count of nodes is "
                           +size);
    }
}
