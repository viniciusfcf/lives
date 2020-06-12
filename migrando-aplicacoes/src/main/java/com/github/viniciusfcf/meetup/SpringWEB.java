package com.github.viniciusfcf.meetup;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "spring")
public class SpringWEB {
    
    @ConfigProperty(name = "meu.nome")
    String nome;

    @GetMapping
    public String olaSpring() {
        return "Olá from Spring "+nome;
    }

}