package Strings.Sentenses;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterTheWordsStartsWith {
    public static void main(String[] args) {
        String word = "My name is harish kumar patel hkp and your name what it is";
        String[] words = word.split(" ");
        String result = "";
        String result2 = "";

        for(String w:words){
               /* if(w.charAt(0) == 'h') {
                    result += w + " ";
                }*/
                if(w.startsWith("h")) {
                    result2 += w + " ";
            }
        }
        System.out.println(result);
        System.out.println(result2);

        //using String builder
        StringBuilder sb = new StringBuilder();
        for(String w:words){
            if(w.startsWith("h")){
                sb.append(w).append(" ");
            }
        }
        System.out.println(sb.toString());

        // Using streams
        String hkp = Arrays.stream(words).filter(w->w.startsWith("h")).collect(Collectors.joining(" "));
        System.out.println("using streams: "+hkp);
    }
}
