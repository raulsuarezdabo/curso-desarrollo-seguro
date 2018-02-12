package com.s3curitybug.curso.desarrollo.seguro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Configuration class for web pages.
 * 
 * @author juanjo
 *
 */
@Configuration
public class WebPagesConfig extends WebMvcConfigurerAdapter {

	/**
	 * Web resources mapping.
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/resources/");

	}

}
