public class sort_Insertion {

    void Sort(int arr[]){
         
        int n=arr.length;
         for(int i=1;i<n;++i){
           int key=arr[i];
            int j=i-1;

           while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
             j=j-1;
           }
           arr[j+1]=key;
         }
    }

    static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;++i)
        System.out.println(arr[i]+" ");

        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={24,45,12,98,65,38,91};
        
        sort_Insertion ob=new sort_Insertion();
        ob.Sort(arr);

        printArray(arr);
    }
}
