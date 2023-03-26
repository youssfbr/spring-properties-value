package com.github.youssfbr.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${name:NoReply}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<String> telefones = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: "
                + nome
                + "\nE-mail: " + email
                + "\nTelefones: " + telefones);

        System.out.println("Seu cadastro foi aprovado.");
    }

}
