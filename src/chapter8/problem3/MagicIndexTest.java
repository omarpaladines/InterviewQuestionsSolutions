package chapter8.problem3;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

/**
 * Created by omarpaladines on 7/28/16.
 */
public class MagicIndexTest {
    MagicIndex magicIndex = new MagicIndex();

    @Test
    public void oneElementMagic(){
        int[] array = {0};
        assertTrue(magicIndex.magicIndex(array)==0);
    }

    @Test(expected= NoSuchElementException.class)
    public void oneElementNotMagic(){
        int[] array = {1};
        magicIndex.magicIndex(array);
    }

    @Test(expected= NoSuchElementException.class)
    public void variousElementsNotMagic(){
        int[] array = {1,2,3,4,5,6,7,8};
        magicIndex.magicIndex(array);
    }

    @Test(expected= NoSuchElementException.class)
    public void emptyArray(){
        int[] array = {};
        magicIndex.magicIndex(array);
    }

    @Test
    public void bigArrayMagicElementOnLeft(){
        int[] array = {-1,0,2,4,5,6,7,8,9,10};
        assertTrue(magicIndex.magicIndex(array)==2);
    }

    @Test
    public void bigArrayMagicElementOnRight(){
        int[] array = {-1,0,1,2,3,4,5,7,9,10};
        assertTrue(magicIndex.magicIndex(array)==7);
    }
}
