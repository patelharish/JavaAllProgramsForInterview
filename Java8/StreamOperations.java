package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(54,5,67,23,87,95,12,12,34,67);

        // filter
        List<Integer> filterEven = list.stream().filter(x-> x%2 == 0).toList();
        System.out.println(filterEven);

        // map
        List<Integer> mapEven = filterEven.stream().map(x->x/2).toList();
        System.out.println(mapEven);

        // distinct remove duplicates
        List<Integer> removeDupl = mapEven.stream().distinct().toList();
        System.out.println(removeDupl);

        // sorted asc order
        List<Integer> sortedasc = removeDupl.stream().sorted().toList();
        System.out.println(sortedasc);

        // sorted desc order
        List<Integer> sorteddesc = sortedasc.stream().sorted((a, b) -> (b - a)).toList();
        System.out.println(sorteddesc);

    }
}
