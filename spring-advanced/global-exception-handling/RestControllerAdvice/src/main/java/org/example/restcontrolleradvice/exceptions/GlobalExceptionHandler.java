package org.example.restcontrolleradvice.exceptions;

import org.jspecify.annotations.Nullable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleProductNotFoundException(ProductNotFoundException e) {
        return e.getMessage();
    }

    /*    @ExceptionHandler(RuntimeException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public String handleRuntimeException(ProductNotFoundException e) {
            //System.out.println(e.getClass().getName());
            return "Exception occured.";
        }*/
/*    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return e.getBindingResult().getAllErrors().toString();
    }*/

    @Override
    protected @Nullable ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        //return super.handleMethodArgumentNotValid(ex, headers, status, request);
/*        Map<String, String> fieldErrors = new HashMap<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            fieldErrors.put(
                    error.getField() + " [" + error.getCode() +
                            "]", error.getDefaultMessage());
        }*/
/*        Map<String, List<String>> fieldErrors = new HashMap<>();
        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            if (!fieldErrors.containsKey(fieldError.getField())) {
                List<String> messages = new ArrayList<>();
                messages.add(fieldError.getDefaultMessage());
                fieldErrors.put(fieldError.getField(), messages);
            } else {
                List<String> messages = fieldErrors.get(fieldError.getField());
                messages.add(fieldError.getDefaultMessage());

            }

        }*/
/*        ex.getBindingResult().getFieldErrors().stream()
                .map(e->Map.of(e.getField(), new ArrayList<String>(List.of(e.getDefaultMessage()))))
                .reduce((a,b)->a)*/
        Map<String, List<String>> fieldErrors = new HashMap<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            fieldErrors.computeIfAbsent(error.getField(), k -> new ArrayList<>())
                    .add(error.getDefaultMessage());
        }
        return new ResponseEntity<>(fieldErrors, HttpStatus.BAD_REQUEST);
    }
}
