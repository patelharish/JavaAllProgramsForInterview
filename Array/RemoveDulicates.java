package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDulicates {
    public static void main(String[] args) {
        int[] ar = {34,21,45,32,45,67,89,67,100,500,100};

        // by using comparing
        for (int i = 0; i < ar.length; i++) {
            for (int j=i+1; j< ar.length; j++){
                if(ar[i] != ar[j]){
                    System.out.print(ar[i]+" ");
                    break;
                }
            }
        }

        System.out.println("\nBy using hashset: ");
        //By using hashset or LinkedHashset(maintaing its own order)
        HashSet<Integer> hs = new HashSet<>();
        for(int num:ar){
            hs.add(num);
        }
        System.out.println(hs);
        //convert set to array
        System.out.println("convert back set to array: ");
        Integer[] ar2 = hs.toArray(new Integer[0]);
        for(Integer n : ar2){
            System.out.print(n+" ");
        }

        // using java streams api
        Integer[] result = Arrays.stream(ar)
                .boxed()  // Convert int[] to Stream<Integer>
                .distinct()  // Remove duplicates
                .toArray(Integer[]::new);  // Collect to an Integer[]
        System.out.println("\nAfter removing duplicates using streams: ");
        for(Integer i: result){
            System.out.print(i+" ");
        }

        // By using TreeSet (It removes duplicates, sorting and also maintaing its own order)
        TreeSet<Integer> tr = new TreeSet<>();
        for(int num : ar){ //adding elements in treeSet
            tr.add(num);
        }
        //convert back to treeSet to normal array
        Integer[] arr3 = tr.toArray(new Integer[0]);
        //printing the array
        System.out.println("\nprinting the arrays by using treeset: ");
        for(Integer n : arr3){
            System.out.print(n+" ");
        }

    }
}
