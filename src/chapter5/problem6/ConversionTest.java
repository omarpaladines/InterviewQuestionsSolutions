package chapter5.problem6;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by omarpaladines on 7/19/16.
 */
public class ConversionTest {

    Conversion conversion = new Conversion();

    @Test
    public void noFlips() {
        assertTrue(conversion.conversion(33, 33) == 0);
    }

    @Test
    public void oneFlipSameLength() {
        assertTrue(conversion.conversion(13, 9) == 1);
    }

    @Test
    public void RandomFlipDifferentLengths() {
        assertTrue(conversion.conversion(555, 207) == 5);
    }
}
