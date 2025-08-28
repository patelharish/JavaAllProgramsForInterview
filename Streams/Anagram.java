package Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if(str1.length() != str2.length()){
            System.out.println("given strings are not anagram");
        }

        String sorted1 = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining());
        String sorted2 = Arrays.stream(str2.split("")).sorted().collect(Collectors.joining());

        if(sorted1.equals(sorted2)){
            System.out.println("Both the strings are anagram");
        }else{
            System.out.println("given strings are not anagram");
        }
    }
}
