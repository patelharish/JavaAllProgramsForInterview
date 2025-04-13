package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FindTheSecondHighestNum {
    public static void main(String[] args) {
        int[] a = {1, 7, 4, 9, 8, 3, 9};
        int[] a2 = {2, 9, 6, 45, 35, 50, 45, 50, 5};
        FindTheSecondHighestNum.secondLarge1(a);
        FindTheSecondHighestNum.secondLarge2(a2);


    }

    // first approach
    public static void secondLarge1(int[] a) {
        int firstLargest = a[0]; // 1 index of 0
        int secondLargest = a[0]; // 1 index of 0

        // by using enhanced for loop
        for (int c : a) {
            if (c > firstLargest) {  // 1 > 1 , 7>1
                secondLargest = firstLargest;
                firstLargest = c;
            } else if (c > secondLargest && c != firstLargest) { // 1 > 1 && 1 != 1
                secondLargest = c;
            }
        }
        System.out.println(firstLargest);
        System.out.println(secondLargest);

        // by using simple for loop
        for (int i = 0; i < a.length; i++) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest && i != firstLargest) {
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }

    // second appraoch
    public static void secondLarge2(int[] a2) {
        int size = a2.length;
        if (size < 2) {
            System.out.println("invalid input");
            return;
        }

        
        Arrays.sort(a2);  // sort an arrays
        //System.out.println(a2[size - 2]); // if not contains duplicates then its works

        // if contain duplicates
        for (int i = size - 2; i >= 0; i--) {
            if (a2[i] != a2[size - 1]) {
                System.out.println(a2[i]);
                return;
            }
        }
        System.out.println("There is no second largest unique number.");

        }

    }

