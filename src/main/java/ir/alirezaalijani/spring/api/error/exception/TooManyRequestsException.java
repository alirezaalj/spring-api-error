package ir.alirezaalijani.spring.api.error.exception;

public class TooManyRequestsException extends AbstractException{

    public TooManyRequestsException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public TooManyRequestsException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public TooManyRequestsException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }
}
