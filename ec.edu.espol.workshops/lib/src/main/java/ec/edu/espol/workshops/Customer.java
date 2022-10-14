package ec.edu.espol.workshops;

public class Customer {
    private int age;
    private String sex;
    private boolean married;
    private boolean drivingLicense;
    private int base;


    public Customer(int age, String sex, boolean married, boolean drivingLicense) {
        this.age = age;
        this.sex = sex;
        this.married = married;
        this.drivingLicense = drivingLicense;
        this.base = 500;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }    

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

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
    	return "The base premium's value to pay is $ " + this.base + ".";
    }

}