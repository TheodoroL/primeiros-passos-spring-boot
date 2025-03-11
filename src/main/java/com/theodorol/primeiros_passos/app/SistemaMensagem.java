package com.theodorol.primeiros_passos.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private  Remetente  noreply;
    @Autowired
    private  Remetente financeiro;
    public void envairConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVinda(){
        financeiro.setEmail("teste@gmail.com");
        System.out.println(this.financeiro);
        System.out.println("Bem-vindo á Tech Elite");
    }
}
