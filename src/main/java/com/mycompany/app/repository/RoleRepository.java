package com.mycompany.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.app.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
