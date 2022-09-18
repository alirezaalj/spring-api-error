package ir.alirezaalijani.spring.api.error.exception;

public class RequestUserOwnerException extends AbstractException{

    public RequestUserOwnerException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public RequestUserOwnerException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public RequestUserOwnerException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }
}
