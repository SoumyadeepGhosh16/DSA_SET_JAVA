class Array_binary {
//binary search can only be done to sorted array
    static int binarySearch(int arr[],int low,int high,int key){
        if(high<low)
            return -1;
    

        int mid=(low+high)/2;
        if(key==arr[mid])
            return mid;
        if(key>arr[mid])
            return binarySearch(arr,(mid+1),high,key);
        
          return binarySearch(arr,low,(mid-1),key);
    }
    public static void main(String[] args) {

        int[] arr={45,54,59,66,79,91};
        int n=arr.length-1;
        int key=91;

        System.out.println("Index:"+binarySearch(arr,0,n, key));
    }
}

