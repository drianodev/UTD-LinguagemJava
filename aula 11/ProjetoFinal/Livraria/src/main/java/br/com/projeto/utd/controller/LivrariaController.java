package br.com.projeto.utd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto.utd.entity.Livro;
import br.com.projeto.utd.service.LivroService;

@Controller
public class LivrariaController {
	
	@Autowired
	LivroService servico;
	
	@RequestMapping("/")
	public String paginaInicial(Model modelo) {
		
		List<Livro> livros = servico.listarLivros();
		
		modelo.addAttribute("livros", livros);
		
		return "index";
	}
	
	@RequestMapping("/cadastro")
	public String paginaCadastro(Model model) {
		
		Livro livro = new Livro();
		
		model.addAttribute("livro", livro);
		
		return "cadastrarlivro";
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String salvar(@ModelAttribute("livro") Livro livro) {
		
		servico.adicionar(livro);
		
		return "redirect:/";
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView paginaEditar(@PathVariable(name="id") long id) {
		
		ModelAndView mav = new ModelAndView("editarlivro");
	
		Livro livro = servico.modificar(id);
	
		mav.addObject("livro", livro);
		return mav;
	}
	
	@RequestMapping("/deletar/{id}")
	public String deletar(@PathVariable(name="id") long id) {
	
		servico.deletar(id);
	
		return "redirect:/";
	}
}
