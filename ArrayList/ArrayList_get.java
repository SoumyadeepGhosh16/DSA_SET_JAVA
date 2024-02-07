import java.io.*;
import java.util.*;

public class ArrayList_get {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        int n=list.get(2);

        System.out.println("at indext 1 number is:"+n);
    }
}
