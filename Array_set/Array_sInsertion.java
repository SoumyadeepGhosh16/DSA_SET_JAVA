public class Array_sInsertion {
//insertion in a sorted array
    static int sortedInsertion(int arr[],int n,int key,int capacity){
        int i;

        if(n>=capacity)
        return n;


          for(i=n-1;(i>=0 && arr[i]>key);i--)
            arr[i+1]=arr[i];
          
          arr[i+1]=key;

          return (n+1);
    }
    public static void main(String[] args) {
        int[] arr=new int[20];

        arr[0]=23;
        arr[1]=35;
        arr[2]=49;
        arr[3]=65;
        arr[4]=76;
        arr[5]=90;

        int capacity=arr.length;
        int n=6;
        int key=59;

        System.out.println("before insertion");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] +" ");

        n=sortedInsertion(arr,n,key,capacity);

        System.out.println("\nafter insertion");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] +" ");
    }
}
