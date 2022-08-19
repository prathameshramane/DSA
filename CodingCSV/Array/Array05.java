package CodingCSV.Array;

import java.util.Arrays;

// Chocolate Distribution Problem
// https://www.geeksforgeeks.org/chocolate-distribution-problem/

public class Array05 {
    public static void main(String[] args) {
        // int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        // int m = 3;
        int[] arr = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int m = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        int start = 0;
        int end = m - 1;
        int minDiff = Integer.MAX_VALUE;

        while (end < arr.length) {
            if (arr[end] - arr[start] < minDiff) {
                minDiff = arr[end] - arr[start];
            }
            start++;
            end++;
        }

        System.out.println(minDiff);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
