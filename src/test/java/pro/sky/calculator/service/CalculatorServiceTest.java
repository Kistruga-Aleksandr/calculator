package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {
    private final CalculatorService service = new CalculatorService();

    @Test
    void multiplication() {
        assertEquals(8, service.multiplication(2, 4));
        assertEquals(3, service.multiplication(1, 3));
    }

    @Test
    void subtraction() {
        assertEquals(1,service.subtraction(4, 3));
        assertEquals(2,service.subtraction(5, 3));
    }

    @Test
    void addition() {
        assertEquals(21,service.addition(10, 11));
        assertEquals(34,service.addition(19, 15));
    }

    @Test
    void division() throws IllegalArgumentException {
        assertEquals(3,service.division(6, 2));
        assertEquals(5,service.division(10, 2));
    }
}