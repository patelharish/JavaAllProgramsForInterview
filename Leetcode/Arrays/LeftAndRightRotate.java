package Leetcode.Arrays;

import java.util.Arrays;

public class LeftAndRightRotate {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] num2 = {1,2,3,4,5};
        int k =2;
        leftRotate(num,k);
        System.out.println(Arrays.toString(num));
        rightRotate(num2,k);
        System.out.println(Arrays.toString(num2));
    }

    private static void rightRotate(int[] num, int k) {
        int n = num.length;
        k = k % n;
        reverse(num, 0, n - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, n - 1);

    }

    public static void leftRotate(int[] num, int k){
        int n = num.length;
        k = k % n;
        reverse(num, 0, k - 1);
        reverse(num, k, n - 1);
        reverse(num, 0, n - 1);
    }
    public static int[] reverse(int[] num, int start, int end){
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        return num;
    }
}
