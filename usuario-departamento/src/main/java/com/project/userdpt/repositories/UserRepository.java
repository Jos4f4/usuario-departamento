package com.project.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
