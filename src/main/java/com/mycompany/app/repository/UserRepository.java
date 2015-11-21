package com.mycompany.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

}
