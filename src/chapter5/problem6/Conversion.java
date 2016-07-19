package chapter5.problem6;

/**
 * Created by omarpaladines on 7/19/16.
 */
public class Conversion {

    /**
     *
     * @param num
     * @return The number of ones in the binary representation of num
     */
    public int numberOfOnes(int num) {
        int count = 0;
        while (num!=0) {
           if (num % 2 == 1) count ++; /* check if last digit is 1 or 0 by checking the parity of the number */
            num = num >>> 1; /* iteratively logical shift right */
        }
        return count;
    }

    /**
     *
     * @param a
     * @param b
     * @return the number of bits that need to be flipped to convert a into b.
     */
    public int conversion(int a, int b) {
        return numberOfOnes(a^b);
    }
}
