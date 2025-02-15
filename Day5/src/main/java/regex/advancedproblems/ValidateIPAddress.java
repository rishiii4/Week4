package regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        // Print results
        System.out.println(validateIPAddress("255.255.255.255") ? "valid" : "invalid");
        System.out.println(validateIPAddress("0.0.55.0") ? "valid" : "invalid");
        System.out.println(validateIPAddress("256.254.500.32") ? "valid" : "invalid");
        System.out.println(validateIPAddress("192.168.1.1") ? "valid" : "invalid");
        System.out.println(validateIPAddress("123.456.78.90") ? "valid" : "invalid");

    }

    public static boolean validateIPAddress(String ipAddress){
        // Regex to validate IP address
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }
}
