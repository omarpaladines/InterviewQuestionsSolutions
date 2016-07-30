package chapter8.problem5;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by omarpaladines on 7/29/16.
 */
public class RecursiveMultiplyTest {

    RecursiveMultiply recursiveMultiply = new RecursiveMultiply();

    @Test
    public void smallNumbersBothOdd() {
        assertTrue(recursiveMultiply.recMultiply(3,5) == 15);
        assertTrue(recursiveMultiply.recMultiply(5,3) == 15);
    }

    @Test
    public void smallNumbersMixedParity() {
        assertTrue(recursiveMultiply.recMultiply(3,6) == 18);
        assertTrue(recursiveMultiply.recMultiply(6,3) == 18);
    }

    @Test
    public void RandomNumbersMixedParity() {
        assertTrue(recursiveMultiply.recMultiply(12943, 45418) == 587845174);
        assertTrue(recursiveMultiply.recMultiply(45418, 12943) == 587845174);
    }
}
