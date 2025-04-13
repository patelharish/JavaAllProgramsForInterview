package Array;

import java.util.Arrays;

public class MinimumElementArray {
    public static void main(String[] args) {
        int[] ar = {5,8,6,1,7,5,9,5};
        int min = ar[0];
        //by using normal for loop
        for (int i=0; i<ar.length; i++){
            if(ar[i]<min){
                min = ar[i];
            }
        }
        System.out.println("by using normal for loop: "+min);
        // by using enhanced for loop
        for(int n:ar){
            if(n<min){
                min = n;
            }
        }
        System.out.println("by using enhanced for loop: "+min);

        //by using sorting
        Arrays.sort(ar);
        int smallest = ar[0];
        System.out.println("by using sorting: "+smallest);

        //using java8 streams
        int small = Arrays.stream(ar).min().getAsInt();
        System.out.println("using java8 streams: "+small);
    }
}
