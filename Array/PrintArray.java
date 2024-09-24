package Array;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,8,3};
        String[] str = {"hari","dharni","anuj","aswini"};

        System.out.println(Arrays.toString(a)); // by using arrays class in java
        System.out.println(Arrays.toString(str));

        //by using for loop
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        // by using for each
        System.out.println("");
        for(int num : a){
            System.out.print(num+" ");
        }
    }
}
