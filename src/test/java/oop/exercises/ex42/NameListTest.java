package oop.exercises.ex42;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NameListTest extends TestCase {

    @Test
    public void testAddToList() {

        NameList names = new NameList();

        names.addToList("Potato,Love,4530");

        String expected = "Love";
        String actual = names.firstName.get(0);
        assertEquals(expected, actual);
    }

}