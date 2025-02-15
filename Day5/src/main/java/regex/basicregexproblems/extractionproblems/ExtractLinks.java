package regex.basicregexproblems.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        // Display result
        String text = "Visit https://www.google.com and http://example.org for more info.";
        // Call extractEmail method and it returns list of emails
        ArrayList<String> links = extractLinks(text);

        // Display email
        System.out.println(links);
    }

    public static ArrayList<String> extractLinks(String text){
        // Regex
        String regex =  "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\S*)?\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Create ArrayList to store links
        ArrayList<String> links = new ArrayList<>();

        // Find and add emails to list
        while(matcher.find()){
            links.add(matcher.group());
        }
        return links;
    }
}
