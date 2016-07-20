package chapter6.problem7;

/**
 * Created by omarpaladines on 7/20/16.
 */
public class Apocalypse {

    public void ratio (int n) {
        double boys = 0;
        double girls = 0;

        for (int i = 0; i < n; i++) {
            double random = Math.round(Math.random());
            if (random == 0) {
                boys++;
            } else {
                girls++;
                continue;
            }
        }
        System.out.println((double)(boys/(boys + girls)));
    }
}
