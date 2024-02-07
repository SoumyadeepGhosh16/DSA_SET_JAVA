import java.io.*;
import java.util.*;

public class ArrayList_sort {
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();

        list.add(53);
        list.add(39);
        list.add(45);
        list.add(10);
        list.add(61);

        System.out.println("Before sorting list:"+list);

        Collections.sort(list);
        System.out.println("after sorting list"+list);
    }
}
