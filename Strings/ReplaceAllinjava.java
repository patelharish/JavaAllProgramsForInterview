package Strings;

public class ReplaceAllinjava {
    public static void main(String[] args) {
        String str = "harish kumar patel";
        String str2 = str.replace("h", "r");
        System.out.println(str2);

        String str3 = str.replaceAll(" ", "");
        System.out.println(str3);
    }
}
