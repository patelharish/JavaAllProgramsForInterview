package Strings.manipulation;

public class SumofDigitsinString {
    // 12ab34ghg56 = 12+34+54 = 100
    public static void main(String[] args) {
        String str = "12ab34ghg56";
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for(char c:ch){
            if(Character.isDigit(c)){
                sb.append(c);
            }else{
                if(sb.length()>0) {
                    sum = sum + Integer.parseInt(sb.toString()); // parseint possible only strings
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        System.out.println(sum);

        // using regex
        String[] str3 = str.split("\\D+");
        int sum2 = 0;
        for(String s: str3){
            int n = Integer.parseInt(s);
            sum2 += n;
        }
        System.out.println("using regex: "+sum2);
    }
}
