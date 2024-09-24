package Numbers;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int n2 = sc.nextInt();
        System.out.println("Before swapping: "+n1+", "+n2);
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping: "+n1+", "+n2);

        /*without using third variable
        n1 = n1+n2; // 1+2 = 3
        n2 = n1-n2; // 3-2 = 1
        n1 = n1-n2; // 3-1 = 2

        System.out.println("without using third variable: "+n1+", "+n2);*/

    }
}
