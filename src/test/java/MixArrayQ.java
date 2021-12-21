import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MixArrayQ {
    public static void main(String[] args) {
        //take the numbers which are less than 5
        int arr[]={7,2,4,5,6,1,8};
        Arrays.sort(arr);
        for(int i:arr ){
            if(i>6){
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        for(int i:arr){
            if(i>6){
                break;
            }
            System.out.println(i);
        }
        int arr1 [] []={{1,2},{3},{4,5,6}};

        int x=0;
        for(int [] w:arr1){
            for(int s:w){
                x+=s;
                System.out.println(s);
            }
        }
        System.out.println(x);
        System.out.println();

        List<Integer> ls=new ArrayList<Integer>();
        ls.add(21);
        ls.add(22);
        ls.add(24);
        ls.add(25);

        for(int w:ls){
            if(w%2==0){
                continue;
            }
            System.out.println(w+" ");
        }
        System.out.println();

        int arr2 []={4,6,8,10,12};
        List<Integer>list=new ArrayList<Integer>();
        for(int w:arr2){
            list.add(w);
        }
        System.out.print(list);

        System.out.println();
        String [] arr3={"Java", "Python", "Ruby"};

        List<String>list2=Arrays.asList(arr3);
        System.out.println(list2);

        String name="Buni";
        System.out.println(m1(name));
        System.out.println(m2(name));


    }
    public static String m1(String name1){
        return name1+"!";
    }
    public static String m2(String name2){
        return name2+"!";
    }
}
