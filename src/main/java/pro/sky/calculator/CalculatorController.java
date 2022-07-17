package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping(value = "/plus")
    public String addition(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        if (areParamsPresent(num1, num2)) {
            return calculator.addition(num1, num2);
        } else {
            return "Не передан параметр ";
        }
    }

    @GetMapping(value = "/minus")
    public String subtraction(@RequestParam(required = false) Integer num1,
                              @RequestParam(required = false) Integer num2) {
        if (areParamsPresent(num1, num2)) {
            return calculator.subtraction(num1, num2);
        } else {
            return "Не передан параметр ";
        }
    }

    @GetMapping(value = "/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1,
                                 @RequestParam(required = false) Integer num2) {
        if (areParamsPresent(num1, num2)) {
            return calculator.multiplication(num1, num2);
        } else {
            return "Не передан параметр ";
        }
    }

    @GetMapping(value = "/divide")
    public String division(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        if (areParamsPresent(num1, num2)) {
            if (num2 == 0) {
                return " На 0 делить нельзя ";
            }
                return calculator.division(num1, num2);
            }
            else {
                return "Не передан параметр ";
            }

    }

    public boolean areParamsPresent(Integer num1, Integer num2) {
        return num1 != null && num2 != null;
    }
}
