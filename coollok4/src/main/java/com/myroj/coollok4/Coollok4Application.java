package com.myroj.coollok4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Coollok4Application {

	@Bean
	public CurrencyRepository currencyRepository() {
		return new CurrencyRepositoryImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(Coollok4Application.class, args);
	}

}
