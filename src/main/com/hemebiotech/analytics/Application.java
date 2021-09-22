package com.hemebiotech.analytics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.hemebiotech.analytics.config.ConfigProperties;
import com.hemebiotech.analytics.repositories.impl.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.repositories.impl.WriteSymptomDataFromFile;
import com.hemebiotech.analytics.services.AnalyticsCounter;

/**
 * The Class Application.
 */
@ComponentScan("com.hemebiotech.analytics")
@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableConfigurationProperties(ConfigProperties.class)
public class Application {
	;
	
	/**
	 * The main method, launch application
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		
	}
	
	/**
	 * Execute the service AnalysCounter when application start.
	 *
	 * @param analyticsCounter the analytics counter
	 * @return the command line runner
	 */
	@Bean
	public CommandLineRunner process(AnalyticsCounter analyticsCounter) {
		return (args) -> {
			analyticsCounter.process();
		};
	}

}
