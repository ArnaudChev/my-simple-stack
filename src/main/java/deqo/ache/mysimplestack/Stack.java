package deqo.ache.mysimplestack;

import java.util.EmptyStackException;

public class Stack implements SimpleStack{
    private Item top;
    private int size = 0;

    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of items in this stack
     */
    public int getSize(){
        return size;
    }

    /**
     * Pushes an item onto the top of this stack
     * null item is allowed
     */
    public void push(Item item){
        item.setNext(top);
        top = item;
        size++;
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack
     */
    public Item peek() throws EmptyStackException{
        //test exigence 1
        if(isEmpty()) throw new EmptyStackException();
        return top;
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException{
        Item result = top;
        if(result == null) throw new EmptyStackException();
        top = top.getNext();
        size--;
        return result;
    }
}
