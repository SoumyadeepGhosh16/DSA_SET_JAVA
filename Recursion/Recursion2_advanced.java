public class Recursion2_advanced {
    public static int countPath(int i,int j,int n,int m){
//counting paths to move from 0,0 to n,m
        if(i==n || j==m){
            return 0;
        }

        if(i==n-1 && j==n-1){
            return 1;
        }
        //move downwards
        int downPaths=countPath(i+1, j, n, m);
        //move sideways
        int sidePaths=countPath(i, j+1, n, m);

        return downPaths+sidePaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int totalPaths=countPath(0, 0, n, m);

        System.err.println("the number of paths="+totalPaths);
    }
}
