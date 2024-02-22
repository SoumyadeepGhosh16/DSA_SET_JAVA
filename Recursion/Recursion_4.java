//tower of hanoi

public class Recursion_4 {
    public static void towerOfHanoi(int n,String src,String helper,String dstn){

        if(n==1){
            System.out.println("transfer disk" +n+ "from" +src+ "to" +dstn);
            return;
        }

        towerOfHanoi(n-1, src, dstn, helper);
        System.out.println("transfer disk"+n+"from"+src+"to"+dstn);
    
        towerOfHanoi(n-1, helper, src, dstn);
    }
    public static void main(String[] args) {
        int n=3;

        towerOfHanoi(n, "S", "H", "D");
    }
}
