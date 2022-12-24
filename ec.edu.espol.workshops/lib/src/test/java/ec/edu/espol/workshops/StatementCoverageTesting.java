package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementCoverageTesting {

    @Test
    void spOneTest() {
        Customer customer = new Customer(24, "M", true, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals(customer.toString(), "The base premium's value to pay is $ 300.", "String should be equal");
    }


    @Test
    void spTwoTest() {
        Customer customer = new Customer(16, "F", false, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals("-1", "-1", "String should be equal");
    }


    @Test
    void spThreeTest() {
        Customer customer = new Customer(-16, "M", true, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        assertEquals("Positive numbers", "Positive numbers", "String should be equal");
    }


    @Test
    void spFourTest() {
        String age = "testing";
        String result = "";
        assertEquals("Insert only numbers", "Insert only numbers");
    }


    @Test
    void spFiveTest() {
        Customer customer = new Customer(90, "F", false, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals("-1", "-1", "String should be equal");
    }
}
