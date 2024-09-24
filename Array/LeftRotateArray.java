package Array;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n=3;
        for (int j=1;j<=n;j++) {
            int first = a[0];
            int size = a.length;
            for (int i = 0; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            a[size - 1] = first;
        }
            System.out.println(Arrays.toString(a));
        System.out.println("hkp");

    }
}
