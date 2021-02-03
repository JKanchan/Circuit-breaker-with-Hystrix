package com.learning.movieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@SpringBootApplication
public class MovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		HttpComponentsClientHttpRequestFactory client = new HttpComponentsClientHttpRequestFactory();
		client.setConnectTimeout(3000);
		return new RestTemplate(client);
	}

}
