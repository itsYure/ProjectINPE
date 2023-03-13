package com.inpe.controledeacesso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inpe.controledeacesso.entities.User;
import com.inpe.controledeacesso.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @Autowired
    private UserRepository repository;
    //Vai ao banco de dados e faz uma busca a todos os usuários

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value ="/{id}")
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get(); //Pega o usuário e joga na variável result
        return result;
    }
    
    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }
}
