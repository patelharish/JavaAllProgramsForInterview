package Array;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int size = a.length;
        int n = 3;

        for (int j = 1; j <= n; j++) {
            int last = a[a.length - 1];
            for (int i = size - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = last; // 0th index of array
        }
        System.out.println(Arrays.toString(a));
    }
}
