package testbasicjunit;

import junit.basicjunittest.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTesting {
    @Test
    void testException(){
        ExceptionHandling eh = new ExceptionHandling();
        assertThrows(ArithmeticException.class,() -> eh.divide(4,0));
        assertEquals(5,eh.divide(10,2));
    }
}
