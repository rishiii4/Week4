package testadvancedjunit;

import junit.advancedjunit.DateFormatter;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDateFormatting() throws ParseException {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"), "Date should be formatted correctly");
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"), "Date should be formatted correctly");
    }

    @Test
    void testInvalidDateThrowsException() {
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("15-02-2025"), "Invalid format should throw ParseException");
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("2025/02/15"), "Invalid format should throw ParseException");
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("abc"), "Invalid input should throw ParseException");
    }
}

