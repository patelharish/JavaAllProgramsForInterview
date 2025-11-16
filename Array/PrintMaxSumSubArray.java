package Array;

public class PrintMaxSumSubArray {
    public static void main(String[] args) {
        int[] num = {2,1,5,7,9,8};
        int maxSum = num[0];   // ✅ no MIN_VALUE
        int start = 0, end = 0;

        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {

                sum += num[j];

                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.print("Max Subarray = {");
        for (int k = start; k <= end; k++) {
            System.out.print(num[k] + " ");
        }
        System.out.println("} Sum = " + maxSum);
    }
}
