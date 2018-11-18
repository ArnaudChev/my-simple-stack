package deqo.ache.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {
    Stack stack;

    @Before
    public void initTest(){
        stack = new Stack();
    }

    @Test
    public void testIsEmptyOnEmptySatck(){
        assertTrue("la pile doit etre vide",stack.isEmpty());
    }

    @Test
    public void testNotEmptyOnEmptyStack(){
        stack.push(new Item(4));
        assertFalse("la pile ne doit pas etre vide",stack.isEmpty());
    }

    @Test
    public void testPush(){
        stack.push(new Item(5));
        assertEquals(5,stack.peek().getValue());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack(){
        stack.pop();
    }

    @Test
    public void testPopOnNotEmptyStack(){
        stack.push(new Item(4));
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekOnEmptyStack(){
        stack.peek();
    }

    @Test
    public void testSize(){
        assertEquals(0,stack.getSize());
    }

}//Close #1
