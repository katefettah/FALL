import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=15;i++){
            System.out.println(i+" ");
        }
        for(int i=15; i>=1;i--){
            System.out.println(i+ " ");
        }
        for(int i=1;i<=15;i++){
            System.out.println(2*i+" ");
        }
        for(int i=1;i<=15;i=i+2){
            System.out.println(i+" ");
        }
        for(int i=2;i<=15;i++){
            System.out.println(2*i-1+" ");
        }
        for(int i=1; i<=15; i++) {
            System.out.print(2*i-1 + " ");
        }
        for(int i=1; i<=29; i=i+2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Write a program to calculate the sum of first 10 counting number.Counting numbers start from 1.
        int sum=0;
        for(int i=1;i<=10; i++){
            sum+=i;
        }
        System.out.println(sum);

        /*
		 Write a program to calculate the product of the first 10
		 counting numbers
		 I mean; 1x2x3x4x5x6x7x8x9x10 = ?
		 */
        int product=1;
        for(int i=1;i<=10; i++){
            product*=i;
        }
        System.out.println(product);
        // Print the counting numbers which are less than 100 and divisible by 3
        // on the console. 3,6,9,..,99

        for(int i=1;i<100;i++){
            if(i%3==0){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        System.out.println();
       /* Print first 70 counting numbers which are divisible by 4 and 6
                */
        int count=0;
        for(int i=1; i<=70; i++){
            if(i%4==0 && i%6==0){
                System.out.println(i + " ");
                count++;
            }
        }
        /*
		 Write a program to print counting numbers which are less than 200 and
		 divisible by 5 on the console by using for-loop.
		*/
        for(int i=1;i<=200;i++){
            if(i%5==0){
                System.out.println(i+" ");
            }
        }
        /*
		 Ask user to enter his/her first name, last name and Social Security Number.
         Then type a program which makes initials of the first name and
         the last name in upper case, other characters will be in lower case.
         All characters except last 4 characters of the Social Security Number “ * ”.
                       For example; Suleyman Alptekin *****5678
		*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name");
        String name=scan.nextLine().toUpperCase();
        System.out.println("Enter surname");
        String surname=scan.nextLine().toUpperCase();
        System.out.println("enter ssn");
        String  ssn=scan.next();

        String firstLetterName=name.substring(0,1).toUpperCase();
        String lastWordsName=name.substring(1).toLowerCase();
        System.out.println(firstLetterName+lastWordsName);

        String firstLetterSurname=surname.substring(0,1).toUpperCase();
        String lastLetterSurname=surname.substring(1).toLowerCase();
        System.out.println(firstLetterSurname+lastLetterSurname);

        String firstPartSsn=ssn.substring(0,5).replaceAll("\\d","*");
        String lastPartSsn=ssn.substring(5);
        System.out.println(firstPartSsn+lastPartSsn);

        /*
		 Ask user to enter a letter,
		 If it is upper case check if it is before “F” or not in alphabetical order.
		 If it is before “F” output will be “Big before F”,
		 otherwise output will be “Big after or on F.”

		 If it is lower case check if it is before “h” or not in alphabetical order.
         If it is before “h” output will be “Small before h”,
         otherwise “Small after h”
		*/
        System.out.println("enter the the letter");
        char ch=scan.next().charAt(0);

        if(ch>'A'&& ch<'Z'){
            if(ch>'A'&& ch<'F'){
                System.out.println("Big before F");
            }else{
                System.out.println("Big after or on F");
            }
        }

        if(ch>'a'&&ch<'z'){
            if(ch>'a' && ch<'h'){
                System.out.println("Small before h");
            }else{
                System.out.println("Small after h");

            }
        }else{
            System.out.println("enter the letter");
        }

    }
}
