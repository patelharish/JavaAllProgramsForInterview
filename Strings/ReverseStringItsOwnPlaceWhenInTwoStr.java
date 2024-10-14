package Strings;

public class ReverseStringItsOwnPlaceWhenInTwoStr {
    public static void main(String[] args) {
        String str = "harish patel";
        String[] str2 = str.split(" ");
        String first = str2[0]; // harish
        String second = str2[1]; // patel

        /*StringBuffer sb = new StringBuffer(str1);
        StringBuffer rev1 = sb.reverse();

        StringBuffer sb2 = new StringBuffer(str3);
        StringBuffer rev2 = sb2.reverse();

        System.out.println(rev1+" "+rev2);*/

        //different ways
        for(int i=first.length()-1; i>=0; i--){
            System.out.print(first.charAt(i));
        }
        System.out.print(" ");
        for (int j=second.length()-1; j>=0; j--){
            System.out.print(second.charAt(j));
        }

    }
}
