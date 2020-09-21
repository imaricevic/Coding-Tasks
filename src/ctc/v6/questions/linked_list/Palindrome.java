package ctc.v6.questions.linked_list;

/**
 * @author ivan
 * 
 *         2.6 Palindrome: Implement a function to check if a linked list is a
 *         palindrome
 * 
 *         Hints: #5, #13, #29, #61, #101
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(new int[] { 0, 9, 1, 9, 0 });
		linkedList.print();
		System.out.println("Is palindrome: " + isPalindrome(linkedList.head));
	}
	
	// TODO: without a buffer
	public static boolean isPalindrome(Node head) {
		if(head == null) {
			return false;
		}
		
		int length = 1;
		Node end = head;
		while(end.next != null) {
			end = end.next;
			length++;
		}
		
		int[] temp = new int[length/2];
		
		for(int i=0; i < length; i++) {
			if(i < length / 2) {
				temp[i] = head.data;
			}
			else if(i == length / 2 && length % 2 == 1) {
				// skip the middle
			}
			else {
				if(temp[length - i - 1] != head.data) {
					return false;
				}
			}
			
			head = head.next;
		}
		
		return true;
	}

}
