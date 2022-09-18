package ir.alirezaalijani.spring.api.error.exception;


public class AccessDeniedException extends AbstractException{

    public AccessDeniedException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public AccessDeniedException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public AccessDeniedException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }
}
