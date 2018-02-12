package com.s3curitybug.curso.desarrollo.seguro.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Basic Web Controller
 * 
 * @author juanjo
 *
 */
@Controller
public class BasicWebController {

	/**
	 * Index endpoint.
	 * 
	 * @return index.html
	 */
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}

}
