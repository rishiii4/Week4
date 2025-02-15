package junit.advancedjunit;

public class PasswordValidator {

    // Method to check password strength
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            // Password must be at least 8 characters
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasDigit;
    }
}

