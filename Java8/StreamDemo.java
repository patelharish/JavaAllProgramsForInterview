package Java8;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(4,7,3,6,7,3);
        Stream<Integer> stream = li.stream();

        String[] str = {"hkp","rkp","aky","dhr"};
        Stream<String> stream1 = Arrays.stream(str);

        Stream<Integer> stre2 = Stream.of(5,8,4,2,9);

        Stream<Integer> num = Stream.iterate(0,n->n+1).limit(100);

    }
}
