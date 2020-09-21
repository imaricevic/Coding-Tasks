package ctc.v6.questions.stacks_and_queues;

import java.util.NoSuchElementException;

public class Stack<T> {

	private StackNode<T> top;
	
	public T peek() {
		if(top == null) {
			throw new NoSuchElementException();
		}
		
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(T data) {
		StackNode<T> node = new StackNode<T>(data);
		node.next = top;
		top = node;
	}
	
	public void pop() {
		if(top == null) {
			throw new NoSuchElementException();
		}
		top = top.next;
	}
	
	@SuppressWarnings("hiding")
	public class StackNode<T> {
		
		private T data;
		private StackNode<T> next;
		
		
		public StackNode(T data) {
			this.data = data;
		}
	}
}
