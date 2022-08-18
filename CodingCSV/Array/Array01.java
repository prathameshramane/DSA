package CodingCSV.Array;

import java.util.Arrays;

// Maximum and minimum of an array using minimum number of comparisons
// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

public class Array01 {
    static class Pair {
        int min;
        int max;

        @Override
        public String toString() {
            return "Min: " + min + ", Max: " + max;
        }
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(linearMinMaxOfArray(nums));
        System.out.println(divideAndConquerMinMaxOfArray(nums, 0, nums.length - 1));
    }

    public static Pair linearMinMaxOfArray(int nums[]) {
        Pair minMax = new Pair();
        minMax.min = nums[0];
        minMax.max = nums[0];
        for (int num : nums) {
            if (num < minMax.min)
                minMax.min = num;
            if (num > minMax.max)
                minMax.max = num;
        }
        return minMax;
    }

    public static Pair divideAndConquerMinMaxOfArray(int nums[], int low, int high) {
        Pair minMax = new Pair();
        Pair minMaxLeft = new Pair();
        Pair minMaxRight = new Pair();
        int mid;

        if (low == high) {
            minMax.min = nums[low];
            minMax.max = nums[high];
            return minMax;
        }

        if (low + 1 == high) {
            if (nums[low] > nums[high]) {
                minMax.min = nums[high];
                minMax.max = nums[low];
            } else {
                minMax.min = nums[low];
                minMax.max = nums[high];
            }
            return minMax;
        }

        mid = (low + high) / 2;
        minMaxLeft = divideAndConquerMinMaxOfArray(nums, low, mid);
        minMaxRight = divideAndConquerMinMaxOfArray(nums, mid + 1, high);

        if (minMaxLeft.min < minMaxRight.min) {
            minMax.min = minMaxLeft.min;
        } else {
            minMax.min = minMaxRight.min;
        }

        if (minMaxLeft.max > minMaxRight.max) {
            minMax.max = minMaxLeft.max;
        } else {
            minMax.max = minMaxRight.max;
        }

        return minMax;
    }
}
