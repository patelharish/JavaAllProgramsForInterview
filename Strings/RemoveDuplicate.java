package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        //String str2 = "";
        str = str.toLowerCase();

        // by using hashset
        char[] ch1 = str.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        StringBuffer bf = new StringBuffer();

        for (Character c : ch1) {
            if (!hs.contains(c)) {
                hs.add(c);
                bf.append(c);
            }
        }
        System.out.println(bf.toString());

        // by using streams
        String hkp = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(hkp);

        // by using linkedhashset
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i)); // it returns unique value
        }

        StringBuffer sb = new StringBuffer();
        for(Character c : set){
            sb.append(c);
        }
        System.out.println(sb);
    }
}