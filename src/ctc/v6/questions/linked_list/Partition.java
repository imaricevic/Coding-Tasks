package ctc.v6.questions.linked_list;

/**
 * 
 * @author ivan
 *
 *         2.4 Partition: Write code to partition a linked list around a value
 *         x, such that all nodes less than x come before all nodes greater than
 *         or equal to x. lf x is contained within the list, the values of x
 *         only need to be after the elements less than x (see below). The
 *         partition element x can appear anywhere in the "right partition"; it
 *         does not need to appear between the left and right partitions.
 * 
 *         EXAMPLE
 * 
 *         Input:  3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
 * 
 *         Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 * 
 *         Hints: #3, #24
 */
public class Partition {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(new int[] {3, 5, 8, 5, 10, 2, 1});
		linkedList.print();
		partition(linkedList.head, 5);
		linkedList.print();
	}

	public static void partition(Node head, int partition) {
		if(head == null || head.next == null) {
			return;
		}
		Node runner = head;
		Node bigNode = head.data >= partition ? head : null;
		
		while(runner.next != null) {
			if(runner.next.data < partition && bigNode != null) {
				int temp = bigNode.data;
				bigNode.data = runner.next.data;
				runner.next.data = temp;
				bigNode = bigNode.next;
			}
			else if(runner.next.data >= partition && bigNode == null) {
				bigNode = runner.next;
			}
			runner = runner.next;
		}
	}
	
}
