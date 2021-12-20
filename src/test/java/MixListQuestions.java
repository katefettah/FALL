import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MixListQuestions {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list.get(1));

        //Convert the following array to a list by using Arrays methods
        String brr[] = {"A", "B", "C"};

        List<String> list1 = Arrays.asList(brr);
        System.out.println("List: " + list1);


        //How to convert a List to an Array
        String crr[] = list1.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(crr));

        //Note:When you convert a list to an array you have to use Wrapper Classes
        //     as data type of array

        System.out.println();
        //byPass value
        int a = 5;
        System.out.println(deneme1(a));
        System.out.println(deneme2(a));

        //find the sum of the cubed of the each elements in array
        int arr2 []={1,2,3};
        int sum=0;
        for(int w:arr2){
            sum+=w*w*w;
        }
        System.out.println(sum);
    }


    public static int deneme1(int a) {
        return a + 1;
    }

    public static int deneme2(int a){
        return a-1;
    }

}

