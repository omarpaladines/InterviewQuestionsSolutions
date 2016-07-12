package chapter4.problem2;

import chapter4.Node;

/**
 * Created by omarpaladines on 7/12/16.
 */
public class MinimalTree {

    /**
     * Returns the root (the tree itself) of a binary search tree constructed from a sorted array of distinct integers
     * between indices lo and hi of the sorted array.
     * @param sorted
     * @param lo
     * @param hi
     * @return
     */
    public Node bstRecursive (int [] sorted, int lo, int hi) {
        if (lo > hi) return null; /* can happen for the special case of 2 elements, then left node is set to null */
        Node root = new Node (sorted[(lo + hi)/2], 2);
        if (lo < hi) {
            Node left = bstRecursive(sorted, lo, (lo + hi)/2 - 1);
            Node right = bstRecursive(sorted, (lo + hi)/2 + 1, hi);
            root.children[0] = left;
            root.children[1] = right;
        }
        return root;
    }

    /**
     * Returns the root (the tree itself) of a binary search tree constructed from a sorted array of distinct integers
     * @param sorted
     * @return
     */
    public Node minimalTree (int [] sorted) {
        return bstRecursive(sorted, 0, sorted.length-1);
    }

}
