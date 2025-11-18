package Strings.manipulation;

public class A2B3C4 {
    public static void main(String[] args) {
        //"A2B3C4D5" = AABBBCCCCDDDDD
        String str = "A2B3C4D5";
        char[] ch = str.toCharArray();
        StringBuilder result = new StringBuilder();
        char currentChar = 0;

        for(char c: ch){
            if(Character.isLetter(c)){
                currentChar = c ;
            }else if(Character.isDigit(c)){
                int count = Character.getNumericValue(c);
                for(int i=0; i<count;i++){
                    result.append(currentChar);
                }
            }
        }
        System.out.println(result);
    }

}
