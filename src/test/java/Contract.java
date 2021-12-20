import java.util.Scanner;

public class Contract {
    public static void main(String[] args) {
         /*
	     Create a method outside of the main method +
         Ask user to enter two numbers
         Ask user which operation he wants to do
         Print the result after doing the operation which user asked
         Call the method from inside the main method
	    */
     simpleCalculater();
    }

    public static void simpleCalculater(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");

        double n1=sc.nextDouble();
        double n2=sc.nextDouble();

        System.out.println("select an operation amoung +,-,/,*");
        char ch=sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println("The sum is "+ (n1+n2));
                break;
            case '-':
                System.out.println("The difference is "+(n1-n2));
                break;
            case '/':
                System.out.println("The quation is "+ (n1/n2));
                break;
            case'*':
                System.out.println("The multply is "+ (n1*n2));
                break;
            default:
                System.out.println("Select just one of + ,-,*,/");
        }



    }
}

