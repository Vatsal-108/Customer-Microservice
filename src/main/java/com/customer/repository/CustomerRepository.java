package com.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.entity.*;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{


}