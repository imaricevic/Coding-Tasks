package codility.tutorial;

/**
 * 
 * @author imaricevic
 *
 *         A string S consisting of N characters is considered to be properly
 *         nested if any of the following conditions is true:
 * 
 *         S is empty; S has the form "(U)" or "[U]" or "{U}" where U is a
 *         properly nested string; S has the form "VW" where V and W are
 *         properly nested strings. For example, the string "{[()()]}" is
 *         properly nested but "([)()]" is not.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(String S); }
 * 
 *         that, given a string S consisting of N characters, returns 1 if S is
 *         properly nested and 0 otherwise.
 * 
 *         For example, given S = "{[()()]}", the function should return 1 and
 *         given S = "([)()]", the function should return 0, as explained above.
 * 
 *         Write an efficient algorithm for the following assumptions:
 * 
 *         N is an integer within the range [0..200,000]; string S consists only
 *         of the following characters: "(", "{", "[", "]", "}" and/or ")".
 *         
 *         Copyright 2009–2020 by Codility Limited. All Rights Reserved.
 *         Unauthorized copying, publication or disclosure prohibited.
 *
 */
public class Brackets {
	
	public int solution(String S) {
        // write your code in Java SE 8
		if(S == null || S.isEmpty()) {
            return 1;
        }
        
        int[] result = new int[S.length()];
        int resultIndex = 0;
        for(int i=0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                result[resultIndex] = 1;
            }
            else if(S.charAt(i) == '{') {
                result[resultIndex] = 2;
            }
            else if(S.charAt(i) == '[') {
                result[resultIndex] = 3;
            }
            else if(S.charAt(i) == ']') {
                result[resultIndex] = -3;
            }
            else if(S.charAt(i) == '}') {
                result[resultIndex] = -2;
            }
            else if(S.charAt(i) == ')') {
                result[resultIndex] = -1;
            }
            if(result[resultIndex] < 0) {
                if(resultIndex < 1) {
                    return 0;
                }
                if(result[resultIndex] + result[resultIndex - 1] != 0) {
                    return 0;
                }
                else {
                    resultIndex -= 2;
                }
            }
            resultIndex++;
        }
        
        return resultIndex == 0 ? 1 : 0;
    }
}
