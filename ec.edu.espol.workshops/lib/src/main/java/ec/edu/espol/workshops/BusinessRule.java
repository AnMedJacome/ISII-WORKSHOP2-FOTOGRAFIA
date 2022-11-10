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
            System.out.println("Positive numbers");
            //System.out.println("Cannot sell insurance to current customer");            
            System.exit(-1);
        } else if (customer.getAge() >= 45 && customer.getAge() < 65) {
            customer.setBase(customer.getBase() - 100);
        }
    }

    public static boolean checkPremium(Customer cliente) {

        if(cliente.getAge() > 80){
            System.out.println("You have exceeded the maximum age to receive a premium value");
            return false;
        }else if(!cliente.hasDrivingLicense()){
            System.out.println("You need a driver's license to get the premium value");
            return false;
        }

        return !(cliente.getAge() > 80 || !cliente.hasDrivingLicense());
    }
}
