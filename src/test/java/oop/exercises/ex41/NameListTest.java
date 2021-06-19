package oop.exercises.ex41;

import junit.framework.TestCase;

public class NameListTest extends TestCase {

    public void testAddToList() {
        NameList names = new NameList();

        names.addToList("Potato");

        String expected = "Potato";
        String actual = names.names.get(0);
        assertEquals(expected, actual);


    }
}