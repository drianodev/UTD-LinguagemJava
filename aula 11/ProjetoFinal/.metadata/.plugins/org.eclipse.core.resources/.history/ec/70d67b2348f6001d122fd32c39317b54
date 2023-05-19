package br.com.projeto.utd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.utd.entity.Livro;

@Controller
public class LivrariaController {
	
	@RequestMapping("/")
	public String paginaInicial() {
		
		Livro livro = new livro();
		
		livro.setTitulo("Os três mosqueteiros");
		/*
		*
		* Aqui vai ficar os outros inserir...
		*
		*/
		return "index";
	}
}
