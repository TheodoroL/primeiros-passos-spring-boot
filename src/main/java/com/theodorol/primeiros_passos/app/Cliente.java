package com.theodorol.primeiros_passos.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
//está refirindo
@Configuration
@ConfigurationProperties(prefix = "cliente")
public class Cliente {
    private String nome;
    private String email;
    private List<Long> telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Long> telefone) {
        this.telefone = telefone;
    }
}
