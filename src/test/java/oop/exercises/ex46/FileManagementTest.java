package oop.exercises.ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileManagementTest {

    @Test
    void first_read_readFile() {
        FileManagement testObject = new FileManagement();
        String expected="badger ";
        testObject.readFile();
        String actual = testObject.getReadFile();
        assertEquals(expected, actual);
    }


    @Test
    void mid__string_read_formatString() {
        FileManagement testObject = new FileManagement();

        String expected = " badger badger badger \n" +
                " badger mushroom \n" +
                " mushroom snake badger badger \n" +
                " badger \n";
        testObject.readFile();
        testObject.formatString();
        String actual = testObject.getReadFile();
        assertEquals(expected, actual);
    }

    @Test
    void countCheck_wordCount() {
        FileManagement testObject = new FileManagement();

        int expected = 7;
        testObject.readFile();
        testObject.formatString();
        testObject.wordCount();
        ArrayList hold = testObject.getCountFinal();
        int actual = (int)hold.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void countCheckFinal_wordCount() {
        FileManagement testObject = new FileManagement();

        int expected = 1;
        testObject.readFile();
        testObject.formatString();
        testObject.wordCount();
        ArrayList hold = testObject.getCountFinal();
        int actual = (int)hold.get(2);
        assertEquals(expected, actual);
    }

    @Test
    void nameCheckFinal_printList() {
        FileManagement testObject = new FileManagement();

        String expected = "snake";
        testObject.readFile();
        testObject.formatString();
        testObject.wordCount();
        testObject.printList();
        ArrayList hold = testObject.getNamesFinal();
        String actual = (String)hold.get(2);
        assertEquals(expected, actual);
    }

}