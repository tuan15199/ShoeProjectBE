package com.project.shoeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoeapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
