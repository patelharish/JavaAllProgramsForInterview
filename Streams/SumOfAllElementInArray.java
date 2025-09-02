package Streams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumOfAllElementInArray {
    public static void main(String[] args) {
        int[] num = {23,54,67,56,89};

        //first way
        int sum = Arrays.stream(num).sum();
        System.out.println("sum: "+sum);

    }
}
