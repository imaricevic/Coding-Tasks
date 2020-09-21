package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Design a stack that supports push, pop, top, and retrieving the
 *         minimum element in constant time.
 * 
 *         push(x) -- Push element x onto stack. pop() -- Removes the element on
 *         top of the stack. top() -- Get the top element. getMin() -- Retrieve
 *         the minimum element in the stack.
 */
public class MinStack {

	private int pointer;
	private int[] data;
	private int[] min;

	/** initialize your data structure here. */
	public MinStack() {
		pointer = -1;
		min = new int[10000];
		data = new int[10000];
	}

	public void push(int x) {
		pointer++;
		data[pointer] = x;
		if (pointer > 0) {
			min[pointer] = Math.min(x, min[pointer - 1]);
		} else {
			min[pointer] = x;
		}
	}

	public void pop() {
		if (pointer >= 0) {
			pointer--;
		}
	}

	public int top() {
		return data[pointer];
	}

	public int getMin() {
		return min[pointer];
	}
}
