package pro.sky.calculator.workingExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class ValidNumberException extends IllegalArgumentException{
    public ValidNumberException() {
    }

    public ValidNumberException(String s) {
        super(s);
    }

    public ValidNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidNumberException(Throwable cause) {
        super(cause);
    }
}
