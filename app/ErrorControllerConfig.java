package com.s3curitybug.curso.desarrollo.seguro.config;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Error Controller Configuration.
 * 
 * @author juanjo
 *
 */
@RestController
public class ErrorControllerConfig implements ErrorController {

	/**
	 * Error endpoint.
	 * 
	 * @return NOT_FOUND
	 */
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ResponseEntity<?> test() {

		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

	}

	/**
	 * @return The path of the error mapping.
	 */
	@Override
	public String getErrorPath() {

		return "/error";

	}

}
