package ctc.v6.questions.linked_list;

/**
 * @author ivan
 * 
 *         2.5 Sum Lists: You have two numbers represented by a linked list,
 *         where each node contains a single digit. The digits are stored in
 *         reverse order, such that the 1's digit is at the head of the list.
 *         Write a function that adds the two numbers and returns the sum as a
 *         linked list.
 * 
 *         EXAMPLE
 * 
 *         Input: (7-> 1 -> 6) + (5 -> 9 -> 2) .That is, 617 + 295.
 * 
 *         Output: 2 -> 1 -> 9. That is, 912.
 * 
 *         FOLLOW UP
 * 
 *         Suppose the digits are stored in forward order. Repeat the above
 *         problem.
 * 
 *         EXAMPLE Input: (6 -> 1 -> 7) + (2 -> 9 -> 5). That is, 617 + 295.
 * 
 *         Output: 9 -> 1 -> 2. That is, 912.
 * 
 *         Hints: #7, #30, #71, #95, #109
 */
public class SumLists {

	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList(new int[] { 0, 9, 1 });
		LinkedList linkedList2 = new LinkedList(new int[] { 0, 1, 9 });
		LinkedList sumList = sumLists(linkedList1.head, linkedList2.head);
		sumList.print();
	}
	
	public static LinkedList sumLists(Node head1, Node head2) {
		if(head1 == null && head2 == null) {
			return new LinkedList(new Node(0));
		}
		if(head1 == null) {
			return new LinkedList(head2);
		}
		else if (head2 == null ) {
			return new LinkedList(head1);
		}
		
		LinkedList sumList = new LinkedList();
		sumList.append(getSecondSumNumber(head1.data + head2.data));
		int carrier = getFirstSumNumber(head1.data + head2.data);
		
		while(head1.next != null || head2.next != null) {
			sumList.append(getSecondSumNumber(head1.next.data + head2.next.data + carrier));
			carrier = getFirstSumNumber(head1.next.data + head2.next.data);
			
			if(head1.next != null) {
				head1 = head1.next;
			}
			if(head2.next != null) {
				head2 = head2.next;
			}
		}
		
		if(carrier > 0) {
			sumList.append(carrier);
		}
		
		return sumList;
	}
	
	private static int getFirstSumNumber(int a) {
		return a >= 10 ? 1 : 0;
	}
	
	private static int getSecondSumNumber(int sum) {
		return sum >= 10 ? (sum) % 10 : sum;
	}
	
}
