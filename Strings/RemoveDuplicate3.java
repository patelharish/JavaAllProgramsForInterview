package Strings;

public class RemoveDuplicate3 {
    public static void main(String[] args) {


        String str = "programming";
        String dupli = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            // check character if not present in string 
            if (dupli.indexOf(ch) == -1) {
                dupli += ch;
            }
        }
        System.out.println(dupli);
    }
}
