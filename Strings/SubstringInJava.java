package Strings;

public class SubstringInJava {
    public static void main(String[] args) {
        String str = "my name is harish patel";
        String str2 = str.substring(1); // y name is harish patel
        System.out.println(str2);

        String str3 = str.substring(3,7); // 3 is starting index, 7 is ending index
        System.out.println(str3); // name

    }
}
