package ec.edu.espol.workshops;

public class BusinessRule {
    
    public void reglaHombreJovenSoltero(Customer customer){
        if(customer.getSex().toUpperCase().equals("M") && !customer.isMarried() && (customer.getAge()<25)){
            customer.setBase(customer.getBase()+1500);
        }
        
    }

    public void reglaMujerCasada(Customer customer){
        if(customer.getSex().toUpperCase().equals("F") || customer.isMarried()){
            customer.setBase(customer.getBase()-200);
        }
    }

    public void reglaEdad(Customer customer){
        if(customer.getAge()>=45 && customer.getAge()<65){
            customer.setBase(customer.getBase()-100);
        }
    }
}
