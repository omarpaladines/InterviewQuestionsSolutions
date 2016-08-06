package chapter10.problem10;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by omarpaladines on 8/6/16.
 */
public class StreamRankTest {

    StreamRank streamRank = new StreamRank();

    @Test
    public void oneNumberTest(){
        streamRank.track(1);
        assertTrue(streamRank.getRankOfNumber(1) == 0);
    }

    @Test
    public void biggerTest(){
        streamRank.track(5);
        streamRank.track(1);
        streamRank.track(4);
        streamRank.track(4);
        streamRank.track(5);
        streamRank.track(9);
        streamRank.track(7);
        streamRank.track(13);
        streamRank.track(3);

        assertTrue(streamRank.getRankOfNumber(1) == 0);
        assertTrue(streamRank.getRankOfNumber(3) == 1);
        assertTrue(streamRank.getRankOfNumber(4) == 3);
        assertTrue(streamRank.getRankOfNumber(5) == 5);
    }


}
