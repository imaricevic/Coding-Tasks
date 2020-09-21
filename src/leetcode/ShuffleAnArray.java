package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleAnArray {

	private Random random = new Random();
	private int[] randomNums;
	private int[] nums;

    public ShuffleAnArray(int[] nums) {
        randomNums = new int [nums.length];
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> unUsedIndexes = new ArrayList<Integer>();
        for(int i=0; i< nums.length; i++) {
            unUsedIndexes.add(i);
        }
        int pos = 0;
        while(!unUsedIndexes.isEmpty()) {
            int rand = random.nextInt(unUsedIndexes.size());
            int randomIndex = unUsedIndexes.get(rand);
            randomNums[pos++] = nums[randomIndex];
            unUsedIndexes.remove(rand);
        }
        
        return randomNums;
    }
    
}
