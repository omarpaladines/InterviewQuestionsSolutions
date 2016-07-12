package chapter4.problem2;

import static org.junit.Assert.*;

import chapter4.Node;
import org.junit.Test;
/**
 * Created by omarpaladines on 7/12/16.
 */
public class MinimalTreeTest {

    MinimalTree minimalTree = new MinimalTree();

    @Test
    public void simpleTree() {
        int[] simpleArray = {1};
        assertTrue((minimalTree.minimalTree(simpleArray)).getHeight() == 1);
    }

    @Test
    public void smallTree() {
        int[] simpleArray = {1,2};
        assertTrue((minimalTree.minimalTree(simpleArray)).getHeight() == 2);
    }

    @Test
    public void perfectBinaryTree() {
        int[] simpleArray = {2,4,6,8,10,35,44};
        assertTrue((minimalTree.minimalTree(simpleArray)).getHeight() == 3);
    }

    @Test
    public void bigRandomTree() {
        int[] simpleArray = {1,2,4,6,8,10,35,44,56,66,78,90, 91, 92, 100, 101, 103, 104, 120, 130};
        assertTrue((minimalTree.minimalTree(simpleArray)).getHeight() == 5);
    }
}
