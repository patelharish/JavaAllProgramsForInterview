package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class CountOnlyVovelsOccurance {
    public static void main(String[] args) {
        String str = "I am working in infogain";
        char[] c = str.toLowerCase().toCharArray();
        // by using hashmap
        HashMap<Character, Integer> charCount = new HashMap<>();
            for (Character ch : c) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
                }
            }

        System.out.println(charCount);

       // by using hashset and hashmap
       HashSet<Character> vovels = new HashSet<>();
        vovels.add('a');
        vovels.add('e');
        vovels.add('i');
        vovels.add('o');
        vovels.add('u');

        HashMap<Character, Integer> charCount2 = new HashMap<>();
        for(Character ch:c){
            if(vovels.contains(ch)){
                charCount2.put(ch, charCount2.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println(charCount2);
    }
}
