package oop.exercises.ex43;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SiteGenTest{

    @Test
    public void pathway_check_testWriteInSite() {
        SiteGen testSite = new SiteGen();
        String test = "awesomeco";
        testSite.getSiteName(test);
        testSite.getAuthor("James Bond");
        testSite.getJSCheck("no");
        testSite.getCSSCheck("no");

        testSite.generateSite();
        testSite.writeInSite();

        String expected="src/main/java/oop/exercises/ex43/"+test+"/index.html";
        String actual = testSite.pathway;
        assertEquals(expected, actual);

    }

    @Test
    public void pathway_check_generateSite() {
        SiteGen testSite = new SiteGen();
        String test = "awesomeco";
        testSite.getSiteName(test);
        testSite.getAuthor("James Bond");
        testSite.getJSCheck("no");
        testSite.getCSSCheck("no");

        testSite.generateSite();

        String expected="src/main/java/oop/exercises/ex43/"+test;
        String actual = testSite.pathway;
        assertEquals(expected, actual);

    }
}