public class Recursion_7 {
//check if array is sorted with recursion
    public static boolean isSorted(int arr[],int idx){
   
        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
             return isSorted(arr, idx+1);
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,5,3,9,2};
        System.out.println(isSorted(arr, 0));
    }
}
