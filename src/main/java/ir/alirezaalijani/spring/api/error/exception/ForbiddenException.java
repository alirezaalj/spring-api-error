package ir.alirezaalijani.spring.api.error.exception;

public class ForbiddenException extends AbstractException{

    public ForbiddenException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public ForbiddenException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public ForbiddenException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }
}
