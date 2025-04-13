package Strings;

public class RemoveSpecialJunkCharacters {
    public static void main(String[] args) {
        String s = "@#$% ~~! harish PATEL 992235";
        // by using replaceAll method and regular expression
        s= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
