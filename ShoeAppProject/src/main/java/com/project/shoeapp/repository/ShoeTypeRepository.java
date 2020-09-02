package com.project.shoeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoeapp.model.ShoeType;

public interface ShoeTypeRepository extends JpaRepository<ShoeType, Integer>{

}
