package com.yyk.hellper.config.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//패키지 단위로 가능
//@RestControllerAdvice("com.example.demo.login.controller")
@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public ResponseEntity commonException(Exception e){
        return ResponseEntity.status(500).body("error");
    }

    /*@ExceptionHandler(NullPointerException.class)
    @ResponseBody
    ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
        HttpStatus status = getStatus(request);
        //return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
        return new ResponseEntity<>(null);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }*/
}
