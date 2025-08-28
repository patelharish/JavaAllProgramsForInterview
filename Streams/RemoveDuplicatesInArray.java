package Streams;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {12,43,56,43,12,11,56};
        //using list
        List<Integer> rmdp = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        System.out.println("Integer: "+rmdp);
        //or
        int[] rmdp1 = Arrays.stream(arr).distinct().toArray();
        System.out.print("int: ");
        for(int rm:rmdp1){
            System.out.print(rm+" ");
        }
        System.out.println();
        //another way to print array
        System.out.println("Int: "+Arrays.toString(rmdp1));

        //using set
        Set<Integer> rm = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println("Integer: "+rm); // this will not print insertion order because set not main insertion order
        //or
        int[] rm1 = Arrays.stream(arr).boxed().collect(Collectors.toSet()).stream().mapToInt(Integer::intValue).toArray();
        System.out.println("int: "+Arrays.toString(rm1));

        //using LinkedHashSet
        LinkedHashSet<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(set);
    }
}
