package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Given an integer array nums, find the contiguous subarray (containing
 *         at least one number) which has the largest sum and return its sum.
 * 
 *         Follow up: If you have figured out the O(n) solution, try coding
 *         another solution using the divide and conquer approach, which is more
 *         subtle.
 */
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {

		if (nums == null) {
			return 0;
		}

		int sum = nums[0], subSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			subSum = Math.max(nums[i], subSum + nums[i]);
			sum = Math.max(sum, subSum);
		}

		return sum;
	}
}
