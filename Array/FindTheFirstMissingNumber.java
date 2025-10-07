package Array;

import java.util.HashSet;
import java.util.Set;

public class FindTheFirstMissingNumber {
    public static void main(String[] args) {
        int[] num = {1,2,3,5,6,7,8};
        int fullSize = num.length+1; // length including missing number
        int sum1 =0;
        int sum2 =0;

        for(int n:num){
            sum1 += n; //or sum1 = sum1+n; // sum of all given array(without missing)
        }
        for(int i=0; i<=fullSize; i++){
            sum2 += i; // sum of all given missing lengh numbers
        }
        int missing = sum2-sum1;
        System.out.println("Missing number is: "+missing);

        // second approach by using formula
        int hkp = fullSize*(fullSize+1)/2;
        int missing2 = hkp-sum1;
        System.out.println("Missing number is: "+missing2);

        //using hashset
        Set<Integer> fullSet = new HashSet<>();
        // storing 1 to n numbers in hashset
        for(int i=1; i<=fullSize; i++){
            fullSet.add(i);
        }
         // removing elements in hashset which are present in the missing array(num)
        for(int n:num){
            fullSet.remove(n);
        }
        System.out.println(fullSet.toString());
        //or
        int missing3 = fullSet.iterator().next();
        System.out.println("missing number: "+missing3);
    }
}
