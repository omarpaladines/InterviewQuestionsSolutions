package chapter3.problem5;

import chapter3.MyStack;

/**
 * Created by omarpaladines on 7/11/16.
 */
public class SortStack {

    /**
     * Iterative swaps the stacks
     */
    public void helperSwap (MyStack<Integer> left, MyStack<Integer> right)  {
        int rightTop = right.peek();
        int leftTop = left.peek();
        if (leftTop < rightTop) { /* swap tops of stacks to get the current minimum candidate on the right */
            int temp = right.pop();
            right.push(left.pop());
            left.push(temp);
        }

    }

    /**
     * Places the minimum element of the left stack on the top of the right stack.
     * @param left
     * @param right
     */
    public void helperMin (MyStack<Integer> left, MyStack<Integer> right, int count)  {
        while (!left.isEmpty()) { /* move smaller elements to the right */
            right.push(left.pop());
            if (left.isEmpty()) break;
            helperSwap(left, right);

        }

        while (!right.isEmpty()) { /* move greater elements back to the left */
            left.push(right.pop());
            if (right.isEmpty()) break;
            helperSwap(left, right);
        }

        for (int i = 0 ; i < count; i++) { /* move current smallest elements to the right */
            right.push(left.pop());
        }
    }

    /**
     * Sorts a stack by placing the minimum element of the left stack on top of an auxiliary stack using a helper function
     * and then empties the auxiliary stack back into the original one.
     * Runtime is O(N^2) for this particular implementation.
     * @param stack
     */
    public void sortStack (MyStack<Integer> stack) {
        MyStack<Integer> helper = new MyStack<>();
        for (int i = 0; i < stack.getSize(); i++) { /* iteratively place each element into its place */
            helperMin (stack, helper, i+1);
        }

        while (!helper.isEmpty()) { /* empty the auxiliary stack back */
            stack.push(helper.pop());
        }
    }
}
