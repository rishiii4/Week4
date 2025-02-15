package testbasicjunit;

import junit.basicjunittest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTesting {
    @Test
    void testCalculator(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(2,4), 6);
        assertEquals(calculator.subtract(4,2), 2);
        assertEquals(calculator.multiply(2,4),8);
        assertEquals(calculator.divide(4,2),2);
    }
}
