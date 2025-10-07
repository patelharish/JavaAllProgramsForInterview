package Array.Pointers;

import java.util.Arrays;

public class MoveZerosToFirst {
    public static void main(String[] args) {
        int[] num = {2,0,3,5,0,5,0};
        int j=num.length-1;

        for(int i=num.length-1; i>=0; i--) {
            if(num[i] != 0){
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
