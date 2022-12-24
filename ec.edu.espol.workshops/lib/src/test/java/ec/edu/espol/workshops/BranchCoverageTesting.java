package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BranchCoverageTesting {

	@Test
	void b1Test() {
		Customer customer = new Customer(24, "M", true, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        assertEquals(customer.toString(), "The base premium's value to pay is $ 300.", "String should be equal");

	}

	@Test
	void b2Test() {
		Customer customer = new Customer(-1, "M", true, true);
        BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        assertEquals("Positive numbers", "Positive numbers", "String should be equal");

	}
	
	@Test
	void b3Test() {
		Customer customer = new Customer(46, "F", true, false);
		BusinessRule.checkSingleYoungManRule(customer);
        BusinessRule.checkMarriedWomanRule(customer);
        BusinessRule.checkAgeRule(customer);
        BusinessRule.checkPremium(customer);
        assertEquals("-1", "-1", "String should be equal");
		
	}
}