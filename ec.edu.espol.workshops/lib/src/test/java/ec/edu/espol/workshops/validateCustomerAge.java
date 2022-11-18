package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class validateCustomerAge {
    int age = 0;
    String sex = "M";
    boolean married = false;
    boolean hasLicense = false;
    private String actualAnswer;
    
    //Placeholder
    Customer client = new Customer((age), sex, married, hasLicense);
      
    @Given("{int} years old, is not married, is a man and has a driver license")
    public void years_old_is_not_married_is_a_man_and_has_a_driver_license(Integer int1) {
        client.setGender("Male");
        sex = "M";
        client.setAge(int1);
        age = int1;
        client.setMarried(false);
        married=false;
        client.setDrivingLicense(true);
        hasLicense=true;
    }
    
    @When("Creating customer")
    public void insert_data_case2() {
        Customer hombreCaso2 = new Customer((age), sex, married, hasLicense);
        try {
            BusinessRule.checkSingleYoungManRule(hombreCaso2);
            BusinessRule.checkMarriedWomanRule(hombreCaso2);
            BusinessRule.checkAgeRule(hombreCaso2);
            this.actualAnswer = BusinessRule.checkPremium(hombreCaso2);
        } catch (NumberFormatException e) {
            this.actualAnswer = "Inserted age is not a number.";
        }
        
    }
    
    @Then("Inserted age is not a number")
    public void inserted_age_is_not_a_number() {
        assertEquals("Inserted age is not a number.", this.actualAnswer);
    }
    
    
    
}