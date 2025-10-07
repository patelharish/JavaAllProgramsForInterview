package Array;

import java.util.HashSet;
import java.util.Set;

public class FindTheMultipleMissingNumbers {
    public static void main(String[] args) {
        int[] num = {1,2,3,5,8,10};

        // find the full size of array including missing number
        int fullSize = num[0];

        for(int n: num){
            if(n>fullSize){
                fullSize = n;
            }
        }

        Set<Integer> fullSet = new HashSet<>();
        // add all numbers in Hashset including missing numbers
        for(int i=1; i<=fullSize; i++){
            fullSet.add(i);
        }
       // System.out.println(fullSet);
        //removing all presented actual numbers in num from the set
        for(int n:num){
            fullSet.remove(n);
        }
        System.out.println("Missing numbers are: "+fullSet);
    }
}
