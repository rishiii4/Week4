package regex.basicregexproblems.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        // print result
        System.out.println(validateHexCode("FF1234")?"valid":"invalid");
        System.out.println(validateHexCode("#AFA234")?"valid":"invalid");
        System.out.println(validateHexCode("#ABC1234")?"valid":"invalid");
    }

    public static boolean validateHexCode(String hexCode){
        // regex to validate username
        String regex = "^#[0-9A-Fa-f]{6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexCode);

        return matcher.matches();
    }
}
