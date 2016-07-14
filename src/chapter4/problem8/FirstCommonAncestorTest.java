package chapter4.problem8;

import static org.junit.Assert.*;

import chapter4.Node;
import org.junit.Test;

/**
 * Created by omarpaladines on 7/13/16.
 */
public class FirstCommonAncestorTest {

    FirstCommonAncestor firstCommonAncestor = new FirstCommonAncestor();

    @Test
    public void simpleTree(){
        Node root = new Node (1, 2);
        Node left = new Node (2, 2);
        Node right = new Node (3, 2);
        root.children[0] = left;
        root.children[1] = right;
        assertTrue(firstCommonAncestor.firstCommonAncestor(root, left, right) == root);
    }

    @Test
    public void rootIsFirst(){
        Node root = new Node (1, 2);
        Node left = new Node (2, 2);
        Node right = new Node (3, 2);
        Node a = new Node (1, 2);
        Node b = new Node (2, 2);
        Node c = new Node (3, 2);
        left.children[0] = a;
        left.children[1] = b;
        right.children[1] = c;
        root.children[0] = left;
        root.children[1] = right;
        assertTrue(firstCommonAncestor.firstCommonAncestor(root, c, a) == root);
    }

    @Test
    public void firstInMiddleOfTree(){
        Node root = new Node (1, 2);
        Node left = new Node (2, 2);
        Node right = new Node (3, 2);
        Node a = new Node (4, 2);
        Node b = new Node (5, 2);
        Node c = new Node (6, 2);
        Node d = new Node (7, 2);
        Node e = new Node (8, 2);
        b.children[0] = d;
        b.children[1] = e;
        left.children[0] = a;
        left.children[1] = b;
        right.children[1] = c;
        root.children[0] = left;
        root.children[1] = right;
        assertTrue(firstCommonAncestor.firstCommonAncestor(root, e, a) == left);
    }

    @Test
    public void longLineLeft(){
        Node n1 = new Node (3, 2);
        Node n2 = new Node (4, 2);
        Node n3 = new Node (1, 2);
        Node n4 = new Node (2, 2);
        Node n5 = new Node (1, 2);
        Node n6 = new Node (6, 2);
        Node n7 = new Node (2, 2);

        n1.children[0] = n2;
        n2.children[0] = n3;
        n3.children[0] = n4;
        n4.children[0] = n5;
        n5.children[1] = n6;
        n6.children[0] = n7;

        assertTrue(firstCommonAncestor.firstCommonAncestor(n1, n5, n2) == n2);
    }
}
