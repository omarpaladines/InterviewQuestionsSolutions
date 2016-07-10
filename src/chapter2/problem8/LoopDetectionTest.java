// Problem 2.8 CTCI
package chapter2.problem8;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoopDetectionTest {
	
	LoopDetection loopDetection = new LoopDetection();
	
	@Test
	public void trivialCycle() {
		Node node1 = new Node ('A');
		node1.next = node1;	
		assertTrue(loopDetection.beginningCycle(node1) == node1);
	}
	
	@Test
	public void beginningOfCycle() {
		Node node1 = new Node ('A');
		Node node2 = new Node ('B');
		Node node3 = new Node ('C');
		node1.next = node2;
		node2.next = node3;
		node3.next = node1;		
		assertTrue(loopDetection.beginningCycle(node1) == node1);
	}
	
	@Test
	public void middleCycleThirdNode() {
		Node node1 = new Node ('A');
		Node node2 = new Node ('B');
		Node node3 = new Node ('C');
		Node node4 = new Node ('D');
		Node node5 = new Node ('E');
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3;	
		assertTrue(loopDetection.beginningCycle(node1) == node3);
	}
	
	@Test
	public void middleCycleSecondNode() {
		Node node1 = new Node ('A');
		Node node2 = new Node ('B');
		Node node3 = new Node ('C');
		Node node4 = new Node ('D');
		Node node5 = new Node ('E');
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node2;		
		assertTrue(loopDetection.beginningCycle(node1) == node2);
	}
	
	@Test
	public void noCycle() {
		Node node1 = new Node ('A');
		Node node2 = new Node ('B');
		Node node3 = new Node ('C');
		Node node4 = new Node ('D');
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		assertTrue(loopDetection.beginningCycle(node1) == null);
	}
}
