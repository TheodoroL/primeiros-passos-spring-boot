package com.theodorol.primeiros_passos;

import com.google.gson.Gson;
import com.theodorol.primeiros_passos.app.ConversorJson;
import com.theodorol.primeiros_passos.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}
	@Bean
	public CommandLineRunner run (ConversorJson conversor) throws Exception{

		return args -> {
			String json = "{ \"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\", \"localidade\": \"São Paulo\" }";
			ViaCepResponse response = conversor.converter(json);
			System.out.printf("dados do CEP: %s\n", response);
		};

	}
}
