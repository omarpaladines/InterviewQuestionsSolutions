package chapter5.problem2;

/**
 * Created by omarpaladines on 7/19/16.
 */
public class BinaryToString {

    /**
     *
     * @param d
     * @return the binary string representation of a real number between 0 and 1. If the number cannot be represented
     * in 32 bits, returns "ERROR".
     */
    public String binaryToString(double d) {
        String s = "0.";
        int count = 1;

        while(d > 0) {
            if (count > 32) return "ERROR";
            double diff = d - (1/Math.pow(2,count)); /* iteratively subtract the next power of 2  */
            if (diff >= 0) { /* we have found the closest power of two so we need a 1 in that position */
                s += "1";
                d = diff;
            } else { /* we keep going by putting a 0 as we haven't hit the closest power of two yet */
                s += "0";
            }
            count++;
        }
        return s;
    }
}
