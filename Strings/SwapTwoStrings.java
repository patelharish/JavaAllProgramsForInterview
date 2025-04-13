package Strings;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String a= "Hello";
        String b= "World";

        // by using third variable
       /* String temp;
        System.out.println("before swapping a= "+a+", b= "+b);
        temp = a;
        a = b;
        b= temp;
        System.out.println("After swapping a= "+a+", b= "+b); */

        // Without using third variable
        a= a+b;
        
        System.out.println("After swapping a= "+a+", b= "+b);
    }
}
