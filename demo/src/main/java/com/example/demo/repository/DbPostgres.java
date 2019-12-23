package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface DbPostgres extends CrudRepository<Alien, Integer>{

}
