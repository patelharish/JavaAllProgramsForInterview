package Strings.manipulation;
import java.util.LinkedHashMap;
import java.util.Map;

public class GroupingCharactersTogether {
    public static void main(String[] args) {
        String str = "programming";
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

       // List<Character> group = new ArrayList<>();
        String group = "";
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            for(int i=0;i<count;i++){
                group += c;
            }
        }
        System.out.println(group);
    }
}
