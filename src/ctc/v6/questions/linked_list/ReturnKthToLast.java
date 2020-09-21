package ctc.v6.questions.linked_list;

/**
 * @author ivan
 * 
 *         2.2 Return Kth to Last: Implement an algorithm to find the kth to last
 *         element of a singly linked list.
 * 
 *         Hints: #8, #25, #41, #67, #126
 */
public class ReturnKthToLast {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(new int[] { 1, 2, 4, 6, 5, 4, 3, 1 });
		linkedList.print();
		Node kth = returnKthToLast(linkedList.head, 1);
		System.out.println(kth != null ? kth.data : "n/a");
	}

	public static Node returnKthToLast(Node node, int k) {
		if (node == null || k < 0) {
			return null;
		}

		Node runner = node;
		while (runner.next != null) {
			runner = runner.next;
			if (k <= 0) {
				node = node.next;
			} else {
				k--;
			}
		}
		return k > 0 ? null : node;
	}
}
