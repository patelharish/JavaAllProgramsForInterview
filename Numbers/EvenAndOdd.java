package Numbers;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter terms: ");
        int n = sc.nextInt();
        sc.close();
        //Even numbers
        System.out.println("Even numbers are: ");
        for (int i = 1; i <= n; i++) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // odd numbers
        System.out.println("odd numbers are:");
        for (int i = 1; i <= n; i++) {
            if(i%2==1) {
                System.out.print(i+" ");
            }
        }
    }
}
