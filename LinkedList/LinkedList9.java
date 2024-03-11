//find the nth index value from a linkedlist

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

public class LinkedList9 {

    static Node head;

    public int getNth(int index){

        Node currNode=head;
        int count=0;

        while(currNode!=null){

            if(count == index){
                return currNode.data;
                
            }else{
                count++;
                currNode=currNode.next;
            }
        }

        assert(false);
        return 0;
    }

    public void push(int new_data){

        Node new_node=new Node(new_data);

        new_node.next=head;

        head=new_node;
    }
    public static void main(String[] args) {
        
        LinkedList9 list=new LinkedList9();

        list.push(1);
        list.push(65);
        list.push(23);
        list.push(5);
        list.push(35);
        list.push(134);

        System.out.println("Element at index 3 is"+list.getNth(3));
    }
}
