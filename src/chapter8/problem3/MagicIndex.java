package chapter8.problem3;

import java.util.NoSuchElementException;

/**
 * Created by omarpaladines on 7/28/16.
 */
public class MagicIndex {

    /**
     *
     * @param lo the lowest index in the array
     * @param hi the highest index in the array
     * @param array
     * @return an index i such that i = array[i] if it exists, throws NoSuchElementException otherwise.
     */
    public int magicIndex (int lo, int hi, int[] array) {
        if (hi < lo) throw new NoSuchElementException();
        int middleIndex = (lo+hi)/2;
        int middleElement = array[middleIndex];
        if (middleElement == middleIndex) return middleIndex;
        if (middleElement < middleIndex) {
            return magicIndex(middleIndex + 1, hi, array);
        } else {
            return magicIndex(lo, middleIndex-1, array);
        }

    }

    /**
     *
     * @param array
     * @return an index i such that i = array[i] if it exists, throws NoSuchElementException otherwise.
     */
    public int magicIndex (int [] array) {
        return magicIndex(0, array.length-1, array);
    }
}
