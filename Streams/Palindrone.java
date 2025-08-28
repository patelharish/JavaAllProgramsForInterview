package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrone {
    public static void main(String[] args) {
        String str = "alam";
        String[] str2 = str.split("");

        List<String> hkp = Arrays.asList(str2);
        Collections.reverse(hkp);

        String str3 = hkp.stream().collect(Collectors.joining());

        if(str.equals(str3)){
            System.out.println("given string is palindrone");
        }else{
            System.out.println("not palindrone");
        }

    }
}
