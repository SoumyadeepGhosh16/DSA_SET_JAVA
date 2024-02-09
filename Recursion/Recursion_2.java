//fibonacci series with recursion
public class Recursion_2 {

    static void printFib(int a,int b,int n){
        if(n>0){
            
        
         int c=a+b;
         int temp =c;
         a = b;
         b = temp;

         System.out.println(c);
        printFib(a,b,n-1);
        }
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        int n=7;
        printFib(a, b, n-2);
    }
}
