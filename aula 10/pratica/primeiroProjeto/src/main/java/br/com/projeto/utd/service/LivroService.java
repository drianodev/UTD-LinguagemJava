package br.com.projeto.utd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.utd.entity.Livro;
import br.com.projeto.utd.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	LivroRepository repo;
	
	public void adicionar(Livro livro) {
		
		repo.save(livro);
	}
	
	public List<Livro> listarLivros() {
		
		return repo.findAll();
	}
	
	public Livro modificar(long id) {
		
		return repo.findById(id).get();
	}
	
	public void deletar(long id) {
		
		repo.deleteById(id);
	}
}
