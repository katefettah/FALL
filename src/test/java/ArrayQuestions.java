import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestions {
    public static void main(String[] args) {
        int num[] = {1, 2, 5, 3, 4};
        Arrays.sort(num);
        System.out.println(Arrays.binarySearch(num, 3));
        System.out.println();

        char arr[] = {'d', 'e', 'k', 'l', 'm'};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 'm'));

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2, 3, 4};
        int arr3[] = {1, 2, 4, 3};

        int count=0;
        for (int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("array is not the same");
                break;
            }
        }
        System.out.println("array is the same");


        System.out.println();

        String str="whataisayouraname?";
        String arr4[]=str.split("a");
        System.out.println(Arrays.toString(arr4));

        System.out.println();
        //Ask user to enter a String then count the number of words inside the String

        Scanner sc=new Scanner(System.in);
        System.out.println("write the text");
        String a=sc.nextLine();

        String ata []= a.split(" ");
        System.out.println("the number of words"+ata.length);

    }
}
