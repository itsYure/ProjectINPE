package com.inpe.controledeacesso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inpe.controledeacesso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
