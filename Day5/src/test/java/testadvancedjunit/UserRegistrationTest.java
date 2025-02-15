package testadvancedjunit;

import junit.advancedjunit.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!",
                UserRegistration.registerUser("JohnDoe", "john@example.com", "StrongP@ss1"));
    }

    @Test
    void testEmptyUsernameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "user@example.com", "StrongP@ss1"));
        assertEquals("Username cannot be empty!", exception.getMessage());
    }

    @Test
    void testInvalidEmailThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "StrongP@ss1"));
        assertEquals("Invalid email format!", exception.getMessage());
    }

    @Test
    void testWeakPasswordThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "weakpass"));
        assertEquals("Password must have at least 8 characters, one uppercase letter, and one digit!", exception.getMessage());
    }
}

