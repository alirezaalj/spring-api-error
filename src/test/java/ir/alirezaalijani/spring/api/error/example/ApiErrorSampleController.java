package ir.alirezaalijani.spring.api.error.example;

import ir.alirezaalijani.spring.api.error.exception.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author alireza alijani : https://alirezaalijani.ir
 * @user alireza
 * @date 8/21/22 - 1:49 AM
 * @project exam
 */
@RestController
@RequestMapping("api/error-sample")
public class ApiErrorSampleController {

    @GetMapping("{code}")
    public ResponseEntity<?> error404(@PathVariable Integer code){
        switch (code){
            case 404 : throw new EntityNotFoundException(this.getClass(),"entity not found.","id","1");
            case 401 : throw new AccessDeniedException(this.getClass(),"access denied to resource.");
            case 403 : throw new ForbiddenException(this.getClass(),"forbidden error message.");
            case 400 : throw new BadRequestException(this.getClass(),"bad request error sample.");
            default: throw new PathNotFoundException(this.getClass(),"code not found.");
        }
    }

    @PostMapping("field-error")
    public ResponseEntity<?> fieldError(@Valid @RequestBody SimpleDto requestBody, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            throw new BadRequestFieldException(this.getClass(),"sent body to path: '/api/error-sample/field-error' has error.",bindingResult);
        }
        throw new BadRequestException(this.getClass(),"bad request error sample.");
    }

}
