package com.helloworld.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping ("/hello-world")
@RestController

public class HelloWorldController {
    
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
    @GetMapping("/bsm")
    public List<String> generationBrasilBSMs(){
        List<String> bsm = new ArrayList<>();
        bsm.add("proatividade");
        bsm.add("gestão de tempo");
        bsm.add("atenção aos detalhes");
        bsm.add("comunicação");
        bsm.add("orientação ao futuro");
        bsm.add("persistência");
        return bsm;
    }
    @GetMapping("/objetivos")
    public List<String> objetivos(){
        List<String> goals = new ArrayList<>();
        goals.add("Aprender a usar ao Spring Boot");
        goals.add("Implementar aplicações com Spring Boot");
        goals.add("Utilizar as principais ferramentas de desenvolvimento Spring Boot");
        goals.add("Criar o seu próprio projeto Spring Boot");
        return goals;
    }
}