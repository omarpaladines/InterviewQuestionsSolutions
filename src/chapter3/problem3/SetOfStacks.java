package chapter3.problem3;

/**
 * Created by omarpaladines on 7/10/16.
 * Assumes MyStack<T> class implemented as in the book.
 * Maintains the invariant that stack creations and deletions are done at the beginning of the method if necessary.
 * @param <T>
 */
public class SetOfStacks<T> {

    private MyStack<MyStack<T>> setOfStacks;
    private int capacity;

     public SetOfStacks(int capacity) {
         MyStack<T> firstStack = new MyStack<T>();
         this.setOfStacks = new MyStack<>();
         this.setOfStacks.push(firstStack);
         this.capacity = capacity;
    }


    public T pop () {
        MyStack<T> topStack = setOfStacks.peek();
        if (!topStack.isEmpty()) {
            return topStack.pop();
        } else {
            setOfStacks.pop();
            return setOfStacks.peek().pop();
        }
    }

    public void push (T item) {
        MyStack<T> topStack = setOfStacks.peek();
        if(topStack.getSize() != capacity) {
            topStack.push(item);
        } else {
            MyStack<T> newStack = new MyStack<T>();
            newStack.push(item);
            setOfStacks.push(newStack);
        }
    }

    public boolean isEmpty() {
        return (setOfStacks.isEmpty() || setOfStacks.peek().isEmpty());
    }

    public T peek () {
        return setOfStacks.peek().peek();
    }

}
