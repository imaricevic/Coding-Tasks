package codility.tutorial;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author imaricevic
 *
 *         This is a demo task.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int[] A); }
 * 
 *         that, given an array A of N integers, returns the smallest positive
 *         integer (greater than 0) that does not occur in A.
 * 
 *         For example, given A = [1, 3, 6, 4, 1, 2], the function should return
 *         5.
 * 
 *         Given A = [1, 2, 3], the function should return 4.
 * 
 *         Given A = [−1, −3], the function should return 1.
 * 
 *         Write an efficient algorithm for the following assumptions:
 * 
 *         N is an integer within the range [1..100,000]; each element of array
 *         A is an integer within the range [−1,000,000..1,000,000].
 * 
 *         Copyright 2009–2020 by Codility Limited. All Rights Reserved.
 *         Unauthorized copying, publication or disclosure prohibited.
 *
 */
public class MissingInteger {

	public int solution(int[] A) {
		// write your code in Java SE 8
		if(A == null) {
			return 1;
		}
		
		Set<Integer> orderSet = new HashSet<Integer>();
		Set<Integer> numberSet = new HashSet<Integer>();
		
		for(int i=0; i < A.length; i++) {
			orderSet.add(i + 1);
			numberSet.add(A[i]);
		}
		
		for (Integer order : orderSet) {
			if(!numberSet.contains(order)) {
				return order;
			}
		}
		
		if(orderSet.size() == numberSet.size()) {
			return orderSet.size() + 1;
		}
		
		return 1;
	}
}
