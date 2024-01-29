public class Array_insertion {

    static void insertArray(int arr[],int n,int p,int x){
         for(int i=n-1;i>=p;i--)
            arr[i+1]=arr[i];
            arr[p]=x;
         
    }
    public static void main(String[] args) {
        int[] arr=new int[15];

        arr[0]=31;
        arr[1]=53;
        arr[2]=96;
        arr[3]=44;
        arr[4]=74;

        int n=5;
        int x=10;
        int p=2;

        System.out.println("before insertion");

        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");

        insertArray(arr,n,p,x);
        n+=1;

        System.out.println("after insertion");

        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
        
    }
}
