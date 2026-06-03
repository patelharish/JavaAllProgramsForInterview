package Array.DSA;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        //sort 0,1,2,
        int[] num = {1,2,0,1,0,2,0};
        int low = 0;
        int mid = 0;
        int high = num.length-1;

        while(mid <= high){
             if(num[mid] == 0){
                 int temp = num[low];
                 num[low] = num[mid];
                 num[mid] = temp;
                 low++;
                 mid++;
             }else if(num[mid] == 1){
                 mid++;
             }else{
                 int temp = num[mid];
                 num[mid] = num[high];
                 num[high] = temp;
                 high--;
             }
        }

        System.out.println(Arrays.toString(num));
    }

}
