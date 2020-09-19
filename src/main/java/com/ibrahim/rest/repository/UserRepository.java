package com.ibrahim.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibrahim.rest.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findById(int id);
}
