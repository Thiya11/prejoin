package com.tom.prejoin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class WebConfig {
	
	Dotenv dotenv = Dotenv.load();
	
    @Bean
    WebMvcConfigurer corsConfiguration() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins(dotenv.get("ALLOWED_URL"))
				.allowedMethods("*")
				.allowedHeaders("*")
				.allowCredentials(true);
			}
		};
	}

}
