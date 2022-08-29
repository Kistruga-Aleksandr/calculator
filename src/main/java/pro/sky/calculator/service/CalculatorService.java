package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.implement.Calculator;
import pro.sky.calculator.workingExceptions.ValidNumberException;

@Service
public class CalculatorService implements Calculator {
    @Override
    public Integer multiplication(Integer num1, Integer num2) {
        return num1 * num2;

    }

    @Override
    public Integer subtraction(int num1, int num2) {
        return num1-num2;
    }

    public int addition(int num1, int num2) {
        return num1 + num2;
        }

    @Override
    public Double division(int num1, int num2) {
        if (num2 == 0) {
            throw new ValidNumberException("На ноль делить нелзя");
        }
        return (double) (num1 / num2);
    }


}

