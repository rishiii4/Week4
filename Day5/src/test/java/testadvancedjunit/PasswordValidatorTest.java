package testadvancedjunit;

import junit.advancedjunit.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongPass1"), "Valid password should return true");
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Short1"), "Password shorter than 8 characters should return false");
    }

    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("weakpassword1"), "Password without uppercase should return false");
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitsHere"), "Password without digit should return false");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should return false");
    }

    @Test
    void testOnlyNumbers() {
        assertFalse(PasswordValidator.isValidPassword("12345678"), "Password with only numbers should return false");
    }

    @Test
    void testOnlyUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("ABCDEFGH"), "Password with only uppercase letters should return false");
    }
}

