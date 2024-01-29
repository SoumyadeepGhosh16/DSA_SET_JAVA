import java.util.*;

public class arrayreverse {
    private static int i;

    public static void main(String[] args){

    int[] numbers={1,2,3,4,5};

    int a=numbers.length;
    System.out.println("size of array is:"+a);

    int n =Math.floorDiv(a,2);

    for(int i=0;i<n;i++){

        int temp=numbers[i];
        numbers[i]=numbers[a-i-1];
        numbers[a-i-1]= temp;
    }
    for(int digits:numbers)
    System.out.println( +digits);
    }
}
