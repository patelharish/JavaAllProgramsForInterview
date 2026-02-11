package Collections.conversion;

import java.util.*;

public class StoringMapToList {
    public static void main(String[] args) {
        TreeMap<Character,Integer> hm = new TreeMap<>();

        hm.put('h',2);
        hm.put('r',10);
        hm.put('k',3);
        hm.put('c',8);
        hm.put('m',10);
        hm.put('a',10);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        System.out.println(list);

        Set<Map.Entry<Character, Integer>> set = new HashSet<>(hm.entrySet());
        System.out.println(set);
    }

}
