package Array;

import java.util.*;

public class MaximunelementArray {
    public static void main(String[] args) {
        int[] ar = {6, 9, 4, 77, 33, 7};
        int max = ar[0];
        // by using normal for loop
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("by using normal for loop: "+max);
        //by using enhanced for loop
        for(int num : ar){
            if(num>max) {
                max = num;
            }
        }
        System.out.println("by using enhanced for loop: "+max);

        //by using sorting
        Arrays.sort(ar);
        int largest = ar[ar.length-1];
        System.out.println("by using sorting: "+largest);

        //using java8 streams
        int large = Arrays.stream(ar).max().getAsInt();
        System.out.println("using java8 streams: "+large);


    }

}

