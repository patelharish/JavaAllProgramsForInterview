package Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] a = {3,5,2,9,4,8};
        //by using iterating from the last index
        int[] rev1 = new int[a.length];
        int j = 0;
        for(int i=a.length-1; i>=0; i--){
            rev1[j++] = a[i];
        }
        for(int r:rev1){
            System.out.print(r+" ");
        }
    }
}
