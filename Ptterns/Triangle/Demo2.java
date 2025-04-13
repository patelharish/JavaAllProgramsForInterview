package Ptterns.Triangle;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo2 {
    public static void main(String[] args) {
        String str = "hharrishh";
        char[] ch = str.toCharArray();

        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(Character c:ch){
            if(!hs.contains(c)) {
                hs.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
