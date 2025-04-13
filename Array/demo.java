package Array;

public class demo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        //left rotatation
        int size = a.length;
        int[] a2 = new int[size];
        int index = 0;

        for(int i=1; i<size; i++){
            a2[index++] = i;
        }

        for(int x:a){
           a2[size-1] = a[0];
        }

        for(int num:a2){
            System.out.print(num+" ");
        }
    }
}
