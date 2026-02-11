package Array.DSA;

public class DoublePairTargetSum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        int target = 5;
        int n = num.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(num[i] + num[j] == target){
                    System.out.println(num[i]+"+"+num[j]+"="+target);
                }
            }
        }
    }
}
