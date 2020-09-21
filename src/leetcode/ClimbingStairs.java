package leetcode;

/**
 * @author imaricevic
 *
 *         You are climbing a stair case. It takes n steps to reach to the top.
 * 
 *         Each time you can either climb 1 or 2 steps. In how many distinct
 *         ways can you climb to the top?
 */
public class ClimbingStairs {

	public int climbStairs(int n) {

		if (n == 1) {
			return 1;
		}
		int[] ways = new int[n + 1];
		ways[1] = 1;
		ways[2] = 2;

		for (int i = 3; i <= n; i++) {
			ways[i] = ways[i - 1] + ways[i - 2];
		}
		
		return ways[n];
	}
}
