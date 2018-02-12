package com.s3curitybug.curso.desarrollo.seguro.controller.rest;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Rest Controller.
 * 
 * @author juanjo
 *
 */
@RestController
@RequestMapping("/rest")
public class BasicRestController {

	/**
	 * Get endpoint.
	 * 
	 * @return {"success":true}
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> get() {

		return new ResponseEntity<>(Collections.singletonMap("success", true), HttpStatus.OK);

	}

}
