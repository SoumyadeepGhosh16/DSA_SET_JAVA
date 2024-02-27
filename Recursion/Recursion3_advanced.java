public class Recursion3_advanced {

    public static int printTiles(int n,int m){

        if(n==m){
            return 2;
        }

        if(n<m){
            return 1;
        }

        //vertically
        int verticalPlacements=printTiles(n-m, m);

        //horizontally
        int horizontalPlacements=printTiles(n-1, m);

        return verticalPlacements+horizontalPlacements;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int paths=printTiles(n, m);

        System.out.println(paths);
    }
}
