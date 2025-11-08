package Array.Pointers;

import java.util.Arrays;

public class MoveAllNegativeEleOneSide {
    public static void main(String[] args) {
        int[] arr = {-1,4,-2,7,8,-9,-3,1};
        swapToEndNegative(arr);
        swapToFirstNegative(arr);
    }

    public static void swapToEndNegative(int[] arr){
        int n = arr.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // swapping and navigating
    public static void swapToFirstNegative(int[] arr){
        int j = arr.length-1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
