package ec.edu.espol.workshops;


public class BusinessRule {
	
  private BusinessRule() {}

  public static void checkSingleYoungManRule(Customer customer){
        if(StringTool.compareUpperCaseString(customer.getSex(), "M") && !customer.isMarried() && (customer.getAge()<25)){
            customer.setBase(customer.getBase()+1500);
        }
    }

  public static void checkMarriedWomanRule(Customer customer){
    if(StringTool.compareUpperCaseString(customer.getSex(), "F") || customer.isMarried()){
      customer.setBase(customer.getBase()-200);
    }
  }

  public static void checkAgeRule(Customer customer){
    if(customer.getAge()>=45 && customer.getAge()<65){
      customer.setBase(customer.getBase()-100);
    }
  }
    
  public static boolean checkPremium(Customer cliente){
    return !(cliente.getAge()>80 || !cliente.hasDrivingLicense());
  }
}
