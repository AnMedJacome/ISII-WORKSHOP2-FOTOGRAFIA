package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Car Insurance Premium\n\nEnter your age: ");
			String age = sc.nextLine();
			
			String genderOption;
			String gender = "";
			String maritalStatus;
			String license;
			String result;

			String genderMessage = "Choose your gender inserting the respective number: \n1. Male\n2. Female\n3. Other\n4. Unspecified\n\nYour option: ";

			do {
				System.out.println(genderMessage);
				genderOption = sc.nextLine();
			} while(!StringTool.validateGenderOption(gender,genderOption));

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
			Customer client = new Customer(Integer.parseInt(age), gender, married, hasLicense);

			BusinessRule.checkSingleYoungManRule(client);
			BusinessRule.checkMarriedWomanRule(client);
			BusinessRule.checkAgeRule(client);
			result = BusinessRule.checkPremium(client);
			System.out.println(result);

		} catch (NumberFormatException e) {
		    System.out.println("Insert only numbers");
		}
	}

}
