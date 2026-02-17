package Strings.Pointers;

import java.util.Arrays;

public class SwapOnlyVovels {
    public static void main(String[] args) {
        String str = "harish";
        char[] ch = str.toCharArray();
        int left = 0;
        int right= ch.length-1;

            // increment until found vovel from left
            while(left < right && !isVovel(ch[left])){
                left++;
            }

            // decrement until found vovel from righe
            while(left < right && !isVovel(ch[right])){
                right--;
            }

            // swap if vovels occurs
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        System.out.println(Arrays.toString(ch));
        }

    public static boolean isVovel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
