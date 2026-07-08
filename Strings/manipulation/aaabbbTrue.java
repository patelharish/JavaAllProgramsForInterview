package Strings.manipulation;

//check if all 'a' comes before 'b' in the string
public class aaabbbTrue {
    public static void main(String[] args) {
        String str = "aaabbb"; //true
        char[] ch = str.toCharArray();

        // Start from index 1 because we compare the current
        // character with the previous character (i - 1)
        for(int i=1; i<ch.length; i++){
            // If we find the pattern "ba", it means an 'a'
            // appears after a 'b', which violates the rule
            // that all 'a's must come before all 'b's.
            if(ch[i] == 'a' && ch[i-1] == 'b'){
                System.out.println("False");
                return;
            }
        }
        // No "ba" pattern found, so all 'a's appear before 'b's
        System.out.println("True");
    }
}
