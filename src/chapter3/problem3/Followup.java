package chapter3.problem3;

import chapter3.MyStack;

/**
 * Created by omarpaladines on 7/10/16.
 * Assumes the implementation of a doubly linked list. Reasons discussed in the followup.
 * Only implemented popAt because the other methods are analogous.
 */
public class Followup<T> {
    private DoublyLinkedList<MyStack<T>> setOfStacks;
    private int capacity;


    public T popAt(int i) {
        if (i > setOfStacks.getSize()) {
            throw new IndexOutOfBoundsException();
        }

        MyStack<T> stackAt = setOfStacks.getNodeAt(i);

        T data = stackAt.pop();
        if (stackAt.isEmpty()) {
            setOfStacks.deleteAt(i); /* assumes implementation of deletion at an index */
        }
        return data;
    }
}
