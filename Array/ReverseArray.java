package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 3, 8, 6};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
            System.out.print(a[i]+" ");
        }

        //by using arrays class
        System.out.println("");
        String rev = Arrays.toString(a);
        System.out.println(rev);

        // by using streams api
        int[] list = Arrays.stream(a).sorted().toArray();
        String st = Arrays.toString(list);
        System.out.println(st);
    }
}
