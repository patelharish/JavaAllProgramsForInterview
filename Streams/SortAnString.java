package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortAnString {
    public static void main(String[] args) {
        String str = "programing";
        String[] ch = str.split("");

        // first way
        String str1 = Arrays.stream(ch).sorted().collect(Collectors.joining()); //ASC order
        System.out.println(str1);

        String str2 = Arrays.stream(ch).sorted(Collections.reverseOrder()).collect(Collectors.joining()); //DESC order
        System.out.println(str2);

        //second way
        String str3 = str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(str3);
    }
}
