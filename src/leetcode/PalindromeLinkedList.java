package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Given a singly linked list, determine if it is a palindrome.
 */
public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {

		if (head == null || head.next == null) {
			return true;
		}

		return withoutMemory(head);
	}

	private boolean withoutMemory(ListNode head) {

		int length = getLength(head);
		ListNode pointer = reverse(head, length);

		for (int i = 0; i < length / 2; i++) {
			System.out.println(head.val + " " + pointer.val);
			if (head.val != pointer.val) {
				return false;
			}
			pointer = pointer.next;
			head = head.next;
		}

		return true;
	}

	// reverse second half
	private ListNode reverse(ListNode head, int length) {

		for (int i = 0; i < length / 2; i++) {
			head = head.next;
		}

		ListNode previous = null, pointer = head, next = head.next;
		while (pointer.next != null) {
			pointer.next = previous;
			previous = pointer;
			pointer = next;
			next = next.next;
		}
		pointer.next = previous;
		return pointer;
	}

	private int getLength(ListNode head) {
		int length = 1;
		ListNode pointer = head;
		while (pointer.next != null) {
			pointer = pointer.next;
			length++;
		}
		return length;
	}

}
