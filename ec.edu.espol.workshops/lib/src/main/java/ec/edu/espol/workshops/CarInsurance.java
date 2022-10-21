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
			} while(!("M".equals(sex.toUpperCase())) && !("F".equals(sex.toUpperCase())));

			do {
				System.out.println("Are you married or not?(Y/N): ");
				maritalStatus = sc.nextLine();
			} while(!("Y".equals(maritalStatus.toUpperCase())) && !("N".equals(maritalStatus.toUpperCase())));

			boolean married = (maritalStatus.toUpperCase()).equals("Y");

			do {
				System.out.println("Do you have a driver's license?(Y/N): ");
				license = sc.nextLine();
			}while(!("Y".equals(license.toUpperCase())) && !("N".equals(license.toUpperCase())));

			boolean hasLicense = license.toUpperCase().equals("Y");
			Customer client = new Customer( Integer.parseInt(age), sex, married, hasLicense );

			BusinessRule.checkSingleYoungManRule(client);
			BusinessRule.checkMarriedWomanRule(client);
			BusinessRule.checkAgeRule(client);
			BusinessRule.checkPremium(client);

			System.out.println(client.toString());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
