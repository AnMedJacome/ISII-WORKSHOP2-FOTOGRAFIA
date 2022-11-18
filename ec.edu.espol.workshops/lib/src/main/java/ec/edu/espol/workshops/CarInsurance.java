package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Car Insurance Premium\n");
			
			String id;
			String genderOption;
			String gender = "";
			String maritalStatus;
			String license;
			String result;

			String idMessage = "Insert your ID number: ";
			String genderMessage = "Choose your gender inserting the respective number: \n1. Male\n2. Female\n3. Other\n4. Unspecified\n\nYour option: ";
			String maritalMessage = "Choose a marital status via the following numbers:\n1. Single\n2. Married\n3. Divorced\n4. Widowed\n\nYour option: ";
			
			System.out.println(idMessage);
			id = sc.nextLine();
			if (id.length() > 10 || (id.length() == 10 && id.charAt(0) != '0')) {
			    System.out.println("Invalid Driver’s Id");
			    System.exit(-1);
			}
            int idNumber = Integer.parseInt(id);
            if (idNumber < 1) {
                System.out.println("Invalid Driver’s Id");
                System.exit(-1);
            }

            System.out.println("Enter your age: ");
            String age = sc.nextLine();
            
			do {
				System.out.println(genderMessage);
				genderOption = sc.nextLine();
			} while(!StringTool.validateGenderOption(gender,genderOption));

			do {
				System.out.println(maritalMessage);
				maritalStatus = sc.nextLine();
			} while(!StringTool.validateMaritalOption(maritalStatus));

			boolean married = Integer.parseInt(maritalStatus) == 2;

			do {
				System.out.println("Do you have a driver's license?(Y/N): ");
				license = sc.nextLine();
			}while(!(StringTool.compareUpperCaseString(license, "Y")) && !(StringTool.compareUpperCaseString(license, "N")));

			boolean hasLicense = StringTool.compareUpperCaseString(license, "Y");
			Customer client = new Customer(idNumber, Integer.parseInt(age), gender, married, hasLicense);

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
