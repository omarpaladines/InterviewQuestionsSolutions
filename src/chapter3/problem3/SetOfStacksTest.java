package chapter3.problem3;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * Created by omarpaladines on 7/10/16.
 */
public class SetOfStacksTest {

    @Test
    public void simplePushAndPop() {
        SetOfStacks setOfStacks = new SetOfStacks(6);
        setOfStacks.push(1);
        assertTrue(setOfStacks.pop().equals(1));
        }

    @Test
    public void exceedingCapacity() {
        SetOfStacks setOfStacks = new SetOfStacks(2);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        assertTrue(setOfStacks.pop().equals(4));
        assertTrue(setOfStacks.peek().equals(3));
        assertTrue(setOfStacks.pop().equals(3));
        assertTrue(setOfStacks.pop().equals(2));
        assertTrue(setOfStacks.pop().equals(1));
        assertTrue(setOfStacks.isEmpty());
    }

    @Test
    public void emptyStack() {
        SetOfStacks setOfStacks = new SetOfStacks(1);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        assertTrue(setOfStacks.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void emptyStackException() {
        SetOfStacks setOfStacks = new SetOfStacks(1);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
    }

}
