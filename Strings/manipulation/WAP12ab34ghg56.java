package Strings.manipulation;

public class WAP12ab34ghg56 {
    public static void main(String[] args) {
        String str = "12ab34ghg,56";
        String[] sr = str.split("[^0-9]+");
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(String s : sr){
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
