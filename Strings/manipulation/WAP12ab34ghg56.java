package Strings.manipulation;

import java.util.Arrays;

public class WAP12ab34ghg56 {
    public static void main(String[] args) {
        String str = "12ab34ghg,56";
        String[] sr = str.split("[^0-9]+");
        System.out.println(Arrays.toString(sr));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(String s : sr){
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
