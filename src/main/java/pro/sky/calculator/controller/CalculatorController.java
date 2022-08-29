package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.implement.Calculator;

@RestController
public class CalculatorController {
    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping(value = "/plus")
    public Integer addition(@RequestParam(required = false) Integer num1,
                            @RequestParam(required = false) Integer num2) {
        return calculator.addition(num1, num2);
    }

    @GetMapping(value = "/minus")
    public Integer subtraction(@RequestParam(required = false) Integer num1,
                              @RequestParam(required = false) Integer num2) {
        return calculator.subtraction(num1, num2);
    }

    @GetMapping(value = "/multiply")
    public Integer multiplication(@RequestParam(required = false) Integer num1,
                                 @RequestParam(required = false) Integer num2) {
        return calculator.multiplication(num1, num2);
    }

    @GetMapping(value = "/divide")
    public Double division(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        return calculator.division(num1, num2);
    }

}