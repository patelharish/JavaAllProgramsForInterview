package Array.Pointers;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] num = {1,25,7,8,2,9};
        int[] num1 = {3,5,9,7,1,6};
        reverseArr(num);
        reverseArr1(num1);
    }

    //using for loop
    public static void reverseArr(int[] arr){
         for(int i = 0, j = arr.length - 1; i < j; i++, j--){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             j--;
         }
        System.out.println(Arrays.toString(arr));
    }

    //using while loop
    public static void reverseArr1(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
