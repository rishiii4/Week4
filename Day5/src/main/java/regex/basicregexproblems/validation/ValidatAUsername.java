package regex.basicregexproblems.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatAUsername {
    public static void main(String[] args) {
        // print result
        System.out.println(isValidUser("user_123")?"valid":"invalid");
        System.out.println(isValidUser("123user_")?"valid":"invalid");
        System.out.println(isValidUser("USER_123")?"valid":"invalid");
        System.out.println(isValidUser("user")?"valid":"invalid");
    }

    public static boolean isValidUser(String username){
        // regex to validate username
        String regex = "^[a-zA-Z][a-zA-z0-9_]{4,14}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        return matcher.matches();
    }
}
