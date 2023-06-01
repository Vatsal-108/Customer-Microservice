package com.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.customer.exception.CustomerNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(Exception ex){
		ResponseEntity<String> responseEntity=new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		return responseEntity;
	
	}
}
