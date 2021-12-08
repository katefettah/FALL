import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        int arr[][]=new int[2][2];
        arr[0][0]=3;
        arr[0][1]=2;
        arr[1][0]=7;
        arr[1][1]=8;
        System.out.println(Arrays.deepToString(arr));

        int arr1 [][]={{1,2,3},{2,3,4},{5,6,7}};
        System.out.println((arr1[2][1]));
        System.out.println((arr1[2][2]));
        System.out.println(Arrays.toString(arr1[2]));

        /*
		 Take a String from user
		 Print it in reverse
		 For example; Germany  ==>  ynamreG
		*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();


        for (int i=str.length()-1; i>=0; i--){

            System.out.print(str.charAt(i));
        }
        System.out.println();


        //Print first 10 counting numbers on the console by using do-while loop
       int num=1;

       do{
           System.out.print(num+" ");
           num++;
       }while(num<=10);

        System.out.println();



        //Print first 5 even counting numbers on the console by using do-while loop

        int num1=1;

        do{
           if(num1%2==0){
               System.out.print(num1+" ");
           }
            num1++;
        }while (num1<=10);
        System.out.println();

        //Print the counting numbers which are divisible by 3 and less than 100
        //by using do-while loop

        int num2=1;

        do {
            if(num2%3==0){
                System.out.print(num2+" ");
            }
            num2++;
        }while (num2<=100);
        System.out.println();

        // Ask user to enter a number
        // If the number user entered is less than 10 print "Won!" on the console
        // otherwise ask user to enter a number again.

        System.out.println("enter a number");
        int num4=sc.nextInt();
        do {

            System.out.println("enter a number");
            num4=sc.nextInt();
        }while(num4>=10);
        System.out.println("won");

        System.out.println();

        // Ask user to enter an integer
        // If the integer is even print on the console "You won!"
        // otherwise ask user to enter another integer

       int num5;
        do {
            System.out.println("enter the number 5");
            num5=sc.nextInt();
        }while(num5%2!=0);
        System.out.println("you won");

        System.out.println();

        /*
		 Ask user to enter his/her first name
		 If the initial is lower case print a message like "Make the initial upper case"
		 If the initial is upper case print a message like "You did it right"
		 */

        String str1=" ";

        do {
            System.out.println("enter the string");
            str1=sc.next();
            if(str1.charAt(0)>='a' && str1.charAt(0)<='z'){
                System.out.println("make initial upper case");
            }
        }while (!(str1.charAt(0)>='A' && str1.charAt(0)<='Z'));

        System.out.println("you did it right");

        System.out.println();

        /*
		 Ask user to enter his first name
		 If the length of his first name is greater than 6 print "Long name"
		 otherwise print "Normal name" and finish the loop
		*/

        System.out.println();

        String str2="";
        do {
            System.out.println("enter the Long name");
            str2=sc.next();
            if(str2.length()>6){
                System.out.println("LONG NAME");
            }
        }while (str2.length()>6);
        System.out.println("normal name");
    }
}
