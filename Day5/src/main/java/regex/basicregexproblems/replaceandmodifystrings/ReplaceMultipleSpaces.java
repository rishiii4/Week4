package regex.basicregexproblems.replaceandmodifystrings;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        // input text
        String text = "This   is   an   example with    multiple    spaces.  ";

        // call replaceSpaces method to replace
        String result = replaceSpaces(text);
        // print result
        System.out.println(result);
    }

    public static String replaceSpaces(String text){
        // regex to validate username
        String regex =  "\\s{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // replace multiple spaces with only one space
        while (matcher.find()) {
           text = (matcher.replaceAll(" "));
        }

        // return replaced text
        return text;
    }
}
