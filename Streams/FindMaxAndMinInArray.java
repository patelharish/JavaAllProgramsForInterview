package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        int[] num = {3,1,5,7,4,9,4};

        // first way
        int max = Arrays.stream(num).max().getAsInt();
        System.out.println("max: "+max);
        int min = Arrays.stream(num).min().getAsInt();
        System.out.println("min: "+min);

        //second way
        int min1 = Arrays.stream(num).sorted().findFirst().getAsInt();
        System.out.println("min: "+min1);
        List<Integer> max1 = Arrays.stream(num).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("max: "+max1.get(0));

        //third way
        List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
        int max2 = Collections.max(list);
        int min2 = Collections.min(list);
        System.out.println("max: "+max2);
        System.out.println("min: "+min2);
    }
}
