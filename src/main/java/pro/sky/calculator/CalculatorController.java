package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController{
    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping(value = "/plus")
    public String addition(@RequestParam int num1,
                                   @RequestParam int num2) {
        return calculator.addition(num1, num2);
    }
    @GetMapping(value ="/minus" )
    public String subtraction(@RequestParam int num1,
                                   @RequestParam int num2) {
        return calculator.subtraction(num1, num2);
    }

    @GetMapping(value ="/multiply" )
    public String multiplication(@RequestParam int num1,
                                   @RequestParam int num2) {
        return calculator.multiplication(num1, num2);
    }

    @GetMapping(value ="/divide" )
    public String division(@RequestParam int num1,
                                   @RequestParam int num2) {
        return calculator.division(num1, num2);
    }
}
