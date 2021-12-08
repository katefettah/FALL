import java.util.Scanner;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat obj =new CodingBat();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=sc.next();
        System.out.println(obj.myDouble(str1));
    }


    public boolean myDouble(String str){
        int i=str.indexOf("x");
        if(i==-1){
            return false;
        }else{
            return str.substring(i+1,i+2).equals("x");
        }
    }
}
