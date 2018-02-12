package com.s3curitybug.curso.desarrollo.seguro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application main class.
 * 
 * @author juanjo
 *
 */
@SpringBootApplication
public class Application {

	/**
	 * Main method. Starts a web server.
	 *
	 * @param args
	 *            Main arguments. They are passed to Spring Boot.
	 */
	public static void main(final String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
