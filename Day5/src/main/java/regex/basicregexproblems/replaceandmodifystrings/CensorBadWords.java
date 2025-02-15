package regex.basicregexproblems.replaceandmodifystrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static void main(String[] args) {
        // input text
        String text = "This is a damn bad example with some stupid words.";

        ArrayList<String> badwords = new ArrayList<>(Arrays.asList(new String[] {"damn","stupid"}));
        // call replaceSpaces method to replace
        String result = replaceCensorWords(text, badwords);
        // print result
        System.out.println(result);
    }

    public static String replaceCensorWords(String text, ArrayList<String> badwords){
        // regex to validate username
        String regex =  "(?i)\\b("+String.join("|",badwords)+")\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // replace all censor words with ****
        text = matcher.replaceAll("****");

        // return text
        return text;

    }
}
