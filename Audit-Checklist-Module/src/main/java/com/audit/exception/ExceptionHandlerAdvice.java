package com.audit.exception;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	
	Logger logger = LoggerFactory.getLogger("Benchmark-Exception-Handler-Advice");
	List<String> dList = new ArrayList<>();
	
	
	//Handles the exception during validation
	// we send an invalid response to angular if exception occurs
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> exception(Exception e) 
	{
		//logger.error(e.getMessage());
		return new ResponseEntity<>(this.dList, HttpStatus.OK);
	}
}
