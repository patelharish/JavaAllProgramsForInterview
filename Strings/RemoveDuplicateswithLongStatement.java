package Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateswithLongStatement {
    public static void main(String[] args) {
        String str = "my name is harish patel. my am a experienced software test engineer";
        String[] str2 = str.split("\\s"); // it is use to remove space

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(str2));

        String results = String.join(" ", set);

        System.out.println(results);
    }
}
