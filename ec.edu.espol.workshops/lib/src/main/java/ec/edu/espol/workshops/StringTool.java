package ec.edu.espol.workshops;

import java.util.Locale;

public class StringTool {
    
    private StringTool() {};
    
    public static boolean compareUpperCaseString(String str, String strCompare) {
        return str.toUpperCase(Locale.ENGLISH).equals(strCompare);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer inputNumber = Integer.parseInt(strNum);
            if(inputNumber<0){
                System.out.println("Negative numbers are not valid.");
                return false;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("The value entered is not valid.");
            return false;
        }
        return true;
    }
}
