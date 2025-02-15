package junit.advancedjunit;

import java.util.regex.Pattern;

public class UserRegistration {

    // Method to register a user
    public static String registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty!");
        }

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format!");
        }

        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Password must have at least 8 characters, one uppercase letter, and one digit!");
        }

        return "User registered successfully!";
    }

    // Email validation (basic regex)
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    // Password validation: At least 8 chars, 1 uppercase, 1 digit
    private static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}

