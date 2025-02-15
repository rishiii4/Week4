package regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        // Call method validateCreditCard and print results
        System.out.println(validateCreditCard("4521369875112504") ? "valid" : "invalid");
        System.out.println(validateCreditCard("552136985011254") ? "valid" : "invalid");
        System.out.println(validateCreditCard("0552136985011254") ? "valid" : "invalid");
        System.out.println(validateCreditCard("5521369875112504") ? "valid" : "invalid");
    }

    public static boolean validateCreditCard(String ipAddress){
        // Regex to validate IP address
        String regex =  "^[5|4][0-9]{15}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }
}
