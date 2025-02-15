package regex.basicregexproblems.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddresses {
    public static void main(String[] args) {
        // Display result
        String text = "Contact us at support@example.com and info@company.org";
        // Call extractEmail method and it returns list of emails
        ArrayList<String> emails = extractEmail(text);

        // Display email
        for (String email : emails){
            System.out.println(email);
        }
    }

    public static ArrayList<String> extractEmail(String text){
        // Regex
        String regex =  "[a-zA-Z0-9_.+%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Create ArrayList to store emails
        ArrayList<String> emails = new ArrayList<>();

        // Find and add emails to list
        while(matcher.find()){
            emails.add(matcher.group());
        }

        return emails;
    }
}
