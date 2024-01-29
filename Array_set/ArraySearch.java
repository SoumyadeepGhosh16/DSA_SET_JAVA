import java.util.*;

//import javax.sql.rowset.spi.SyncResolver;
public class ArraySearch {

    private static int flag;

    public static void main(String[] args){
        int[] arr={5,65,81,21,53};
        int x=arr.length;

        System.out.println("enter the element");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
       for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                flag=1;
                break;
        }
     }
     if(flag==1){
        System.out.println("element found");
     }else{
        System.out.println("element not found");
          }
    }
}
