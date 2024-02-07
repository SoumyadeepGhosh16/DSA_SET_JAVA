import java.io.*;
import java.util.*;

public class ArrayList_size {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int b=arr.size();
        System.out.println("the size of the arraya is"+b);
    }
}
