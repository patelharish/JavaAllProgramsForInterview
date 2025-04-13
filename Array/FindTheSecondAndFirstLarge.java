package Array;

import java.util.*;

public class FindTheSecondAndFirstLarge {
    public static void main(String[] args) {
        int[] a = {2,6,5,6,4,2,7};
        int temp;
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        // this is the logic of sorting in descending order
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            // this is removing duplicates in the array and storing into hashset
            if(!hs.contains(a[i])){
                hs.add(a[i]);
            }
        }
        // this is iterator class to iterating first index to last
        Iterator<Integer> it = hs.iterator();
        int firstLarge = it.next(); //
        int secondLarge = it.next();
        System.out.println("first largest: "+firstLarge);
        System.out.println("second largest: "+secondLarge);

        // by using treeset
        TreeSet<Integer> tr = new TreeSet<>();
        for(int t:a){
            tr.add(t);
        }
        System.out.println(tr);
        int last = tr.last(); // it will return last element
        System.out.println(last); // printing last element

        Iterator<Integer> it2 = tr.descendingIterator(); // it will counting from desc order
        int firstl = it2.next();
        int secl = it2.next();
        System.out.println(firstl);
        System.out.println(secl);

    }
}
