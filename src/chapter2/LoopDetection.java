// Problem 2.8 CTCI
package chapter2;

public class LoopDetection {
	
	/**  
	 * 
	 * @param head
	 * @return A node in the cycle if there is one, returns null if there is no cycle.
	 */
	public Node loopDetection(Node head) {
		Node p1 = head;
		Node p2 = p1;
		int distance = 1; /* increasing distance of second pointer */
		while (p1 != null) { 
			p2 = p1;
			for (int i = 0; i < distance; i++) { /* advance running second pointer */
				p2 = p2.next;
				if (p2 == null) return null; /* if second pointers hits end then return null */
			}
			if (p1 == p2) return p1; /* if pointers match then return the node in cycle */
			p1 = p1.next;
			distance++;
		}
		return null; /* if hit the end with first pointer then return null */
	}
	
	/**
	 * 
	 * @param head
	 * @param node: A node in the cycle.
	 * @return the length of a cycle, assuming there is one.
	 */
	public int cycleLength(Node head, Node node) {
		int length = 1;
		Node p = node;
		while (true) {
			if (p.next == node) { /* If running pointer matches node of the cycle get length */
				return length;
			} else {
				p = p.next;
				length++;
			}
		}
	}
	
	/**
	 * 
	 * @param head
	 * @return First node of cycle if there is one, null if there is no cycle.
	 */
	public Node beginningCycle (Node head) {
		Node node = loopDetection(head);
		if (node == null) return null;
		int length = cycleLength(head, node);
		
		Node p1 = head;
		Node p2 = p1;
		for (int i = 0; i < length; i++) { /* move second pointer a fixed length */
			p2 = p2.next;
		}
		
		while (p1 != p2) { /* Iterate until both pointers match, they will if there is cycle */
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
