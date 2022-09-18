package ir.alirezaalijani.spring.api.error.exception;

public class InternalServerException extends AbstractException{
    public InternalServerException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public InternalServerException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public InternalServerException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }
}
