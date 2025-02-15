package regex.advancedproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "This this is is a repeated repeated word test this.";

        // Call the method to find repeating words
        ArrayList<String> repeatingWords = findRepeatingWords(sentence);

        // Print the result
        System.out.println(String.join(", ", repeatingWords)); // Output: is, repeated
    }

    public static ArrayList<String> findRepeatingWords(String sentence) {
        // Regex to find repeating words
        String regex = "(?i)\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        // List to store repeating words
        ArrayList<String> repeatingWords = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1)); // Add the repeating word
        }

        return repeatingWords;
    }
}