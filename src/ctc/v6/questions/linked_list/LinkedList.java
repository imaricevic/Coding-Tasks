package ctc.v6.questions.linked_list;

public class LinkedList {

	Node head;
	
	public LinkedList() {
	}
	
	public LinkedList(Node head) {
		this.head = head;
	}

	public LinkedList(int[] data) {
		append(data);
	}
	
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void delete(int data) {
		if(head == null) {
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void append(int[] data) {
		for(int i=0; i < data.length; i++) {
			append(data[i]);
		}
	}
	
	public void print() {
		if(head == null) {
			return;
		}
		System.out.println();
		Node current = head;
		while(current.next != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}
	
}
