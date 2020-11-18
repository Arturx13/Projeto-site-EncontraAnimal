package com.EncontrarAnimal.demo.Repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.EncontrarAnimal.demo.Resources.Animais;

public interface AnimaisRepositories extends MongoRepository< Animais, String >{
	
}
