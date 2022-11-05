package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class validateInsertedData {
    int age = 0;
    String sex = "M";
    boolean married = false;
    boolean hasLicense = false;
    
    //Placeholder
    Customer client = new Customer((age), sex, married, hasLicense);
    
 // FEATURE 1    
    
    @Given("Is a woman, {int} years old, is not married and does not have a driver license")
    public void is_a_woman_years_old_is_not_married_and_does_not_have_a_driver_license(Integer int1) {
        client.setSex("F");
        sex = "F";
        client.setAge(int1);
        age = int1;
        client.setMarried(false);
        married=false;
        client.setDrivingLicense(false);
        hasLicense=false;
    }
    
    @When("Inserting data")
    public void insert_data_case1() {
        Customer mujerCaso1 = new Customer((age), sex, married, hasLicense);
        BusinessRule.checkSingleYoungManRule(mujerCaso1);
        BusinessRule.checkMarriedWomanRule(mujerCaso1);
        BusinessRule.checkAgeRule(mujerCaso1);
        BusinessRule.checkPremium(mujerCaso1); 
    }
    
    @Then("Client needs license")
    public void client_needs_license() {
        System.out.println("Client needs a driver's license to get a premium calculated.");
    }
    
    
    
}