package chapter8.problem5;

/**
 * Created by omarpaladines on 7/29/16.
 */
public class RecursiveMultiply {

    public int recMultiply(int a, int b) {
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }

        if (b == 1) return a;
        if (b == 0) return 0;

        int mult = recMultiply(a, b>>1);
        int remainder = recMultiply(a, b & 1);
        return mult + mult + remainder;

    }
}
