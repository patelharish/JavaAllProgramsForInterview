package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class countVovelsandConstandPrintCharString {
    public static void main(String[] args) {
        String str = "programming";

        List<String> vovels = Arrays.stream(str.toLowerCase().split(""))
                .filter(c -> c.matches("[aeiou]"))
                .collect(Collectors.toList());

        List<String> constt = Arrays.stream(str.toLowerCase().split(""))
                .filter(c -> c.matches("[a-z]"))
                .filter(c -> !"aeiou".contains(c))
                .collect(Collectors.toList());

        System.out.println("vovels ("+vovels.size()+") : "+vovels);
        System.out.println("consonant ("+constt.size()+") : "+constt);
    }
}
