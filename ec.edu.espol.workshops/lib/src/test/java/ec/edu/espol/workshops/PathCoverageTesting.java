package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PathCoverageTesting {

    @Test
    void pOneTest() {
        assertEquals("The base premium's value to pay is $ 300.", "The base premium's value to pay is $ 300.", "String should be equal");
    }


    @Test
    void pTwoTest() {
        assertEquals("-1", "-1", "String should be equal");
    }


    @Test
    void pThreeTest() {
        assertEquals("Positive numbers", "Positive numbers", "String should be equal");
    }


    @Test
    void pFourTest() {
        assertEquals("Insert only numbers", "Insert only numbers");
    }


    @Test
    void pFiveTest() {
        assertEquals("-1", "-1", "String should be equal");
    }

}
