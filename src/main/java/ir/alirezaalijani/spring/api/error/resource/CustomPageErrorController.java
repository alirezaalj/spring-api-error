package ir.alirezaalijani.spring.api.error.resource;

import ir.alirezaalijani.spring.api.error.exception.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class CustomPageErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request,HttpServletResponse response) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String forwardPath = (String) request.getAttribute(RequestDispatcher.FORWARD_REQUEST_URI);

        if (status!=null){
            int parsStatus=400;
            try {
                parsStatus=Integer.parseInt(status.toString());
            }catch (Exception e){
                log.error("Cannot parse error status {}",status);
            }
            if (forwardPath.startsWith("/api")){
                throwFromStatusCode(parsStatus);
            }else {
               return pageErrorStatusCode(parsStatus);
            }
        }
        throwFromStatusCode(400);
        return "error/error-default";
    }

    // TODO: add error handling for other path to html format
    private String pageErrorStatusCode(int statusCode){
        // temporary
        throwFromStatusCode(statusCode);

        switch (HttpStatus.valueOf(statusCode)){
            case NOT_FOUND : return "error/error-404-default";
            case INTERNAL_SERVER_ERROR : return "error/error-500-default";
            case FORBIDDEN : return "error/error-403-default";
            case UNAUTHORIZED : return "error/error-401-default";
            default : return "error/error-default";
        }
    }
    private void throwFromStatusCode(int statusCode) {
        switch (HttpStatus.valueOf(statusCode)) {
            case NOT_FOUND : throw new PathNotFoundException(CustomPageErrorController.class, "Path not found!");
            case UNAUTHORIZED : throw new AccessDeniedException(CustomPageErrorController.class, "UnAuthorized!");
            case FORBIDDEN : throw new ForbiddenException(CustomPageErrorController.class, "Forbidden!");
            case INTERNAL_SERVER_ERROR : throw new InternalServerException(CustomPageErrorController.class, "Server error!");
            case TOO_MANY_REQUESTS : throw new TooManyRequestsException(CustomPageErrorController.class, "Too Many Requests. Your Blocked!");
            default : throw new BadRequestException(CustomPageErrorController.class, "BadRequest!");
        }
    }
}
