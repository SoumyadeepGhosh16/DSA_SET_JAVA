//java program to implement selection sort
import java.util.*;
public class sort_Selection {

    void sort(int arr[]){

        int n=arr.length;

        for(int i=0;i<n-1;i++){

            int min_idx=i;
             for(int j=i+1;j<n;j++)
               if(arr[j]<arr[min_idx])
                   min_idx=j;

            int temp=arr[min_idx];
             arr[min_idx]=arr[i];
               arr[i]=temp;

        }
    }

    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        sort_Selection obj=new sort_Selection();
        int[] arr={11,68,53,71,20,47};
        obj.sort(arr);
        System.out.println("after sorting");
        obj.printArray(arr);
    }
}
