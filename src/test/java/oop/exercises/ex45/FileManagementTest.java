package oop.exercises.ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagementTest {

    @Test
    void first_read_readFile() {
        FileManagement testObject = new FileManagement("output.txt","the","theeee");
        String expected="utilizes an IDE to write her Java programs\".";
        testObject.readFile();
        String actual = testObject.getReadFile();
        assertEquals(expected, actual);
    }


    @Test
    void mid__string_read_formatString() {
        FileManagement testObject = new FileManagement("output.txt","the","theeee");

        String expected = " One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                " For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                " utilizes an IDE to write her Java programs\".\n";
        testObject.readFile();
        testObject.formatString();
        String actual = testObject.getReadFile();
        assertEquals(expected, actual);
    }

    @Test
    void out_read_writeFile() {
        FileManagement testObject = new FileManagement("output.txt","the","theeee");

        String expected = " One should never utilize theeee word \"utilize\" in writing. Use \"use\" instead.\n" +
                " For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                " utilizes an IDE to write her Java programs\".\n";
        testObject.readFile();
        testObject.formatString();
        String actual = testObject.getOutputFile();
        assertEquals(expected, actual);
    }
}