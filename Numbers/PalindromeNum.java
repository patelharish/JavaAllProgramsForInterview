package Numbers;

import java.util.Scanner;

public class PalindromeNum {
    // 121 = 121
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n1 = sc.nextInt();
        int n2 = n1;
        int rem;
        int palim=0;
        while(n1>0){
            rem = n1%10;
            palim = (palim*10)+rem;
            n1 = n1/10;
        }
        if(n2==palim){
            System.out.print("palim");
        }else{
            System.out.print("not palim");
        }

        System.out.println("");
        // using string conversion
        System.out.println("Enter another num: ");
        String s1 = sc.next();
        String reverse = new StringBuffer(s1).reverse().toString();
        if(s1.equals(reverse)){
            System.out.print("palim");
        }else{
            System.out.print("not palim");
        }

    }
}
