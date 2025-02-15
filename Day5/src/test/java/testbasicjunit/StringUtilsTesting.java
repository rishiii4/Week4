package testbasicjunit;

import junit.basicjunittest.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTesting {
    @Test
    void testStringUtils(){
        StringUtils stringUtils = new StringUtils();
        assertEquals(stringUtils.reverse("sandeep"), "peednas");
        assertEquals(stringUtils.isPalindrome("racecar"), true);
        assertEquals(stringUtils.toUpperCase("rishi"), "RISHI");
    }
}
