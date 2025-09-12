package Strings.Sentenses;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestWord {
    public static void main(String[] args) {
        String str = "My name is shahrukhan";
        String[] str1 = str.split(" ");

        String longest = "";
        int max = 0;

        for(String s:str1){
            if(s.length() > max){
                max = s.length();
                longest = s;
            }
        }
        System.out.println(longest);

    // using map
    Map<String, Integer> map = new HashMap<>();
    for(String s1 : str1){
       map.put(s1, s1.length());
    }

    Map.Entry<String,Integer> longest2 = null;
    for(Map.Entry<String,Integer> entry : map.entrySet()){
        if(longest2 == null || entry.getValue() > longest2.getValue()){
            longest2 = entry;
        }
    }

    System.out.println(longest2.getKey());

    }
}
