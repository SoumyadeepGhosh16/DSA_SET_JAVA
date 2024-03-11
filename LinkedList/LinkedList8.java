public class LinkedList8 {

static Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void deleteList(){
        head=null;
    }

    public void push(int new_data){

        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;

    }

    public void printList(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        
        LinkedList8 list=new LinkedList8();

        list.push(1);
        list.push(5);
        list.push(4);
        list.push(12);
        list.push(1);

        list.printList();

        list.deleteList();

        list.printList();
    }
}
