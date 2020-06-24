package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @SpringBootApplication - Convenience annotation that combines @Configuration, 
 * 			@EnableAutoConfiguration, and @ComponentScan.  Every Spring Boot project should
 * 			likely have this annotation over the class holding the main method unless you have
 * 			very good reason not to.
 * 
 * We supply Launcher.class to SpringApplication.run to give it a source class from which
 * to conduct a package scan.  Spring will scan for any components or configuration at the package
 * that holds the class passed to it. Optionally, you could supply an array of classes such that
 * it has multiple source packages to scan.
 *
 */
@SpringBootApplication
public class Launcher {
	public static void main(String[] args) {
		SpringApplication.run(Launcher.class, args);
	}
}
