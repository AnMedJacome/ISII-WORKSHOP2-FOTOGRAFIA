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
    
    //Placeholder
    Customer client = new Customer((age), sex, married, hasLicense);
      
    @Given("{int} years old, is not married, is a man and has a driver license")
    public void years_old_is_not_married_is_a_man_and_has_a_driver_license(Integer int1) {
        client.setSex("M");
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
        //BusinessRule.checkSingleYoungManRule(hombreCaso2);
        //BusinessRule.checkMarriedWomanRule(hombreCaso2);
        //BusinessRule.checkAgeRule(hombreCaso2);
        //BusinessRule.checkPremium(hombreCaso2); 
    }
    
    @Then("Inserted age is not a number")
    public void inserted_age_is_not_a_number() {
        System.out.println("Inserted age is not a number");
    }
    
    
    
}