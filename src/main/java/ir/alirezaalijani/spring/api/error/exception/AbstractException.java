package ir.alirezaalijani.spring.api.error.exception;


import ir.alirezaalijani.spring.api.error.apierror.CustomErrorMessageGenerator;

/**
 * @author alireza alijani : https://alirezaalijani.ir
 * @user: alireza
 * @date: 8/2/22 - 12:00 AM
 * @project: exam
 */
public abstract class AbstractException extends RuntimeException {

    public AbstractException(Class clazz, String message , String... searchParamsMap) {
        super(CustomErrorMessageGenerator.generateMessage(clazz.getSimpleName().concat(" - "),
                message,
                CustomErrorMessageGenerator.toMap(String.class, String.class, searchParamsMap)
        ));
    }

    public AbstractException(String perMessage, String message , String... searchParamsMap) {
        super(CustomErrorMessageGenerator.generateMessage(perMessage.concat(" - "),
                message,
                CustomErrorMessageGenerator.toMap(String.class, String.class, searchParamsMap)
        ));
    }

    public AbstractException(String message , String... searchParamsMap) {
        super(CustomErrorMessageGenerator.generateMessage("",
                message,
                CustomErrorMessageGenerator.toMap(String.class, String.class, searchParamsMap)
        ));
    }

}
