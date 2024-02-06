public class Array_2D {
//initializing of 2D array with 4*4 matrix  
    public static void main(String[] args) {
        int row=4;
    int column=4;

    int[][] arr=new int[row][column];

    int value=1;

    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            arr[i][j]=value;
            value++;
        }
    }

    System.out.println("2D array is:");
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  }
}
