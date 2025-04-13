package com.example.jobms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point for the Spring Boot application.
 *
 * This class triggers the launch of the Spring Boot application by calling
 * the `SpringApplication.run()` method, which bootstraps the application,
 * loads the application context, and starts the embedded server.
 *
 * ✅ This class is minimal and focuses on application setup —
 *    no business logic is handled here, following the **Single Responsibility Principle (SRP)**.
 */
@SpringBootApplication
public class DemoApplication {

	/**
	 * The main method that starts the Spring Boot application.
	 *
	 * @param args Command line arguments, if any.
	 */
	public static void main(String[] args) {
		// Launch the Spring Boot application
		SpringApplication.run(DemoApplication.class, args);
	}

}
