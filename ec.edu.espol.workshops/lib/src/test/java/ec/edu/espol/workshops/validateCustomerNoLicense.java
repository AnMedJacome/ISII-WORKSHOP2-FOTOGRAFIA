package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class validateCustomerNoLicense {
    int age = 0;
    String sex = "M";
    boolean married = false;
    boolean hasLicense = false;
    private String actualAnswer;
    
    //Placeholder
    Customer client = new Customer((age), sex, married, hasLicense);
    
// FEATURE 4
    
    @Given("{int} years old, is a man, is married and he does not have a driver license")
    public void years_old_is_a_man_is_married_and_he_does_not_have_a_driver_license(Integer int1) {
        client.setSex("M");
        sex = "M";
        client.setAge(int1);
        age = int1;
        client.setMarried(true);
        married = true;
        client.setDrivingLicense(false);
        hasLicense = false;
    }
    
    @When("Creating customer with no license")
    public void insert_data_case4() {
        Customer hombreCaso4 = new Customer((age), sex, married, hasLicense);
        BusinessRule.checkSingleYoungManRule(hombreCaso4);
        BusinessRule.checkMarriedWomanRule(hombreCaso4);
        BusinessRule.checkAgeRule(hombreCaso4);
        this.actualAnswer = BusinessRule.checkPremium(hombreCaso4);
    }
    
    @Then("You need a driver license to get the premium value")
    public void customer_requires_license() {
        assertEquals("You need a driver's license to get the premium value.", this.actualAnswer);
    }
    
    
    
}