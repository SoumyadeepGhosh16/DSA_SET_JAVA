import java.util.*;
//java program to change elements by set()
public class ArrayList_set {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();

        a1.add("CSE");
        a1.add("EIE");

        //adding element
        a1.add("ECE");

        System.out.println("Initial ArrayList"+a1);

        //setting element at the second position
        a1.set(1,"AEIE"); 

        System.out.println("Initial ArrayList"+a1);
    }
}
