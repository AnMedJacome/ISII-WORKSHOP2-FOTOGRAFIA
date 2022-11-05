package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs{
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
    
    //FEATURE 2
    
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
        BusinessRule.checkSingleYoungManRule(hombreCaso2);
        BusinessRule.checkMarriedWomanRule(hombreCaso2);
        BusinessRule.checkAgeRule(hombreCaso2);
        BusinessRule.checkPremium(hombreCaso2); 
    }
    
    @Then("Inserted age is not a number")
    public void inserted_age_is_not_a_number() {
        System.out.println("Inserted age is not a number");
    }
    
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
        BusinessRule.checkPremium(mujerCaso3); 
    }
    
    @Then("You have exceeded the maximum age to receive a premium value")
    public void you_have_exceeded_the_maximum_age_to_receive_a_premium_value() {
        System.out.println("You have exceeded the maximum age to receive a premium value. ");
    }
    
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
        BusinessRule.checkPremium(hombreCaso4);
    }
    
    @Then("You need a driver license to get the premium value")
    public void customer_requires_license() {
        System.out.println("You need a driver's license to get the premium value.");
    }
    
    
    
    
}