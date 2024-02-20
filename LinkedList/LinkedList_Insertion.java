import java.io.*;
//insertion ata the begining/front of the list
class Node{
    int data;
    Node next;
}

class LinkedList_Insertion {

    Node head;

    void insertAtFront(int new_data){
        //allocating node
        Node new_node=new Node();
        //put in data
        new_node.data=new_data;
        //make next of new node as head
        new_node.next=head;
        //moving the head to point to the next node
        new_node=head;
    }

    void printList(){
        Node node=head;
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList_Insertion list=new LinkedList_Insertion();

        list.insertAtFront(90);
        list.insertAtFront(70);
        list.insertAtFront(50);
        list.insertAtFront(40);
        list.insertAtFront(20);
        list.insertAtFront(10);

        System.out.println("after inserting nodes at their front:");
        list.printList();
    }
}
