package Collections.conversion;

import java.util.TreeSet;

public class treeSetUseFullMethods {
    public static void main(String[] args) {
        String str = "programminggg";

        TreeSet<Character> set = new TreeSet<>();
        for(char c: str.toCharArray()){
            set.add(c);
        }
        char last = set.last();
        set.remove(last);
        System.out.println(set);
        System.out.println(set.last());
        System.out.println(set.first());
    }
}
