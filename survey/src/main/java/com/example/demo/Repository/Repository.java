package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.model;
public interface Repository extends JpaRepository<model,Integer>{

}