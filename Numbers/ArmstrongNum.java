package Numbers;

import java.util.Scanner;

public class ArmstrongNum {
    // 153 = 1*1*1+5*5*5+3*3*3 = 153
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int actual = n;
        int rem;
        int arm = 0;
        while(n>0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
        }
        if(actual==arm){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong number");
        }
    }
}
