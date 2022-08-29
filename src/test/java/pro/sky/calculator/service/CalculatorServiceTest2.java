package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest2 {
    private final CalculatorService service = new CalculatorService();

    @ParameterizedTest
    @MethodSource("numberForMultiplication")
    void multiplication(Integer num1, Integer num2, Integer expected) {
        var actual = service.multiplication(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("numberForSubtraction")
    void subtraction(Integer num1, Integer num2, Integer expected) {
        var actual = service.subtraction(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("numberForAddition")
    void addition(Integer num1, Integer num2, Integer expected) {
        var actual = service.addition(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("numberFordDivision")
    void division(Integer num1, Integer num2, Double expected) {
        var actual = service.division(num1, num2);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> numberForMultiplication() {
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(3,3,9),
                Arguments.of(5,5,25)
        );
    }
    private static Stream<Arguments> numberForSubtraction() {
        return Stream.of(
                Arguments.of(3,2,1),
                Arguments.of(5,3,2),
                Arguments.of(11,5,6)
        );
    }
    private static Stream<Arguments> numberForAddition() {
        return Stream.of(
                Arguments.of(3,2,4),
                Arguments.of(5,3,8),
                Arguments.of(11,5,16)
        );
    }
    private static Stream<Arguments> numberFordDivision() {
        return Stream.of(
                Arguments.of(10,2,5),
                Arguments.of(15,3,5),
                Arguments.of(25,5,5)
        );
    }
}
