package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Car Insurance Premium\n\nEnter your age: ")
			String age = sc.nextLine();
			
			do {
				System.out.println("Enter your sex(M/F): ");
				String sex = sc.nextLine();
			} while(!(sex.toUpperCase()).equals("M") && !(sex.toUpperCase()).equals("F"))
			
			do {
				System.out.println("Are you married or not?(Y/N): ");
				String maritalStatus = sc.nextLine();
			} while(!(maritalStatus.toUpperCase()).equals("Y") && !(maritalStatus.toUpperCase()).equals("N"))
			
			boolean married = (maritalStatus.toUpperCase()).equals("Y");
			
			do {
				System.out.println("Do you have a driver's license?(Y/N): ");
				String license = sc.nextLine();
			}while(!license.toUpperCase().equals("Y") && !license.toUpperCase().equals("N"))
			
			boolean hasLicense = license.toUpperCase().equals("Y");
			Customer client = new Customer( Integer.parseInt(edad), sex, married, hasLicense );
			
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
