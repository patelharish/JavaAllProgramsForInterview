package Strings;

public class Demo {
    public static void main(String[] args) {
        String str = "HaRiSh";
        String rst ="";
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                rst += Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                rst += Character.toUpperCase(c);
            }
        }

        System.out.println(rst);
    }
}
