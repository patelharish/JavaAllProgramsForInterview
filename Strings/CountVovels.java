package Strings;

public class CountVovels {
    public static void main(String[] args) {
        String str = "Hello worlds";
        str = str.toLowerCase();
        
        int Vovelcount = 0;
        int constCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char str2 = str.charAt(i);
            if(str2=='a'|| str2=='e'||str2=='i'||str2=='o'||str2=='u'){
                Vovelcount++;
            }else{
                constCount++;
            }
        }
        System.out.println("vovel counts: "+Vovelcount);
        System.out.println("consonent counts: "+constCount);
    }
}
