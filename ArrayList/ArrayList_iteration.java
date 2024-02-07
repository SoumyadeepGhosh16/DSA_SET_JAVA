import java.util.*;

public class ArrayList_iteration {
        public static void main(String[] args) {
            
        ArrayList<String> arr = new ArrayList<>();
 
        arr.add("Practice");
        arr.add("Perfect");
        arr.add(1, "Makes");

        //using get() method
        for(int i=0;i<arr.size();i++){
            
            System.out.println(arr.get(i)+" ");
        }
        System.out.println();

        //using for each loop
        for(String elements:arr){
            System.out.println(elements+" ");
        }
    }
}
