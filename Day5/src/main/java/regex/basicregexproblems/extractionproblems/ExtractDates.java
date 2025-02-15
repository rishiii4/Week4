package regex.basicregexproblems.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        // Input
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Call method extractDates, returns list of dates of type string
        ArrayList<String> dates = extractDates(text);

        // Display result
        System.out.println(dates);
    }

    public static ArrayList<String> extractDates(String text){
        // Regex
        String regex =  "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // ArrayList to store words
        ArrayList<String> dates = new ArrayList<>();

        // Find and add words to list
        while(matcher.find()){
            dates.add(matcher.group());
        }
        return dates;
    }
}
