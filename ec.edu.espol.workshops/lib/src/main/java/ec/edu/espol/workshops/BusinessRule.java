package ec.edu.espol.workshops;

public class BusinessRule {

    private BusinessRule() {
    }

    public static void checkSingleYoungManRule(Customer customer) {
        if (StringTool.compareUpperCaseString(customer.getSex(), "M") && !customer.isMarried()
                && (customer.getAge() < 25)) {
            customer.setBase(customer.getBase() + 1500);
        }
    }

    public static void checkMarriedWomanRule(Customer customer) {
        if (StringTool.compareUpperCaseString(customer.getSex(), "F") || customer.isMarried()) {
            customer.setBase(customer.getBase() - 200);
        }
    }

    public static void checkAgeRule(Customer customer) {
        if (customer.getAge() < 0) {
            System.exit(-1);
        } else if (customer.getAge() >= 45 && customer.getAge() < 65) {
            customer.setBase(customer.getBase() - 100);
        }
    }

    public static String checkPremium(Customer cliente) {
        if (cliente.getAge() < 0) {
            return "Positive numbers only";
        } else if (cliente.getAge() > 0 && cliente.getAge() < 18) {
            return "You are underage to get a Premium Car Insurance";
        } else if (cliente.getAge() > 80) {
            return "You have exceeded the maximum age to receive a car insurance premium value";
        } else if (!cliente.hasDrivingLicense()) {
            return "You need a driver's license to get the car insurance premium value";
        }

        return cliente.toString();
    }
}
