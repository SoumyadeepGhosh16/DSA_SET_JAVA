public class Array_linear {

    static int printArray(int arr[],int n,int key){
        for(int i=0;i<n;i++)
            if(arr[i]==key)
               return i;

         return -1;      
    }
    public static void main(String[] args) {
        int[] arr={45,21,64,33,19};

        int n=arr.length;

        int key=65;

        int position=printArray(arr,n,key);

        if(position==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at position"+(position+1));
        }
    }
}
