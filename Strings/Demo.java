package Strings;

public class Demo {
    public static void main(String[] args) {
        String str = "hkp37687@##$998kumar878";
        String str2 = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str2);
    }
}
