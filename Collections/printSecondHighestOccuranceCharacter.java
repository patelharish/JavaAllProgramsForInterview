package Collections;

import java.util.*;

public class printSecondHighestOccuranceCharacter {
    public static void main(String[] args) {
        String str = "pprrroggghhhkkco";

        Map<Character,Integer> hm = new HashMap<>();

        for(char c: str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

     //   List<Integer> values = new ArrayList<>(hm.values());
     //   List<Character> keys = new ArrayList<>(hm.keySet());

        TreeSet<Integer> set = new TreeSet<>(hm.values()); // sort asc order and unique
        Integer highest = set.last(); // last integer
        set.remove(highest); // removed last element

        Integer secondHighest = set.last();

        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue() == secondHighest){
                System.out.print(entry.getKey());
            }
        }
    }
}
