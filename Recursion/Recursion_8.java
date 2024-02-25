public class Recursion_8 {
//moving particular string element at the end
    public static void moveAllx(String str,int idx,int count,String newString){

        if(idx==str.length()){

            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            System.out.println("value of count is:"+""+ count);
            return;
        }

        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllx(str, idx+1, count, newString);
        }else{
            newString+=currChar;
            moveAllx(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="abxfkjscxx";
        moveAllx(str, 0, 0, "");
    }
}
