package deqo.ache.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class ItemTest {
    Item item;
    Stack stack;

    @Before
    public void initTest(){
        stack = new Stack();
        item = new Item(0);
        item.setNext(new Item(3));
    }
    @Test
    public void getNext() {
        assertEquals(3,item.getNext().getValue());
    }

    @Test
    public void getNextNull() {
        item.setNext(null);
        assertEquals(null,item.getNext());
    }
    @Test
    public void setNext() {
        item.setNext(new Item(4));
        assertEquals(4,item.getNext().getValue());
    }

   @Test
    public void empty(){
        assertTrue("la pile doit etre vide",stack.isEmpty());
    }

    @Test
    public void notEmpty(){
        stack.push(new Item(4));
        assertFalse("la pile ne doit pas etre vide",stack.isEmpty());
    }

    @Test
    public void push(){
        stack.push(new Item(5));
        assertEquals(5,stack.peek().getValue());
    }

    @Test(expected = EmptyStackException.class)
    public void popOnEmptyStack(){
        stack.pop();
    }

    @Test
    public void popOnNotEmptyStack(){
        stack.push(new Item(4));
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekOnEmptyStack(){
        stack.peek();
    }

    @Test
    public void size(){
        assertEquals(0,stack.getSize());
    }
}