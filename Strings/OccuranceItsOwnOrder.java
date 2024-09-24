package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceItsOwnOrder {
    // harish = {h:2,a:1,r:1,i:1,s:1}
    public static void main(String[] args) {
        String str = "harish";
        char[] str2 = str.toCharArray();
        // by using linkedHasMap the character displayed its own order
        LinkedHashMap<Character,Integer> charMapCount = new LinkedHashMap<>();
        for(Character c : str2){
            if(charMapCount.containsKey(c)){
                charMapCount.put(c,charMapCount.get(c)+1);
            }else{
                charMapCount.put(c,1);
            }
        }
        // print character its own order logic
        // first way to printing character
        System.out.println(charMapCount);

        // second way to printing character
        for(Map.Entry<Character,Integer> entry : charMapCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
