package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Reverse a singly linked list.
 */
public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {

		return recursiveReverse(head);
	}

	private ListNode recursiveReverse(ListNode head) {
		if (head == null) {
			return head;
		}
		if (head.next.next != null) {
			ListNode last = recursiveReverse(head.next);
			head.next.next = head;
			head.next = null;
			return last;
		}

		head.next.next = head;
		return head.next;
	}

	private ListNode recursiveReverse(ListNode head, ListNode previous) {
		if (head == null) {
			return head;
		}
		if (head.next != null) {
			ListNode last = recursiveReverse(head.next, head);
			head.next = previous;
			return last;
		}

		head.next = previous;
		return head;
	}

	private ListNode iterativeReverse(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode previous = null;
		ListNode next = head.next;
		while (head.next != null) {
			head.next = previous;
			previous = head;
			head = next;
			next = next.next;
		}
		head.next = previous;

		return head;
	}
}
