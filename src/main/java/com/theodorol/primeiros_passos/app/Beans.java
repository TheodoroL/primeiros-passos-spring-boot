package com.theodorol.primeiros_passos.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Configuração do nossos beans
@Configuration
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
    @Bean
    /*
    *
    * No Spring, o escopo do bean é usado para decidir qual tipo de instância do bean deve ser retornada do contêiner Spring de volta ao chamador.

      Tipos de escopos de feijão suportados:

        singleton – Devolva uma única instância de bean por container IoC Spring
        prototype – Retorna uma nova instância de bean sempre que solicitado
        request – Retorna uma única instância de bean por solicitação HTTP. *
        session – Retorna uma única instância de bean por sessão HTTP. *
        globalSession – Retorna uma única instância de bean por sessão HTTP global. *
Na maioria dos casos, você só pode lidar com o escopo do núcleo Springilits – singleton e protótipo, e o escopo padrão é singleton.
    * */
    @Scope("prototype")
    public  Remetente remetentes(){
        System.out.println("criando o objeto remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("testecliente@gmail.com");
        remetente.setNome("Teste Cliente");
        return  remetente;
    }
}
