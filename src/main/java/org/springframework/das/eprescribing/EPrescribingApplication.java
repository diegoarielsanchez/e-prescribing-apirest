package org.springframework.das.eprescribing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EPrescribingApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EPrescribingApplication.class, args);
	}
}
