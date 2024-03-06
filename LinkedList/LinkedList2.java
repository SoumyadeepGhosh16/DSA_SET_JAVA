import java.util.*;

//linkedlist implementation and implementing the insertion and deletion of nodes by predefined functions

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");

        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }

        System.out.println("NULL");

        list.removeFirst();
        list.removeLast();

        list.remove(1);

        System.out.println(list);
    }
}




