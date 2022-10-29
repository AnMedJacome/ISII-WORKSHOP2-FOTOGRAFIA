package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Car Insurance Premium\n\nEnter your age: ");
			String age = sc.nextLine();
			String sex;
			String maritalStatus;
			String license;

			do {
				System.out.println("Enter your sex(M/F): ");
				sex = sc.nextLine();
			} while(!(StringTool.compareUpperCaseString(sex, "M")) && !(StringTool.compareUpperCaseString(sex, "F")));

			do {
				System.out.println("Are you married or not?(Y/N): ");
				maritalStatus = sc.nextLine();
			} while(!("Y".equals(maritalStatus.toUpperCase())) && !("N".equals(maritalStatus.toUpperCase())));

			boolean married = (maritalStatus.toUpperCase()).equals("Y");

			do {
				System.out.println("Do you have a driver's license?(Y/N): ");
				license = sc.nextLine();
			}while(!(StringTool.compareUpperCaseString(license, "Y")) && !(StringTool.compareUpperCaseString(license, "N")));

			boolean hasLicense = StringTool.compareUpperCaseString(license, "Y");
			Customer client = new Customer(Integer.parseInt(age), sex, married, hasLicense);

			BusinessRule.checkSingleYoungManRule(client);
			BusinessRule.checkMarriedWomanRule(client);
			BusinessRule.checkAgeRule(client);
			if(BusinessRule.checkPremium(client)) {
			    System.out.println(client.toString());
			} else {
			    System.out.println("-1");
			}

		} catch (NumberFormatException e) {
		    System.out.println("Insert only numbers");
		}
	}

}
