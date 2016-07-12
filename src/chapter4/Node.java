package chapter4;

/**
 * This class encapsulates the node for a tree.
 * Created by omarpaladines on 7/12/16.
 */
public class Node {
    public Object data;
    public Node [] children;

    public Node (Object data, int maxDegree) {
        this.data = data;
        this.children = new Node [maxDegree];
    }

    public boolean isLeaf () {
        for (int i = 0 ; i < this.children.length; i++) {
            if (children[i] != null) return false;
        }
        return true;
    }

    /**
     * Returns the height of the tree starting at root.
     * @return
     */
    public int getHeight() {
        if (this.isLeaf()) return 1;
        int max = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] != null) {
                int tentativeMax = (children[i].getHeight());
                if (tentativeMax > max) max = tentativeMax;
            }
        }
        return 1 + max;
    }
}
