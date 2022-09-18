package ir.alirezaalijani.spring.api.error.exception;

public class EntityNotFoundException extends AbstractException {

    public EntityNotFoundException(Class clazz, String message, String... searchParamsMap) {
        super(clazz, message, searchParamsMap);
    }

    public EntityNotFoundException(String perMessage, String message, String... searchParamsMap) {
        super(perMessage, message, searchParamsMap);
    }

    public EntityNotFoundException(String message, String... searchParamsMap) {
        super(message, searchParamsMap);
    }
}
