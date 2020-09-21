package codility.tutorial;

import java.util.Stack;

/**
 * 
 * @author imaricevic
 *
 *         A string S consisting of N characters is called properly nested if:
 * 
 *         S is empty; S has the form "(U)" where U is a properly nested string;
 *         S has the form "VW" where V and W are properly nested strings. For
 *         example, string "(()(())())" is properly nested but string "())"
 *         isn't.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(String S); }
 * 
 *         that, given a string S consisting of N characters, returns 1 if
 *         string S is properly nested and 0 otherwise.
 * 
 *         For example, given S = "(()(())())", the function should return 1 and
 *         given S = "())", the function should return 0, as explained above.
 * 
 *         Write an efficient algorithm for the following assumptions:
 * 
 *         N is an integer within the range [0..1,000,000]; string S consists
 *         only of the characters "(" and/or ")".
 * 
 *         Copyright 2009–2020 by Codility Limited. All Rights Reserved.
 *         Unauthorized copying, publication or disclosure prohibited.
 */
public class Nesting {

	public int solution(String S) {
        // write your code in Java SE 8
		if(S == null || S.length() % 2 == 1) {
			return 0;
		}
		else if(S.isEmpty()) {
			return 1;
		}
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i < S.length(); i++) {
			if(S.charAt(i) == ')') {
				if(stack.isEmpty()) { 
					return 0;
				}
				else if (stack.peek() != S.charAt(i)) {
					stack.pop();
				}
				else {
					return 0;
				}
			}
			else {
				stack.push(S.charAt(i));
			}
		}
		
		return stack.isEmpty() ? 1 : 0;
    }
	
}
