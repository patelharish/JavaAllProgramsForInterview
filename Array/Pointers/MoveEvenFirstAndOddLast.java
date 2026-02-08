package Array.Pointers;

import java.util.Arrays;

public class MoveEvenFirstAndOddLast {
    public static void main(String[] args) {

        // {2,3,0,4,0,5,7,0,8} = {2,4,8,0,0,0,3,5,7}
        int[] num = {2, 3, 0, 4, 0, 5, 7, 0, 8};

        //first: move all even first
        int j=0;
        for(int i=0; i < num.length; i++) {
            if (num[i] != 0 && num[i] % 2 == 0) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }

        // second: move all odd to last
        j = num.length - 1;
        for (int i = num.length - 1; i >= 0; i--) {
              if(num[i]%2 != 0 && num[j]%2 == 0){
                  int temp = num[i];
                  num[i] = num[j];
                  num[j] = temp;
                  j--;
              }
        }
        System.out.println(Arrays.toString(num));
    }
}
