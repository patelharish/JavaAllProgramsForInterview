package Strings;

import java.util.Scanner;

public class SplittingText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        sc.close();

        String[] split1 = str.split(" "); // splitting sentence basis on space " "

        // print splitted words
        for(String s:split1){
            System.out.println(s);
        }
        System.out.println(split1[0]);

    }
}
