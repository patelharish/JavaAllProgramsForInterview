package Strings;

import java.util.Map;
import java.util.TreeMap;

public class OccuranceASCOrder {
    public static void main(String[] args) {
        String str = "Harish";// string literal declaration
        str = str.toLowerCase(); // its compulsory
        char[] str2 = str.toCharArray();
        // by using treeMap we can maintain the order like asc automatically
        TreeMap<Character,Integer> charMapCount = new TreeMap<>();
        for(Character c : str2){
            if(charMapCount.containsKey(c)){
                charMapCount.put(c,charMapCount.get(c)+1);
            }else{
                charMapCount.put(c,1);
            }
        }
        System.out.println(charMapCount);

        // Printing the characters with their occurrence in ascending order
        for (Map.Entry<Character, Integer> entry : charMapCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
