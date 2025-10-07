package Array.Pointers;

import java.util.Arrays;

public class SegregateEvenAndOdd {
    public static void main(String[] args) {
        int[] num = {11,2,4,3,6,9,7,8,1};
        EvenOdd(num);
    }

    public static void EvenOdd(int[] arr){
        int n = arr.length;
        int j=0;
        for(int i=0; i<n; i++){
           if(arr[i]%2 != 0) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}
