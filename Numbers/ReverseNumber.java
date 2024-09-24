package Numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        // 155 = 551
        int n = 155;
        int rem;
        System.out.println("Before reverse: "+n);
        System.out.print("After reverse: ");
        while(n>0){
            rem = n%10;
            System.out.print(rem);
            n=n/10;
        }

    }
}
