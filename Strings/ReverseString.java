package Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Harish";
        for (int i = str.length()-1; i >= 0 ; i--) {
          char rev = str.charAt(i);
          System.out.print(rev);
        }

        System.out.println("");
        //by using Stringbuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse());

        System.out.println("");
        //by using StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        System.out.println(sbr.reverse());
    }
}
