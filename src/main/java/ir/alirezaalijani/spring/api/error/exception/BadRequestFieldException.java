package ir.alirezaalijani.spring.api.error.exception;

import org.springframework.validation.BindingResult;

public class BadRequestFieldException  extends AbstractException {

    private BindingResult bindingResult;

    public BadRequestFieldException(Class clazz, String message, BindingResult bindingResult, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
        this.bindingResult = bindingResult;
    }

    public BadRequestFieldException(String perMessage, String message, BindingResult bindingResult, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
        this.bindingResult = bindingResult;
    }

    public BadRequestFieldException(String message, BindingResult bindingResult, String... searchParamsMap) {
        super(message, searchParamsMap);
        this.bindingResult = bindingResult;
    }

    public BadRequestFieldException(String message, BindingResult bindingResult) {
        super(message);
        this.bindingResult = bindingResult;
    }

    public BindingResult getBindingResult() {
        return bindingResult;
    }
}
