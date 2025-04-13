package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceEachCharacter {
    //java = j:1,a:2,v:1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to count occurance of every character: ");
        String str = sc.nextLine();
        char[] str2 = str.toCharArray(); // convert string to charArray
        // By using HashMap the character displayed any of order
        HashMap<Character, Integer> charMapCount = new HashMap<>(); // empty hashmap created
        for (Character c : str2){
                if (charMapCount.containsKey(c)) {
                    charMapCount.put(c, charMapCount.get(c) + 1); //
                } else {
                    charMapCount.put(c, 1);
                }

        }
        // first way to printing character
        System.out.println(charMapCount);

        // second way to printing character
        for(Map.Entry<Character,Integer> entry : charMapCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // more simple way

        // By using HashMap the character displayed any of order
        for (Character c : str2){
            charMapCount.put(c, charMapCount.getOrDefault(c,0) + 1);
        }
        // first way to printing character
        System.out.println(charMapCount);
    }
}
