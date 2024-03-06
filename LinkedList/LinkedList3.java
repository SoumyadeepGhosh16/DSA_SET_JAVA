

public class LinkedList3 {

    private int size;
    
        LinkedList3(){
            this.size = 0;
        }
    
        class Node{
            String data;
            Node next;
           
         Node(String data){
                this.data=data;
                this.next=null;
                size++;
            }
        }
    
        static Node head;
    
    //insert at the front of the list
        public void InsertAtFront(String data){
            Node newNode=new Node(data);
            
            if(head==null){
                head = newNode;
                return;
            }
    
            newNode.next=head;
            head=newNode;
        }
    
    //insert at the end of the list    
        public void InsertAtLast(String data){
            Node newNode=new Node(data);
            
            if(head==null){
                head = newNode;
                return;
            }
    
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
    
    //delete node element from the front    
        public void deleteAtFirst(){
            if(head==null){
                System.out.println("the list is empty");
                return;
            }
    
            size--;
            head=head.next;
        }
    
    //delete node element from the end    
        public void deleteAtEnd(){
            if(head==null){
                System.out.println("the list is empty");
                return;
            }
    
            size--;
    
            if(head.next==null){
                head=null;
                return;
            }
    
    
            Node secondLast = head;
            Node lastNode=head.next;
    
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                secondLast=secondLast.next;
            }
            
            secondLast.next=null;
        }
    
        public int getSize(){
            return size;
        }

//reversing the linkedlist                                
        public void reverseIterate(){

            if(head==null || head.next==null){
                System.out.println("the list is empty");
                return;
            }

            Node prevNode=head;
            Node currNode=head.next;
            
            while(currNode!=null){
                Node nextNode=currNode.next;
                currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
            }

            head.next=null;
            head=prevNode;
        }

//
    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }       
    
    //printing statement of the list
        public void printList(){
    
            if(head==null){
                System.out.println("list is empty");
                return;
            }
    
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data + " -> ");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }
        
        public static void main(String[] args) {
            LinkedList_Implementation list=new LinkedList_Implementation();
    
            list.InsertAtFront("a");
            list.InsertAtFront("is");
            list.InsertAtFront("This");
    
            list.InsertAtLast("list");
    
            list.printList();
    
            list.deleteAtEnd();
            list.printList();
    
            list.deleteAtFirst();
            list.printList();
    
            System.out.println(list.getSize());
            
            list.reverseIterate();
            list.printList();

            list.reverseRecursive();
            list.printList();
        }
    }
    