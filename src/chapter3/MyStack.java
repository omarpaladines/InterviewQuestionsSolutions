package chapter3;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by omarpaladines on 7/10/16.
 */

// Book Implementation of a Stack data structure.
public class MyStack<T> {

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode (T data) {
            this.data = data;
        }

        public StackNode<T> next () {
            return this.next;
        }
    }

    private StackNode<T> top;
    private int size;

    public MyStack(){
        this.top = null;
        this.size = 0;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
        size ++;
    }

    public T peek () {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }
}
