package chapter10.problem5;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by omarpaladines on 8/3/16.
 */
public class SparseSearchTest {

    SparseSearch sparseSearch = new SparseSearch();



    @Test
    public void simpleTestNoEmpty(){
        String[] a = {"a", "b", "c"};
        assertTrue(sparseSearch.sparseSearch(a, "c") == 2);
    }


    @Test
    public void simpleTestEmptyInMiddle(){
        String[] a = {"a", "", "", "c"};
        assertTrue(sparseSearch.sparseSearch(a, "c") == 3);
    }


    @Test
    public void SearchingEmptyString(){
        String[] a = {"", "", "", "c"};
        assertTrue(sparseSearch.sparseSearch(a, "") == 1);
    }


    @Test
    public void RandomTest(){
        String[] a = {"", "", "", "", "at", "", "", "", "ball", "", "", "car", "", "", "dad", ""};
        assertTrue(sparseSearch.sparseSearch(a, "at") == 4);
        assertTrue(sparseSearch.sparseSearch(a, "ball") == 8);
        assertTrue(sparseSearch.sparseSearch(a, "car") == 11);
        assertTrue(sparseSearch.sparseSearch(a, "dad") == 14);
    }

}
