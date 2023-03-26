package com.github.youssfbr.spring.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    private String nome = "Alisson Youssf";
    private String email = "youssf@gmail.com";
    private List<Long> telefones = new ArrayList<>(Arrays.asList(8511998877L, 85554466552L));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: "
                + nome
                + "\nE-mail: " + email
                + "\nTelefones: " + telefones);

        System.out.println("Seu cadastro foi aprovado.");
    }

}
