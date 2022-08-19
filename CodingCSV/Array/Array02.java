package CodingCSV.Array;

import java.util.Arrays;

public class Array02 {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        // reverseArray(nums);
        recursiveReverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void recursiveReverse(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        swap(nums, start, end);
        recursiveReverse(nums, start + 1, end - 1);
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
