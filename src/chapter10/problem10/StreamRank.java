package chapter10.problem10;

/**
 * Created by omarpaladines on 8/6/16.
 */
public class StreamRank {

    private class RankNode {
        public RankNode left;
        public RankNode right;
        public RankNode center;
        public int value;
        public int numBelow;
    }

    public RankNode root;

    public StreamRank() {
        root = null;
    }

    /**
     *
     * @param x
     * Inserts the stream integer x in our private data structure so we can keep track of it.
     */
    public void track(int x) {
        if (root == null) { /* empty TST */
            root = new RankNode();
            root.left = null;
            root.center = null;
            root.right = null;
            root.value = x;
            root.numBelow = 0;
        } else {
            RankNode parent = null;
            RankNode node = root;

            while (node != null) { /* traverse the graph keeping track of the parent node */
                node.numBelow++; /* augmentation maintenance */
                parent = node;

                if (x < node.value) {
                    node = node.left;
                } else if (x > node.value) {
                    node = node.right;
                } else {
                    node = node.center;
                }
            }

            node = new RankNode(); /* found the insertion place, create new node */
            node.left = null;
            node.center = null;
            node.right = null;
            node.value = x;
            node.numBelow = 0;

            if (x < parent.value) { /* put node in the required place in parent */
                parent.left = node;
            } else if (x > parent.value) {
                parent.right = node;
            } else {
                parent.center = node;
            }
        }
    }

    /**
     *
     * @param x
     * @return the number of integers in the stream less than or equal to the given integer (not including itself).
     */
    public int getRankOfNumber (int x) {

        RankNode node = root;
        int rank = 0;

        while (node != null && node.value != x) { /* traverse TST */
            if (x < node.value) {
                node = node.left;
            } else if (x > node.value) { /* we go right, we need to add that node plus all of its nodes in its left and
            center subtrees */
                rank++;
                if (node.left != null) rank += (node.left.numBelow);
                if (node.center != null) rank += (node.center.numBelow);
                node = node.right;
            } else {
                node = node.center;
            }
        }

        if (node == null) return -1; /* not found */

        if (node.left != null) rank += (node.left.numBelow + 1);
        if (node.center != null) rank += (node.center.numBelow + 1);

        return rank;
    }
}
