//java program to implement bubble sort

public class sort_Bubble {

    static void bubbleSort(int arr[],int n){
        int i,j,temp;
        boolean swap;

        for(i=0;i<n-1;i++){
            swap=false;
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false)
            break;
        }
    }

    static void printArray(int arr[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={35,10,64,73,29};
        int n=arr.length;
        bubbleSort(arr,n);
        System.out.println("after sorting");
        printArray(arr, n);
    }
}
