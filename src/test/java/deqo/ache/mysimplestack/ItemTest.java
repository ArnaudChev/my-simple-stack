package deqo.ache.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class ItemTest {
    Item item;

    @Before
    public void initTest(){
        item = new Item(0);
        item.setNext(new Item(3));
    }

    @Test
    public void testGetNext() {
        assertEquals(3,item.getNext().getValue());
    }

    @Test
    public void testGetNextNull() {
        item.setNext(null);
        assertEquals(null,item.getNext());
    }
    @Test
    public void testSetNext() {
        item.setNext(new Item(4));
        assertEquals(4,item.getNext().getValue());
    }
}