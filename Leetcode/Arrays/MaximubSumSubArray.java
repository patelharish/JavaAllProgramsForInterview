package Leetcode.Arrays;

public class MaximubSumSubArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(sumSub(num));
    }

    // using kadane algo
    public static int sumSub(int[] num){
        int currentSum = 0;
        int maxSum = 0;

        for(int n:num){
            currentSum = Math.max(n,currentSum+n);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }

    // using collections

}
