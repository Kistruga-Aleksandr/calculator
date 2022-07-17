package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public String multiplication(int num1, int num2) {
     return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override
    public String subtraction(int num1, int num2) {
     return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public String addition(int num1,int num2) {
     return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    @Override
    public String division(int num1, int num2) {
     return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
