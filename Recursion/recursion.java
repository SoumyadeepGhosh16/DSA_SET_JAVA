import java.util.*;

public class recursion {
    static int factorial(int n){
        
        if( n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        int result=1;
        if(n==0 || n==1){
            return 1;
        }else{
            
            for(int i=1;i<=n;i++)
            result*=i;
            return result;
        }
      }
    


    public static void main(String[] args){
         int n=5;
         System.out.println(+factorial(n));
         System.out.println(+factorial_iterative(n));
    }
}














