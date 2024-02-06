public class Array_jagged {
    public static void main(String[] args) {
        int[][] arr=new int[2][];

        arr[0]=new int[5];

        arr[1]=new int[3];

        int count=0;
        for(int i=0;i<2;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=count++;

            System.out.println("Contents of 2D jagged array");
            
        for(int i=0;i<2;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");    
        System.out.println();
     }
  }
}
