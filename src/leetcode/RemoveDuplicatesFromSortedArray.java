package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Given a sorted array nums, remove the duplicates in-place such that
 *         each element appear only once and return the new length.
 * 
 *         Do not allocate extra space for another array, you must do this by
 *         modifying the input array in-place with O(1) extra memory.
 */

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {

		int len = 0;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] != nums[i + 1]) {
				len++;
				nums[len] = nums[i + 1];
			}
		}

		return len + 1;
	}

}
