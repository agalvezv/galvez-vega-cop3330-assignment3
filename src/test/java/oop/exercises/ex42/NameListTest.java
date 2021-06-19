package oop.exercises.ex42;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NameListTest{

    @Test
    public void lastname_testAddToList() {

        NameList names = new NameList();

        names.addToList("Potato,Love,4530");

        String expected = "Potato";
        String actual = names.lastName.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void mid_testAddToList() {

        NameList names = new NameList();

        names.addToList("Potato,Love,4530");

        String expected = "Love";
        String actual = names.firstName.get(0);
        assertEquals(expected, actual);
    }


    @Test
    public void salary_testAddToList() {

        NameList names = new NameList();

        names.addToList("Potato,Love,4530");

        String expected = "4530";
        String actual = names.salary.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void table_testAddToList() {

        NameList names = new NameList();

        names.addToList("Potato,Love,4530");

        String expected = "Potato                    Love                      4530";
        String actual = names.namesTable.get(0);
        assertEquals(expected, actual);
    }



}