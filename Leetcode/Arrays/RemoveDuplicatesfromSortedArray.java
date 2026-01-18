package Leetcode.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] num = {1,1,2,2,3,3,4,4,5,5};
        removeDuplicate(num);
    }

    public static void removeDuplicate(int[] n){
        if(n.length == 0){
            System.out.println("elements are not available in array");
        }
        int k = 1;

        for(int i=1; i<n.length; i++){
            if(n[i] != n[i-1]){
                n[k] = n[i];
                k++;
            }
        }
        for(int i=0; i<k; i++){
            System.out.print(n[i]+" ");
        }
    }
}
