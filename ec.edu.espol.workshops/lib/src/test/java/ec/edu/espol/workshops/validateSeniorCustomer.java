package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class validateSeniorCustomer {
    int age = 0;
    String sex = "M";
    boolean married = false;
    boolean hasLicense = false;
    private String actualAnswer;
    
    //Placeholder
    Customer client = new Customer((age), sex, married, hasLicense);
    
// FEATURE 3
    @Given("Customer is a married, {int} year old woman and has a driver license.")
    public void customer_is_a_married_year_old_woman_and_has_a_driver_license(Integer int1) {
        client.setSex("F");
        sex = "F";
        client.setAge(int1);
        age = int1;
        client.setMarried(true);
        married = true;
        client.setDrivingLicense(true);
        hasLicense = true;
    }
    
    
    @When("Creating senior customer")
    public void insert_data_case3() {
        Customer mujerCaso3 = new Customer((age), sex, married, hasLicense);
        BusinessRule.checkSingleYoungManRule(mujerCaso3);
        BusinessRule.checkMarriedWomanRule(mujerCaso3);
        BusinessRule.checkAgeRule(mujerCaso3);
        this.actualAnswer = BusinessRule.checkPremium(mujerCaso3);
    }
    
    @Then("You have exceeded the maximum age to receive a premium value")
    public void you_have_exceeded_the_maximum_age_to_receive_a_premium_value() {
        assertEquals("You have exceeded the maximum age to receive a premium value.", this.actualAnswer);
    }
    
    
    
}