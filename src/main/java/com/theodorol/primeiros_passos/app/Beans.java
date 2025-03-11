package com.theodorol.primeiros_passos.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Configuração do nossos beans
@Configuration
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
