package oop.exercises.ex44;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProductTest{
    @Test
    public void nameCheck_testTestGetName() {
        Product testObject = new Product("object",23.2,2);
        String expected= "object";
        String actual = testObject.getName();
        assertEquals(expected, actual);

    }
    @Test
    public void nameCheck_testTestsetName() {
        Product testObject = new Product("object",23.2,2);
        testObject.setName("pork");
        String expected= "pork";
        String actual = testObject.name;
        assertEquals(expected, actual);

    }

    @Test
    public void numCheck_testTestGetPrice() {
        Product testObject = new Product("object",23.2,2);
        double expected= 23.2;
        double actual = testObject.getPrice();
        assertEquals(expected, actual);

    }
    @Test
    public void numCheck_testTestsetPrice() {
        Product testObject = new Product("object",23.2,2);
        testObject.setPrice(32.4);
        double expected= 32.4;
        double actual = testObject.price;
        assertEquals(expected, actual);

    }

    @Test
    public void numCheck_testTestGetQuantity() {
        Product testObject = new Product("object",23.2,2);
        int expected= 2;
        int actual = testObject.getQuantity();
        assertEquals(expected, actual);

    }
    @Test
    public void numCheck_testTestsetQuantity() {
        Product testObject = new Product("object",23.2,2);
        testObject.setQuantity(45);
        int expected= 45;
        int actual = testObject.quantity;
        assertEquals(expected, actual);

    }
}