package com.s3curitybug.curso.desarrollo.seguro.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Configuration class for global controllers configurations.
 * 
 * @author juanjo
 *
 */
@ControllerAdvice
public class ControllerAdviceConfig {

	/**
	 * Exception handler for HttpRequestMethodNotSupportedException.
	 * 
	 * @param e
	 *            The HttpRequestMethodNotSupportedException.
	 * @param request
	 *            The HttpServletRequest that caused the exception.
	 * @return The ResponseEntity.
	 */
	@ExceptionHandler
	public ResponseEntity<?> exceptionHandler(HttpRequestMethodNotSupportedException e, HttpServletRequest request) {

		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

	}

	/**
	 * Exception handler for ServletRequestBindingException.
	 * 
	 * @param e
	 *            The ServletRequestBindingException.
	 * @param request
	 *            The HttpServletRequest that caused the exception.
	 * @return The ResponseEntity.
	 */
	@ExceptionHandler
	public ResponseEntity<?> exceptionHandler(ServletRequestBindingException e, HttpServletRequest request) {

		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

	}

	/**
	 * Exception handler for TypeMismatchException.
	 * 
	 * @param e
	 *            The TypeMismatchException.
	 * @param request
	 *            The HttpServletRequest that caused the exception.
	 * @return The ResponseEntity.
	 */
	@ExceptionHandler
	public ResponseEntity<?> exceptionHandler(TypeMismatchException e, HttpServletRequest request) {

		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

	}

	/**
	 * Exception handler for generic Exception.
	 * 
	 * @param e
	 *            The Exception.
	 * @param request
	 *            The HttpServletRequest that caused the exception.
	 * @return The ResponseEntity.
	 */
	@ExceptionHandler
	public ResponseEntity<?> exceptionHandler(Exception e, HttpServletRequest request) {

		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

	}

}
