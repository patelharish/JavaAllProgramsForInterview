package Array.DSA;

import java.util.HashSet;

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


        //second approach using set
        HashSet<Integer> hs = new HashSet<>();

        for(int n1 : num) {
            int complement = target - n1;
            if (hs.contains(complement)) {
                System.out.println(complement + ", " + n1);
            }
            hs.add(n1);
        }

    }
}
