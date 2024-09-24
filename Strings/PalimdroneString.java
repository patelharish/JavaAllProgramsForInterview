package Strings;

public class PalimdroneString {
    public static void main(String[] args) {
        String str = "ada";
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("palim");
        }else{
            System.out.println("not palim");
        }

        StringBuffer sb = new StringBuffer(str); // convert normal string to stringbuffer
        StringBuffer rev1=sb.reverse(); // reverse string by using reverse method
        String str2 = rev1.toString(); // again covert stringBuffer to normal string

        if(str.equals(str2)){
            System.out.println("palim");
        }else{
            System.out.println("not palim");
        }
    }
}
