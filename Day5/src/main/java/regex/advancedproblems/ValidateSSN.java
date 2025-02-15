package regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        // Input text
        String text = "My SSN is 123-45-6789. Another number is 123456789.";

        // Call the method to validate SSNs
        validateSSN(text);
    }

    public static void validateSSN(String text) {
        // Regex to match SSN format
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find all matches
        while (matcher.find()) {
            String ssn = matcher.group();
            System.out.println( ssn + "\" is valid");
        }

        // Check for invalid SSNs (digits without hyphens)
        String invalidRegex = "\\b\\d{9}\\b";
        Pattern invalidPattern = Pattern.compile(invalidRegex);
        Matcher invalidMatcher = invalidPattern.matcher(text);

        while (invalidMatcher.find()) {
            String invalidSSN = invalidMatcher.group();
            System.out.println(invalidSSN + "\" is invalid");
        }
    }
}