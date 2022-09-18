package ir.alirezaalijani.spring.api.error.exception;

public class PathNotFoundException extends AbstractException{

    public PathNotFoundException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public PathNotFoundException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public PathNotFoundException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }
}
