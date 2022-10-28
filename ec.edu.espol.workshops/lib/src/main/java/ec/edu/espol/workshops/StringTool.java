package ec.edu.espol.workshops;

import java.util.Locale;

public class StringTool {
    
    private StringTool() {};
    
    public static boolean compareUpperCaseString(String str, String strCompare) {
        return str.toUpperCase(Locale.ENGLISH).equals(strCompare);
    }
}
