package Array.DSA;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] num = {1,-2,9,-3,8,5};

        //optimized way
        int currentSum = num[0];
        int maxSum = num[0];

        for(int i=1; i<num.length; i++){
            currentSum = Math.max(num[i],currentSum+num[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println("Max sum is: "+maxSum);


        //three things happening here : printing all subarrays, printing maximum sum of subarray and printing max subarray
        int maxSum1 = Integer.MIN_VALUE;
        List<Integer> maxSubArray = new ArrayList<>();
        for(int i=0; i<num.length; i++){
            List<Integer> subarrys = new ArrayList<>();
            int currentSum1 =0;

            for(int j=i; j<num.length; j++){
                subarrys.add(num[j]);
                currentSum1 += num[j];
                System.out.println(subarrys);
                if(currentSum1 > maxSum1){
                    maxSum1 = currentSum1;
                    maxSubArray = new ArrayList<>(subarrys);
                }
            }
        }
        System.out.println(maxSum1);
        System.out.println(maxSubArray);
    }
}
