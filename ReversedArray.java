package com.company;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1]=array[i];

        }
        System.out.println(Arrays.toString(reversed));
    }
}
