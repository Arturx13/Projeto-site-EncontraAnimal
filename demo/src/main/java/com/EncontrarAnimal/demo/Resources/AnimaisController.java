package com.EncontrarAnimal.demo.Resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EncontrarAnimal.demo.Repositories.AnimaisRepositories;


@RestController
public class AnimaisController {
	
	@Autowired
	AnimaisRepositories repository;
	
	@PostMapping("/cadastroAnimal") 
	public void cadastrarAnimal(@RequestBody Animais animais) {
		this.repository.save(animais);
	}
	
	@GetMapping("/pesquisaAnimal/")
	public List<Animais> buscaTodosAnimal() {
		return this.repository.findAll();
	}

}
