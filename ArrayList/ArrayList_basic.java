import java.io.*;
import java.util.*;

//basic ArrayList example
public class ArrayList_basic {
    public static void main(String[] args) {
        
        //declaring size of ArrayList 
        int n=5;

        //declaring the ArrayList with fixed size
        ArrayList<Integer> arr1=new ArrayList<Integer>(n);

        //ArrayList can be initialized even without the size
        ArrayList<Integer> arr2=new ArrayList<Integer>();

        System.out.println("Array 1" +arr1);
        System.out.println("Array 2" +arr2);

        //appending the elements of the ArrayList
        for(int i=1;i<=n;i++){
            arr1.add(i);
            arr2.add(i);
        }

        //add element at a particular position
        arr1.add(1,45);


        //remove element at a particular position
        arr1.remove(1);

        //clears all elements from an array
        arr1.clear();
  
        //returns true if no element present in an array
        arr1.isEmpty();

        
        System.out.println("Array 1"+arr1);
        System.out.println("Array 2" +arr2);

        System.out.println(arr1.isEmpty());
    }
}
