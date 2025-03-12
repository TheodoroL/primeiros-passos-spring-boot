package com.theodorol.primeiros_passos.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SistemaMensagemTelefone  implements CommandLineRunner {
    //esse value faz você pegar os valores da variavel de ambiente do application.properties
    @Value("${name:Teste1234}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefone}")
    private List<Long> telefone;

    @Override
    public void run(String... args) throws Exception {
        String mensagem = String.format("""
                Mensagem enviada por: %s
                email: %s
                telefone: %s""", nome, email, telefone.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(mensagem);
    }
}
