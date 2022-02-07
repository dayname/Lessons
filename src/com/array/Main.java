package com.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 1, 2};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix.length);
        System.out.println(Arrays.deepToString(matrix));
    }
}