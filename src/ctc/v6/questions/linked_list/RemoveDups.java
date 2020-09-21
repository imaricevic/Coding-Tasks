package ctc.v6.questions.linked_list;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ivan
 * 
 *         2.1 Remove Dups: Write code to remove duplicates from an unsorted
 *         linked list.
 * 
 *         FOLLOW UP
 * 
 *         How would you solve this problem if a temporary buffer is not
 *         allowed?
 * 
 *         Hints: #9, #40
 */
public class RemoveDups {
	

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.append(new int[] {1, 2 , 4, 6, 5, 4 , 3, 1});
		
		linkedList.print();
		removeDuplicatesWithoutBuffer(linkedList.head);
		linkedList.print();
	}
	
	
	public static void removeDuplicates(Node node) {
		if(node == null) {
			return;
		}
		Set<Integer> dataSet = new HashSet<Integer>();
		dataSet.add(node.data);
		
		while(node.next != null) {
			if(!dataSet.contains(node.next.data)) {
				dataSet.add(node.next.data);
				node = node.next;
			}
			else {
				node.next = node.next.next;
			}
		}
	}
	
	public static void removeDuplicatesWithoutBuffer(Node node) {
		if(node == null) {
			return;
		}
		
		Node outerNode = node;
		while(outerNode.next != null) {
			node = outerNode.next;
			while(node.next != null) {
				if(outerNode.data == node.next.data) {
					node.next = node.next.next;
				}
				else {
					node = node.next;
				}
			}
			outerNode = outerNode.next;
		}
	}
	
}
