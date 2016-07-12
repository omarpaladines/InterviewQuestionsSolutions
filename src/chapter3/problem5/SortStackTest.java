package chapter3.problem5;

import chapter3.MyStack;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by omarpaladines on 7/11/16.
 */
public class SortStackTest {

    SortStack sortStack = new SortStack();

    @Test
    public void orderedStack() {
        MyStack<Integer> stack = new MyStack ();
        stack.push(2);
        stack.push(1);
        sortStack.sortStack(stack);
        assertTrue(stack.pop() == 1);
        assertTrue(stack.pop() == 2);
    }

    @Test
    public void notInOrder() {
        MyStack<Integer> stack = new MyStack ();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        sortStack.sortStack(stack);
        assertTrue(stack.pop() == 1);
        assertTrue(stack.pop() == 2);
        assertTrue(stack.pop() == 3);
    }

    @Test
    public void notInOrderHugeRandom() {
        MyStack<Integer> stack = new MyStack ();
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(3);
        sortStack.sortStack(stack);
        assertTrue(stack.pop() == 1);
        assertTrue(stack.pop() == 2);
        assertTrue(stack.pop() == 3);
        assertTrue(stack.pop() == 4);
        assertTrue(stack.pop() == 5);
        assertTrue(stack.pop() == 6);
        assertTrue(stack.pop() == 7);
    }

}
