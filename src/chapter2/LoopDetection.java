package chapter2;

public class LoopDetection {
	
	// Returns a node in the cycle if there is one, null if there is no cycle.
	public Node loopDetection(Node head) {
		Node p1 = head;
		Node p2 = p1;
		int distance = 1;
		while (p1 != null) {
			
			p2 = p1;
			for (int i = 0; i < distance; i++) {
				p2 = p2.next;
				if (p2 == null) return null;
			}
			
			if (p1 == p2) return p1;
			p1 = p1.next;
			distance++;
		}
		return null;
	}
	
	// Returns the length of a cycle in a list. Assumes there is one.
	public int cycleLength(Node head, Node node) {
		int length = 1;
		Node p = node;
		while (true) {
			if (p.next == node) {
				return length;
			} else {
				p = p.next;
				length++;
			}
		}
	}
	
	// Return null if no cycle, or beginning of cycle if not.
	public Node beginningCycle (Node head) {
		Node node = loopDetection(head);
		if (node == null) return null;
		int length = cycleLength(head, node);
		
		Node p1 = head;
		Node p2 = p1;
		
		for (int i = 0; i < length; i++) {
			p2 = p2.next;
		}
		
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
