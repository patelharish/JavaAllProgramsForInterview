package Numbers;

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        // fab series : 0,1,1,2,3,5,8....
        int a=0, b=1,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();
        sc.close();
        for(int i=0; i<=n;i++){
            System.out.println(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
    }
}
