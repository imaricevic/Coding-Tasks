package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Reverse a linked list from position m to n. Do it in one-pass.
 * 
 *         Note: 1 ≤ m ≤ n ≤ length of list.
 */
public class ReverseLinkedList2 {

	public ListNode reverseBetween(ListNode head, int m, int n) {

		ListNode before = null, after = null, start = null;

		before = getNode(head, m - 1);
		start = getNode(head, m);
		after = getNode(head, n + 1);

		if (before == null) {
			head = reverse(start, after);
		} else {
			before.next = reverse(start, after);
		}

		start.next = after;

		return head;
	}

	private ListNode getNode(ListNode head, int index) {
		ListNode node = head;
		while (index > 1 && node != null) {
			node = node.next;
			index--;
		}

		if (index > 1 || index <= 0) {
			return null;
		}
		return node;
	}

	private ListNode reverse(ListNode start, ListNode end) {
		ListNode head = start;
		if (head == null) {
			return null;
		}

		ListNode previous = null;
		while (head != null && head != end) {
			ListNode next = head.next;
			head.next = previous;
			previous = head;
			head = next;
		}

		return previous;
	}
}
