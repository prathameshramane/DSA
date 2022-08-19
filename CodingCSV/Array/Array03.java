package CodingCSV.Array;

public class Array03 {

    public static void main(String args[]) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            int sum = sumOfArray(nums, left, right);
            if (sum < 0)
                left++;
            if (sum > maxSum)
                maxSum = sum;
            right++;
        }
        return maxSum;
    }

    public static int sumOfArray(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
