import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
    /*
		 TASK:
         Create a method outside of the main method
         Ask user to enter two numbers
         Ask user which operation he wants to do
         Print the result after doing the operation which user asked
         Call the method from inside the main method
		*/
       calculator();
    }
    public static void calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter secand number");
        int b=sc.nextInt();
        System.out.println("Select the operations + -,/,*");
      char op=sc.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("a"+"+"+"b"+"="+(a+b));
                break;
            case'-':
                System.out.println("a"+"-"+"b"+"="+(a-b));
                break;
            case '*':
                System.out.println("a"+"*"+"b"+"="+(a*b));
                break;
            case '/':
                System.out.println("a"+"/"+"b"+"="+(a/b));
                break;
            default:
                System.out.println("enter valid operation");

        }
        System.out.println();

        /*
		 Ask user to enter a word which has 4 letters and output will be
		 the inverse of the word.
         For example; if user enters “MARK” output will be “KRAM”
		*/

        System.out.println("enter one string");
        String name=sc.next();

        char ch1=name.charAt(0);
        char ch2=name.charAt(1);
        char ch3=name.charAt(2);
        char ch4=name.charAt(3);

        System.out.println(""+ch4+ch3+ch2+ch1);
        System.out.println();

       /* Interview Question
		 Type java code by using while loop,
         Write a program that prompts the user to input a positive integer.
         It should then print factorial of that number. 
                      5 factorial(5!) = 1x2x3x4x5
		*/

        System.out.println("enter the number");
        int num=sc.nextInt();
        int product=1;

        for(int i=1; i<=num; i++){
            product*=i;
        }
        System.out.println(product);

        System.out.println();

        int prodct=1;
        int j=1;
        while (j<=num){
            prodct*=j;
            j++;
        }
        System.out.println(prodct);

        System.out.println();

        /*
		 Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
         For example; 6 ==> 1, 2, 3, 6 ==> Print on the console 4
                      12 ==> 1, 2, 3, 4, 6, 12 ==> Print on the console 6
                      5 ==> 1, 5 ==> Print on the console 2
		*/
        System.out.println("write the number to find the number of foctors");
        int num2=sc.nextInt();
        int i=1;
        int count=0;

        while(i<=num2){
            if(num2%i==0){
                System.out.println(i+" ");
                count++;
            }
            i++;
        }
        System.out.println("the number of factors: ");
        System.out.print(count);
        System.out.println();

        /* Interview Question
		 Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find sum of the digits of that number. 
		*/
        System.out.println("enter the positive integer");
        int num3=sc.nextInt();
        int sum=0;

        while (num3!=0){
            int last_digit=num3%10;
            num3=num3/10;
            sum+=last_digit;
        }
        System.out.println(sum);



    }
}
