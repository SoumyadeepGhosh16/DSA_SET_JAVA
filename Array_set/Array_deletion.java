public class Array_deletion {

    static int findElement(int arr[],int n,int key){
         int i;
         for( i=0;i<n;i++)
            if(arr[i]==key)
            return i;

        return -1;    
    }

    static int deleteElement(int arr[],int n,int key){
        int pos=findElement(arr,n,key);
        
        if(pos==-1){
            System.out.println("element not found");
        
            return n;
        }
       int i;
       for( i=pos;i<n-1;i++)
          arr[i]=arr[i+1];

          return n-1;

    }
    public static void main(String[] args) {
        int i;
        int[] arr={50,20,10,60,30};
        int key=10;
        int n=arr.length;

        System.out.println("before deletion");
        for(i=0;i<n;i++)
        System.out.print(arr[i] +" ");

        n=deleteElement(arr,n,key); 

        System.out.println("\n\nafter deletion");
        for(i=0;i<n;i++)
        System.out.print(arr[i] +" ");
    }
}
