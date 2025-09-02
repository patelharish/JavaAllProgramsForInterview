package Streams;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOdd {
    public static void main(String[] args) {
        int[] num = {2,4,2,5,7,1,9,6,1};

        //normal array
        int[] even = Arrays.stream(num).filter(n -> n%2 == 0).toArray();
        System.out.println("even: "+Arrays.toString(even));

        int[] odd = Arrays.stream(num).filter(n->n%2 ==1).toArray();
        System.out.println("odd: "+Arrays.toString(odd));

        //using list
        List<Integer> even1 = Arrays.stream(num).boxed().filter(n->n%2 ==0).collect(Collectors.toList());
        System.out.println("even: "+even1.toString());

        List<Integer> odd1 = Arrays.stream(num).boxed().filter(n->n%2==1).collect(Collectors.toList());
        System.out.println("odd: "+odd1.toString());

        //using LinkedHashset by removing duplicated also
        LinkedHashSet<Integer> even2 = Arrays.stream(num).boxed().filter(n->n%2==0).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("even: "+even2.toString());

        LinkedHashSet<Integer> odd2 = Arrays.stream(num).boxed().filter(n->n%2==1).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("even: "+odd2.toString());

        //by using forEach
        System.out.print("even: ");
        Arrays.stream(num).filter(n->n%2==0).forEach(n-> System.out.print(n+" "));

        System.out.print("\nodd: ");
        Arrays.stream(num).filter(n-> n%2 !=0).forEach(n-> System.out.print(n+" "));

    }

}
