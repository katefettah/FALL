import java.util.Arrays;

public class ArraysQuestions {

    public static void main(String[] args) {
        //How to check if a specific element is in the array
        int arr[] = {15, 2, 4, 3, 5};
		
		/*
		 Note: 1) Before using binarySearch() method you have to use sort()
		          otherwise binarySearch() sometimes returns correct index
		          
		          sometimes returns wrong index
		       2) binarySearch() method returns the index of element which you
		          are looking for
		       3) If you look for a non-existing element in an Array you will
		          get a negative number. "-" means not exist, the number 
		          the displays the number of the element if the element is exist     
		*/
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,15));
        System.out.println(Arrays.binarySearch(arr,23));

        int arr1[] = {2, 7, 6};
        int arr2[] = {2, 7, 6};
        int arr3[] = {6, 2, 7};

            int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                count++;
            }
        }
    if(count==arr1.length){
        System.out.println("Arrays are the same");
    }else{
        System.out.println("Arrays are not the same");
    }

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr2,arr3));

    }


}
