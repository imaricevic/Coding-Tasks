package ctc.v6.questions.linked_list;

/**
 * @author ivan
 *
 *         2.7 Intersection: Given two (singly) linked lists, determine if the two
 *         lists intersect. Return the intersecting node. Note that the
 *         intersection is defined based on reference, not value. That is, if
 *         the kth node of the first linked list is the exact same node (by
 *         reference) as the jth node of the second linked list, then they are
 *         intersecting. 
 *         
 *         Hints: #20, #45, #55, #65, #76, #93, #111, #120, #129
 *
 */
public class Intersection {

	public static void main(String[] args) {
		
	}
	
	public static boolean isIntersection(Node head1, Node head2) {
		if(head1 == null || head2 == null) {
			return false;
		}
		else if(head1 == head2) {
			return false;
		}
		
		while(head1.next != null && head2.next != null) {
			if(head1.next == head2.next) {
				return true;
			}
			if(head1.next != null) {
				head1 = head1.next;
			}
			if(head2.next != null) {
				head2 = head2.next;
			}
		}
		
		return false;
	}
	
	public static Node intersaction(Node head1, Node head2) {
		if(head1 == null || head2 == null) {
			return null;
		}
		else if(head1 == head2) {
			return null;
		}
		
		int length1 = 1, length2 = 1;
		while(head1.next != null && head2.next != null) {
			if(head1.next != null) {
				length1++;
				head1.next = head1.next.next;
			}
			if(head2.next != null) {
				length2++;
				head2.next = head2.next.next;
			}
		}
		
		for(int i=0; i < Math.max(length1, length2); i++) {
			if(i < Math.abs(length1 - length2)) {
				if(length1 > length2) {
					head1 = head1.next;
				}
				else if(length1 < length2){
					head2 = head2.next;
				}
			}
			else {
				if(head1 == head2) {
					return head1;
				}
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		
		return null;
	}
	
}
