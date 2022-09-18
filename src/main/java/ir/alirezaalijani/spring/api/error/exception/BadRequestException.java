package ir.alirezaalijani.spring.api.error.exception;

public class BadRequestException extends AbstractException {

    public BadRequestException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public BadRequestException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public BadRequestException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }

}
