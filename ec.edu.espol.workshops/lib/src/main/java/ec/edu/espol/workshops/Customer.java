package ec.edu.espol.workshops;

public class Customer {
    private int age;
	private String sex;
	private boolean isMarried;
	private boolean hasDrivingLicense;
	private int base;
	
	public CarInsurance(int age, String sex, boolean isMarried, boolean hasDrivingLicense, int base) {
		this.age = age;
		this.sex = sex;
		this.isMarried = isMarried;
		this.hasDrivingLicense = hasDrivingLicense;
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
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public boolean isHasDrivingLicense() {
		return hasDrivingLicense;
	}
	public void setHasDrivingLicense(boolean hasDrivingLicense) {
		this.hasDrivingLicense = hasDrivingLicense;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}

}