package Strings;

public class ReverseStringItsOwnPlace {

    public static void main(String[] args) {

        String str = "harish patel hkp kumar";

        String[] sr = str.split(" ");
        /*String str1 = sr[0];
        String str2 = sr[1];*/

        /*for(String s:sr){
            System.out.println(s);
        }*/
        // by using simple for loop
        for (int i = 0; i < sr.length; i++) {
            StringBuffer sb = new StringBuffer(sr[i]);
            sb = sb.reverse();
            System.out.print(sb+" ");
        }
        // by using enhanced for loop
        System.out.println();
        for(String s:sr){
            StringBuffer sb = new StringBuffer(s);
            sb = sb.reverse();
            System.out.print(sb+" ");
        }

        System.out.println();
        // without using stringbuffer and stringbuilder
        // by using enhanced for and normal for loop
        for(String s:sr){ // this enhanced for loop iterate every elements of an array
            for (int j = s.length()-1; j >=0 ; j--) { // this normal for loop iterate into last index to 0th index
                System.out.print(s.charAt(j)); // charAt coverts strings to each character and writting into reverse order
            }
            System.out.print(" ");
        }
        System.out.println();
        // by using only normal for loop
        for(int i = 0; i < sr.length; i++) {
            for (int j = sr[i].length()-1; j >=0 ; j--) {
                System.out.print(sr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
