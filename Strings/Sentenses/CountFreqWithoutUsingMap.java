package Strings.Sentenses;

public class CountFreqWithoutUsingMap {
    public static void main(String[] args) {
        String str = "programing";

        int[] freq = new int[256]; //for storing ASCII values of character

        // this logic maintains same order
        for(char c: str.toCharArray()){
            freq[c]++;
        }

        for(char c: str.toCharArray()){
            if(freq[c] > 0){
                System.out.println(c+": "+freq[c]);
                freq[c] = 0; // reseting characters for avoiding duplicacy
            }
        }


        // other way
        // this logic doesn't maintains order
        int[] freq1 = new int[256];
        for(char c:str.toCharArray()){
            freq1[c]++;
        }

        for(int i=0; i<freq1.length; i++){
            if(freq1[i] > 0){
                System.out.println((char)i+": "+freq1[i]);
            }
        }
    }
}
