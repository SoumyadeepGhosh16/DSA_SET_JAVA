public class sort_Merge {

    static void merge(int[] arr,int start,int end){

        int mid = start + (end-start)/2;

        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(int m = 0, n = start; m < temp.length; m++, n++){
            arr[n] = temp[m];
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, end);
    }

    static void printArray(int[] arr){

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12,11,13,5,6,7};

        System.out.println("Given array is");
        printArray(arr);

        mergeSort(arr,0,arr.length-1);
    }
}
