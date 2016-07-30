package chapter8.problem11;

import java.util.HashMap;

/**
 * Created by omarpaladines on 7/30/16.
 */
public class Coins {

    /**
     *
     * @param n
     * @return The number of different ways to decompose n cents into pennies, nickels, dimes and quarters
     */

    public int numberOfWays (int n) {
        HashMap<Integer, Integer> equiv = new HashMap<>(); /* to have the coin values available by index */
        equiv.put(0,1);
        equiv.put(1,5);
        equiv.put(2,10);
        equiv.put(3,25);

        int[][] memo = new int[n+1][4]; /* the memoized answers */

            for (int j = 0; j < 4; j++) {
                memo[0][j] = 1; /* fill in the dummy first row */
        }

        for (int i = 1; i <= n; i++) { /* iteratively fill in the array */
            for (int j = 0; j < 4; j++) {
                if (j == 0) { /* the base case */
                    memo[i][j] = 1;
                } else if (j > 0 &&  (i - equiv.get(j) < 0)) { /* if can't use the closest coin value */
                    memo[i][j] = memo[i][j-1];
                } else { /* we can either use the closest coin value or not (start with the next closest coin) */
                    memo[i][j] = memo[i][j-1] + memo[i - equiv.get(j)][j];
                }
            }
        }

        return memo[n][3]; /* our answer */
    }


}
