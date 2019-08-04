package edu.mum.cs545.lab9.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ControllerAdvice
public class EmployeeExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ValidationErrorDTO beanValidationHandler(MethodArgumentNotValidException e){
        ValidationErrorDTO validationErrorDTO= new ValidationErrorDTO();
        validationErrorDTO.setErrType("ValidationError");
        BindingResult result=e.getBindingResult();
        List<FieldError> fieldErrors=result.getFieldErrors();
        for(FieldError f:fieldErrors){
          validationErrorDTO.addFieldError(new FieldErrorDTO(f.getField(),f.getDefaultMessage()));
        }
        System.out.println(validationErrorDTO);

        return validationErrorDTO;
    }
}
