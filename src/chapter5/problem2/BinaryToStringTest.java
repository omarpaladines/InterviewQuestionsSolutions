package chapter5.problem2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by omarpaladines on 7/19/16.
 */
public class BinaryToStringTest {

    BinaryToString binaryToString = new BinaryToString();

    @Test
    public void powerOfTwoTest() {
        assertTrue(binaryToString.binaryToString(0.5).equals("0.1"));
    }

    @Test
    public void powerOfTwoTest2() {
        assertTrue(binaryToString.binaryToString(0.125).equals("0.001"));
    }

    @Test
    public void notPowerOfTwoTestRandom() {
        assertTrue(binaryToString.binaryToString(0.8194163255393505096435546875).equals("0.1101000111000101010001001011"));
    }

    @Test
    public void notRepresentable() {
        assertTrue(binaryToString.binaryToString(((double)1/3)).equals("ERROR"));
    }
}
