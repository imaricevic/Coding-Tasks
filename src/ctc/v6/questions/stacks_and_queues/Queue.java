package ctc.v6.questions.stacks_and_queues;

import java.util.NoSuchElementException;

public class Queue<T> {
	
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void add(T data) {
		QueueNode<T> node = new QueueNode<T>(data);
		
		if(last == null) {
			last = node;
			first = node;
		}
		else {
			last.next = node;
		}
	}
	
	public void remove() throws NoSuchElementException {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		first = first.next;
		if(first == null) {
			last = null;
		}
	}
	
	public QueueNode<T> peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		return first;
	}
	
	@SuppressWarnings("hiding")
	public class QueueNode<T> {
		
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data) {
			this.data = data;
		}
	}
	
}
