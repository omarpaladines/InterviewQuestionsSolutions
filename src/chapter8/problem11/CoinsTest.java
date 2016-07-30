package chapter8.problem11;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by omarpaladines on 7/30/16.
 */
public class CoinsTest {

    Coins coins = new Coins();


    @Test
    public void TestOne() {
        assertTrue(coins.numberOfWays(1) == 1);
    }

    @Test
    public void TestThree() {
        assertTrue(coins.numberOfWays(3) == 1);
    }


    @Test
    public void TestSeven() {
        assertTrue(coins.numberOfWays(7) == 2);
    }

    @Test
    public void TestFourteen() {
        assertTrue(coins.numberOfWays(14) == 4);
    }
}
