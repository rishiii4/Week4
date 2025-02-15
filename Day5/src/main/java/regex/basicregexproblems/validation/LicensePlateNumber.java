package regex.basicregexproblems.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static void main(String[] args) {
        // print result
        System.out.println(isValidPlateNumber("AB1234")?"valid":"invalid");
        System.out.println(isValidPlateNumber("A1234")?"valid":"invalid");
        System.out.println(isValidPlateNumber("ABC1234")?"valid":"invalid");
    }

    public static boolean isValidPlateNumber(String number){
        // regex to validate number plate
        String regex = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex); // compile regex
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }
}
