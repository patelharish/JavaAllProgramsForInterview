package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("sort an array ascending order");
        int[] a = {2, 1, 5, 3, 8, 6};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
            System.out.print(a[i]+" ");
        }

        //by using arrays class
        System.out.println("");
        Arrays.sort(a);
        for(int arr:a){
            System.out.print(arr+" ");
        }

        // by using streams api
        System.out.println("");
        int[] a2 = {34,12,67,87,43,90};
        int[] list = Arrays.stream(a2).sorted().toArray();
        String st = Arrays.toString(list);
        System.out.println(st);

        System.out.println("sort an array descending order");
        int[] hkp = {5,1,9,3,7,19};
        int temp2;

        for(int i=0; i<hkp.length; i++){
            for(int j=i+1; j<hkp.length; j++){
                if(hkp[i]<hkp[j]){
                    temp2 = hkp[i];
                    hkp[i] = hkp[j];
                    hkp[j] = temp2;
                }
            }
            System.out.print(hkp[i]+" ");
        }

        //by using streams
        System.out.println();
        List<Integer> rev4 = Arrays.stream(hkp).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        for(int r:rev4){
            System.out.print(r+" ");
        }
    }
}
