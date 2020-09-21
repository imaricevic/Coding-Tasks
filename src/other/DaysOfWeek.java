package other;

public class DaysOfWeek {
	
	public String solve(String dayOfWeek, int K) {

		String[] days = new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", };

		int currentDayIndex = -1;
		for (int i = 0; i < days.length; i++) {
			if (days[i].equals(dayOfWeek)) {
				currentDayIndex = i;
				break;
			}
		}

		return days[(currentDayIndex + (K % 7)) % 7];
	}
}
