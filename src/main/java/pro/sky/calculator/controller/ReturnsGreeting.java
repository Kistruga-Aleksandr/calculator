package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnsGreeting {

    @GetMapping
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }
}
