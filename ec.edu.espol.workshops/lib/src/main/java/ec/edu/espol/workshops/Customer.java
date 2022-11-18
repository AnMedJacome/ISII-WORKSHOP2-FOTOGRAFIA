package ec.edu.espol.workshops;

/**
 * The Customer class is used to represent
 * a real customer of the car insurance business.
*/
public class Customer {
    /**
     * An integer to save the customer's age.
    */
    private int age;
    /**
     * A string variable to save information about the gender of the customer.
    */
    private String gender;
    /**
     * A boolean variable to save information 
     * about the marital status of the customer.
    */
    private boolean married;
    /**
     * A boolean variable that tells if the customer has a driver's license or not.
    */
    private transient boolean drivingLicense;
    /**
     * An integer to save the value of the base.
    */
    private int base;


    /**
     * Constructor of the Customer Class
     * @param age
     * @param gender
     * @param married
     * @param drivingLicense
     */
    public Customer(int age, String gender, boolean married, boolean drivingLicense) {
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.drivingLicense = drivingLicense;
        this.base = 500;
    }

    /**
     *
     * @return age of the customer
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age
     */

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }    

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    /**
     * @return if the customer has a driver's license or not
     */
    public boolean hasDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    
    @Override
    public String toString() {
    	return "Your car insurance premium value is $" + this.base + ".";
    }

}