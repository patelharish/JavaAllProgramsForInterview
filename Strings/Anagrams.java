package Strings;

import java.util.Arrays;
import java.util.Scanner;
// anagram => heart = earth
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        sc.close();

        // Remove spaces
        str1 = str1.replaceAll("\s",""); // \s is known as space
        str2 = str2.replaceAll(" ",""); // " " also known as space both are same to use

        // covert into lowercase or uppercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println(str1+" and "+str2+" are not anagram");
        }else{
            // convert string to charArray
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            //sort character
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            //compare both the sorted charArrays
            if(Arrays.equals(ch1,ch2)){
                System.out.println(str1+" and "+str2+" are anagram");
            }else{
                System.out.println(str1+" and "+str2+" are not anagram");
            }
        }
    }
}
