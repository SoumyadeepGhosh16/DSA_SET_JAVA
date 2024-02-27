public class Recursion4_advanced {
    public static int callGuests(int n){
//ways to invite n guest in single or pair combination
        if(n <= 1){
            return 1;
        }
    //single
    int ways1=callGuests(n-1);

    //double
    int ways2=(n-1)*callGuests(n-2);

    return ways1+ways2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuests(n));
    }
}
