package Array.Pointers;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] num = {2,5,0,3,0,7,0,9};
        int n = num.length;
        int j = 0;
        for(int i=0; i<n; i++){
            if(num[i] != 0){
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
