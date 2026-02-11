package Collections.comprator;

import java.util.*;

public class sortingMap {
    public static void main(String[] args) {
        String str = "programingg";
        Map<Character,Integer> hm = new HashMap<>();

        for(char c : str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(hm.entrySet());
        System.out.println(list);

      /* list.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        }); // sorted asc order */

        // or
        list.sort((a,b) -> a.getValue()-b.getValue());
        System.out.println(list);

        // sorting using character
        list.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getKey()-o1.getKey();
            }
        });

        System.out.println(list);

    }
}
