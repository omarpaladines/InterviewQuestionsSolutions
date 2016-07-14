package chapter4.problem8;

import chapter4.Node;

/**
 *
 * Created by omarpaladines on 7/13/16.
 */
public class FirstCommonAncestor {

    public int numberOfNodesFound(Node root, Node first, Node second) {
        if (root == null) return 0;
        int foundLeft = numberOfNodesFound(root.children[0], first, second);
        int foundRight = numberOfNodesFound(root.children[1], first, second);
        int found = foundLeft + foundRight;
        if (root == first || root == second) return 1 + found;
        return found;
    }

    public Node firstCommonAncestor(Node root, Node first, Node second) {
        if (root == null) return null;
        int foundLeft = numberOfNodesFound(root.children[0], first, second);
        int foundRight = numberOfNodesFound(root.children[1], first, second);
        if ((foundLeft == 1 && foundRight == 1) ||
                ((root == first || root == second) && (foundLeft == 1 || foundRight == 1))) { /* two possible cases */
            return root;
        } else {
            Node candidate1 = firstCommonAncestor(root.children[0], first, second);
            Node candidate2 = firstCommonAncestor(root.children[1], first, second);
            if (candidate1 != null) return candidate1;
            if (candidate2 != null) return candidate2;
            return null;
        }

    }
}
