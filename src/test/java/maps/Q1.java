package maps;

import java.util.*;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
       /*
                Create an array like {"A", "B", "D", "C", "B", "A", "A", "B", "B"};
				 Print the repeated elements on the console
				 Use 'structured programming'
				 Try to do by using 'functional programming'
        */

        String str[] = {"A", "B", "D", "C", "B", "A", "A", "B", "B"};
        Set<String>set1=new HashSet<>();
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length-1;j++){
                if(str[i].equals(str[j])){
                    set1.add(str[i]);
                }
            }
        }
        System.out.println(set1);

        Set<String>set2=new HashSet<>();
        Set<String>set3=new HashSet<>();

        for(String w:str){
            if(set2.add(w)==false){
                set3.add(w);
            }
        }
        System.out.println(set3);

        Map<String,Integer>map=new HashMap<>();

    }
}
