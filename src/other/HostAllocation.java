package other;

import java.util.TreeSet;

public class HostAllocation {

	private TreeSet<Integer> free = new TreeSet<Integer>();
	int max = 0;

	// allocate & return next free
	public int allocate() {
		if (free.isEmpty()) {
			return ++max;
		}
		free.pollFirst();
		int next = free.isEmpty() ? free.first() : max;
		return next;
	}

	// free
	public void reallocate(int i) {
		if (i <= max) {
			free.add(i);
		}
	}

}
