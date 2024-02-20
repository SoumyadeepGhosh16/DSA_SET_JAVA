class Node{
    int data;
    Node next;
}

public class LinkedList_Insertion3 {
    Node head;

    void InsertAfter(int new_data,Node prev_node){

        if(prev_node!=null){
            System.out.println
            ("the previous node cannot be null");
            return;
        }

        Node new_node=new Node();

        new_node.data=new_data;

        new_node.next=prev_node.next;

        prev_node.next=new_node;
    }

    void push(int new_data){
        Node new_node=new Node();
        new_node.data=new_data;
        new_node.next = head;
        head = new_node;
    }

    void printList(){
        Node node=head;
        if(node!=null){
            System.out.println(" "+node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        LinkedList_Insertion3 list=new LinkedList_Insertion3();
   
        list.push(9);
        list.push(7);
        list.push(4);
        list.push(8);
        list.push(2);
        list.push(6);

        System.out.println("Created linked list is:");
        list.printList();

        list.InsertAfter(1, list.head);

        System.out.println("after inserting 1 after 6");
        list.printList();
    }
}
