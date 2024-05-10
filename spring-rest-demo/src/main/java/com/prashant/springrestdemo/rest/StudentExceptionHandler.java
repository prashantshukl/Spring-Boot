package com.prashant.springrestdemo.rest;

import com.prashant.springrestdemo.entity.StudentNotFoundException;
import com.prashant.springrestdemo.entity.StudentNotFoundResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentNotFoundResponse> handleExeption(StudentNotFoundException exec) {
        StudentNotFoundResponse response = new StudentNotFoundResponse();
        response.setMessage(exec.getMessage());
        response.setStatus(HttpStatus.NOT_FOUND.value());
        response.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentNotFoundResponse> handleExeption(Exception exec) {
        StudentNotFoundResponse response = new StudentNotFoundResponse();
        response.setMessage(exec.getMessage());
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
