package Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with duplicate character: ");
        String str = sc.nextLine();
        char[] ic = str.toCharArray();

        // create linkedhashset that holds unique and given ordered formate
        Set<Character>  set = new LinkedHashSet<>();
        // add each character into set
        for(char c : ic){
            set.add(c);
        }
         // create stringbuffer object that we can use append method
        StringBuffer sb = new StringBuffer();
         // append set to stringbuffer
        for(Character cr : set){
            sb.append(cr);
        }

        System.out.println(sb);
    }
}
