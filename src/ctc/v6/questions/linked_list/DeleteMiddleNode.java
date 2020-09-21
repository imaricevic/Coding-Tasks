package ctc.v6.questions.linked_list;

/**
 * @author ivan
 *
 *         2.3 Delete Middle Node: Implement an algorithm to delete a node in
 *         the middle (i.e., any node but the first and last node, not
 *         necessarily the exact middle) of a singly linked list, given only
 *         access to that node.
 * 
 *         EXAMPLE
 * 
 *         Input: the node c from the linked list a->b->c->d->e->f 
 *         Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 * 
 *         Hints: #72
 */
public class DeleteMiddleNode {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.append(new int[] {1, 2, 4, 5 });
		
		linkedList.print();
		deleteMiddleNode(linkedList.head.next);
		linkedList.print();
	}
	
	public static void deleteMiddleNode(Node middleNode) {
		if(middleNode == null || middleNode.next == null) {
			return;
		}
		middleNode.data = middleNode.next.data;
		middleNode.next = middleNode.next.next;
	}
	
}
