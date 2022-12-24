package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PathCoverageTesting {

    @Test
    void pOneTest() {
        Customer customer = new Customer(23, "F", true, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals(customer.toString(), "The base premium's value to pay is $ 300.", "String should be equal");
    }


    @Test
    void pTwoTest() {
        Customer customer = new Customer(23, "F", false, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals("-1", "-1", "String should be equal");
    }


    @Test
    void pThreeTest() {
        Customer customer = new Customer(23, "M", false, false);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        assertEquals("Positive numbers", "Positive numbers", "String should be equal");
    }


    @Test
    void pFourTest() {
        Customer customer = new Customer(23, "M", false, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals("Insert only numbers", "Insert only numbers");
    }


    @Test
    void pFiveTest() {
        Customer customer = new Customer(-1, "F", false, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals("-1", "-1", "String should be equal");
    }

}
