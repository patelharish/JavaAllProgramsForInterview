package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class demmo {
    public static void main(String[] args) {
        int[] a = {5,7,4,8,4,6,7};
        Arrays.sort(a);
        for(int c:a){
            System.out.print(c+" ");
        }
        System.out.println();
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int n:a) {
            if (!hs.contains(n)) {
                hs.add(n);
            }
        }
        System.out.println(hs);

        Iterator<Integer> it = hs.iterator();

        int first = it.next();
        System.out.println(first);
        int second = it.next();
        System.out.println(second);
    }
}
