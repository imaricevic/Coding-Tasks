package other;

import org.junit.Assert;
import org.junit.Test;

public class ValidIp {

	public int solution(String s) {
		if(s == null || s.length() < 4 || s.length() > 12) {
			return 0;
		}
		
		return recursion(s, 3);
	}
	
	private int recursion(String s, int dots) {
		if(dots == 0 && isValid(s)) {
			return 1;
		}
		
		int result = 0;
		for(int i=0; i < s.length(); i++) {
			
			String ip = s.substring(0, i + 1);
			String rest = s.substring(i + 1);
			if(!isValid(ip)) {
				continue;
			}
			result += recursion(rest, dots - 1);
		}
		
		return result;
	}
	
	private boolean isValid(String ipNumber) {
		
		if(ipNumber == null || ipNumber.isEmpty() || ipNumber.length() > 3 
				|| (ipNumber.length() > 1 && ipNumber.startsWith("0"))) {
			return false;
		}
		
		try {
			int number = Integer.parseInt(ipNumber);
			if(number > 255) {
				return false;
			}
		}
		catch (NumberFormatException e) {
			return false;
		}
		
		
		return true;
	}
	
	@Test
	public void testResult1() {
		ValidIp ip = new ValidIp();
		Assert.assertEquals(8, ip.solution("188212")); ;
	}

	@Test
    public void testSolve0() {
        ValidIp ip = new ValidIp();
        int result = ip.solution("");

        Assert.assertEquals(0, result);
    }

    @Test
    public void testSolve1() {
        ValidIp ip = new ValidIp();
        int result = ip.solution("121");

        Assert.assertEquals(0, result);
    }

    @Test
    public void testSolve2() {
        ValidIp ip = new ValidIp();
        int result = ip.solution("188212");

        Assert.assertEquals(8, result);
    }

    @Test
    public void testSolve3() {
        ValidIp ip = new ValidIp();
        int result = ip.solution("4216712120");

        Assert.assertEquals(2, result);
    }

    @Test
    public void testSolve4() {
        ValidIp ip = new ValidIp();
        int result = ip.solution("255255255255");

        Assert.assertEquals(1, result);
    }
	
}
