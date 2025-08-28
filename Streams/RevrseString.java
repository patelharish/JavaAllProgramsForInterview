package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RevrseString {
    public static void main(String[] args) {
        String str = "harish";
        String[] str2 = str.split("");

        List<String> strlist= Arrays.asList(str2);
        Collections.reverse(strlist);

        String reversed = strlist.stream().collect(Collectors.joining());
        System.out.println(reversed);
    }
}
