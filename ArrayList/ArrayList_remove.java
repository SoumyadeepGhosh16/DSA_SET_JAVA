import java.util.*;

public class ArrayList_remove {
    public static void main(String[] args) {
        
        ArrayList<String> a1=new ArrayList<>();

        a1.add("Rajesh");
        a1.add("Suresh");

        a1.add(1,"Soumyadeep");

        System.out.println("Initial ArrayList"+a1);

        //removing by element name directly
        a1.remove("Suresh");

        System.out.println("Initial ArrayList"+a1);

        //removal of element by index
        a1.remove(0);

        System.out.println("Initial ArrayList"+a1);
    }
}
