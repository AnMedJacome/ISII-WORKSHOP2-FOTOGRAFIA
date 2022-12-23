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
        assertEquals(customer.toString(), "The base premium's value to pay is $ 1900.", "String should be equal");
    }


    @Test
    void spTwoTest() {
        Customer customer = new Customer(16, "F", false, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        if (BusinessRule.checkPremium(customer)) {
            assertEquals(customer.toString(), "The base premium's value to pay is $ 300.", "String should be equal");
        } else {
            assertEquals(customer.toString(), "-1", "String should be equal");
        }
    }


    @Test
    void spThreeTest() {
        Customer customer = new Customer(-16, "M", true, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        String message = "";
        if (customer.getAge() < 0) message = "Positive numbers";
        assertEquals(message, "Positive numbers", "String should be equal");
    }


    @Test
    void spFourTest() {
        String age = "testing";
        String result = "";
        try {
            int customerAge = Integer.parseInt(age);
            Customer customer = new Customer(customerAge, "M", true, true);
            BusinessRule.checkSingleYoungManRule(customer);
            BusinessRule.checkMarriedWomanRule(customer);
            BusinessRule.checkAgeRule(customer);
            result = customer.toString();
        } catch(NumberFormatException e) {
            result = "Insert only numbers";
        }
        assertEquals(result, "Insert only numbers");
    }


    @Test
    void spFiveTest() {
        Customer customer = new Customer(90, "F", false, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        String result = "";
        if (BusinessRule.checkPremium(customer)) {
            result = customer.toString();
        } else {
            result = "-1";
        }
        assertEquals(result, "-1", "String should be equal");
    }
}
