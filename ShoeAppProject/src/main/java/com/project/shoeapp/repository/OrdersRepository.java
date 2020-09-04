package com.project.shoeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoeapp.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
