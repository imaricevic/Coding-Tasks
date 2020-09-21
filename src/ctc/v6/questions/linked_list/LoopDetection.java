package ctc.v6.questions.linked_list;

/**
 * @author imaricevic
 *
 *         2.8 Loop Detection: Given a circular linked list, implement an algorithm
 *         that returns the node at the beginning of the loop. 
 *         DEFINITION
 *         
 *         Circular linked list: A (corrupt) linked list in which a node's next
 *         pointer points to an earlier node, so as to make a loop in the linked
 *         list. 
 *         
 *         EXAMPLE 
 *         
 *         Input: A -> B -> C -> D -> E -> C[the same C as earlier]
 *         Output: C
 *         
 *         Hints: #50, #69, #83, #90
 *
 *
 */
public class LoopDetection {
	
	public static void main(String[] args) {
		
	}
	
	// TODO: optimise
	public static Node loopDefinition(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		
		Node runner1 = head, runner2 = head;
		while(true) {
			runner1 = runner1.next.next;
			runner2 = runner2.next;
			if(head == runner1 || head == runner2) {
				return head;
			}
			if(runner1 == runner2) {
				head = head.next;
			}
		}
	}

}
