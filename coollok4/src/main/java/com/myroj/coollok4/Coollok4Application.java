package com.myroj.coollok4;

import com.myroj.coollok4.reposirory.CurrencyRepository;
import com.myroj.coollok4.reposirory.CurrencyRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Coollok4Application {

	@Bean
	public CurrencyRepository currencyRepository() {
		return new CurrencyRepositoryImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(Coollok4Application.class, args);
	}

}
