package Collections.conversion;

import java.util.*;

public class convertSetToString {
    public static void main(String[] args) {
        Set<Character> set = new LinkedHashSet<>();
        set.add('h');
        set.add('a');
        set.add('r');
        set.add('i');
        set.add('s');
        set.add('h');

        StringBuilder sb = new StringBuilder();

        for(char c:set){
            sb.append(c);
        }

        String str = sb.toString();
        System.out.println(str);


        // for list
        List<Character> list = new ArrayList<>();
        list.add('h');
        list.add('a');
        list.add('r');
        list.add('i');
        list.add('s');
        list.add('h');

        StringBuilder sb2 = new StringBuilder();
        for(char c:list){
            sb2.append(c);
        }

        String str2 = sb2.toString();
        System.out.println(str2);

    }
}
