package chapter6.problem7;

import org.junit.Test;

/**
 * Created by omarpaladines on 7/20/16.
 */
public class ApocalypseTest {

    Apocalypse apocalypse = new Apocalypse();

    @Test
    public void run() {
        apocalypse.ratio(1);
        apocalypse.ratio(3);
        apocalypse.ratio(4);
        apocalypse.ratio(5);
        apocalypse.ratio(6);
        apocalypse.ratio(7);
        apocalypse.ratio(10);
        apocalypse.ratio(14);
        apocalypse.ratio(20);
        apocalypse.ratio(50);
        apocalypse.ratio(100);
        apocalypse.ratio(120);
        apocalypse.ratio(200);
        apocalypse.ratio(300);
        apocalypse.ratio(500);
        apocalypse.ratio(1000);
        apocalypse.ratio(3000);
        apocalypse.ratio(10000);
    }
}
