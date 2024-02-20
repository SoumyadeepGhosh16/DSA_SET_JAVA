public class LinkedList_Insertion2 {
//insertion at the beginning /front of the list
    static class node{
        int data;
        node next;
        node(int value){
            data=value;
            next=null;
        }
    }

    static node head;

    static void printList(){
        node p=head;
        System.out.println("\n[");

        while(p!=null){
            System.out.println(" "+p.data+" ");
            p=p.next;
        }
        System.out.println("\n]");
    }

    static void insertAtFront(int data){
        node lk=new node(data);

        lk.next=head;

        head=lk;

    }
    public static void main(String[] args) {
        int k=0;

        insertAtFront(12);
        insertAtFront(52);
        insertAtFront(41);
        insertAtFront(63);
        insertAtFront(89);
        insertAtFront(23);

        System.out.println("Linked List:");
        printList();
    }
}
