package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnArray {
    public static void main(String[] args) {
        int[] hkp = {3,5,1,7,6,2};

        // first way
        int[] hkp1 = Arrays.stream(hkp).sorted().toArray(); //ASC order
        System.out.println(Arrays.toString(hkp1));

        List<Integer> hkp2 = Arrays.stream(hkp).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(hkp2);
        //convert back to int array
        int[] hkp3 = hkp2.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(hkp3));

        //second way
        int[] rev = Arrays.stream(hkp).boxed().sorted((a,b) -> b-a).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(rev));
    }
}
