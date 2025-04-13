package Array;

public class ReturnTwoSumCombination {
    public static void main(String[] args) {
        int[] n = {1,2,7,4,5,6,3,8,9};
        int sum =8;

        // approach1: brute force
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if(n[i]+n[j] == sum){
                    System.out.println("pair ["+n[i]+","+n[j]+"]");
                }
            }
        }

        // approach2:

    }
}
