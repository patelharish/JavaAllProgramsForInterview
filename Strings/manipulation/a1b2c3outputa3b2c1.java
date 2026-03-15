package Strings.manipulation;
import java.util.*;
public class a1b2c3outputa3b2c1 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        char[] ch = str.toCharArray();
        StringBuffer result = new StringBuffer();

        List<Character> number = new ArrayList<>();
        for(char c : ch){
            if(Character.isDigit(c)){
                number.add(c);
            }
        }

        Collections.reverse(number);
        int index = 0;

        for(char c: ch){
            if(Character.isLetter(c)){
                result.append(c);
                result.append(number.get(index));
                index++;
            }
        }
        System.out.println(result);
    }

}
